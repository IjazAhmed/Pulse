// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g 2018-03-31 13:43:24

package smc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PluralParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT_FULL", "AT_PURE", "AT_IMMUTABLE", "AT_SHARE", "AT_UNIQUE", "PUBLIC_BEHAVIOR", "FULL", "PURE", "IMMUTABLE", "SHARE", "UNIQUE", "LSBRACKET", "RSBRACKET", "PERM", "EQUAL", "EQUALOPERATOR", "IN", "THIS", "RESULT", "PARAM", "REQUIRES", "ENSURES", "QUOTE", "AND", "USE", "USEFIELDS", "PUNCTUATION", "CASES", "LCBRACKET", "RCBRACKET", "CLASS_STATES", "REFINE", "VALUE", "STATE", "STATES", "DIM", "NAME", "INV", "OPERATOR", "SEMICOLON", "LESS", "LESSTHANEQUAL", "GREATER", "GREATERTHANEQUAL", "ANDD", "OR", "JMLSTART", "JMLEND", "PLUSMINUSOPERATOR", "ASSIGNABLE", "NOTHING", "EVERYTHING", "GHOST", "INT", "INVARIANT", "OLD", "ID", "NUMBERS", "WS"
    };
    public static final int EOF=-1;
    public static final int AT_FULL=4;
    public static final int AT_PURE=5;
    public static final int AT_IMMUTABLE=6;
    public static final int AT_SHARE=7;
    public static final int AT_UNIQUE=8;
    public static final int PUBLIC_BEHAVIOR=9;
    public static final int FULL=10;
    public static final int PURE=11;
    public static final int IMMUTABLE=12;
    public static final int SHARE=13;
    public static final int UNIQUE=14;
    public static final int LSBRACKET=15;
    public static final int RSBRACKET=16;
    public static final int PERM=17;
    public static final int EQUAL=18;
    public static final int EQUALOPERATOR=19;
    public static final int IN=20;
    public static final int THIS=21;
    public static final int RESULT=22;
    public static final int PARAM=23;
    public static final int REQUIRES=24;
    public static final int ENSURES=25;
    public static final int QUOTE=26;
    public static final int AND=27;
    public static final int USE=28;
    public static final int USEFIELDS=29;
    public static final int PUNCTUATION=30;
    public static final int CASES=31;
    public static final int LCBRACKET=32;
    public static final int RCBRACKET=33;
    public static final int CLASS_STATES=34;
    public static final int REFINE=35;
    public static final int VALUE=36;
    public static final int STATE=37;
    public static final int STATES=38;
    public static final int DIM=39;
    public static final int NAME=40;
    public static final int INV=41;
    public static final int OPERATOR=42;
    public static final int SEMICOLON=43;
    public static final int LESS=44;
    public static final int LESSTHANEQUAL=45;
    public static final int GREATER=46;
    public static final int GREATERTHANEQUAL=47;
    public static final int ANDD=48;
    public static final int OR=49;
    public static final int JMLSTART=50;
    public static final int JMLEND=51;
    public static final int PLUSMINUSOPERATOR=52;
    public static final int ASSIGNABLE=53;
    public static final int NOTHING=54;
    public static final int EVERYTHING=55;
    public static final int GHOST=56;
    public static final int INT=57;
    public static final int INVARIANT=58;
    public static final int OLD=59;
    public static final int ID=60;
    public static final int NUMBERS=61;
    public static final int WS=62;

    // delegates
    // delegators


        public PluralParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PluralParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PluralParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g"; }



    // $ANTLR start "jmlSpecifications"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:86:1: jmlSpecifications : ( jmlClassSpecifications | jmlMethodSpecification );
    public final void jmlSpecifications() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:86:18: ( jmlClassSpecifications | jmlMethodSpecification )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==GHOST||LA1_0==INVARIANT) ) {
                alt1=1;
            }
            else if ( (LA1_0==JMLSTART) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:86:20: jmlClassSpecifications
                    {
                    pushFollow(FOLLOW_jmlClassSpecifications_in_jmlSpecifications1049);
                    jmlClassSpecifications();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:86:43: jmlMethodSpecification
                    {
                    pushFollow(FOLLOW_jmlMethodSpecification_in_jmlSpecifications1051);
                    jmlMethodSpecification();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlSpecifications"


    // $ANTLR start "jmlClassSpecifications"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:89:1: jmlClassSpecifications : ( jmlGhostDeclaration | jmlGhostInv );
    public final void jmlClassSpecifications() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:89:23: ( jmlGhostDeclaration | jmlGhostInv )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==GHOST) ) {
                alt2=1;
            }
            else if ( (LA2_0==INVARIANT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:89:25: jmlGhostDeclaration
                    {
                    pushFollow(FOLLOW_jmlGhostDeclaration_in_jmlClassSpecifications1059);
                    jmlGhostDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:89:45: jmlGhostInv
                    {
                    pushFollow(FOLLOW_jmlGhostInv_in_jmlClassSpecifications1061);
                    jmlGhostInv();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlClassSpecifications"


    // $ANTLR start "jmlGhostDeclaration"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:91:1: jmlGhostDeclaration : GHOST INT dim= ID SEMICOLON ;
    public final void jmlGhostDeclaration() throws RecognitionException {
        Token dim=null;

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:91:20: ( GHOST INT dim= ID SEMICOLON )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:91:22: GHOST INT dim= ID SEMICOLON
            {
            match(input,GHOST,FOLLOW_GHOST_in_jmlGhostDeclaration1068); 
            match(input,INT,FOLLOW_INT_in_jmlGhostDeclaration1070); 
            dim=(Token)match(input,ID,FOLLOW_ID_in_jmlGhostDeclaration1074); 
            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jmlGhostDeclaration1076); 

                E_JmlSpecification.setDimensionName((dim!=null?dim.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlGhostDeclaration"


    // $ANTLR start "jmlGhostInv"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:95:1: jmlGhostInv : INVARIANT low= NUMBERS LESSTHANEQUAL ID ANDD ID LESSTHANEQUAL high= NUMBERS SEMICOLON ;
    public final void jmlGhostInv() throws RecognitionException {
        Token low=null;
        Token high=null;

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:95:12: ( INVARIANT low= NUMBERS LESSTHANEQUAL ID ANDD ID LESSTHANEQUAL high= NUMBERS SEMICOLON )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:95:14: INVARIANT low= NUMBERS LESSTHANEQUAL ID ANDD ID LESSTHANEQUAL high= NUMBERS SEMICOLON
            {
            match(input,INVARIANT,FOLLOW_INVARIANT_in_jmlGhostInv1084); 
            low=(Token)match(input,NUMBERS,FOLLOW_NUMBERS_in_jmlGhostInv1089); 
            match(input,LESSTHANEQUAL,FOLLOW_LESSTHANEQUAL_in_jmlGhostInv1091); 
            match(input,ID,FOLLOW_ID_in_jmlGhostInv1093); 
            match(input,ANDD,FOLLOW_ANDD_in_jmlGhostInv1095); 
            match(input,ID,FOLLOW_ID_in_jmlGhostInv1097); 
            match(input,LESSTHANEQUAL,FOLLOW_LESSTHANEQUAL_in_jmlGhostInv1099); 
            high=(Token)match(input,NUMBERS,FOLLOW_NUMBERS_in_jmlGhostInv1103); 
            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jmlGhostInv1105); 

                int nlow=Integer.parseInt((low!=null?low.getText():null));
                int nhigh=Integer.parseInt((high!=null?high.getText():null));
              E_JmlSpecification.setDimensionValues(nlow, nhigh);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlGhostInv"


    // $ANTLR start "jmlMethodSpecification"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:102:1: jmlMethodSpecification : JMLSTART PUBLIC_BEHAVIOR ( REQUIRES jmlRequires SEMICOLON )? ( jmlAssign )? ( jmlEnsures )? JMLEND ;
    public final void jmlMethodSpecification() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:102:23: ( JMLSTART PUBLIC_BEHAVIOR ( REQUIRES jmlRequires SEMICOLON )? ( jmlAssign )? ( jmlEnsures )? JMLEND )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:102:25: JMLSTART PUBLIC_BEHAVIOR ( REQUIRES jmlRequires SEMICOLON )? ( jmlAssign )? ( jmlEnsures )? JMLEND
            {
            match(input,JMLSTART,FOLLOW_JMLSTART_in_jmlMethodSpecification1114); 
            match(input,PUBLIC_BEHAVIOR,FOLLOW_PUBLIC_BEHAVIOR_in_jmlMethodSpecification1116); 
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:102:51: ( REQUIRES jmlRequires SEMICOLON )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==REQUIRES) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:102:52: REQUIRES jmlRequires SEMICOLON
                    {
                    match(input,REQUIRES,FOLLOW_REQUIRES_in_jmlMethodSpecification1120); 
                    pushFollow(FOLLOW_jmlRequires_in_jmlMethodSpecification1122);
                    jmlRequires();

                    state._fsp--;

                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jmlMethodSpecification1125); 

                    }
                    break;

            }

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:102:86: ( jmlAssign )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ASSIGNABLE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:102:87: jmlAssign
                    {
                    pushFollow(FOLLOW_jmlAssign_in_jmlMethodSpecification1130);
                    jmlAssign();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:102:99: ( jmlEnsures )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ENSURES) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:102:100: jmlEnsures
                    {
                    pushFollow(FOLLOW_jmlEnsures_in_jmlMethodSpecification1135);
                    jmlEnsures();

                    state._fsp--;


                    }
                    break;

            }

            match(input,JMLEND,FOLLOW_JMLEND_in_jmlMethodSpecification1139); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlMethodSpecification"


    // $ANTLR start "jmlRequires"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:104:1: jmlRequires : ( jmlReq | jmlOrReq | jmlLessThanEqualReq );
    public final void jmlRequires() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:104:12: ( jmlReq | jmlOrReq | jmlLessThanEqualReq )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUALOPERATOR) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==NUMBERS) ) {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==SEMICOLON) ) {
                            alt6=1;
                        }
                        else if ( (LA6_4==OR) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==LESSTHANEQUAL) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:104:13: jmlReq
                    {
                    pushFollow(FOLLOW_jmlReq_in_jmlRequires1145);
                    jmlReq();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:104:20: jmlOrReq
                    {
                    pushFollow(FOLLOW_jmlOrReq_in_jmlRequires1147);
                    jmlOrReq();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:104:29: jmlLessThanEqualReq
                    {
                    pushFollow(FOLLOW_jmlLessThanEqualReq_in_jmlRequires1149);
                    jmlLessThanEqualReq();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlRequires"


    // $ANTLR start "jmlOrReq"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:106:1: jmlOrReq : jmlReq ( OR jmlReq )+ ;
    public final void jmlOrReq() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:106:9: ( jmlReq ( OR jmlReq )+ )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:106:11: jmlReq ( OR jmlReq )+
            {
            pushFollow(FOLLOW_jmlReq_in_jmlOrReq1156);
            jmlReq();

            state._fsp--;

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:106:18: ( OR jmlReq )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:106:19: OR jmlReq
            	    {
            	    match(input,OR,FOLLOW_OR_in_jmlOrReq1159); 
            	    pushFollow(FOLLOW_jmlReq_in_jmlOrReq1161);
            	    jmlReq();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlOrReq"


    // $ANTLR start "jmlLessThanEqualReq"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:108:1: jmlLessThanEqualReq : ID LESSTHANEQUAL tstate= NUMBERS ;
    public final void jmlLessThanEqualReq() throws RecognitionException {
        Token tstate=null;

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:108:20: ( ID LESSTHANEQUAL tstate= NUMBERS )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:108:22: ID LESSTHANEQUAL tstate= NUMBERS
            {
            match(input,ID,FOLLOW_ID_in_jmlLessThanEqualReq1170); 
            match(input,LESSTHANEQUAL,FOLLOW_LESSTHANEQUAL_in_jmlLessThanEqualReq1172); 
            tstate=(Token)match(input,NUMBERS,FOLLOW_NUMBERS_in_jmlLessThanEqualReq1176); 

            	      int n=Integer.parseInt((tstate!=null?tstate.getText():null));
            	      int x=1;
            	      while(x<=n){
            	       E_JmlSpecification.addRequires(""+x);
            	       x++;
            	    }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlLessThanEqualReq"


    // $ANTLR start "jmlReq"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:117:1: jmlReq : ID EQUALOPERATOR strState= NUMBERS ;
    public final void jmlReq() throws RecognitionException {
        Token strState=null;

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:117:7: ( ID EQUALOPERATOR strState= NUMBERS )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:117:9: ID EQUALOPERATOR strState= NUMBERS
            {
            match(input,ID,FOLLOW_ID_in_jmlReq1185); 
            match(input,EQUALOPERATOR,FOLLOW_EQUALOPERATOR_in_jmlReq1187); 
            strState=(Token)match(input,NUMBERS,FOLLOW_NUMBERS_in_jmlReq1191); 

              E_JmlSpecification.addRequires((strState!=null?strState.getText():null));



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlReq"


    // $ANTLR start "jmlEnsures"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:122:1: jmlEnsures : ( jmlEns | jmlOldEns );
    public final void jmlEnsures() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:122:11: ( jmlEns | jmlOldEns )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ENSURES) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==ID) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==EQUALOPERATOR) ) {
                        int LA8_3 = input.LA(4);

                        if ( (LA8_3==NUMBERS) ) {
                            alt8=1;
                        }
                        else if ( (LA8_3==OLD) ) {
                            alt8=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:122:12: jmlEns
                    {
                    pushFollow(FOLLOW_jmlEns_in_jmlEnsures1199);
                    jmlEns();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:122:19: jmlOldEns
                    {
                    pushFollow(FOLLOW_jmlOldEns_in_jmlEnsures1201);
                    jmlOldEns();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlEnsures"


    // $ANTLR start "jmlOldEns"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:124:1: jmlOldEns : ENSURES ID EQUALOPERATOR OLD LSBRACKET ID RSBRACKET (ope= PLUSMINUSOPERATOR num= NUMBERS )? SEMICOLON ;
    public final void jmlOldEns() throws RecognitionException {
        Token ope=null;
        Token num=null;

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:124:10: ( ENSURES ID EQUALOPERATOR OLD LSBRACKET ID RSBRACKET (ope= PLUSMINUSOPERATOR num= NUMBERS )? SEMICOLON )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:124:11: ENSURES ID EQUALOPERATOR OLD LSBRACKET ID RSBRACKET (ope= PLUSMINUSOPERATOR num= NUMBERS )? SEMICOLON
            {
            match(input,ENSURES,FOLLOW_ENSURES_in_jmlOldEns1207); 
            match(input,ID,FOLLOW_ID_in_jmlOldEns1209); 
            match(input,EQUALOPERATOR,FOLLOW_EQUALOPERATOR_in_jmlOldEns1211); 
            match(input,OLD,FOLLOW_OLD_in_jmlOldEns1213); 
            match(input,LSBRACKET,FOLLOW_LSBRACKET_in_jmlOldEns1215); 
            match(input,ID,FOLLOW_ID_in_jmlOldEns1217); 
            match(input,RSBRACKET,FOLLOW_RSBRACKET_in_jmlOldEns1219); 
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:124:63: (ope= PLUSMINUSOPERATOR num= NUMBERS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==PLUSMINUSOPERATOR) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:124:64: ope= PLUSMINUSOPERATOR num= NUMBERS
                    {
                    ope=(Token)match(input,PLUSMINUSOPERATOR,FOLLOW_PLUSMINUSOPERATOR_in_jmlOldEns1224); 
                    num=(Token)match(input,NUMBERS,FOLLOW_NUMBERS_in_jmlOldEns1228); 

                    }
                    break;

            }

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jmlOldEns1232); 


              if ((ope!=null?ope.getText():null)!=null&& (num!=null?num.getText():null)!=null)
                E_JmlSpecification.setEnsures("old"+(ope!=null?ope.getText():null)+(num!=null?num.getText():null));
             else
                E_JmlSpecification.setEnsures("old");
             


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlOldEns"


    // $ANTLR start "jmlEns"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:134:1: jmlEns : ENSURES ID EQUALOPERATOR strState= NUMBERS SEMICOLON ;
    public final void jmlEns() throws RecognitionException {
        Token strState=null;

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:134:7: ( ENSURES ID EQUALOPERATOR strState= NUMBERS SEMICOLON )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:134:9: ENSURES ID EQUALOPERATOR strState= NUMBERS SEMICOLON
            {
            match(input,ENSURES,FOLLOW_ENSURES_in_jmlEns1241); 
            match(input,ID,FOLLOW_ID_in_jmlEns1243); 
            match(input,EQUALOPERATOR,FOLLOW_EQUALOPERATOR_in_jmlEns1245); 
            strState=(Token)match(input,NUMBERS,FOLLOW_NUMBERS_in_jmlEns1249); 
            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jmlEns1251); 

              E_JmlSpecification.setEnsures((strState!=null?strState.getText():null));



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlEns"


    // $ANTLR start "jmlAssign"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:139:1: jmlAssign : ASSIGNABLE (strPerm= '\\\\everything' | strPerm= '\\\\nothing' | strPerm= ID ) SEMICOLON ;
    public final void jmlAssign() throws RecognitionException {
        Token strPerm=null;

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:139:10: ( ASSIGNABLE (strPerm= '\\\\everything' | strPerm= '\\\\nothing' | strPerm= ID ) SEMICOLON )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:139:11: ASSIGNABLE (strPerm= '\\\\everything' | strPerm= '\\\\nothing' | strPerm= ID ) SEMICOLON
            {
            match(input,ASSIGNABLE,FOLLOW_ASSIGNABLE_in_jmlAssign1258); 
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:139:22: (strPerm= '\\\\everything' | strPerm= '\\\\nothing' | strPerm= ID )
            int alt10=3;
            switch ( input.LA(1) ) {
            case EVERYTHING:
                {
                alt10=1;
                }
                break;
            case NOTHING:
                {
                alt10=2;
                }
                break;
            case ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:139:23: strPerm= '\\\\everything'
                    {
                    strPerm=(Token)match(input,EVERYTHING,FOLLOW_EVERYTHING_in_jmlAssign1263); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:139:46: strPerm= '\\\\nothing'
                    {
                    strPerm=(Token)match(input,NOTHING,FOLLOW_NOTHING_in_jmlAssign1267); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:139:66: strPerm= ID
                    {
                    strPerm=(Token)match(input,ID,FOLLOW_ID_in_jmlAssign1271); 

                    }
                    break;

            }

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jmlAssign1274); 

                
                String perm="Pure";
                String str=(strPerm!=null?strPerm.getText():null);
                if (str.compareTo("\\nothing")==0)
                      perm="Pure";
                 else if (str.length()>0)
                        perm="Full";       
                E_JmlSpecification.setPerm(perm);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jmlAssign"


    // $ANTLR start "specifications"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:155:1: specifications : ( perm | cases | classstates | refine );
    public final void specifications() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:155:15: ( perm | cases | classstates | refine )
            int alt11=4;
            switch ( input.LA(1) ) {
            case AT_FULL:
            case AT_PURE:
            case AT_IMMUTABLE:
            case AT_SHARE:
            case AT_UNIQUE:
            case PERM:
                {
                alt11=1;
                }
                break;
            case CASES:
                {
                alt11=2;
                }
                break;
            case CLASS_STATES:
                {
                alt11=3;
                }
                break;
            case REFINE:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:155:17: perm
                    {
                    pushFollow(FOLLOW_perm_in_specifications1287);
                    perm();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:155:22: cases
                    {
                    pushFollow(FOLLOW_cases_in_specifications1289);
                    cases();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:155:28: classstates
                    {
                    pushFollow(FOLLOW_classstates_in_specifications1291);
                    classstates();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:155:40: refine
                    {
                    pushFollow(FOLLOW_refine_in_specifications1293);
                    refine();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "specifications"


    // $ANTLR start "refine"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:158:1: refine : REFINE LSBRACKET LCBRACKET ( states ) ( PUNCTUATION states )* RCBRACKET RSBRACKET ;
    public final void refine() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:158:7: ( REFINE LSBRACKET LCBRACKET ( states ) ( PUNCTUATION states )* RCBRACKET RSBRACKET )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:158:8: REFINE LSBRACKET LCBRACKET ( states ) ( PUNCTUATION states )* RCBRACKET RSBRACKET
            {
            match(input,REFINE,FOLLOW_REFINE_in_refine1300); 
            match(input,LSBRACKET,FOLLOW_LSBRACKET_in_refine1302); 
            match(input,LCBRACKET,FOLLOW_LCBRACKET_in_refine1304); 
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:158:35: ( states )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:158:36: states
            {
            pushFollow(FOLLOW_states_in_refine1307);
            states();

            state._fsp--;


            }

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:158:44: ( PUNCTUATION states )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==PUNCTUATION) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:158:45: PUNCTUATION states
            	    {
            	    match(input,PUNCTUATION,FOLLOW_PUNCTUATION_in_refine1311); 
            	    pushFollow(FOLLOW_states_in_refine1313);
            	    states();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,RCBRACKET,FOLLOW_RCBRACKET_in_refine1318); 
            match(input,RSBRACKET,FOLLOW_RSBRACKET_in_refine1320); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "refine"


    // $ANTLR start "states"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:161:1: states : STATES LSBRACKET dimension PUNCTUATION ( value )* RSBRACKET ;
    public final void states() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:161:7: ( STATES LSBRACKET dimension PUNCTUATION ( value )* RSBRACKET )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:161:9: STATES LSBRACKET dimension PUNCTUATION ( value )* RSBRACKET
            {
            match(input,STATES,FOLLOW_STATES_in_states1329); 
            match(input,LSBRACKET,FOLLOW_LSBRACKET_in_states1331); 
            pushFollow(FOLLOW_dimension_in_states1333);
            dimension();

            state._fsp--;

            match(input,PUNCTUATION,FOLLOW_PUNCTUATION_in_states1335); 
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:161:48: ( value )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==VALUE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:161:49: value
            	    {
            	    pushFollow(FOLLOW_value_in_states1338);
            	    value();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,RSBRACKET,FOLLOW_RSBRACKET_in_states1342); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "states"


    // $ANTLR start "dimension"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:165:1: dimension : DIM EQUAL QUOTE dim= ID QUOTE ;
    public final void dimension() throws RecognitionException {
        Token dim=null;

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:165:10: ( DIM EQUAL QUOTE dim= ID QUOTE )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:165:12: DIM EQUAL QUOTE dim= ID QUOTE
            {
            match(input,DIM,FOLLOW_DIM_in_dimension1351); 
            match(input,EQUAL,FOLLOW_EQUAL_in_dimension1353); 
            match(input,QUOTE,FOLLOW_QUOTE_in_dimension1355); 
            dim=(Token)match(input,ID,FOLLOW_ID_in_dimension1359); 
            match(input,QUOTE,FOLLOW_QUOTE_in_dimension1361); 

                                                      EVMDD_SMC_Generator.addDimension((dim!=null?dim.getText():null));
                                                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dimension"


    // $ANTLR start "value"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:170:1: value : VALUE EQUAL LCBRACKET item ( PUNCTUATION item )* RCBRACKET ;
    public final void value() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:170:6: ( VALUE EQUAL LCBRACKET item ( PUNCTUATION item )* RCBRACKET )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:170:8: VALUE EQUAL LCBRACKET item ( PUNCTUATION item )* RCBRACKET
            {
            match(input,VALUE,FOLLOW_VALUE_in_value1371); 
            match(input,EQUAL,FOLLOW_EQUAL_in_value1373); 
            match(input,LCBRACKET,FOLLOW_LCBRACKET_in_value1375); 
            pushFollow(FOLLOW_item_in_value1377);
            item();

            state._fsp--;

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:170:35: ( PUNCTUATION item )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==PUNCTUATION) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:170:36: PUNCTUATION item
            	    {
            	    match(input,PUNCTUATION,FOLLOW_PUNCTUATION_in_value1380); 
            	    pushFollow(FOLLOW_item_in_value1382);
            	    item();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,RCBRACKET,FOLLOW_RCBRACKET_in_value1386); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "value"


    // $ANTLR start "item"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:172:1: item : QUOTE state_name= ID QUOTE ;
    public final void item() throws RecognitionException {
        Token state_name=null;

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:172:5: ( QUOTE state_name= ID QUOTE )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:172:7: QUOTE state_name= ID QUOTE
            {
            match(input,QUOTE,FOLLOW_QUOTE_in_item1393); 
            state_name=(Token)match(input,ID,FOLLOW_ID_in_item1397); 
            match(input,QUOTE,FOLLOW_QUOTE_in_item1399); 

                                               EVMDD_SMC_Generator.addDimensionValue((state_name!=null?state_name.getText():null));
                                               EVMDD_SMC_Generator.addState((state_name!=null?state_name.getText():null));
                                             

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "item"


    // $ANTLR start "classstates"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:179:1: classstates : start_classstates state ( PUNCTUATION state )* end_classstates ;
    public final void classstates() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:179:12: ( start_classstates state ( PUNCTUATION state )* end_classstates )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:179:14: start_classstates state ( PUNCTUATION state )* end_classstates
            {
            pushFollow(FOLLOW_start_classstates_in_classstates1410);
            start_classstates();

            state._fsp--;

            pushFollow(FOLLOW_state_in_classstates1412);
            state();

            state._fsp--;

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:179:38: ( PUNCTUATION state )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==PUNCTUATION) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:179:39: PUNCTUATION state
            	    {
            	    match(input,PUNCTUATION,FOLLOW_PUNCTUATION_in_classstates1415); 
            	    pushFollow(FOLLOW_state_in_classstates1417);
            	    state();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            pushFollow(FOLLOW_end_classstates_in_classstates1421);
            end_classstates();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "classstates"


    // $ANTLR start "start_classstates"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:182:1: start_classstates : CLASS_STATES LSBRACKET LCBRACKET ;
    public final void start_classstates() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:182:18: ( CLASS_STATES LSBRACKET LCBRACKET )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:182:19: CLASS_STATES LSBRACKET LCBRACKET
            {
            match(input,CLASS_STATES,FOLLOW_CLASS_STATES_in_start_classstates1428); 
            match(input,LSBRACKET,FOLLOW_LSBRACKET_in_start_classstates1430); 
            match(input,LCBRACKET,FOLLOW_LCBRACKET_in_start_classstates1432); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "start_classstates"


    // $ANTLR start "end_classstates"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:185:1: end_classstates : RCBRACKET RSBRACKET ;
    public final void end_classstates() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:185:16: ( RCBRACKET RSBRACKET )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:185:17: RCBRACKET RSBRACKET
            {
            match(input,RCBRACKET,FOLLOW_RCBRACKET_in_end_classstates1439); 
            match(input,RSBRACKET,FOLLOW_RSBRACKET_in_end_classstates1441); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "end_classstates"


    // $ANTLR start "state"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:188:1: state : STATE LSBRACKET NAME EQUAL QUOTE state_name= ID QUOTE ( PUNCTUATION invariant )* RSBRACKET ;
    public final void state() throws RecognitionException {
        Token state_name=null;

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:188:6: ( STATE LSBRACKET NAME EQUAL QUOTE state_name= ID QUOTE ( PUNCTUATION invariant )* RSBRACKET )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:188:8: STATE LSBRACKET NAME EQUAL QUOTE state_name= ID QUOTE ( PUNCTUATION invariant )* RSBRACKET
            {
            match(input,STATE,FOLLOW_STATE_in_state1449); 
            match(input,LSBRACKET,FOLLOW_LSBRACKET_in_state1451); 
            match(input,NAME,FOLLOW_NAME_in_state1453); 
            match(input,EQUAL,FOLLOW_EQUAL_in_state1455); 
            match(input,QUOTE,FOLLOW_QUOTE_in_state1457); 
            state_name=(Token)match(input,ID,FOLLOW_ID_in_state1461); 
            match(input,QUOTE,FOLLOW_QUOTE_in_state1463); 
             EVMDD_SMC_Generator.addState((state_name!=null?state_name.getText():null));
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:188:112: ( PUNCTUATION invariant )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==PUNCTUATION) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:188:113: PUNCTUATION invariant
            	    {
            	    match(input,PUNCTUATION,FOLLOW_PUNCTUATION_in_state1468); 
            	    pushFollow(FOLLOW_invariant_in_state1470);
            	    invariant();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,RSBRACKET,FOLLOW_RSBRACKET_in_state1474); 
            // add states into class structure
                                                                                                           
                                                                                                            

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "state"


    // $ANTLR start "invariant"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:193:1: invariant : INV EQUAL QUOTE ( condition ( AND condition )* )? QUOTE ;
    public final void invariant() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:193:10: ( INV EQUAL QUOTE ( condition ( AND condition )* )? QUOTE )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:193:11: INV EQUAL QUOTE ( condition ( AND condition )* )? QUOTE
            {
            match(input,INV,FOLLOW_INV_in_invariant1569); 
            match(input,EQUAL,FOLLOW_EQUAL_in_invariant1571); 
            match(input,QUOTE,FOLLOW_QUOTE_in_invariant1573); 
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:193:27: ( condition ( AND condition )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=FULL && LA18_0<=UNIQUE)||LA18_0==ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:193:28: condition ( AND condition )*
                    {
                    pushFollow(FOLLOW_condition_in_invariant1576);
                    condition();

                    state._fsp--;

                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:193:38: ( AND condition )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==AND) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:193:39: AND condition
                    	    {
                    	    match(input,AND,FOLLOW_AND_in_invariant1579); 
                    	    pushFollow(FOLLOW_condition_in_invariant1581);
                    	    condition();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,QUOTE,FOLLOW_QUOTE_in_invariant1587); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "invariant"


    // $ANTLR start "condition"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:196:1: condition : (var= ID op= OPERATOR val= ID | ap= accesspermission LSBRACKET var= ( THIS | ID ) RSBRACKET ( IN st= ID )? );
    public final void condition() throws RecognitionException {
        Token var=null;
        Token op=null;
        Token val=null;
        Token st=null;
        PluralParser.accesspermission_return ap = null;


        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:196:11: (var= ID op= OPERATOR val= ID | ap= accesspermission LSBRACKET var= ( THIS | ID ) RSBRACKET ( IN st= ID )? )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=FULL && LA20_0<=UNIQUE)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:196:13: var= ID op= OPERATOR val= ID
                    {
                    var=(Token)match(input,ID,FOLLOW_ID_in_condition1598); 
                    op=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_condition1602); 
                    val=(Token)match(input,ID,FOLLOW_ID_in_condition1606); 

                                                            String variable=(var!=null?var.getText():null);
                                                            String opertor=(op!=null?op.getText():null);
                                                            String value=(val!=null?val.getText():null);
                                                            EVMDD_SMC_Generator.addBoolStateInvariant(variable,opertor,value);
                                                          

                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:202:13: ap= accesspermission LSBRACKET var= ( THIS | ID ) RSBRACKET ( IN st= ID )?
                    {
                    pushFollow(FOLLOW_accesspermission_in_condition1624);
                    ap=accesspermission();

                    state._fsp--;

                    match(input,LSBRACKET,FOLLOW_LSBRACKET_in_condition1626); 
                    var=(Token)input.LT(1);
                    if ( input.LA(1)==THIS||input.LA(1)==ID ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    match(input,RSBRACKET,FOLLOW_RSBRACKET_in_condition1636); 
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:202:67: ( IN st= ID )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==IN) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:202:68: IN st= ID
                            {
                            match(input,IN,FOLLOW_IN_in_condition1639); 
                            st=(Token)match(input,ID,FOLLOW_ID_in_condition1643); 

                            }
                            break;

                    }


                                                                                          String accessPermission=(ap!=null?input.toString(ap.start,ap.stop):null);
                                                                                          String variable=(var!=null?var.getText():null);
                                                                                          String state=(st!=null?st.getText():null);
                                                                                          if (state==null)
                                                                                                state="alive";
                                                                                          EVMDD_SMC_Generator.addStateInvariant(accessPermission,variable,state);
                                                                                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "condition"


    // $ANTLR start "cases"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:212:1: cases : CASES LSBRACKET LCBRACKET perm ( other perm )* RCBRACKET RSBRACKET ;
    public final void cases() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:212:6: ( CASES LSBRACKET LCBRACKET perm ( other perm )* RCBRACKET RSBRACKET )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:212:7: CASES LSBRACKET LCBRACKET perm ( other perm )* RCBRACKET RSBRACKET
            {
            match(input,CASES,FOLLOW_CASES_in_cases1654); 
            match(input,LSBRACKET,FOLLOW_LSBRACKET_in_cases1656); 
            match(input,LCBRACKET,FOLLOW_LCBRACKET_in_cases1658); 
            pushFollow(FOLLOW_perm_in_cases1660);
            perm();

            state._fsp--;

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:212:38: ( other perm )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==PUNCTUATION) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:212:39: other perm
            	    {
            	    pushFollow(FOLLOW_other_in_cases1663);
            	    other();

            	    state._fsp--;

            	    pushFollow(FOLLOW_perm_in_cases1665);
            	    perm();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,RCBRACKET,FOLLOW_RCBRACKET_in_cases1669); 
            match(input,RSBRACKET,FOLLOW_RSBRACKET_in_cases1671); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cases"


    // $ANTLR start "other"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:215:1: other : PUNCTUATION ;
    public final void other() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:215:6: ( PUNCTUATION )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:215:8: PUNCTUATION
            {
            match(input,PUNCTUATION,FOLLOW_PUNCTUATION_in_other1679); 
            EVMDD_SMC_Generator.addCase();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "other"


    // $ANTLR start "perm"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:218:1: perm : ( PERM LSBRACKET requires_ensures_clause RSBRACKET | attype );
    public final void perm() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:218:5: ( PERM LSBRACKET requires_ensures_clause RSBRACKET | attype )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==PERM) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=AT_FULL && LA22_0<=AT_UNIQUE)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:218:7: PERM LSBRACKET requires_ensures_clause RSBRACKET
                    {
                    match(input,PERM,FOLLOW_PERM_in_perm1690); 
                    match(input,LSBRACKET,FOLLOW_LSBRACKET_in_perm1692); 
                    pushFollow(FOLLOW_requires_ensures_clause_in_perm1694);
                    requires_ensures_clause();

                    state._fsp--;

                    match(input,RSBRACKET,FOLLOW_RSBRACKET_in_perm1696); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:219:7: attype
                    {
                    pushFollow(FOLLOW_attype_in_perm1705);
                    attype();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "perm"


    // $ANTLR start "attype"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:1: attype : ap= at_ap_permission ( LSBRACKET ( REQUIRES EQUAL QUOTE restate= typestate QUOTE )? ( PUNCTUATION )? ( ENSURES EQUAL QUOTE enstate= typestate QUOTE )? ( PUNCTUATION usevalue )? )? ;
    public final void attype() throws RecognitionException {
        PluralParser.at_ap_permission_return ap = null;

        PluralParser.typestate_return restate = null;

        PluralParser.typestate_return enstate = null;


        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:7: (ap= at_ap_permission ( LSBRACKET ( REQUIRES EQUAL QUOTE restate= typestate QUOTE )? ( PUNCTUATION )? ( ENSURES EQUAL QUOTE enstate= typestate QUOTE )? ( PUNCTUATION usevalue )? )? )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:8: ap= at_ap_permission ( LSBRACKET ( REQUIRES EQUAL QUOTE restate= typestate QUOTE )? ( PUNCTUATION )? ( ENSURES EQUAL QUOTE enstate= typestate QUOTE )? ( PUNCTUATION usevalue )? )?
            {
            pushFollow(FOLLOW_at_ap_permission_in_attype1713);
            ap=at_ap_permission();

            state._fsp--;

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:28: ( LSBRACKET ( REQUIRES EQUAL QUOTE restate= typestate QUOTE )? ( PUNCTUATION )? ( ENSURES EQUAL QUOTE enstate= typestate QUOTE )? ( PUNCTUATION usevalue )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LSBRACKET) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:29: LSBRACKET ( REQUIRES EQUAL QUOTE restate= typestate QUOTE )? ( PUNCTUATION )? ( ENSURES EQUAL QUOTE enstate= typestate QUOTE )? ( PUNCTUATION usevalue )?
                    {
                    match(input,LSBRACKET,FOLLOW_LSBRACKET_in_attype1716); 
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:39: ( REQUIRES EQUAL QUOTE restate= typestate QUOTE )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==REQUIRES) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:40: REQUIRES EQUAL QUOTE restate= typestate QUOTE
                            {
                            match(input,REQUIRES,FOLLOW_REQUIRES_in_attype1719); 
                            match(input,EQUAL,FOLLOW_EQUAL_in_attype1721); 
                            match(input,QUOTE,FOLLOW_QUOTE_in_attype1723); 
                            pushFollow(FOLLOW_typestate_in_attype1727);
                            restate=typestate();

                            state._fsp--;

                            match(input,QUOTE,FOLLOW_QUOTE_in_attype1729); 

                            }
                            break;

                    }

                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:87: ( PUNCTUATION )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==PUNCTUATION) ) {
                        int LA24_1 = input.LA(2);

                        if ( (LA24_1==EOF||LA24_1==ENSURES||LA24_1==PUNCTUATION||LA24_1==RCBRACKET) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:88: PUNCTUATION
                            {
                            match(input,PUNCTUATION,FOLLOW_PUNCTUATION_in_attype1734); 

                            }
                            break;

                    }

                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:102: ( ENSURES EQUAL QUOTE enstate= typestate QUOTE )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==ENSURES) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:103: ENSURES EQUAL QUOTE enstate= typestate QUOTE
                            {
                            match(input,ENSURES,FOLLOW_ENSURES_in_attype1739); 
                            match(input,EQUAL,FOLLOW_EQUAL_in_attype1741); 
                            match(input,QUOTE,FOLLOW_QUOTE_in_attype1743); 
                            pushFollow(FOLLOW_typestate_in_attype1747);
                            enstate=typestate();

                            state._fsp--;

                            match(input,QUOTE,FOLLOW_QUOTE_in_attype1749); 

                            }
                            break;

                    }

                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:149: ( PUNCTUATION usevalue )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==PUNCTUATION) ) {
                        int LA26_1 = input.LA(2);

                        if ( (LA26_1==USE||LA26_1==VALUE) ) {
                            alt26=1;
                        }
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:221:150: PUNCTUATION usevalue
                            {
                            match(input,PUNCTUATION,FOLLOW_PUNCTUATION_in_attype1754); 
                            pushFollow(FOLLOW_usevalue_in_attype1756);
                            usevalue();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


                                                                    String str=(ap!=null?input.toString(ap.start,ap.stop):null);
                                                                    str=str.substring(1); //this remove @
                                                                    
                                                                    String re_state=(restate!=null?input.toString(restate.start,restate.stop):null);
                                                                    if (re_state==null)
                                                                        re_state="alive";
                                                                   
                                                                    String en_state=(enstate!=null?input.toString(enstate.start,enstate.stop):null);
                                                                    if (en_state==null)
                                                                        en_state="alive";
                                                                    
                                                                    EVMDD_SMC_Generator.addRequiresAP_TS(str.toString(),re_state);
                                                                    EVMDD_SMC_Generator.addEnsuresAP_TS(str.toString(),en_state);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "attype"


    // $ANTLR start "usevalue"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:238:1: usevalue : ( USE EQUAL USEFIELDS | VALUE EQUAL QUOTE ID QUOTE );
    public final void usevalue() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:238:9: ( USE EQUAL USEFIELDS | VALUE EQUAL QUOTE ID QUOTE )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==USE) ) {
                alt28=1;
            }
            else if ( (LA28_0==VALUE) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:238:11: USE EQUAL USEFIELDS
                    {
                    match(input,USE,FOLLOW_USE_in_usevalue1770); 
                    match(input,EQUAL,FOLLOW_EQUAL_in_usevalue1772); 
                    match(input,USEFIELDS,FOLLOW_USEFIELDS_in_usevalue1774); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:239:11: VALUE EQUAL QUOTE ID QUOTE
                    {
                    match(input,VALUE,FOLLOW_VALUE_in_usevalue1787); 
                    match(input,EQUAL,FOLLOW_EQUAL_in_usevalue1789); 
                    match(input,QUOTE,FOLLOW_QUOTE_in_usevalue1791); 
                    match(input,ID,FOLLOW_ID_in_usevalue1793); 
                    match(input,QUOTE,FOLLOW_QUOTE_in_usevalue1795); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usevalue"


    // $ANTLR start "requires_ensures_clause"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:243:1: requires_ensures_clause : ( requires_clause )? ( PUNCTUATION )? ( ensures_clause )? ;
    public final void requires_ensures_clause() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:243:24: ( ( requires_clause )? ( PUNCTUATION )? ( ensures_clause )? )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:243:26: ( requires_clause )? ( PUNCTUATION )? ( ensures_clause )?
            {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:243:26: ( requires_clause )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==REQUIRES) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:243:27: requires_clause
                    {
                    pushFollow(FOLLOW_requires_clause_in_requires_ensures_clause1809);
                    requires_clause();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:243:45: ( PUNCTUATION )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==PUNCTUATION) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:243:46: PUNCTUATION
                    {
                    match(input,PUNCTUATION,FOLLOW_PUNCTUATION_in_requires_ensures_clause1814); 

                    }
                    break;

            }

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:243:60: ( ensures_clause )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ENSURES) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:243:61: ensures_clause
                    {
                    pushFollow(FOLLOW_ensures_clause_in_requires_ensures_clause1819);
                    ensures_clause();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "requires_ensures_clause"


    // $ANTLR start "requires_clause"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:246:1: requires_clause : REQUIRES EQUAL QUOTE re_accesspermission_typestates ( AND re_accesspermission_typestates )* QUOTE ;
    public final void requires_clause() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:246:17: ( REQUIRES EQUAL QUOTE re_accesspermission_typestates ( AND re_accesspermission_typestates )* QUOTE )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:246:19: REQUIRES EQUAL QUOTE re_accesspermission_typestates ( AND re_accesspermission_typestates )* QUOTE
            {
            match(input,REQUIRES,FOLLOW_REQUIRES_in_requires_clause1830); 
            match(input,EQUAL,FOLLOW_EQUAL_in_requires_clause1832); 
            match(input,QUOTE,FOLLOW_QUOTE_in_requires_clause1834); 
            pushFollow(FOLLOW_re_accesspermission_typestates_in_requires_clause1836);
            re_accesspermission_typestates();

            state._fsp--;

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:246:71: ( AND re_accesspermission_typestates )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==AND) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:246:72: AND re_accesspermission_typestates
            	    {
            	    match(input,AND,FOLLOW_AND_in_requires_clause1839); 
            	    pushFollow(FOLLOW_re_accesspermission_typestates_in_requires_clause1841);
            	    re_accesspermission_typestates();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            match(input,QUOTE,FOLLOW_QUOTE_in_requires_clause1845); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "requires_clause"


    // $ANTLR start "ensures_clause"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:249:1: ensures_clause : ENSURES EQUAL QUOTE en_accesspermission_typestates ( AND en_accesspermission_typestates )* QUOTE ;
    public final void ensures_clause() throws RecognitionException {
        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:249:15: ( ENSURES EQUAL QUOTE en_accesspermission_typestates ( AND en_accesspermission_typestates )* QUOTE )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:249:17: ENSURES EQUAL QUOTE en_accesspermission_typestates ( AND en_accesspermission_typestates )* QUOTE
            {
            match(input,ENSURES,FOLLOW_ENSURES_in_ensures_clause1853); 
            match(input,EQUAL,FOLLOW_EQUAL_in_ensures_clause1855); 
            match(input,QUOTE,FOLLOW_QUOTE_in_ensures_clause1857); 
            pushFollow(FOLLOW_en_accesspermission_typestates_in_ensures_clause1859);
            en_accesspermission_typestates();

            state._fsp--;

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:249:68: ( AND en_accesspermission_typestates )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==AND) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:249:69: AND en_accesspermission_typestates
            	    {
            	    match(input,AND,FOLLOW_AND_in_ensures_clause1862); 
            	    pushFollow(FOLLOW_en_accesspermission_typestates_in_ensures_clause1864);
            	    en_accesspermission_typestates();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            match(input,QUOTE,FOLLOW_QUOTE_in_ensures_clause1868); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ensures_clause"


    // $ANTLR start "re_accesspermission_typestates"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:252:1: re_accesspermission_typestates : (ap= accesspermission LSBRACKET THIS RSBRACKET ( IN st= typestate )? | ap= accesspermission LSBRACKET para= PARAM RSBRACKET ( IN st= typestate )? | para= PARAM OPERATOR ID );
    public final void re_accesspermission_typestates() throws RecognitionException {
        Token para=null;
        PluralParser.accesspermission_return ap = null;

        PluralParser.typestate_return st = null;


        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:252:32: (ap= accesspermission LSBRACKET THIS RSBRACKET ( IN st= typestate )? | ap= accesspermission LSBRACKET para= PARAM RSBRACKET ( IN st= typestate )? | para= PARAM OPERATOR ID )
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=FULL && LA36_0<=UNIQUE)) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==LSBRACKET) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==THIS) ) {
                        alt36=1;
                    }
                    else if ( (LA36_3==PARAM) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA36_0==PARAM) ) {
                alt36=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:252:34: ap= accesspermission LSBRACKET THIS RSBRACKET ( IN st= typestate )?
                    {
                    pushFollow(FOLLOW_accesspermission_in_re_accesspermission_typestates1879);
                    ap=accesspermission();

                    state._fsp--;

                    match(input,LSBRACKET,FOLLOW_LSBRACKET_in_re_accesspermission_typestates1881); 
                    match(input,THIS,FOLLOW_THIS_in_re_accesspermission_typestates1883); 
                    match(input,RSBRACKET,FOLLOW_RSBRACKET_in_re_accesspermission_typestates1885); 
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:252:79: ( IN st= typestate )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==IN) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:252:80: IN st= typestate
                            {
                            match(input,IN,FOLLOW_IN_in_re_accesspermission_typestates1888); 
                            pushFollow(FOLLOW_typestate_in_re_accesspermission_typestates1892);
                            st=typestate();

                            state._fsp--;


                            }
                            break;

                    }


                                                                                                            String en_state=(st!=null?input.toString(st.start,st.stop):null);
                                                                                                            if (en_state==null)
                                                                                                                en_state="alive";
                                                                                                            EVMDD_SMC_Generator.addRequiresAP_TS((ap!=null?input.toString(ap.start,ap.stop):null),en_state);
                                                                                                

                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:258:33: ap= accesspermission LSBRACKET para= PARAM RSBRACKET ( IN st= typestate )?
                    {
                    pushFollow(FOLLOW_accesspermission_in_re_accesspermission_typestates1932);
                    ap=accesspermission();

                    state._fsp--;

                    match(input,LSBRACKET,FOLLOW_LSBRACKET_in_re_accesspermission_typestates1934); 
                    para=(Token)match(input,PARAM,FOLLOW_PARAM_in_re_accesspermission_typestates1938); 
                    match(input,RSBRACKET,FOLLOW_RSBRACKET_in_re_accesspermission_typestates1940); 
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:258:84: ( IN st= typestate )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==IN) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:258:85: IN st= typestate
                            {
                            match(input,IN,FOLLOW_IN_in_re_accesspermission_typestates1943); 
                            pushFollow(FOLLOW_typestate_in_re_accesspermission_typestates1947);
                            st=typestate();

                            state._fsp--;


                            }
                            break;

                    }


                                                                                                String re_state=(st!=null?input.toString(st.start,st.stop):null);
                                                                                                if (re_state==null)
                                                                                                          re_state="alive";
                                                                                                String param_number=(para!=null?para.getText():null);
                                                                                                param_number=param_number.substring(1); //this remove #
                                                                                                EVMDD_SMC_Generator.addRequiresParam_AP_TS((ap!=null?input.toString(ap.start,ap.stop):null),re_state,param_number);
                                                                                                

                    }
                    break;
                case 3 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:266:34: para= PARAM OPERATOR ID
                    {
                    para=(Token)match(input,PARAM,FOLLOW_PARAM_in_re_accesspermission_typestates1989); 
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_re_accesspermission_typestates1991); 
                    match(input,ID,FOLLOW_ID_in_re_accesspermission_typestates1993); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "re_accesspermission_typestates"


    // $ANTLR start "en_accesspermission_typestates"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:269:1: en_accesspermission_typestates : (ap= accesspermission LSBRACKET THIS RSBRACKET ( IN st= typestate )? | ap= accesspermission LSBRACKET RESULT RSBRACKET ( IN st= typestate )? | ap= accesspermission LSBRACKET para= PARAM RSBRACKET ( IN st= typestate )? | para= PARAM OPERATOR ID );
    public final void en_accesspermission_typestates() throws RecognitionException {
        Token para=null;
        PluralParser.accesspermission_return ap = null;

        PluralParser.typestate_return st = null;


        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:269:32: (ap= accesspermission LSBRACKET THIS RSBRACKET ( IN st= typestate )? | ap= accesspermission LSBRACKET RESULT RSBRACKET ( IN st= typestate )? | ap= accesspermission LSBRACKET para= PARAM RSBRACKET ( IN st= typestate )? | para= PARAM OPERATOR ID )
            int alt40=4;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=FULL && LA40_0<=UNIQUE)) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==LSBRACKET) ) {
                    switch ( input.LA(3) ) {
                    case THIS:
                        {
                        alt40=1;
                        }
                        break;
                    case RESULT:
                        {
                        alt40=2;
                        }
                        break;
                    case PARAM:
                        {
                        alt40=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==PARAM) ) {
                alt40=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:269:34: ap= accesspermission LSBRACKET THIS RSBRACKET ( IN st= typestate )?
                    {
                    pushFollow(FOLLOW_accesspermission_in_en_accesspermission_typestates2124);
                    ap=accesspermission();

                    state._fsp--;

                    match(input,LSBRACKET,FOLLOW_LSBRACKET_in_en_accesspermission_typestates2126); 
                    match(input,THIS,FOLLOW_THIS_in_en_accesspermission_typestates2128); 
                    match(input,RSBRACKET,FOLLOW_RSBRACKET_in_en_accesspermission_typestates2130); 
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:269:79: ( IN st= typestate )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==IN) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:269:80: IN st= typestate
                            {
                            match(input,IN,FOLLOW_IN_in_en_accesspermission_typestates2133); 
                            pushFollow(FOLLOW_typestate_in_en_accesspermission_typestates2137);
                            st=typestate();

                            state._fsp--;


                            }
                            break;

                    }

                     
                                                                                                 String en_state=(st!=null?input.toString(st.start,st.stop):null);
                                                                                                 if (en_state==null)
                                                                                                     en_state="alive";
                                                                                                EVMDD_SMC_Generator.addEnsuresAP_TS((ap!=null?input.toString(ap.start,ap.stop):null),en_state);
                                                                                                

                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:275:33: ap= accesspermission LSBRACKET RESULT RSBRACKET ( IN st= typestate )?
                    {
                    pushFollow(FOLLOW_accesspermission_in_en_accesspermission_typestates2177);
                    ap=accesspermission();

                    state._fsp--;

                    match(input,LSBRACKET,FOLLOW_LSBRACKET_in_en_accesspermission_typestates2179); 
                    match(input,RESULT,FOLLOW_RESULT_in_en_accesspermission_typestates2181); 
                    match(input,RSBRACKET,FOLLOW_RSBRACKET_in_en_accesspermission_typestates2183); 
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:275:80: ( IN st= typestate )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==IN) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:275:81: IN st= typestate
                            {
                            match(input,IN,FOLLOW_IN_in_en_accesspermission_typestates2186); 
                            pushFollow(FOLLOW_typestate_in_en_accesspermission_typestates2190);
                            st=typestate();

                            state._fsp--;


                            }
                            break;

                    }

                     
                                                                                                 String en_state=(st!=null?input.toString(st.start,st.stop):null);
                                                                                                 if (en_state==null)
                                                                                                     en_state="alive";
                                                                                                EVMDD_SMC_Generator.addEnsuresResult_AP_TS((ap!=null?input.toString(ap.start,ap.stop):null),en_state);
                                                                                                

                    }
                    break;
                case 3 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:281:33: ap= accesspermission LSBRACKET para= PARAM RSBRACKET ( IN st= typestate )?
                    {
                    pushFollow(FOLLOW_accesspermission_in_en_accesspermission_typestates2230);
                    ap=accesspermission();

                    state._fsp--;

                    match(input,LSBRACKET,FOLLOW_LSBRACKET_in_en_accesspermission_typestates2232); 
                    para=(Token)match(input,PARAM,FOLLOW_PARAM_in_en_accesspermission_typestates2236); 
                    match(input,RSBRACKET,FOLLOW_RSBRACKET_in_en_accesspermission_typestates2238); 
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:281:84: ( IN st= typestate )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==IN) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:281:85: IN st= typestate
                            {
                            match(input,IN,FOLLOW_IN_in_en_accesspermission_typestates2241); 
                            pushFollow(FOLLOW_typestate_in_en_accesspermission_typestates2245);
                            st=typestate();

                            state._fsp--;


                            }
                            break;

                    }


                                                                                                String en_state=(st!=null?input.toString(st.start,st.stop):null);
                                                                                                if (en_state==null)
                                                                                                      en_state="alive";
                                                                                                String param_number=(para!=null?para.getText():null);
                                                                                                param_number=param_number.substring(1); //this remove #
                                                                                                EVMDD_SMC_Generator.addEnsuresParam_AP_TS((ap!=null?input.toString(ap.start,ap.stop):null),en_state,param_number);
                                                                                                

                    }
                    break;
                case 4 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:289:34: para= PARAM OPERATOR ID
                    {
                    para=(Token)match(input,PARAM,FOLLOW_PARAM_in_en_accesspermission_typestates2287); 
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_en_accesspermission_typestates2289); 
                    match(input,ID,FOLLOW_ID_in_en_accesspermission_typestates2291); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "en_accesspermission_typestates"

    public static class typestate_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "typestate"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:292:1: typestate : ID ;
    public final PluralParser.typestate_return typestate() throws RecognitionException {
        PluralParser.typestate_return retval = new PluralParser.typestate_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:292:10: ( ID )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:292:12: ID
            {
            match(input,ID,FOLLOW_ID_in_typestate2351); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typestate"

    public static class at_ap_permission_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "at_ap_permission"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:295:1: at_ap_permission : ( AT_UNIQUE | AT_FULL | AT_SHARE | AT_PURE | AT_IMMUTABLE );
    public final PluralParser.at_ap_permission_return at_ap_permission() throws RecognitionException {
        PluralParser.at_ap_permission_return retval = new PluralParser.at_ap_permission_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:295:19: ( AT_UNIQUE | AT_FULL | AT_SHARE | AT_PURE | AT_IMMUTABLE )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:
            {
            if ( (input.LA(1)>=AT_FULL && input.LA(1)<=AT_UNIQUE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "at_ap_permission"

    public static class accesspermission_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "accesspermission"
    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:303:1: accesspermission : ( UNIQUE | FULL | SHARE | PURE | IMMUTABLE );
    public final PluralParser.accesspermission_return accesspermission() throws RecognitionException {
        PluralParser.accesspermission_return retval = new PluralParser.accesspermission_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:303:17: ( UNIQUE | FULL | SHARE | PURE | IMMUTABLE )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:
            {
            if ( (input.LA(1)>=FULL && input.LA(1)<=UNIQUE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "accesspermission"

    // Delegated rules


 

    public static final BitSet FOLLOW_jmlClassSpecifications_in_jmlSpecifications1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jmlMethodSpecification_in_jmlSpecifications1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jmlGhostDeclaration_in_jmlClassSpecifications1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jmlGhostInv_in_jmlClassSpecifications1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GHOST_in_jmlGhostDeclaration1068 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_INT_in_jmlGhostDeclaration1070 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_jmlGhostDeclaration1074 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jmlGhostDeclaration1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVARIANT_in_jmlGhostInv1084 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_NUMBERS_in_jmlGhostInv1089 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LESSTHANEQUAL_in_jmlGhostInv1091 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_jmlGhostInv1093 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ANDD_in_jmlGhostInv1095 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_jmlGhostInv1097 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LESSTHANEQUAL_in_jmlGhostInv1099 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_NUMBERS_in_jmlGhostInv1103 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jmlGhostInv1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JMLSTART_in_jmlMethodSpecification1114 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PUBLIC_BEHAVIOR_in_jmlMethodSpecification1116 = new BitSet(new long[]{0x0028000003000000L});
    public static final BitSet FOLLOW_REQUIRES_in_jmlMethodSpecification1120 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_jmlRequires_in_jmlMethodSpecification1122 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jmlMethodSpecification1125 = new BitSet(new long[]{0x0028000002000000L});
    public static final BitSet FOLLOW_jmlAssign_in_jmlMethodSpecification1130 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_jmlEnsures_in_jmlMethodSpecification1135 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_JMLEND_in_jmlMethodSpecification1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jmlReq_in_jmlRequires1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jmlOrReq_in_jmlRequires1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jmlLessThanEqualReq_in_jmlRequires1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jmlReq_in_jmlOrReq1156 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_OR_in_jmlOrReq1159 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_jmlReq_in_jmlOrReq1161 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ID_in_jmlLessThanEqualReq1170 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LESSTHANEQUAL_in_jmlLessThanEqualReq1172 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_NUMBERS_in_jmlLessThanEqualReq1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_jmlReq1185 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUALOPERATOR_in_jmlReq1187 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_NUMBERS_in_jmlReq1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jmlEns_in_jmlEnsures1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jmlOldEns_in_jmlEnsures1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENSURES_in_jmlOldEns1207 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_jmlOldEns1209 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUALOPERATOR_in_jmlOldEns1211 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_OLD_in_jmlOldEns1213 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_jmlOldEns1215 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_jmlOldEns1217 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_jmlOldEns1219 = new BitSet(new long[]{0x0010080000000000L});
    public static final BitSet FOLLOW_PLUSMINUSOPERATOR_in_jmlOldEns1224 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_NUMBERS_in_jmlOldEns1228 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jmlOldEns1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENSURES_in_jmlEns1241 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_jmlEns1243 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUALOPERATOR_in_jmlEns1245 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_NUMBERS_in_jmlEns1249 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jmlEns1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNABLE_in_jmlAssign1258 = new BitSet(new long[]{0x10C0000000000000L});
    public static final BitSet FOLLOW_EVERYTHING_in_jmlAssign1263 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NOTHING_in_jmlAssign1267 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_jmlAssign1271 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jmlAssign1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_perm_in_specifications1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cases_in_specifications1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classstates_in_specifications1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_refine_in_specifications1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFINE_in_refine1300 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_refine1302 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LCBRACKET_in_refine1304 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_states_in_refine1307 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_PUNCTUATION_in_refine1311 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_states_in_refine1313 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_RCBRACKET_in_refine1318 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_refine1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATES_in_states1329 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_states1331 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_dimension_in_states1333 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PUNCTUATION_in_states1335 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_value_in_states1338 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_states1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIM_in_dimension1351 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_dimension1353 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_dimension1355 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_dimension1359 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_dimension1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_value1371 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_value1373 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LCBRACKET_in_value1375 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_item_in_value1377 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_PUNCTUATION_in_value1380 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_item_in_value1382 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_RCBRACKET_in_value1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_item1393 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_item1397 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_item1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_classstates_in_classstates1410 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_state_in_classstates1412 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_PUNCTUATION_in_classstates1415 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_state_in_classstates1417 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_end_classstates_in_classstates1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_STATES_in_start_classstates1428 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_start_classstates1430 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LCBRACKET_in_start_classstates1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RCBRACKET_in_end_classstates1439 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_end_classstates1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATE_in_state1449 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_state1451 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_NAME_in_state1453 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_state1455 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_state1457 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_state1461 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_state1463 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_PUNCTUATION_in_state1468 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_invariant_in_state1470 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_state1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_invariant1569 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_invariant1571 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_invariant1573 = new BitSet(new long[]{0x1000000004007C00L});
    public static final BitSet FOLLOW_condition_in_invariant1576 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_AND_in_invariant1579 = new BitSet(new long[]{0x1000000000007C00L});
    public static final BitSet FOLLOW_condition_in_invariant1581 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_QUOTE_in_invariant1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_condition1598 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_OPERATOR_in_condition1602 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_condition1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesspermission_in_condition1624 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_condition1626 = new BitSet(new long[]{0x1000000000200000L});
    public static final BitSet FOLLOW_set_in_condition1630 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_condition1636 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IN_in_condition1639 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_condition1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASES_in_cases1654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_cases1656 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LCBRACKET_in_cases1658 = new BitSet(new long[]{0x00000000000201F0L});
    public static final BitSet FOLLOW_perm_in_cases1660 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_other_in_cases1663 = new BitSet(new long[]{0x00000000000201F0L});
    public static final BitSet FOLLOW_perm_in_cases1665 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_RCBRACKET_in_cases1669 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_cases1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUNCTUATION_in_other1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERM_in_perm1690 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_perm1692 = new BitSet(new long[]{0x0000000043010000L});
    public static final BitSet FOLLOW_requires_ensures_clause_in_perm1694 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_perm1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attype_in_perm1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_at_ap_permission_in_attype1713 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_LSBRACKET_in_attype1716 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_REQUIRES_in_attype1719 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_attype1721 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_attype1723 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_typestate_in_attype1727 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_attype1729 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_PUNCTUATION_in_attype1734 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_ENSURES_in_attype1739 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_attype1741 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_attype1743 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_typestate_in_attype1747 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_attype1749 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_PUNCTUATION_in_attype1754 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_usevalue_in_attype1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_usevalue1770 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_usevalue1772 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_USEFIELDS_in_usevalue1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_usevalue1787 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_usevalue1789 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_usevalue1791 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_usevalue1793 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_usevalue1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requires_clause_in_requires_ensures_clause1809 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_PUNCTUATION_in_requires_ensures_clause1814 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ensures_clause_in_requires_ensures_clause1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRES_in_requires_clause1830 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_requires_clause1832 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_requires_clause1834 = new BitSet(new long[]{0x1000000000807C00L});
    public static final BitSet FOLLOW_re_accesspermission_typestates_in_requires_clause1836 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_AND_in_requires_clause1839 = new BitSet(new long[]{0x1000000000807C00L});
    public static final BitSet FOLLOW_re_accesspermission_typestates_in_requires_clause1841 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_QUOTE_in_requires_clause1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENSURES_in_ensures_clause1853 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_ensures_clause1855 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTE_in_ensures_clause1857 = new BitSet(new long[]{0x1000000000807C00L});
    public static final BitSet FOLLOW_en_accesspermission_typestates_in_ensures_clause1859 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_AND_in_ensures_clause1862 = new BitSet(new long[]{0x1000000000807C00L});
    public static final BitSet FOLLOW_en_accesspermission_typestates_in_ensures_clause1864 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_QUOTE_in_ensures_clause1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesspermission_in_re_accesspermission_typestates1879 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_re_accesspermission_typestates1881 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_THIS_in_re_accesspermission_typestates1883 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_re_accesspermission_typestates1885 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IN_in_re_accesspermission_typestates1888 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_typestate_in_re_accesspermission_typestates1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesspermission_in_re_accesspermission_typestates1932 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_re_accesspermission_typestates1934 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PARAM_in_re_accesspermission_typestates1938 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_re_accesspermission_typestates1940 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IN_in_re_accesspermission_typestates1943 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_typestate_in_re_accesspermission_typestates1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_in_re_accesspermission_typestates1989 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_OPERATOR_in_re_accesspermission_typestates1991 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_re_accesspermission_typestates1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesspermission_in_en_accesspermission_typestates2124 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_en_accesspermission_typestates2126 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_THIS_in_en_accesspermission_typestates2128 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_en_accesspermission_typestates2130 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IN_in_en_accesspermission_typestates2133 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_typestate_in_en_accesspermission_typestates2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesspermission_in_en_accesspermission_typestates2177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_en_accesspermission_typestates2179 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RESULT_in_en_accesspermission_typestates2181 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_en_accesspermission_typestates2183 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IN_in_en_accesspermission_typestates2186 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_typestate_in_en_accesspermission_typestates2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesspermission_in_en_accesspermission_typestates2230 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LSBRACKET_in_en_accesspermission_typestates2232 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PARAM_in_en_accesspermission_typestates2236 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RSBRACKET_in_en_accesspermission_typestates2238 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IN_in_en_accesspermission_typestates2241 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_typestate_in_en_accesspermission_typestates2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_in_en_accesspermission_typestates2287 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_OPERATOR_in_en_accesspermission_typestates2289 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_en_accesspermission_typestates2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typestate2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_at_ap_permission0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_accesspermission0 = new BitSet(new long[]{0x0000000000000002L});

}