// $ANTLR 3.5 /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2013-03-11 15:53:18

 package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.properties.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.transforms.*; 
  import java.util.Map;
  import java.util.HashMap;
  import com.pixelmaid.dresscode.app.Window;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PogoTreeWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "Add", "And", "Assert", 
		"Assign", "BLOCK", "Bool", "CBrace", "CBracket", "COLOR_CONSTANT", "CParen", 
		"Comma", "Comment", "Copy", "Cosine", "Curve", "DOT", "DOTLOOKUP", "DOTPROPERTY", 
		"Def", "Digit", "Divide", "Do", "Dot", "DotEnd", "DotFill", "DotHeight", 
		"DotOrigin", "DotRotation", "DotStart", "DotStroke", "DotWeight", "DotWidth", 
		"DotX", "DotY", "EXP", "EXP_LIST", "Ellipse", "Else", "End", "Equals", 
		"Excl", "Expand", "FUNCTION", "FUNC_CALL", "Fill", "For", "GT", "GTEquals", 
		"Group", "HEIGHT_CONSTANT", "Hide", "ID_LIST", "IF", "INDEXES", "Identifier", 
		"If", "In", "Int", "LAdd", "LIST", "LOOKUP", "LRemove", "LShape", "LT", 
		"LTEquals", "Line", "Merge", "Modulus", "Move", "Multiply", "NEGATE", 
		"NEquals", "NoFill", "NoStroke", "Null", "Number", "OBrace", "OBracket", 
		"OParen", "Or", "PI_CONSTANT", "Point", "Polygon", "Pow", "Print", "Println", 
		"QMark", "Quad", "RETURN", "Rect", "Repeat", "Return", "Rotate", "SPECIAL", 
		"STATEMENTS", "Scale", "Sine", "Size", "Space", "String", "Stroke", "Subtract", 
		"TERNARY", "To", "Triangle", "UNARY_MIN", "WIDTH_CONSTANT", "Weight", 
		"While", "'&&'", "';'", "'|'", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int ASSIGNMENT=4;
	public static final int Add=5;
	public static final int And=6;
	public static final int Assert=7;
	public static final int Assign=8;
	public static final int BLOCK=9;
	public static final int Bool=10;
	public static final int CBrace=11;
	public static final int CBracket=12;
	public static final int COLOR_CONSTANT=13;
	public static final int CParen=14;
	public static final int Comma=15;
	public static final int Comment=16;
	public static final int Copy=17;
	public static final int Cosine=18;
	public static final int Curve=19;
	public static final int DOT=20;
	public static final int DOTLOOKUP=21;
	public static final int DOTPROPERTY=22;
	public static final int Def=23;
	public static final int Digit=24;
	public static final int Divide=25;
	public static final int Do=26;
	public static final int Dot=27;
	public static final int DotEnd=28;
	public static final int DotFill=29;
	public static final int DotHeight=30;
	public static final int DotOrigin=31;
	public static final int DotRotation=32;
	public static final int DotStart=33;
	public static final int DotStroke=34;
	public static final int DotWeight=35;
	public static final int DotWidth=36;
	public static final int DotX=37;
	public static final int DotY=38;
	public static final int EXP=39;
	public static final int EXP_LIST=40;
	public static final int Ellipse=41;
	public static final int Else=42;
	public static final int End=43;
	public static final int Equals=44;
	public static final int Excl=45;
	public static final int Expand=46;
	public static final int FUNCTION=47;
	public static final int FUNC_CALL=48;
	public static final int Fill=49;
	public static final int For=50;
	public static final int GT=51;
	public static final int GTEquals=52;
	public static final int Group=53;
	public static final int HEIGHT_CONSTANT=54;
	public static final int Hide=55;
	public static final int ID_LIST=56;
	public static final int IF=57;
	public static final int INDEXES=58;
	public static final int Identifier=59;
	public static final int If=60;
	public static final int In=61;
	public static final int Int=62;
	public static final int LAdd=63;
	public static final int LIST=64;
	public static final int LOOKUP=65;
	public static final int LRemove=66;
	public static final int LShape=67;
	public static final int LT=68;
	public static final int LTEquals=69;
	public static final int Line=70;
	public static final int Merge=71;
	public static final int Modulus=72;
	public static final int Move=73;
	public static final int Multiply=74;
	public static final int NEGATE=75;
	public static final int NEquals=76;
	public static final int NoFill=77;
	public static final int NoStroke=78;
	public static final int Null=79;
	public static final int Number=80;
	public static final int OBrace=81;
	public static final int OBracket=82;
	public static final int OParen=83;
	public static final int Or=84;
	public static final int PI_CONSTANT=85;
	public static final int Point=86;
	public static final int Polygon=87;
	public static final int Pow=88;
	public static final int Print=89;
	public static final int Println=90;
	public static final int QMark=91;
	public static final int Quad=92;
	public static final int RETURN=93;
	public static final int Rect=94;
	public static final int Repeat=95;
	public static final int Return=96;
	public static final int Rotate=97;
	public static final int SPECIAL=98;
	public static final int STATEMENTS=99;
	public static final int Scale=100;
	public static final int Sine=101;
	public static final int Size=102;
	public static final int Space=103;
	public static final int String=104;
	public static final int Stroke=105;
	public static final int Subtract=106;
	public static final int TERNARY=107;
	public static final int To=108;
	public static final int Triangle=109;
	public static final int UNARY_MIN=110;
	public static final int WIDTH_CONSTANT=111;
	public static final int Weight=112;
	public static final int While=113;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public PogoTreeWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public PogoTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return PogoTreeWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g"; }


	 
	  Scope currentScope = null;
	  public Map<String, FunctionType> functions = null;
	  
	  public PogoTreeWalker(CommonTreeNodeStream nodes, Map<String, FunctionType> fns) {
	    this(nodes, null, fns);
	  }
	  
	  public PogoTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns) {
	    super(nds);
	    currentScope = sc;
	    functions = fns;
	  }



	// $ANTLR start "walk"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:38:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:39:3: ( block )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:39:6: block
			{
			pushFollow(FOLLOW_block_in_walk64);
			block1=block();
			state._fsp--;

			node = block1;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "walk"



	// $ANTLR start "block"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:42:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final BlockNode block() throws RecognitionException {
		BlockNode node = null;


		DCNode statement2 =null;
		DCNode expression3 =null;


			//System.out.println(" new block called");

		  BlockNode bn = new BlockNode();
		  node = bn;
		  Scope local = new Scope(currentScope);
		  currentScope = local;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:55:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:55:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block95); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block98); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:55:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==For||LA1_0==IF||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:55:28: statement
						{
						pushFollow(FOLLOW_statement_in_block101);
						statement2=statement();
						state._fsp--;

						bn.addStatement(statement2);
						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}

			match(input,RETURN,FOLLOW_RETURN_in_block109); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:55:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||(LA2_0 >= UNARY_MIN && LA2_0 <= WIDTH_CONSTANT)||LA2_0==114||LA2_0==117) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:55:87: expression
						{
						pushFollow(FOLLOW_expression_in_block112);
						expression3=expression();
						state._fsp--;

						bn.addReturn(expression3);
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			}


			  currentScope = currentScope.parent();

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:59:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] );
	public final DCNode statement() throws RecognitionException {
		DCNode node = null;


		DCNode assignment4 =null;
		DCNode functionCall5 =null;
		DCNode ifStatement6 =null;
		DCNode forStatement7 =null;
		DCNode whileStatement8 =null;
		DCNode repeatStatement9 =null;


			//System.out.println(" statement called");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:63:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] )
			int alt3=6;
			switch ( input.LA(1) ) {
			case ASSIGNMENT:
				{
				alt3=1;
				}
				break;
			case FUNC_CALL:
				{
				alt3=2;
				}
				break;
			case IF:
				{
				alt3=3;
				}
				break;
			case For:
				{
				alt3=4;
				}
				break;
			case While:
				{
				alt3=5;
				}
				break;
			case Repeat:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:63:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement141);
					assignment4=assignment();
					state._fsp--;

					node = assignment4;
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:64:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement154);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement165);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6;
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:66:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement177);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7;
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:67:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement188);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8;
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:68:5: repeatStatement[false]
					{
					pushFollow(FOLLOW_repeatStatement_in_statement196);
					repeatStatement9=repeatStatement(false);
					state._fsp--;

					node = repeatStatement9;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "statement"



	// $ANTLR start "assignment"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:71:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier10=null;
		java.util.List<DCNode> indexes11 =null;
		DCNode expression12 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:72:3: ( ^( ASSIGNMENT Identifier ( indexes )? expression ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:72:6: ^( ASSIGNMENT Identifier ( indexes )? expression )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment218); 
			match(input, Token.DOWN, null); 
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment220); 
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:72:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:72:30: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment222);
					indexes11=indexes();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_expression_in_assignment225);
			expression12=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new AssignmentNode((Identifier10!=null?Identifier10.getText():null), indexes11, expression12, currentScope);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "functionCall"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:75:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall );
	public final DCNode functionCall() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier13=null;
		CommonTree FUNC_CALL20=null;
		CommonTree FUNC_CALL22=null;
		java.util.List<DCNode> exprList14 =null;
		DCNode expression15 =null;
		DCNode expression16 =null;
		DCNode expression17 =null;
		DCNode expression18 =null;
		java.util.List<DCNode> exprList19 =null;
		java.util.List<DCNode> exprList21 =null;
		DCNode primitiveCall23 =null;
		DCNode transformCall24 =null;
		DCNode mathCall25 =null;


			//System.out.println("function called");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:79:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall )
			int alt9=10;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FUNC_CALL) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt9=1;
						}
						break;
					case Println:
						{
						alt9=2;
						}
						break;
					case Print:
						{
						alt9=3;
						}
						break;
					case Assert:
						{
						alt9=4;
						}
						break;
					case Size:
						{
						alt9=5;
						}
						break;
					case LAdd:
						{
						alt9=6;
						}
						break;
					case LRemove:
						{
						alt9=7;
						}
						break;
					case Curve:
					case Ellipse:
					case LShape:
					case Line:
					case Point:
					case Polygon:
					case Rect:
						{
						alt9=8;
						}
						break;
					case Copy:
					case Expand:
					case Fill:
					case Group:
					case Hide:
					case Merge:
					case Move:
					case NoFill:
					case NoStroke:
					case Rotate:
					case Stroke:
					case Weight:
						{
						alt9=9;
						}
						break;
					case Cosine:
					case Sine:
						{
						alt9=10;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:79:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall251); 
					match(input, Token.DOWN, null); 
					Identifier13=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall253); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:79:29: ( exprList )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==EXP_LIST) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:79:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall255);
							exprList14=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FunctionCallNode((Identifier13!=null?Identifier13.getText():null), exprList14, functions);
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:80:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall267); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall269); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:80:26: ( expression )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==Add||LA6_0==Bool||LA6_0==COLOR_CONSTANT||LA6_0==DOTPROPERTY||LA6_0==Divide||LA6_0==Equals||(LA6_0 >= GT && LA6_0 <= GTEquals)||LA6_0==HEIGHT_CONSTANT||LA6_0==In||LA6_0==LOOKUP||(LA6_0 >= LT && LA6_0 <= LTEquals)||LA6_0==Modulus||(LA6_0 >= Multiply && LA6_0 <= NEquals)||(LA6_0 >= Null && LA6_0 <= Number)||LA6_0==PI_CONSTANT||LA6_0==Pow||(LA6_0 >= Subtract && LA6_0 <= TERNARY)||(LA6_0 >= UNARY_MIN && LA6_0 <= WIDTH_CONSTANT)||LA6_0==114||LA6_0==117) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:80:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall271);
							expression15=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression15);
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:81:6: ^( FUNC_CALL Print expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall284); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall286); 
					pushFollow(FOLLOW_expression_in_functionCall288);
					expression16=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression16);
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:82:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall303); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall305); 
					pushFollow(FOLLOW_expression_in_functionCall307);
					expression17=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression17);
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:83:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall321); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall323); 
					pushFollow(FOLLOW_expression_in_functionCall325);
					expression18=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression18);
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL20=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall341); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall343); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:23: ( exprList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EXP_LIST) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:84:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall345);
							exprList19=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LAddNode(exprList19,FUNC_CALL20.getLine());
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:85:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL22=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall358); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall360); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:85:26: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:85:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall362);
							exprList21=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LRemoveNode(exprList21,FUNC_CALL22.getLine());
					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall373);
					primitiveCall23=primitiveCall();
					state._fsp--;

					node = primitiveCall23;
					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:87:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall382);
					transformCall24=transformCall();
					state._fsp--;

					node = transformCall24;
					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:88:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall391);
					mathCall25=mathCall();
					state._fsp--;

					node= mathCall25;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "functionCall"



	// $ANTLR start "primitiveCall"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:92:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL27=null;
		CommonTree FUNC_CALL29=null;
		CommonTree FUNC_CALL31=null;
		CommonTree FUNC_CALL33=null;
		CommonTree FUNC_CALL35=null;
		CommonTree FUNC_CALL37=null;
		CommonTree FUNC_CALL39=null;
		java.util.List<DCNode> exprList26 =null;
		java.util.List<DCNode> exprList28 =null;
		java.util.List<DCNode> exprList30 =null;
		java.util.List<DCNode> exprList32 =null;
		java.util.List<DCNode> exprList34 =null;
		java.util.List<DCNode> exprList36 =null;
		java.util.List<DCNode> exprList38 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:93:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) )
			int alt17=7;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==FUNC_CALL) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Ellipse:
						{
						alt17=1;
						}
						break;
					case Line:
						{
						alt17=2;
						}
						break;
					case Rect:
						{
						alt17=3;
						}
						break;
					case Curve:
						{
						alt17=4;
						}
						break;
					case Polygon:
						{
						alt17=5;
						}
						break;
					case LShape:
						{
						alt17=6;
						}
						break;
					case Point:
						{
						alt17=7;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:93:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL27=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall418); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall420); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:93:25: ( exprList )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EXP_LIST) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:93:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall422);
							exprList26=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList26,FUNC_CALL27.getLine());
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL29=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall434); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall436); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:22: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall438);
							exprList28=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList28,FUNC_CALL29.getLine());
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL31=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall451); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall453); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall455);
							exprList30=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList30,FUNC_CALL31.getLine());
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL33=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall469); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall471); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:24: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:96:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall473);
							exprList32=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList32,FUNC_CALL33.getLine());
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:97:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL35=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall487); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall489); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:97:26: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:97:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall491);
							exprList34=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList34,FUNC_CALL35.getLine());
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:6: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL37=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall503); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall505); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:25: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:98:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall507);
							exprList36=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList36,FUNC_CALL37.getLine());
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:99:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL39=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall520); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall522); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:99:25: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:99:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall524);
							exprList38=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PointNode(exprList38,FUNC_CALL39.getLine());
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "primitiveCall"



	// $ANTLR start "transformCall"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:102:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) );
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL41=null;
		CommonTree FUNC_CALL43=null;
		CommonTree FUNC_CALL45=null;
		CommonTree FUNC_CALL47=null;
		CommonTree FUNC_CALL49=null;
		CommonTree FUNC_CALL51=null;
		CommonTree FUNC_CALL53=null;
		CommonTree FUNC_CALL55=null;
		CommonTree FUNC_CALL57=null;
		CommonTree FUNC_CALL59=null;
		CommonTree FUNC_CALL61=null;
		CommonTree FUNC_CALL63=null;
		java.util.List<DCNode> exprList40 =null;
		DCNode expression42 =null;
		java.util.List<DCNode> exprList44 =null;
		java.util.List<DCNode> exprList46 =null;
		java.util.List<DCNode> exprList48 =null;
		DCNode expression50 =null;
		DCNode expression52 =null;
		java.util.List<DCNode> exprList54 =null;
		DCNode expression56 =null;
		java.util.List<DCNode> exprList58 =null;
		DCNode expression60 =null;
		DCNode expression62 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) )
			int alt24=12;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==FUNC_CALL) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Move:
						{
						alt24=1;
						}
						break;
					case Copy:
						{
						alt24=2;
						}
						break;
					case Rotate:
						{
						alt24=3;
						}
						break;
					case Fill:
						{
						alt24=4;
						}
						break;
					case Stroke:
						{
						alt24=5;
						}
						break;
					case NoFill:
						{
						alt24=6;
						}
						break;
					case NoStroke:
						{
						alt24=7;
						}
						break;
					case Weight:
						{
						alt24=8;
						}
						break;
					case Hide:
						{
						alt24=9;
						}
						break;
					case Group:
						{
						alt24=10;
						}
						break;
					case Expand:
						{
						alt24=11;
						}
						break;
					case Merge:
						{
						alt24=12;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 24, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL41=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall551); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall553); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:22: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall555);
							exprList40=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveNode(exprList40,FUNC_CALL41.getLine());
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL43=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall568); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall570); 
					pushFollow(FOLLOW_expression_in_transformCall572);
					expression42=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression42,FUNC_CALL43.getLine());
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL45=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall583); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall585); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:24: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==EXP_LIST) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall587);
							exprList44=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RotateNode(exprList44,FUNC_CALL45.getLine());
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL47=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall598); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall600); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:22: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==EXP_LIST) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall602);
							exprList46=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList46,FUNC_CALL47.getLine());
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL49=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall615); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall617); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:24: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall619);
							exprList48=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList48,FUNC_CALL49.getLine());
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL51=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall630); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall632); 
					pushFollow(FOLLOW_expression_in_transformCall634);
					expression50=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoFillNode(expression50,FUNC_CALL51.getLine());
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL53=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall644); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall646); 
					pushFollow(FOLLOW_expression_in_transformCall648);
					expression52=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression52,FUNC_CALL53.getLine());
					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL55=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall658); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall660); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:24: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall662);
							exprList54=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList54,FUNC_CALL55.getLine());
					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL57=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall673); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall675); 
					pushFollow(FOLLOW_expression_in_transformCall677);
					expression56=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression56,FUNC_CALL57.getLine());
					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL59=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall687); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall689); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:23: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall691);
							exprList58=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList58,FUNC_CALL59.getLine());
					}
					break;
				case 11 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:113:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL61=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall702); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall704); 
					pushFollow(FOLLOW_expression_in_transformCall706);
					expression60=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ExpandNode(expression60,FUNC_CALL61.getLine());
					}
					break;
				case 12 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:114:6: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL63=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall716); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall718); 
					pushFollow(FOLLOW_expression_in_transformCall720);
					expression62=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MergeNode(expression62,FUNC_CALL63.getLine());
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "transformCall"



	// $ANTLR start "mathCall"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:117:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) );
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL65=null;
		CommonTree FUNC_CALL67=null;
		DCNode expression64 =null;
		DCNode expression66 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==FUNC_CALL) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==DOWN) ) {
					int LA25_2 = input.LA(3);
					if ( (LA25_2==Cosine) ) {
						alt25=1;
					}
					else if ( (LA25_2==Sine) ) {
						alt25=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL65=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall747); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall749); 
					pushFollow(FOLLOW_expression_in_mathCall751);
					expression64=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CosineNode(expression64,FUNC_CALL65.getLine());
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL67=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall761); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall763); 
					pushFollow(FOLLOW_expression_in_mathCall765);
					expression66=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SineNode(expression66,FUNC_CALL67.getLine());
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "mathCall"



	// $ANTLR start "ifStatement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement799); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement801);
			ifStat(ifNode);
			state._fsp--;

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:26: ( elseIfStat[ifNode] )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==EXP) ) {
					int LA26_1 = input.LA(2);
					if ( (LA26_1==DOWN) ) {
						int LA26_3 = input.LA(3);
						if ( (LA26_3==Add||LA26_3==Bool||LA26_3==COLOR_CONSTANT||LA26_3==DOTPROPERTY||LA26_3==Divide||LA26_3==Equals||(LA26_3 >= GT && LA26_3 <= GTEquals)||LA26_3==HEIGHT_CONSTANT||LA26_3==In||LA26_3==LOOKUP||(LA26_3 >= LT && LA26_3 <= LTEquals)||LA26_3==Modulus||(LA26_3 >= Multiply && LA26_3 <= NEquals)||(LA26_3 >= Null && LA26_3 <= Number)||LA26_3==PI_CONSTANT||LA26_3==Pow||(LA26_3 >= Subtract && LA26_3 <= TERNARY)||(LA26_3 >= UNARY_MIN && LA26_3 <= WIDTH_CONSTANT)||LA26_3==114||LA26_3==117) ) {
							alt26=1;
						}

					}

				}

				switch (alt26) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement805);
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
					break loop26;
				}
			}

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:48: ( elseStat[ifNode] )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==EXP) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement811);
					elseStat(ifNode);
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}

			node = ifNode;
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "ifStat"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:128:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression68 =null;
		BlockNode block69 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:3: ( ^( EXP expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat831); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat833);
			expression68=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat835);
			block69=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression68, block69);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifStat"



	// $ANTLR start "elseIfStat"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression70 =null;
		BlockNode block71 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:3: ( ^( EXP expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat854); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat856);
			expression70=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat858);
			block71=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(expression70, block71);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "elseIfStat"



	// $ANTLR start "elseStat"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block72 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:3: ( ^( EXP block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat877); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat879);
			block72=block();
			state._fsp--;

			match(input, Token.UP, null); 

			parent.addChoice(new AtomNode(true), block72);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "elseStat"



	// $ANTLR start "forStatement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier73=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block74 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement904); 
			match(input, Token.DOWN, null); 
			Identifier73=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement906); 
			pushFollow(FOLLOW_expression_in_forStatement910);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement914);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement916);
			block74=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForStatementNode((Identifier73!=null?Identifier73.getText():null), a, b, block74, currentScope);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "forStatement"



	// $ANTLR start "repeatStatement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:1: repeatStatement[boolean lookup] returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
	public final DCNode repeatStatement(boolean lookup) throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier75=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block76 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement940); 
			match(input, Token.DOWN, null); 
			Identifier75=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement942); 
			pushFollow(FOLLOW_expression_in_repeatStatement946);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement950);
			b=expression();
			state._fsp--;

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:51: (c= expression )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==Add||LA28_0==Bool||LA28_0==COLOR_CONSTANT||LA28_0==DOTPROPERTY||LA28_0==Divide||LA28_0==Equals||(LA28_0 >= GT && LA28_0 <= GTEquals)||LA28_0==HEIGHT_CONSTANT||LA28_0==In||LA28_0==LOOKUP||(LA28_0 >= LT && LA28_0 <= LTEquals)||LA28_0==Modulus||(LA28_0 >= Multiply && LA28_0 <= NEquals)||(LA28_0 >= Null && LA28_0 <= Number)||LA28_0==PI_CONSTANT||LA28_0==Pow||(LA28_0 >= Subtract && LA28_0 <= TERNARY)||(LA28_0 >= UNARY_MIN && LA28_0 <= WIDTH_CONSTANT)||LA28_0==114||LA28_0==117) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement955);
					c=expression();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_block_in_repeatStatement959);
			block76=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new RepeatStatementNode((Identifier75!=null?Identifier75.getText():null), a, b, c, block76, currentScope, lookup);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "repeatStatement"



	// $ANTLR start "whileStatement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


		DCNode expression77 =null;
		BlockNode block78 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:3: ( ^( While expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement982); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement984);
			expression77=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement986);
			block78=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileStatementNode(expression77, block78);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "whileStatement"



	// $ANTLR start "idList"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		CommonTree Identifier79=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1013); 
			match(input, Token.DOWN, null); 
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:16: ( Identifier )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==Identifier) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:17: Identifier
					{
					Identifier79=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1016); 
					i.add((Identifier79!=null?Identifier79.getText():null));
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression80 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1046); 
			match(input, Token.DOWN, null); 
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:17: ( expression )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==Add||LA30_0==Bool||LA30_0==COLOR_CONSTANT||LA30_0==DOTPROPERTY||LA30_0==Divide||LA30_0==Equals||(LA30_0 >= GT && LA30_0 <= GTEquals)||LA30_0==HEIGHT_CONSTANT||LA30_0==In||LA30_0==LOOKUP||(LA30_0 >= LT && LA30_0 <= LTEquals)||LA30_0==Modulus||(LA30_0 >= Multiply && LA30_0 <= NEquals)||(LA30_0 >= Null && LA30_0 <= Number)||LA30_0==PI_CONSTANT||LA30_0==Pow||(LA30_0 >= Subtract && LA30_0 <= TERNARY)||(LA30_0 >= UNARY_MIN && LA30_0 <= WIDTH_CONSTANT)||LA30_0==114||LA30_0==117) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:160:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1049);
					expression80=expression();
					state._fsp--;

					e.add(expression80);
					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "exprList"



	// $ANTLR start "expression"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:164:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


		CommonTree Number81=null;
		CommonTree Bool82=null;
		CommonTree COLOR_CONSTANT84=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup83 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt31=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt31=1;
				}
				break;
			case In:
				{
				alt31=2;
				}
				break;
			case 117:
				{
				alt31=3;
				}
				break;
			case 114:
				{
				alt31=4;
				}
				break;
			case Equals:
				{
				alt31=5;
				}
				break;
			case NEquals:
				{
				alt31=6;
				}
				break;
			case GTEquals:
				{
				alt31=7;
				}
				break;
			case LTEquals:
				{
				alt31=8;
				}
				break;
			case GT:
				{
				alt31=9;
				}
				break;
			case LT:
				{
				alt31=10;
				}
				break;
			case Add:
				{
				alt31=11;
				}
				break;
			case Subtract:
				{
				alt31=12;
				}
				break;
			case Multiply:
				{
				alt31=13;
				}
				break;
			case Divide:
				{
				alt31=14;
				}
				break;
			case Modulus:
				{
				alt31=15;
				}
				break;
			case Pow:
				{
				alt31=16;
				}
				break;
			case UNARY_MIN:
				{
				alt31=17;
				}
				break;
			case NEGATE:
				{
				alt31=18;
				}
				break;
			case Number:
				{
				alt31=19;
				}
				break;
			case Bool:
				{
				alt31=20;
				}
				break;
			case Null:
				{
				alt31=21;
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
				alt31=22;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt31=23;
				}
				break;
			case PI_CONSTANT:
				{
				alt31=24;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt31=25;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt31=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1074); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1078);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1082);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1086);
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c);
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression1097); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1101);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1105);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:6: ^( '||' a= expression b= expression )
					{
					match(input,117,FOLLOW_117_in_expression1134); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1138);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1142);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:6: ^( '&&' a= expression b= expression )
					{
					match(input,114,FOLLOW_114_in_expression1169); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1173);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1177);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b);
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression1204); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1208);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1212);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression1239); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1243);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1247);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:171:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression1274); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1278);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1282);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression1309); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1313);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1317);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression1344); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1348);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1352);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression1380); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1384);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1388);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression1416); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1420);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1424);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b);
					}
					break;
				case 12 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression1452); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1456);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1460);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b);
					}
					break;
				case 13 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:177:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression1488); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1492);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1496);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:178:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression1524); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1528);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1532);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1560); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1564);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1568);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:180:6: ^( '^' a= expression b= expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression1596); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1600);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1604);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:181:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression1632); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1636);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression1671); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1675);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:6: Number
					{
					Number81=(CommonTree)match(input,Number,FOLLOW_Number_in_expression1712); 
					node = new AtomNode(Double.parseDouble((Number81!=null?Number81.getText():null)));
					}
					break;
				case 20 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:184:6: Bool
					{
					Bool82=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression1764); 
					node = new AtomNode(Boolean.parseBoolean((Bool82!=null?Bool82.getText():null)));
					}
					break;
				case 21 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:185:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression1818); 
					node = new AtomNode(null);
					}
					break;
				case 22 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression1872);
					lookup83=lookup();
					state._fsp--;

					node = lookup83;
					}
					break;
				case 23 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:187:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT84=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression1924); 
					node = new AtomNode((COLOR_CONSTANT84!=null?COLOR_CONSTANT84.getText():null));
					}
					break;
				case 24 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:188:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression1943); 
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:189:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression1989); 
					node = new AtomNode(Window.canvas.width);
					}
					break;
				case 26 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:190:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2034); 
					node = new AtomNode(Window.canvas.height);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "expression"



	// $ANTLR start "list"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


		java.util.List<DCNode> exprList85 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:3: ( ^( LIST ( exprList )? ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2093); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:13: ( exprList )?
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==EXP_LIST) ) {
					alt32=1;
				}
				switch (alt32) {
					case 1 :
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list2095);
						exprList85=exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new ListNode(exprList85);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "list"



	// $ANTLR start "lookup"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier88=null;
		CommonTree Identifier93=null;
		CommonTree String94=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall86 =null;
		java.util.List<PropertyNode> dotProperty87 =null;
		java.util.List<PropertyNode> dotProperty89 =null;
		DCNode functionCall90 =null;
		DCNode list91 =null;
		DCNode expression92 =null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt38=7;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==DOTPROPERTY) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==DOWN) ) {
					int LA38_3 = input.LA(3);
					if ( (LA38_3==Identifier) ) {
						alt38=2;
					}
					else if ( (LA38_3==FUNC_CALL) ) {
						alt38=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 38, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA38_0==LOOKUP) ) {
				int LA38_2 = input.LA(2);
				if ( (LA38_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt38=6;
						}
						break;
					case String:
						{
						alt38=7;
						}
						break;
					case FUNC_CALL:
						{
						alt38=3;
						}
						break;
					case LIST:
						{
						alt38=4;
						}
						break;
					case Add:
					case Bool:
					case COLOR_CONSTANT:
					case DOTPROPERTY:
					case Divide:
					case Equals:
					case GT:
					case GTEquals:
					case HEIGHT_CONSTANT:
					case In:
					case LOOKUP:
					case LT:
					case LTEquals:
					case Modulus:
					case Multiply:
					case NEGATE:
					case NEquals:
					case Null:
					case Number:
					case PI_CONSTANT:
					case Pow:
					case Subtract:
					case TERNARY:
					case UNARY_MIN:
					case WIDTH_CONSTANT:
					case 114:
					case 117:
						{
						alt38=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 38, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:200:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2118); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2120);
					functionCall86=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup2122);
					dotProperty87=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(functionCall86, dotProperty87);
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:201:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2130); 
					match(input, Token.DOWN, null); 
					Identifier88=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2132); 
					pushFollow(FOLLOW_dotProperty_in_lookup2134);
					dotProperty89=dotProperty();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DotPropertyNode(new IdentifierNode((Identifier88!=null?Identifier88.getText():null), currentScope), dotProperty89);
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2158); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2160);
					functionCall90=functionCall();
					state._fsp--;

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:28: (i= indexes )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==INDEXES) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2164);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(functionCall90, i) : functionCall90;
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:208:6: ^( LOOKUP list (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2176); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup2178);
					list91=list();
					state._fsp--;

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:208:21: (i= indexes )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==INDEXES) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:208:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2182);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(list91, i) : list91;
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:6: ^( LOOKUP expression (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2202); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup2204);
					expression92=expression();
					state._fsp--;

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:27: (i= indexes )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==INDEXES) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2208);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(expression92, i) : expression92;
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:210:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2222); 
					match(input, Token.DOWN, null); 
					Identifier93=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2224); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:210:27: (i= indexes )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==INDEXES) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:210:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2228);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new IdentifierNode((Identifier93!=null?Identifier93.getText():null), currentScope), i) : new IdentifierNode((Identifier93!=null?Identifier93.getText():null), currentScope);
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:6: ^( LOOKUP String (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2242); 
					match(input, Token.DOWN, null); 
					String94=(CommonTree)match(input,String,FOLLOW_String_in_lookup2244); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:23: (i= indexes )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==INDEXES) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:211:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2248);
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = i != null ? new LookupNode(new AtomNode((String94!=null?String94.getText():null)), i) : new AtomNode((String94!=null?String94.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "lookup"



	// $ANTLR start "indexes"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


		DCNode expression95 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes2298); 
			match(input, Token.DOWN, null); 
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:16: ( expression )+
			int cnt39=0;
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==Add||LA39_0==Bool||LA39_0==COLOR_CONSTANT||LA39_0==DOTPROPERTY||LA39_0==Divide||LA39_0==Equals||(LA39_0 >= GT && LA39_0 <= GTEquals)||LA39_0==HEIGHT_CONSTANT||LA39_0==In||LA39_0==LOOKUP||(LA39_0 >= LT && LA39_0 <= LTEquals)||LA39_0==Modulus||(LA39_0 >= Multiply && LA39_0 <= NEquals)||(LA39_0 >= Null && LA39_0 <= Number)||LA39_0==PI_CONSTANT||LA39_0==Pow||(LA39_0 >= Subtract && LA39_0 <= TERNARY)||(LA39_0 >= UNARY_MIN && LA39_0 <= WIDTH_CONSTANT)||LA39_0==114||LA39_0==117) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes2301);
					expression95=expression();
					state._fsp--;

					e.add(expression95);
					}
					break;

				default :
					if ( cnt39 >= 1 ) break loop39;
					EarlyExitException eee = new EarlyExitException(39, input);
					throw eee;
				}
				cnt39++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "indexes"



	// $ANTLR start "dotProperty"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:228:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


		PropertyNode dotExpression96 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty2339); 
			match(input, Token.DOWN, null); 
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:12: ( dotExpression )+
			int cnt40=0;
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( ((LA40_0 >= DotEnd && LA40_0 <= DotY)) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2342);
					dotExpression96=dotExpression();
					state._fsp--;

					e.add(dotExpression96);
					}
					break;

				default :
					if ( cnt40 >= 1 ) break loop40;
					EarlyExitException eee = new EarlyExitException(40, input);
					throw eee;
				}
				cnt40++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "dotProperty"



	// $ANTLR start "dotExpression"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt41=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt41=1;
				}
				break;
			case DotY:
				{
				alt41=2;
				}
				break;
			case DotStart:
				{
				alt41=3;
				}
				break;
			case DotEnd:
				{
				alt41=4;
				}
				break;
			case DotOrigin:
				{
				alt41=5;
				}
				break;
			case DotRotation:
				{
				alt41=6;
				}
				break;
			case DotWidth:
				{
				alt41=7;
				}
				break;
			case DotHeight:
				{
				alt41=8;
				}
				break;
			case DotFill:
				{
				alt41=9;
				}
				break;
			case DotStroke:
				{
				alt41=10;
				}
				break;
			case DotWeight:
				{
				alt41=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression2370); 
					node = new XPropertyNode();
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression2378); 
					node = new YPropertyNode();
					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:236:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression2386); 
					node = new StartPropertyNode();
					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:237:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression2394); 
					node = new EndPropertyNode();
					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression2402); 
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:239:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression2410); 
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:240:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression2418); 
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:241:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression2426); 
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression2434); 
					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression2441); 
					}
					break;
				case 11 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:244:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression2448); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "dotExpression"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_walk64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block95 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STATEMENTS_in_block98 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_block101 = new BitSet(new long[]{0x0205000000000018L,0x0002000080000000L});
	public static final BitSet FOLLOW_RETURN_in_block109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x2458100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_assignment225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall251 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall253 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall255 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall267 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall269 = new BitSet(new long[]{0x2058100002402428L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_functionCall271 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall284 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall286 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_functionCall288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall303 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall305 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_functionCall307 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall321 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall323 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_functionCall325 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall343 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall345 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall358 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall360 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall362 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall420 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall436 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall438 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall453 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall469 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall471 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall473 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall487 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall489 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall503 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall505 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall507 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall520 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall522 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall524 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall551 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall553 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall555 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall568 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall570 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall572 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall583 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall585 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall587 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall600 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall602 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall615 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall617 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall619 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall630 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall632 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall634 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall646 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall648 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall658 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall660 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall662 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall673 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall675 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall677 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall687 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall689 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall691 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall702 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall704 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall706 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall716 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall718 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_transformCall720 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall747 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall749 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_mathCall751 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall763 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_mathCall765 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement799 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement801 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement805 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement811 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat831 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat833 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_ifStat835 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat854 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat856 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_elseIfStat858 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat877 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat879 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement904 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement906 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_forStatement910 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_forStatement914 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_forStatement916 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement940 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement942 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_repeatStatement946 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_repeatStatement950 = new BitSet(new long[]{0x2058100002402620L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_repeatStatement955 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_repeatStatement959 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement982 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement984 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_whileStatement986 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1013 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1016 = new BitSet(new long[]{0x0800000000000008L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1046 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1049 = new BitSet(new long[]{0x2058100002402428L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_TERNARY_in_expression1074 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1078 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1082 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1086 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression1097 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1101 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1105 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_117_in_expression1134 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1138 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1142 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_114_in_expression1169 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1173 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1177 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression1204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1208 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression1239 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1243 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1247 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression1274 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1278 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1282 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression1309 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1313 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1317 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression1344 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1348 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1352 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression1380 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1384 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1388 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression1416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1420 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1424 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression1452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1456 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1460 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression1488 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1492 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1496 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression1524 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1528 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1532 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1560 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1564 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1568 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression1596 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1600 = new BitSet(new long[]{0x2058100002402420L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_expression_in_expression1604 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression1632 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1636 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression1671 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1675 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression1712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression1818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression1924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression1943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2093 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list2095 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2118 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2120 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2122 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2132 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2134 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2158 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2160 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2164 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2176 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup2178 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2182 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup2204 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2208 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2222 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2224 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2242 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup2244 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_indexes_in_lookup2248 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes2298 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes2301 = new BitSet(new long[]{0x2058100002402428L,0x0024CC0001219D32L});
	public static final BitSet FOLLOW_DOT_in_dotProperty2339 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2342 = new BitSet(new long[]{0x0000007FF0000008L});
	public static final BitSet FOLLOW_DotX_in_dotExpression2370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression2378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression2386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression2394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression2402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression2410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression2418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression2426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression2434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression2441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression2448 = new BitSet(new long[]{0x0000000000000002L});
}
