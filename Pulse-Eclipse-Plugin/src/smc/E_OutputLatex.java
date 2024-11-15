package smc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;

import structure.E_Class;
import structure.E_Method;
import structure.E_Package;
import structure.E_State;


public class E_OutputLatex {
	
	static BufferedWriter latex;
	static E_Package _prj;
	private static boolean bRequires=false;
	private static boolean bSTM=false;
	private static boolean bSinkStates=false;
	private static boolean bconcurrency=false;
	static String endOfRow="\\\\";
	static String hLine="\\hline";
	private static String beginSideWay="\\begin{sideways}";
	private static String endSideWay="\\end{sideways}";
	
	
	public static void create_Plugin(){
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
		String folder= workspace.getRoot().getLocation().toFile().getPath().toString();
		
		System.out.println("model.tex generated in the directory "+folder);
		
		FileWriter fstream;
		try {
			fstream = new FileWriter(folder+"/"+"model.tex");
			latex = new BufferedWriter(fstream);
			addUsePackages();
			latex.write("\n\\begin{document}\n");
			writeToLatex();
			latex.write("\n\\end{document}\n");
			latex.flush();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

public static void create_CommandLine(){
		
	
		FileWriter fstream;
		try {
			fstream = new FileWriter("model.tex");
			Process p1=Runtime.getRuntime().exec("chmod 777 model.tex" );
			latex = new BufferedWriter(fstream);
			addUsePackages();
			latex.write("\n\\begin{document}\n");
			writeToLatex();
			latex.write("\n\\end{document}\n");
			latex.flush();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	private static void addUsePackages() throws IOException {
		latex.write("\\documentclass[10pt]{article}");
		latex.write("\n\\usepackage{fullpage}");
		latex.write("\n\\usepackage{longtable}");
		latex.write("\n\\usepackage[usenames,dvipsnames]{xcolor}");
		latex.write("\n\\usepackage{amsmath}");
		latex.write("\n\\usepackage{amssymb}");
		latex.write("\n\\usepackage{hyperref}");
		latex.write("\n\\hypersetup{colorlinks=true}");
		latex.write("\n\\usepackage{rotating}\n");
		latex.flush();
	}


	public static void writeToLatex() throws IOException {
		
		WriteSummary();
		
		if ((bRequires==false)&&(bSTM==false)&&(bconcurrency==false))
			return;
		latex.write("\n\\newpage");
		latex.write("\n\\tableofcontents");
	
		for (E_Class _class:_prj.getClasses()){
			latex.write("\n\\newpage");
			latex.write("\n\n\\section{{\\color{Fuchsia}"+_class.getName()+"}}");
			latex.write("\n\\label{"+_class.getName()+"}");	
			if (bRequires==true)
				writeRequiresClauseSatisfiabilty(_class);
			if (bSTM==true)
				writeStateTransitionMatrix(_class);
			if (bconcurrency==true)
				writeMethodConcurrencyMatrix(_class);
		}
		writeAbbervations();
		bRequires=false;
		bSTM=false;
		bconcurrency=false;
	}


	private static void writeAbbervations() throws IOException {
		
		
		latex.write("\n\\newpage");
		latex.write("\n\n\\section{{\\color{Fuchsia}Abbreviation}}");
		latex.write("\n\\label{Abbreviation}");	
		
		latex.write("\n\\begin{longtable}{|l|l|}");
		latex.write("\n\\caption{Used Abbreviation}\\\\\n\\hline");
		latex.write("\nSymbol & Meaning\\\\\n\\hline\n");
		
		latex.write("{\\color{blue}$\\surd$}"+"&"+"requires clause of the method is satisfiable");	
		latex.write(endOfRow+"\n");
		latex.write("\\hline\n");
		latex.write("{\\color{red}$\\times$}"+"&"+"requires clause of the method is unsatisfiable");
		latex.write(endOfRow+"\n");
		latex.write("\\hline\n");
		latex.write("{\\color{blue}$\\uparrow$}"+"&"+"The row-state can be transitioned to the column-state");	
		latex.write(endOfRow+"\n");
		latex.write("\\hline\n");
		latex.write("{\\color{BlueGreen}$\\times$}"+"&"+"The row-state cannot be transitioned to the column-state");
		latex.write(endOfRow+"\n");
		latex.write("\\hline\n");
		latex.write("{\\color{blue}$\\parallel$}"+"&"+"The row-method can be possibly executed parallel with the column-method");	
		latex.write(endOfRow+"\n");
		latex.write("\\hline\n");
		latex.write("{\\color{BrickRed}$\\nparallel$}"+"&"+"The row-method cannot be executed parallel with the column-method");
		latex.write(endOfRow+"\n");
		latex.write("\\hline\n");
		latex.flush();
		
		latex.write("\\end{longtable}");
		latex.flush();
		
		
	}


	private static void WriteSummary() throws IOException {
		
		latex.write("\n\\begin{center}\\huge{Summary}\\end{center}");
		if (bSinkStates==true)
			latex.write("\n\\textbf{Sink States}:"+"$"+_prj.getSinkStates().replace("x","\\times")+"$");
		addSummaryTableColumns();
		addSummaryTableHeaders();
		addSummaryTableRows();
		latex.write("\\end{longtable}");
		latex.flush();
		
	}


	private static void writeMethodConcurrencyMatrix(E_Class _class) throws IOException {
		

		if (_class.getMethods().size()<2)
			return;
			
		addConcurrencyMatrixColumns(_class);
		addConcurrencyMatrixHeaders(_class);
		addConcurrencyMatrixRows(_class);
		latex.write("\\end{longtable}");
		latex.flush();	
		
		
	}



	private static void addConcurrencyMatrixRows(E_Class _class) throws IOException {
	

		for (E_Method _method:_class.getMethods()){
			latex.write(_method.getIdentifier().replace("_","\\_"));
				for (E_Method __method:_class.getMethods()){
						String value=getConcurrencyValue(_method, __method);
						latex.write("&"+value);
						}
					latex.write(endOfRow);
					latex.write("\n"+hLine+"\n");
					}
					
				}
		
		
	private static String getConcurrencyValue(E_Method _method, E_Method __method) {
		
		if (_method.isConcurrentMethod(__method.getIdentifier())==true)
			
			return "{\\color{blue}$\\parallel$}";	
		 else
			 return "{\\color{BrickRed}$\\nparallel$}";
	
	}



	private static void addSummaryTableHeaders() throws IOException {
		
		latex.write(beginSideWay+"{\\color{BlueGreen}Classes}"+endSideWay);
		latex.write("&"+beginSideWay+"{\\color{BlueGreen}Methods}"+endSideWay);
		latex.write("&"+beginSideWay+"{\\color{BlueGreen}States}"+endSideWay);
		
		if (bRequires==true)
			latex.write("&"+beginSideWay+"{\\color{BlueGreen}Unsatisfiable Clauses}"+endSideWay);
		
		if (bSTM==true)
			latex.write("&"+beginSideWay+"{\\color{BlueGreen}Unreachable States}"+endSideWay);
		
		if (bconcurrency==true)
			latex.write("&"+beginSideWay+"{\\color{BlueGreen}Possible Concuurent Methods}"+endSideWay);
		
		latex.write(endOfRow);
		latex.write("\n\\hline\n");
		
	}


	private static void addSummaryTableColumns() throws IOException {
		
		latex.write("\n\\begin{longtable}{|l|l|l");
		
		if (bSinkStates==true)
			latex.write("|l");
	
		if (bRequires==true)
			latex.write("|l");
	
		if (bSTM==true)
			latex.write("|l");
		
		latex.write("|}");
		latex.write("\n\\caption{Pulse Analysis Summary}\\\\\n\\hline\n");
		
	}


	private static void writeStateTransitionMatrix(E_Class _class) throws IOException {
		
		if (_class.getStates().size()<2)
			return;
		
		latex.write("\n\\begin{longtable}{|l");
		addSTMNumberofColumns(_class);
		latex.write("|}");
		latex.write("\n\\caption{State Transition Matrix}\\\\\n\\hline\n");
		addSTMColumnsHeaders(_class);
		addSTMRows(_class);
		latex.write("\\end{longtable}");
		latex.flush();	
		
		
}


	private static void addSTMNumberofColumns(E_Class _class) throws IOException {
		for (E_State _state:_class.getStates()){
			if (_state.getStateIndex()>1) // means not alive
			latex.write("|l");
		}
	}


	private static void addSTMColumnsHeaders(E_Class _class) throws IOException {
		
		latex.write("");
		for (E_State _state:_class.getStates()){
			if (_state.getStateIndex()>1){ // means not alive
				latex.write("&"+beginSideWay+_state.getName().replace("_", "\\_")+endSideWay);
			}
			
		}
		latex.write(endOfRow);
		latex.write("\n"+hLine+"\n");
		latex.flush();
	}


	private static void addSTMRows(E_Class _class) throws IOException {
		
		for(int i=1; i<_class.getStates().size();i++){
			E_State _state= _class.getStates().get(i);
			latex.write(_state.getName().replace("_","\\_" ));
			for (int j=1;j<_class.getStates().size(); j++){
				E_State __state= _class.getStates().get(j);
				String value=getStateReachabilityValue(_state, __state);
				latex.write("&"+value);
			}		
			latex.write(endOfRow);
			latex.write("\n"+hLine+"\n");
		}
	}		
		
		private static String getStateReachabilityValue(E_State _state, E_State __state) {
			
			//	if (_state.getStateIndex()==__state.getStateIndex())
			//	return "-";	
			
			if (_state.isReachableState(__state.getName())==true)
				return "{\\color{blue}$\\uparrow$}";	
			 else
				 return "{\\color{BlueGreen}$\\times$}";
	}

	

	private static void writeRequiresClauseSatisfiabilty(E_Class _class) throws IOException {
			
			if (_class.getMethods().size()<1)
				return;
		
			latex.write("\n\\begin{longtable}{|l|l|}");
			latex.write("\n\\caption{Methods Requires Clause Satisfiability}\\\\\n\\hline");
			latex.write("\nMethod & Satisfiability\\\\\n\\hline\n");
			String value;
			
			for (E_Method _method:_class.getMethods()){
				
				if (_method.getRequiresClauseSatisfiability())
						value="{\\color{blue}$\\surd$}";	
				 else
					 	value="{\\color{red}$\\times$}";
				String methodName=_method.getIdentifier().replace("_","\\_");
				latex.write(methodName+"&"+value);
				latex.write(endOfRow+"\n");
				latex.write("\\hline\n");
				latex.flush();
			}
			latex.write("\\end{longtable}");
			latex.flush();	
	}


	public static void setText(String str) {
		
		_prj=EVMDD_SMC_Generator.getPkgObject();
		
		if (str.contains("requires")){ 
			parseRequires(str);
		}
		if (str.contains("stateTransition")){ 
			parseTransitions(str);
		}
		if (str.contains("concurrentMethods")){ 
			parseConcurrentMethods(str);
		}
		
		if (str.contains("sinkstates")){ 
			parseSinkStates(str);
		}
		
		
	}

	private static void parseSinkStates(String str) {
		
		bSinkStates=true;
		

		int i=str.indexOf(":");
		String sinkStates= str.substring(i+1);
		_prj.setSinkStates(sinkStates);
		
	
	}


	private static void parseConcurrentMethods(String str) {
		
		//concurrentMethods_Utility_0_0_Utility_and_Utility_0_1_m
		// concurrentMethods_APDU_0_0_setIncomingAndReceive_and_APDU_0_1_setIncomingAndReceive:
		//concurrentMethods_APDU_0_0_setIncomingAndReceive_case1_and_APDU_0_1_APDU
		//concurrentMethods_APDU_0_0_setIncomingAndReceive_case1_and_APDU_0_1_setIncomingAndReceive_case1
		
		bconcurrency=true;
		int i=str.indexOf("_");
		str=str.substring(i+1);
		i=str.indexOf("_");
		String className=str.substring(0,i);
		str=str.substring(i+5);
		i=str.indexOf("_");
		String fromMethod=str.substring(0,i);
		i=str.indexOf("_and_");
		str=str.substring(i+5);
		
		i=str.lastIndexOf("_");
		int j=str.indexOf(":");
		String toMethod= str.substring(i+1,j);
		
		String concuurent=str.substring(j+1);
		concuurent=concuurent.trim();
	
		if (concuurent.substring(0,1).compareTo("0")!=0){
			 LinkedList<E_Class> _listClasses=_prj.getClasses();
				for (E_Class _class:_listClasses){
					if (_class.getName().compareTo(className)==0){
						for (E_Method _method: _class.getMethods())
							if (_method.getIdentifier().compareTo(fromMethod)==0)
								_method.setConcurrentMethod(toMethod);
								
					}	 
				}
		}	
		
		
	}


	private static void parseTransitions(String str){
	
		
			bSTM=true;
		
			int i=str.indexOf("_of_");
			int j=str.indexOf("_from_");
			int k=str.indexOf("_to_");
			int l=str.indexOf(":");
			String className=str.substring(i+4,j);	
			String fromState= str.substring(j+6,k);
			String toState= str.substring(k+4,l);
			
			String transition=str.substring(l+1);
			transition=transition.trim();
		
			if (transition.substring(0,1).compareTo("0")!=0){
				 LinkedList<E_Class> _listClasses=_prj.getClasses();
					for (E_Class _class:_listClasses){
						if (_class.getName().compareTo(className)==0){
							for (E_State _state: _class.getStates())
								if (_state.getName().compareTo(fromState)==0)
									_state.setReachability(toState);
						}	 
					}
			}	
			else{
				int test=0;
				
			}
				
			
	}
	

	private static void parseRequires(String str) {
	
		//requires_clause_of_APDU_setIncomingAndReceive_case1_0_0:
		bRequires=true;
		int j=str.indexOf("_of_")+4;
		str=str.substring(j);
		j=str.indexOf("_");
		String className=str.substring(0,j);
		str=str.substring(j+1);
		//j=str.indexOf("_");
		
		int i=str.indexOf(":");
		String methodName=str.substring(0,i-4);
		
		String reachability=str.substring(i+1);
		reachability=reachability.trim();
		E_Method _method=getMethod(className,methodName);
		if (_method!=null){
			
			if (reachability.substring(0,1).compareTo("0")==0)
					_method.setRequiresClauseSatisfiability(false);	
			else	
				_method.setRequiresClauseSatisfiability(true);
		}
		
	}
	
	private static E_Method getMethod (String className, String methodName){
		
		
		for (E_Class _class: _prj.getClasses()){
			if (_class.getName().compareTo(className)==0){
				for (E_Method _method:_class.getMethods()){
					if (_method.getIdentifier().compareTo(methodName)==0)
						return _method;
				}
			}
		}
		return null;
		
	}


	private static void addConcurrencyMatrixColumns(E_Class _class) throws IOException {
		
		latex.write("\n\\begin{longtable}{|l");
		
		for (E_Method _method:_class.getMethods()){
			latex.write("|l");
		}
		
		latex.write("|}");
		latex.write("\n\\caption{Methods Concurrency Matrix}\\\\\n\\hline\n");
		
	}


	private static void addConcurrencyMatrixHeaders(E_Class _class) throws IOException {
		
		latex.write("");
		for (E_Method _method:_class.getMethods())
				latex.write("&"+beginSideWay+_method.getIdentifier().replace("_","\\_")+endSideWay);
		
		latex.write(endOfRow);
		latex.write("\n\\hline\n");
		
	}


	private static void addSummaryTableRows() throws IOException {
	
		int totalClasses=_prj.getClasses().size();
		int totalMethods=0;
		int totalunsatifiedRequireClauses=0;
		int totalStates=0;
		int totalunreachableStates=0;
		int totalconcurrentmethods=0;
		
		for (E_Class _class:_prj.getClasses()){
			latex.write("\\hyperref["+_class.getName()+"]"+"{\\color{Fuchsia}"+_class.getName()+"}");
			latex.write("&"+_class.getMethods().size());
			latex.write("&"+(_class.getStates().size()-1));
			totalStates=totalStates+_class.getStates().size()-1;
			
			int unsatifiedRequireClauses=0;
			for (E_Method _method:_class.getMethods()){
				totalMethods++;
				if (_method.getRequiresClauseSatisfiability()==false){
					unsatifiedRequireClauses++;
					totalunsatifiedRequireClauses++;
				}
			}
			int unreachableStates=0;
			for (E_State _state:_class.getStates())
				if (_state.isReachableState()==false){
					unreachableStates++;
					totalunreachableStates++;
				}
			
			int concurrentMethods=0;
			for (E_Method _method:_class.getMethods()){
				if (_method.isConcurrentMethod()){
					concurrentMethods++;
					totalconcurrentmethods++;
					
				}
			}
			
			
			
			
			if (bRequires==true)
				latex.write("&"+unsatifiedRequireClauses);
		
			if (bSTM==true)
				latex.write("&"+unreachableStates);
			if (bconcurrency==true)
				latex.write("&"+concurrentMethods);
			
			latex.write(endOfRow);
			latex.write("\n"+hLine+"\n");
		}
			
		latex.write("Total Classes="+totalClasses+"&"+totalMethods+"&"+totalStates);
		
		if (bRequires==true)
			latex.write("&"+totalunsatifiedRequireClauses);
			
		if (bSTM==true)
			latex.write("&"+totalunreachableStates);
		
		if (bconcurrency==true)
			latex.write("&"+totalconcurrentmethods);

		latex.write(endOfRow);
		latex.write("\n"+hLine+"\n");
		
	}


	public static void reset() {
		bRequires=false;
		bSTM=false;
		bSinkStates=false;
		bconcurrency=false;
		
	}
	
}
