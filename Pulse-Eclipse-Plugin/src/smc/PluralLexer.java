// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g 2018-03-31 13:43:25

package smc;
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PluralLexer extends Lexer {
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

    public PluralLexer() {;} 
    public PluralLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PluralLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g"; }

    // $ANTLR start "AT_FULL"
    public final void mAT_FULL() throws RecognitionException {
        try {
            int _type = AT_FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:17:8: ( '@Full' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:17:20: '@Full'
            {
            match("@Full"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT_FULL"

    // $ANTLR start "AT_PURE"
    public final void mAT_PURE() throws RecognitionException {
        try {
            int _type = AT_PURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:18:8: ( '@Pure' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:18:20: '@Pure'
            {
            match("@Pure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT_PURE"

    // $ANTLR start "AT_IMMUTABLE"
    public final void mAT_IMMUTABLE() throws RecognitionException {
        try {
            int _type = AT_IMMUTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:19:13: ( '@Immutable' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:19:20: '@Immutable'
            {
            match("@Immutable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT_IMMUTABLE"

    // $ANTLR start "AT_SHARE"
    public final void mAT_SHARE() throws RecognitionException {
        try {
            int _type = AT_SHARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:20:9: ( '@Share' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:20:20: '@Share'
            {
            match("@Share"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT_SHARE"

    // $ANTLR start "AT_UNIQUE"
    public final void mAT_UNIQUE() throws RecognitionException {
        try {
            int _type = AT_UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:21:10: ( '@Unique' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:21:20: '@Unique'
            {
            match("@Unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT_UNIQUE"

    // $ANTLR start "PUBLIC_BEHAVIOR"
    public final void mPUBLIC_BEHAVIOR() throws RecognitionException {
        try {
            int _type = PUBLIC_BEHAVIOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:22:16: ( 'public_behavior' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:22:20: 'public_behavior'
            {
            match("public_behavior"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLIC_BEHAVIOR"

    // $ANTLR start "FULL"
    public final void mFULL() throws RecognitionException {
        try {
            int _type = FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:25:5: ( ( 'F' | 'f' ) 'ull' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:25:17: ( 'F' | 'f' ) 'ull'
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("ull"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FULL"

    // $ANTLR start "PURE"
    public final void mPURE() throws RecognitionException {
        try {
            int _type = PURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:26:5: ( ( 'P' | 'p' ) 'ure' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:26:17: ( 'P' | 'p' ) 'ure'
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("ure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PURE"

    // $ANTLR start "IMMUTABLE"
    public final void mIMMUTABLE() throws RecognitionException {
        try {
            int _type = IMMUTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:27:10: ( ( 'I' | 'i' ) 'mmutable' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:27:17: ( 'I' | 'i' ) 'mmutable'
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("mmutable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMMUTABLE"

    // $ANTLR start "SHARE"
    public final void mSHARE() throws RecognitionException {
        try {
            int _type = SHARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:28:6: ( ( 'S' | 's' ) 'hare' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:28:17: ( 'S' | 's' ) 'hare'
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("hare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHARE"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:29:7: ( ( 'U' | 'u' ) 'nique' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:29:17: ( 'U' | 'u' ) 'nique'
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("nique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNIQUE"

    // $ANTLR start "LSBRACKET"
    public final void mLSBRACKET() throws RecognitionException {
        try {
            int _type = LSBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:32:10: ( '(' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:32:17: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSBRACKET"

    // $ANTLR start "RSBRACKET"
    public final void mRSBRACKET() throws RecognitionException {
        try {
            int _type = RSBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:33:10: ( ')' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:33:17: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSBRACKET"

    // $ANTLR start "PERM"
    public final void mPERM() throws RecognitionException {
        try {
            int _type = PERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:34:5: ( '@' ( 'P' | 'p' ) 'erm' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:34:17: '@' ( 'P' | 'p' ) 'erm'
            {
            match('@'); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("erm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERM"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:35:6: ( '=' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:35:18: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "EQUALOPERATOR"
    public final void mEQUALOPERATOR() throws RecognitionException {
        try {
            int _type = EQUALOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:36:14: ( '==' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:36:26: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALOPERATOR"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:37:4: ( 'in' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:37:18: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:38:5: ( 'this' | 'this!fr' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='h') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='i') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='s') ) {
                            int LA1_4 = input.LA(5);

                            if ( (LA1_4=='!') ) {
                                alt1=2;
                            }
                            else {
                                alt1=1;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:38:18: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:38:25: 'this!fr'
                    {
                    match("this!fr"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "RESULT"
    public final void mRESULT() throws RecognitionException {
        try {
            int _type = RESULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:39:7: ( ( 'R' | 'r' ) 'esult' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:39:19: ( 'R' | 'r' ) 'esult'
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("esult"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESULT"

    // $ANTLR start "PARAM"
    public final void mPARAM() throws RecognitionException {
        try {
            int _type = PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:40:6: ( '#' ( '0' .. '9' )* )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:40:19: '#' ( '0' .. '9' )*
            {
            match('#'); 
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:40:22: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:40:23: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARAM"

    // $ANTLR start "REQUIRES"
    public final void mREQUIRES() throws RecognitionException {
        try {
            int _type = REQUIRES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:42:9: ( 'requires' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:42:18: 'requires'
            {
            match("requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REQUIRES"

    // $ANTLR start "ENSURES"
    public final void mENSURES() throws RecognitionException {
        try {
            int _type = ENSURES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:43:8: ( 'ensures' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:43:18: 'ensures'
            {
            match("ensures"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENSURES"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:44:6: ( '\"' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:44:18: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:45:4: ( '*' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:45:19: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:46:4: ( ( 'U' | 'u' ) 'se' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:46:19: ( 'U' | 'u' ) 'se'
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("se"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "USEFIELDS"
    public final void mUSEFIELDS() throws RecognitionException {
        try {
            int _type = USEFIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:47:10: ( ( 'U' | 'u' ) 'se.FIELDS' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:47:19: ( 'U' | 'u' ) 'se.FIELDS'
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("se.FIELDS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USEFIELDS"

    // $ANTLR start "PUNCTUATION"
    public final void mPUNCTUATION() throws RecognitionException {
        try {
            int _type = PUNCTUATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:49:13: ( ',' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:49:17: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUNCTUATION"

    // $ANTLR start "CASES"
    public final void mCASES() throws RecognitionException {
        try {
            int _type = CASES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:50:6: ( '@' ( 'C' | 'c' ) 'ases' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:50:17: '@' ( 'C' | 'c' ) 'ases'
            {
            match('@'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("ases"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASES"

    // $ANTLR start "LCBRACKET"
    public final void mLCBRACKET() throws RecognitionException {
        try {
            int _type = LCBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:51:10: ( '{' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:51:17: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCBRACKET"

    // $ANTLR start "RCBRACKET"
    public final void mRCBRACKET() throws RecognitionException {
        try {
            int _type = RCBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:52:10: ( '}' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:52:17: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCBRACKET"

    // $ANTLR start "CLASS_STATES"
    public final void mCLASS_STATES() throws RecognitionException {
        try {
            int _type = CLASS_STATES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:53:13: ( '@' ( 'C' | 'c' ) 'lass' ( 'S' | 's' ) 'tates' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:53:17: '@' ( 'C' | 'c' ) 'lass' ( 'S' | 's' ) 'tates'
            {
            match('@'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("lass"); 

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("tates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS_STATES"

    // $ANTLR start "REFINE"
    public final void mREFINE() throws RecognitionException {
        try {
            int _type = REFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:54:7: ( '@' ( 'R' | 'r' ) 'efine' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:54:17: '@' ( 'R' | 'r' ) 'efine'
            {
            match('@'); 
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("efine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFINE"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:55:6: ( ( 'V' | 'v' ) 'alue' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:55:17: ( 'V' | 'v' ) 'alue'
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("alue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUE"

    // $ANTLR start "STATE"
    public final void mSTATE() throws RecognitionException {
        try {
            int _type = STATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:56:6: ( '@' ( 'S' | 's' ) 'tate' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:56:17: '@' ( 'S' | 's' ) 'tate'
            {
            match('@'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("tate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATE"

    // $ANTLR start "STATES"
    public final void mSTATES() throws RecognitionException {
        try {
            int _type = STATES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:57:7: ( '@' ( 'S' | 's' ) 'tates' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:57:17: '@' ( 'S' | 's' ) 'tates'
            {
            match('@'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("tates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATES"

    // $ANTLR start "DIM"
    public final void mDIM() throws RecognitionException {
        try {
            int _type = DIM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:58:4: ( ( 'D' | 'd' ) 'im' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:58:17: ( 'D' | 'd' ) 'im'
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("im"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIM"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:59:5: ( ( 'N' | 'n' ) 'ame' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:59:17: ( 'N' | 'n' ) 'ame'
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("ame"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "INV"
    public final void mINV() throws RecognitionException {
        try {
            int _type = INV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:60:4: ( 'inv' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:60:17: 'inv'
            {
            match("inv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INV"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:61:9: ( '==' | '!=' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='=') ) {
                alt3=1;
            }
            else if ( (LA3_0=='!') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:61:17: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:61:22: '!='
                    {
                    match("!="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:62:10: ( ';' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:62:17: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:63:5: ( '<' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:63:18: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "LESSTHANEQUAL"
    public final void mLESSTHANEQUAL() throws RecognitionException {
        try {
            int _type = LESSTHANEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:64:14: ( '<=' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:64:18: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSTHANEQUAL"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:65:8: ( '>' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:65:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "GREATERTHANEQUAL"
    public final void mGREATERTHANEQUAL() throws RecognitionException {
        try {
            int _type = GREATERTHANEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:66:17: ( '>=' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:66:19: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATERTHANEQUAL"

    // $ANTLR start "ANDD"
    public final void mANDD() throws RecognitionException {
        try {
            int _type = ANDD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:67:5: ( '&&' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:67:21: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANDD"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:68:3: ( '||' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:68:20: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "JMLSTART"
    public final void mJMLSTART() throws RecognitionException {
        try {
            int _type = JMLSTART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:69:9: ( '/*@' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:69:20: '/*@'
            {
            match("/*@"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JMLSTART"

    // $ANTLR start "JMLEND"
    public final void mJMLEND() throws RecognitionException {
        try {
            int _type = JMLEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:70:7: ( '*/' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:70:20: '*/'
            {
            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JMLEND"

    // $ANTLR start "PLUSMINUSOPERATOR"
    public final void mPLUSMINUSOPERATOR() throws RecognitionException {
        try {
            int _type = PLUSMINUSOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:71:18: ( ( '+' | '-' ) )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:71:21: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSMINUSOPERATOR"

    // $ANTLR start "ASSIGNABLE"
    public final void mASSIGNABLE() throws RecognitionException {
        try {
            int _type = ASSIGNABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:72:11: ( 'assignable' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:72:18: 'assignable'
            {
            match("assignable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGNABLE"

    // $ANTLR start "NOTHING"
    public final void mNOTHING() throws RecognitionException {
        try {
            int _type = NOTHING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:73:8: ( '\\\\nothing' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:73:18: '\\\\nothing'
            {
            match("\\nothing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTHING"

    // $ANTLR start "EVERYTHING"
    public final void mEVERYTHING() throws RecognitionException {
        try {
            int _type = EVERYTHING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:74:11: ( '\\\\everything' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:74:18: '\\\\everything'
            {
            match("\\everything"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EVERYTHING"

    // $ANTLR start "GHOST"
    public final void mGHOST() throws RecognitionException {
        try {
            int _type = GHOST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:75:6: ( 'ghost' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:75:17: 'ghost'
            {
            match("ghost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GHOST"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:76:4: ( 'int' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:76:17: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "INVARIANT"
    public final void mINVARIANT() throws RecognitionException {
        try {
            int _type = INVARIANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:77:10: ( 'invariant' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:77:17: 'invariant'
            {
            match("invariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INVARIANT"

    // $ANTLR start "OLD"
    public final void mOLD() throws RecognitionException {
        try {
            int _type = OLD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:78:4: ( '\\\\old' )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:78:17: '\\\\old'
            {
            match("\\old"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OLD"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:79:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:79:17: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:79:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBERS"
    public final void mNUMBERS() throws RecognitionException {
        try {
            int _type = NUMBERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:80:8: ( ( '0' .. '9' )* )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:80:17: ( '0' .. '9' )*
            {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:80:17: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:80:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBERS"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:81:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:81:18: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:81:18: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:8: ( AT_FULL | AT_PURE | AT_IMMUTABLE | AT_SHARE | AT_UNIQUE | PUBLIC_BEHAVIOR | FULL | PURE | IMMUTABLE | SHARE | UNIQUE | LSBRACKET | RSBRACKET | PERM | EQUAL | EQUALOPERATOR | IN | THIS | RESULT | PARAM | REQUIRES | ENSURES | QUOTE | AND | USE | USEFIELDS | PUNCTUATION | CASES | LCBRACKET | RCBRACKET | CLASS_STATES | REFINE | VALUE | STATE | STATES | DIM | NAME | INV | OPERATOR | SEMICOLON | LESS | LESSTHANEQUAL | GREATER | GREATERTHANEQUAL | ANDD | OR | JMLSTART | JMLEND | PLUSMINUSOPERATOR | ASSIGNABLE | NOTHING | EVERYTHING | GHOST | INT | INVARIANT | OLD | ID | NUMBERS | WS )
        int alt7=59;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:10: AT_FULL
                {
                mAT_FULL(); 

                }
                break;
            case 2 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:18: AT_PURE
                {
                mAT_PURE(); 

                }
                break;
            case 3 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:26: AT_IMMUTABLE
                {
                mAT_IMMUTABLE(); 

                }
                break;
            case 4 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:39: AT_SHARE
                {
                mAT_SHARE(); 

                }
                break;
            case 5 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:48: AT_UNIQUE
                {
                mAT_UNIQUE(); 

                }
                break;
            case 6 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:58: PUBLIC_BEHAVIOR
                {
                mPUBLIC_BEHAVIOR(); 

                }
                break;
            case 7 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:74: FULL
                {
                mFULL(); 

                }
                break;
            case 8 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:79: PURE
                {
                mPURE(); 

                }
                break;
            case 9 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:84: IMMUTABLE
                {
                mIMMUTABLE(); 

                }
                break;
            case 10 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:94: SHARE
                {
                mSHARE(); 

                }
                break;
            case 11 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:100: UNIQUE
                {
                mUNIQUE(); 

                }
                break;
            case 12 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:107: LSBRACKET
                {
                mLSBRACKET(); 

                }
                break;
            case 13 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:117: RSBRACKET
                {
                mRSBRACKET(); 

                }
                break;
            case 14 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:127: PERM
                {
                mPERM(); 

                }
                break;
            case 15 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:132: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 16 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:138: EQUALOPERATOR
                {
                mEQUALOPERATOR(); 

                }
                break;
            case 17 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:152: IN
                {
                mIN(); 

                }
                break;
            case 18 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:155: THIS
                {
                mTHIS(); 

                }
                break;
            case 19 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:160: RESULT
                {
                mRESULT(); 

                }
                break;
            case 20 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:167: PARAM
                {
                mPARAM(); 

                }
                break;
            case 21 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:173: REQUIRES
                {
                mREQUIRES(); 

                }
                break;
            case 22 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:182: ENSURES
                {
                mENSURES(); 

                }
                break;
            case 23 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:190: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 24 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:196: AND
                {
                mAND(); 

                }
                break;
            case 25 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:200: USE
                {
                mUSE(); 

                }
                break;
            case 26 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:204: USEFIELDS
                {
                mUSEFIELDS(); 

                }
                break;
            case 27 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:214: PUNCTUATION
                {
                mPUNCTUATION(); 

                }
                break;
            case 28 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:226: CASES
                {
                mCASES(); 

                }
                break;
            case 29 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:232: LCBRACKET
                {
                mLCBRACKET(); 

                }
                break;
            case 30 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:242: RCBRACKET
                {
                mRCBRACKET(); 

                }
                break;
            case 31 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:252: CLASS_STATES
                {
                mCLASS_STATES(); 

                }
                break;
            case 32 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:265: REFINE
                {
                mREFINE(); 

                }
                break;
            case 33 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:272: VALUE
                {
                mVALUE(); 

                }
                break;
            case 34 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:278: STATE
                {
                mSTATE(); 

                }
                break;
            case 35 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:284: STATES
                {
                mSTATES(); 

                }
                break;
            case 36 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:291: DIM
                {
                mDIM(); 

                }
                break;
            case 37 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:295: NAME
                {
                mNAME(); 

                }
                break;
            case 38 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:300: INV
                {
                mINV(); 

                }
                break;
            case 39 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:304: OPERATOR
                {
                mOPERATOR(); 

                }
                break;
            case 40 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:313: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 41 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:323: LESS
                {
                mLESS(); 

                }
                break;
            case 42 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:328: LESSTHANEQUAL
                {
                mLESSTHANEQUAL(); 

                }
                break;
            case 43 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:342: GREATER
                {
                mGREATER(); 

                }
                break;
            case 44 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:350: GREATERTHANEQUAL
                {
                mGREATERTHANEQUAL(); 

                }
                break;
            case 45 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:367: ANDD
                {
                mANDD(); 

                }
                break;
            case 46 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:372: OR
                {
                mOR(); 

                }
                break;
            case 47 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:375: JMLSTART
                {
                mJMLSTART(); 

                }
                break;
            case 48 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:384: JMLEND
                {
                mJMLEND(); 

                }
                break;
            case 49 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:391: PLUSMINUSOPERATOR
                {
                mPLUSMINUSOPERATOR(); 

                }
                break;
            case 50 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:409: ASSIGNABLE
                {
                mASSIGNABLE(); 

                }
                break;
            case 51 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:420: NOTHING
                {
                mNOTHING(); 

                }
                break;
            case 52 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:428: EVERYTHING
                {
                mEVERYTHING(); 

                }
                break;
            case 53 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:439: GHOST
                {
                mGHOST(); 

                }
                break;
            case 54 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:445: INT
                {
                mINT(); 

                }
                break;
            case 55 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:449: INVARIANT
                {
                mINVARIANT(); 

                }
                break;
            case 56 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:459: OLD
                {
                mOLD(); 

                }
                break;
            case 57 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:463: ID
                {
                mID(); 

                }
                break;
            case 58 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:466: NUMBERS
                {
                mNUMBERS(); 

                }
                break;
            case 59 :
                // C:\\Users\\asad22\\ANTLRWorkspace\\pulse-distro\\src\\pt\\uma\\Plural\\grammar\\Plural.g:1:474: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\45\1\uffff\6\44\2\uffff\1\71\3\44\1\uffff\2\44\1\uffff\1\77"+
        "\3\uffff\3\44\2\uffff\1\104\1\106\4\uffff\1\44\1\uffff\1\44\14\uffff"+
        "\4\44\1\127\3\44\2\uffff\4\44\2\uffff\3\44\4\uffff\1\44\3\uffff"+
        "\1\44\5\uffff\4\44\1\153\1\154\1\uffff\2\44\1\160\1\uffff\5\44\1"+
        "\166\3\44\1\uffff\1\44\1\174\1\175\2\44\2\uffff\2\44\2\uffff\1\u0082"+
        "\4\44\1\uffff\1\u0087\2\44\1\uffff\1\44\2\uffff\2\44\1\u008e\1\44"+
        "\1\uffff\3\44\1\u0093\1\uffff\1\44\1\u0095\1\u0097\3\44\1\uffff"+
        "\1\u009b\1\u009c\2\44\1\uffff\1\44\3\uffff\3\44\2\uffff\1\44\1\u00a4"+
        "\4\44\1\u00a9\1\uffff\2\44\1\u00ac\1\u00ad\1\uffff\2\44\2\uffff"+
        "\1\u00b0\1\44\1\uffff\3\44\1\u00b5\1\uffff";
    static final String DFA7_eofS =
        "\u00b6\uffff";
    static final String DFA7_minS =
        "\1\11\1\103\3\165\1\155\1\150\1\156\2\uffff\1\75\1\155\1\150\1"+
        "\145\1\uffff\1\145\1\156\1\uffff\1\57\3\uffff\1\141\1\151\1\141"+
        "\2\uffff\2\75\4\uffff\1\163\1\145\1\150\4\uffff\1\145\1\uffff\1"+
        "\150\2\uffff\1\141\1\uffff\1\164\1\142\1\154\1\162\1\155\1\60\1"+
        "\141\1\151\1\145\2\uffff\1\151\1\161\2\163\2\uffff\1\154\2\155\4"+
        "\uffff\1\163\3\uffff\1\157\2\uffff\1\141\2\uffff\1\154\1\145\1\154"+
        "\1\165\2\60\1\uffff\1\162\1\161\1\56\1\uffff\1\163\4\165\1\60\1"+
        "\145\1\151\1\163\1\164\1\151\2\60\1\164\1\162\2\uffff\1\145\1\165"+
        "\2\uffff\1\60\1\154\1\151\1\162\1\145\1\uffff\1\60\1\147\1\164\1"+
        "\145\1\143\2\uffff\1\141\1\151\1\60\1\145\1\uffff\1\164\1\162\1"+
        "\145\1\60\1\uffff\1\156\1\60\1\163\1\137\1\142\1\141\1\uffff\2\60"+
        "\1\145\1\163\1\uffff\1\141\3\uffff\1\142\1\154\1\156\2\uffff\1\163"+
        "\1\60\1\142\2\145\1\164\1\60\1\uffff\1\154\1\150\2\60\1\uffff\1"+
        "\145\1\141\2\uffff\1\60\1\166\1\uffff\1\151\1\157\1\162\1\60\1\uffff";
    static final String DFA7_maxS =
        "\1\175\1\163\3\165\1\156\1\150\1\163\2\uffff\1\75\1\155\1\150\1"+
        "\145\1\uffff\1\145\1\156\1\uffff\1\57\3\uffff\1\141\1\151\1\141"+
        "\2\uffff\2\75\4\uffff\1\163\1\157\1\150\4\uffff\1\165\1\uffff\1"+
        "\164\2\uffff\1\154\1\uffff\1\164\1\162\1\154\1\162\1\155\1\172\1"+
        "\141\1\151\1\145\2\uffff\1\151\3\163\2\uffff\1\154\2\155\4\uffff"+
        "\1\163\3\uffff\1\157\2\uffff\1\141\2\uffff\1\154\1\145\1\154\1\165"+
        "\2\172\1\uffff\1\162\1\161\1\172\1\uffff\1\163\4\165\1\172\1\145"+
        "\1\151\1\163\1\164\1\151\2\172\1\164\1\162\2\uffff\1\145\1\165\2"+
        "\uffff\1\172\1\154\1\151\1\162\1\145\1\uffff\1\172\1\147\1\164\1"+
        "\145\1\143\2\uffff\1\141\1\151\1\172\1\145\1\uffff\1\164\1\162\1"+
        "\145\1\172\1\uffff\1\156\1\172\1\163\1\137\1\142\1\141\1\uffff\2"+
        "\172\1\145\1\163\1\uffff\1\141\3\uffff\1\142\1\154\1\156\2\uffff"+
        "\1\163\1\172\1\142\2\145\1\164\1\172\1\uffff\1\154\1\150\2\172\1"+
        "\uffff\1\145\1\141\2\uffff\1\172\1\166\1\uffff\1\151\1\157\1\162"+
        "\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\10\uffff\1\14\1\15\4\uffff\1\24\2\uffff\1\27\1\uffff\1\33\1\35"+
        "\1\36\3\uffff\1\47\1\50\2\uffff\1\55\1\56\1\57\1\61\3\uffff\1\71"+
        "\1\72\1\73\1\1\1\uffff\1\3\1\uffff\1\5\1\16\1\uffff\1\40\11\uffff"+
        "\1\20\1\17\4\uffff\1\60\1\30\3\uffff\1\52\1\51\1\54\1\53\1\uffff"+
        "\1\63\1\64\1\70\1\uffff\1\2\1\4\1\uffff\1\34\1\37\6\uffff\1\21\3"+
        "\uffff\1\20\17\uffff\1\46\1\66\2\uffff\1\32\1\31\5\uffff\1\44\5"+
        "\uffff\1\10\1\7\4\uffff\1\22\4\uffff\1\45\6\uffff\1\12\4\uffff\1"+
        "\41\1\uffff\1\65\1\43\1\42\3\uffff\1\13\1\23\7\uffff\1\26\4\uffff"+
        "\1\25\2\uffff\1\11\1\67\2\uffff\1\62\4\uffff\1\6";
    static final String DFA7_specialS =
        "\u00b6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\46\2\uffff\1\46\22\uffff\1\46\1\31\1\21\1\16\2\uffff\1\35"+
            "\1\uffff\1\10\1\11\1\22\1\40\1\23\1\40\1\uffff\1\37\13\uffff"+
            "\1\32\1\33\1\12\1\34\1\uffff\1\1\3\44\1\27\1\44\1\3\2\44\1\13"+
            "\4\44\1\30\1\44\1\4\1\44\1\17\1\6\1\44\1\7\1\26\4\44\1\uffff"+
            "\1\42\4\uffff\1\41\2\44\1\27\1\20\1\3\1\43\1\44\1\5\4\44\1\30"+
            "\1\44\1\2\1\44\1\15\1\6\1\14\1\7\1\26\4\44\1\24\1\36\1\25",
            "\1\55\2\uffff\1\47\2\uffff\1\51\6\uffff\1\50\1\uffff\1\56"+
            "\1\52\1\uffff\1\53\15\uffff\1\55\14\uffff\1\54\1\uffff\1\56"+
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63\1\64",
            "\1\65",
            "\1\66\4\uffff\1\67",
            "",
            "",
            "\1\70",
            "\1\63",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\103",
            "\1\105",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\111\10\uffff\1\110\1\112",
            "\1\113",
            "",
            "",
            "",
            "",
            "\1\54\17\uffff\1\114",
            "",
            "\1\115\13\uffff\1\116",
            "",
            "",
            "\1\117\12\uffff\1\120",
            "",
            "\1\116",
            "\1\121\17\uffff\1\122",
            "\1\123",
            "\1\122",
            "\1\124",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\126\1\44"+
            "\1\125\4\44",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "",
            "\1\134",
            "\1\136\1\uffff\1\135",
            "\1\135",
            "\1\137",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "",
            "",
            "\1\143",
            "",
            "",
            "",
            "\1\144",
            "",
            "",
            "\1\145",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\152\31\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\155",
            "\1\156",
            "\1\157\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\176",
            "\1\177",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0094",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0096",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "\1\u00a3",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00ae",
            "\1\u00af",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AT_FULL | AT_PURE | AT_IMMUTABLE | AT_SHARE | AT_UNIQUE | PUBLIC_BEHAVIOR | FULL | PURE | IMMUTABLE | SHARE | UNIQUE | LSBRACKET | RSBRACKET | PERM | EQUAL | EQUALOPERATOR | IN | THIS | RESULT | PARAM | REQUIRES | ENSURES | QUOTE | AND | USE | USEFIELDS | PUNCTUATION | CASES | LCBRACKET | RCBRACKET | CLASS_STATES | REFINE | VALUE | STATE | STATES | DIM | NAME | INV | OPERATOR | SEMICOLON | LESS | LESSTHANEQUAL | GREATER | GREATERTHANEQUAL | ANDD | OR | JMLSTART | JMLEND | PLUSMINUSOPERATOR | ASSIGNABLE | NOTHING | EVERYTHING | GHOST | INT | INVARIANT | OLD | ID | NUMBERS | WS );";
        }
    }
 

}