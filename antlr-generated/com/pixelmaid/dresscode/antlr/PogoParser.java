// $ANTLR 3.5 /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-03-11 15:53:16

  package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PogoParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PogoParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PogoParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PogoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g"; }


	  public Map<String, FunctionType> functions = new HashMap<String, FunctionType>();
	  
	  private void defineFunction(String id, Object idList, Object block) {

	    // `idList` is possibly null! Create an empty tree in that case. 
	    CommonTree idListTree = idList == null ? new CommonTree() : (CommonTree)idList;

	    // `block` is never null.
	    CommonTree blockTree = (CommonTree)block;

	    // The function name with the number of parameters after it the unique key
	    String key = id + idListTree.getChildCount();
	    functions.put(key, new FunctionType(id, idListTree, blockTree));
	    System.out.println("defined function:"+id);
	  }


	public static class parse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parse"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:65:1: parse : block EOF -> block ;
	public final PogoParser.parse_return parse() throws RecognitionException {
		PogoParser.parse_return retval = new PogoParser.parse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope block1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:3: ( block EOF -> block )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:66:6: block EOF
			{
			pushFollow(FOLLOW_block_in_parse167);
			block1=block();
			state._fsp--;

			stream_block.add(block1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse169);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:16: -> block
			{
				adaptor.addChild(root_0, stream_block.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parse"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:69:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final PogoParser.block_return block() throws RecognitionException {
		PogoParser.block_return retval = new PogoParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Return5=null;
		Token char_literal7=null;
		ParserRuleReturnScope statement3 =null;
		ParserRuleReturnScope functionDecl4 =null;
		ParserRuleReturnScope expression6 =null;

		Object Return5_tree=null;
		Object char_literal7_tree=null;
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:5: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:5: ( statement | functionDecl )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Assert||(LA1_0 >= Copy && LA1_0 <= Curve)||LA1_0==Ellipse||LA1_0==Expand||(LA1_0 >= Fill && LA1_0 <= For)||LA1_0==Group||LA1_0==Hide||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==LAdd||(LA1_0 >= LRemove && LA1_0 <= LShape)||(LA1_0 >= Line && LA1_0 <= Merge)||LA1_0==Move||(LA1_0 >= NoFill && LA1_0 <= NoStroke)||(LA1_0 >= Point && LA1_0 <= Polygon)||(LA1_0 >= Print && LA1_0 <= Println)||(LA1_0 >= Rect && LA1_0 <= Repeat)||LA1_0==Rotate||(LA1_0 >= Sine && LA1_0 <= Size)||LA1_0==Stroke||(LA1_0 >= Weight && LA1_0 <= While)||LA1_0==115) ) {
					alt1=1;
				}
				else if ( (LA1_0==Def) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:6: statement
					{
					pushFollow(FOLLOW_statement_in_block187);
					statement3=statement();
					state._fsp--;

					stream_statement.add(statement3.getTree());
					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:18: functionDecl
					{
					pushFollow(FOLLOW_functionDecl_in_block191);
					functionDecl4=functionDecl();
					state._fsp--;

					stream_functionDecl.add(functionDecl4.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:33: ( Return expression ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Return) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:70:34: Return expression ';'
					{
					Return5=(Token)match(input,Return,FOLLOW_Return_in_block196);  
					stream_Return.add(Return5);

					pushFollow(FOLLOW_expression_in_block198);
					expression6=expression();
					state._fsp--;

					stream_expression.add(expression6.getTree());
					char_literal7=(Token)match(input,115,FOLLOW_115_in_block200);  
					stream_115.add(char_literal7);

					}
					break;

			}

			// AST REWRITE
			// elements: statement, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:71:51: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_2, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:74:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
	public final PogoParser.statement_return statement() throws RecognitionException {
		PogoParser.statement_return retval = new PogoParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal9=null;
		Token char_literal11=null;
		ParserRuleReturnScope assignment8 =null;
		ParserRuleReturnScope functionCall10 =null;
		ParserRuleReturnScope ifStatement12 =null;
		ParserRuleReturnScope forStatement13 =null;
		ParserRuleReturnScope whileStatement14 =null;
		ParserRuleReturnScope repeatStatement15 =null;

		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:75:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
			int alt3=6;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==OParen) ) {
					alt3=2;
				}
				else if ( (LA3_1==Assign||LA3_1==OBracket) ) {
					alt3=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 115:
				{
				alt3=1;
				}
				break;
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
			case Group:
			case Hide:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Merge:
			case Move:
			case NoFill:
			case NoStroke:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Rect:
			case Rotate:
			case Sine:
			case Size:
			case Stroke:
			case Weight:
				{
				alt3=2;
				}
				break;
			case If:
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
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:75:6: assignment ';'
					{
					pushFollow(FOLLOW_assignment_in_statement242);
					assignment8=assignment();
					state._fsp--;

					stream_assignment.add(assignment8.getTree());
					char_literal9=(Token)match(input,115,FOLLOW_115_in_statement244);  
					stream_115.add(char_literal9);

					// AST REWRITE
					// elements: assignment
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 75:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:76:6: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_statement257);
					functionCall10=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall10.getTree());
					char_literal11=(Token)match(input,115,FOLLOW_115_in_statement259);  
					stream_115.add(char_literal11);

					// AST REWRITE
					// elements: functionCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 76:24: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement271);
					ifStatement12=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement12.getTree());

					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement278);
					forStatement13=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement13.getTree());

					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:79:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement285);
					whileStatement14=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement14.getTree());

					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:6: repeatStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_repeatStatement_in_statement292);
					repeatStatement15=repeatStatement();
					state._fsp--;

					adaptor.addChild(root_0, repeatStatement15.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:83:1: assignment : ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |);
	public final PogoParser.assignment_return assignment() throws RecognitionException {
		PogoParser.assignment_return retval = new PogoParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier16=null;
		Token char_literal18=null;
		ParserRuleReturnScope indexes17 =null;
		ParserRuleReturnScope expression19 =null;

		Object Identifier16_tree=null;
		Object char_literal18_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			else if ( (LA5_0==115) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:6: Identifier ( indexes )? '=' expression
					{
					Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment306);  
					stream_Identifier.add(Identifier16);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:17: ( indexes )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OBracket) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment308);
							indexes17=indexes();
							state._fsp--;

							stream_indexes.add(indexes17.getTree());
							}
							break;

					}

					char_literal18=(Token)match(input,Assign,FOLLOW_Assign_in_assignment311);  
					stream_Assign.add(char_literal18);

					pushFollow(FOLLOW_expression_in_assignment313);
					expression19=expression();
					state._fsp--;

					stream_expression.add(expression19.getTree());
					// AST REWRITE
					// elements: Identifier, indexes, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:42: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:45: ^( ASSIGNMENT Identifier ( indexes )? expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:69: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:3: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:88:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall );
	public final PogoParser.functionCall_return functionCall() throws RecognitionException {
		PogoParser.functionCall_return retval = new PogoParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier20=null;
		Token char_literal21=null;
		Token char_literal23=null;
		Token Println24=null;
		Token char_literal25=null;
		Token char_literal27=null;
		Token Print28=null;
		Token char_literal29=null;
		Token char_literal31=null;
		Token Assert32=null;
		Token char_literal33=null;
		Token char_literal35=null;
		Token Size36=null;
		Token char_literal37=null;
		Token char_literal39=null;
		Token LAdd40=null;
		Token char_literal41=null;
		Token char_literal43=null;
		Token LRemove44=null;
		Token char_literal45=null;
		Token char_literal47=null;
		ParserRuleReturnScope exprList22 =null;
		ParserRuleReturnScope expression26 =null;
		ParserRuleReturnScope expression30 =null;
		ParserRuleReturnScope expression34 =null;
		ParserRuleReturnScope expression38 =null;
		ParserRuleReturnScope exprList42 =null;
		ParserRuleReturnScope exprList46 =null;
		ParserRuleReturnScope primitiveCall48 =null;
		ParserRuleReturnScope transformCall49 =null;
		ParserRuleReturnScope mathCall50 =null;

		Object Identifier20_tree=null;
		Object char_literal21_tree=null;
		Object char_literal23_tree=null;
		Object Println24_tree=null;
		Object char_literal25_tree=null;
		Object char_literal27_tree=null;
		Object Print28_tree=null;
		Object char_literal29_tree=null;
		Object char_literal31_tree=null;
		Object Assert32_tree=null;
		Object char_literal33_tree=null;
		Object char_literal35_tree=null;
		Object Size36_tree=null;
		Object char_literal37_tree=null;
		Object char_literal39_tree=null;
		Object LAdd40_tree=null;
		Object char_literal41_tree=null;
		Object char_literal43_tree=null;
		Object LRemove44_tree=null;
		Object char_literal45_tree=null;
		Object char_literal47_tree=null;
		RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_LRemove=new RewriteRuleTokenStream(adaptor,"token LRemove");
		RewriteRuleTokenStream stream_LAdd=new RewriteRuleTokenStream(adaptor,"token LAdd");
		RewriteRuleTokenStream stream_Assert=new RewriteRuleTokenStream(adaptor,"token Assert");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Print=new RewriteRuleTokenStream(adaptor,"token Print");
		RewriteRuleTokenStream stream_Size=new RewriteRuleTokenStream(adaptor,"token Size");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall )
			int alt10=10;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt10=1;
				}
				break;
			case Println:
				{
				alt10=2;
				}
				break;
			case Print:
				{
				alt10=3;
				}
				break;
			case Assert:
				{
				alt10=4;
				}
				break;
			case Size:
				{
				alt10=5;
				}
				break;
			case LAdd:
				{
				alt10=6;
				}
				break;
			case LRemove:
				{
				alt10=7;
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
				alt10=8;
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
				alt10=9;
				}
				break;
			case Cosine:
			case Sine:
				{
				alt10=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:6: Identifier '(' ( exprList )? ')'
					{
					Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall347);  
					stream_Identifier.add(Identifier20);

					char_literal21=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall349);  
					stream_OParen.add(char_literal21);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:21: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==Assert||LA6_0==Bool||LA6_0==COLOR_CONSTANT||(LA6_0 >= Copy && LA6_0 <= Curve)||LA6_0==Ellipse||(LA6_0 >= Excl && LA6_0 <= Expand)||LA6_0==Fill||(LA6_0 >= Group && LA6_0 <= Hide)||LA6_0==Identifier||LA6_0==LAdd||(LA6_0 >= LRemove && LA6_0 <= LShape)||(LA6_0 >= Line && LA6_0 <= Merge)||LA6_0==Move||(LA6_0 >= NoFill && LA6_0 <= Number)||(LA6_0 >= OBracket && LA6_0 <= OParen)||(LA6_0 >= PI_CONSTANT && LA6_0 <= Polygon)||(LA6_0 >= Print && LA6_0 <= Println)||LA6_0==Rect||LA6_0==Rotate||(LA6_0 >= Sine && LA6_0 <= Size)||(LA6_0 >= String && LA6_0 <= Subtract)||(LA6_0 >= WIDTH_CONSTANT && LA6_0 <= Weight)) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall351);
							exprList22=exprList();
							state._fsp--;

							stream_exprList.add(exprList22.getTree());
							}
							break;

					}

					char_literal23=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall354);  
					stream_CParen.add(char_literal23);

					// AST REWRITE
					// elements: Identifier, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 89:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:61: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:6: Println '(' ( expression )? ')'
					{
					Println24=(Token)match(input,Println,FOLLOW_Println_in_functionCall372);  
					stream_Println.add(Println24);

					char_literal25=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall374);  
					stream_OParen.add(char_literal25);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:18: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Assert||LA7_0==Bool||LA7_0==COLOR_CONSTANT||(LA7_0 >= Copy && LA7_0 <= Curve)||LA7_0==Ellipse||(LA7_0 >= Excl && LA7_0 <= Expand)||LA7_0==Fill||(LA7_0 >= Group && LA7_0 <= Hide)||LA7_0==Identifier||LA7_0==LAdd||(LA7_0 >= LRemove && LA7_0 <= LShape)||(LA7_0 >= Line && LA7_0 <= Merge)||LA7_0==Move||(LA7_0 >= NoFill && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||(LA7_0 >= PI_CONSTANT && LA7_0 <= Polygon)||(LA7_0 >= Print && LA7_0 <= Println)||LA7_0==Rect||LA7_0==Rotate||(LA7_0 >= Sine && LA7_0 <= Size)||(LA7_0 >= String && LA7_0 <= Subtract)||(LA7_0 >= WIDTH_CONSTANT && LA7_0 <= Weight)) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:18: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall376);
							expression26=expression();
							state._fsp--;

							stream_expression.add(expression26.getTree());
							}
							break;

					}

					char_literal27=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall379);  
					stream_CParen.add(char_literal27);

					// AST REWRITE
					// elements: Println, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 90:35: -> ^( FUNC_CALL Println ( expression )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:38: ^( FUNC_CALL Println ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Println.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:58: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:6: Print '(' expression ')'
					{
					Print28=(Token)match(input,Print,FOLLOW_Print_in_functionCall398);  
					stream_Print.add(Print28);

					char_literal29=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall400);  
					stream_OParen.add(char_literal29);

					pushFollow(FOLLOW_expression_in_functionCall402);
					expression30=expression();
					state._fsp--;

					stream_expression.add(expression30.getTree());
					char_literal31=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall404);  
					stream_CParen.add(char_literal31);

					// AST REWRITE
					// elements: Print, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 91:35: -> ^( FUNC_CALL Print expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:38: ^( FUNC_CALL Print expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Print.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:92:6: Assert '(' expression ')'
					{
					Assert32=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall425);  
					stream_Assert.add(Assert32);

					char_literal33=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall427);  
					stream_OParen.add(char_literal33);

					pushFollow(FOLLOW_expression_in_functionCall429);
					expression34=expression();
					state._fsp--;

					stream_expression.add(expression34.getTree());
					char_literal35=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall431);  
					stream_CParen.add(char_literal35);

					// AST REWRITE
					// elements: expression, Assert
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 92:35: -> ^( FUNC_CALL Assert expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:92:38: ^( FUNC_CALL Assert expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Assert.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:93:6: Size '(' expression ')'
					{
					Size36=(Token)match(input,Size,FOLLOW_Size_in_functionCall451);  
					stream_Size.add(Size36);

					char_literal37=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall453);  
					stream_OParen.add(char_literal37);

					pushFollow(FOLLOW_expression_in_functionCall455);
					expression38=expression();
					state._fsp--;

					stream_expression.add(expression38.getTree());
					char_literal39=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall457);  
					stream_CParen.add(char_literal39);

					// AST REWRITE
					// elements: Size, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 93:35: -> ^( FUNC_CALL Size expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:93:38: ^( FUNC_CALL Size expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Size.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:6: LAdd '(' ( exprList )? ')'
					{
					LAdd40=(Token)match(input,LAdd,FOLLOW_LAdd_in_functionCall479);  
					stream_LAdd.add(LAdd40);

					char_literal41=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall481);  
					stream_OParen.add(char_literal41);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:15: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==Assert||LA8_0==Bool||LA8_0==COLOR_CONSTANT||(LA8_0 >= Copy && LA8_0 <= Curve)||LA8_0==Ellipse||(LA8_0 >= Excl && LA8_0 <= Expand)||LA8_0==Fill||(LA8_0 >= Group && LA8_0 <= Hide)||LA8_0==Identifier||LA8_0==LAdd||(LA8_0 >= LRemove && LA8_0 <= LShape)||(LA8_0 >= Line && LA8_0 <= Merge)||LA8_0==Move||(LA8_0 >= NoFill && LA8_0 <= Number)||(LA8_0 >= OBracket && LA8_0 <= OParen)||(LA8_0 >= PI_CONSTANT && LA8_0 <= Polygon)||(LA8_0 >= Print && LA8_0 <= Println)||LA8_0==Rect||LA8_0==Rotate||(LA8_0 >= Sine && LA8_0 <= Size)||(LA8_0 >= String && LA8_0 <= Subtract)||(LA8_0 >= WIDTH_CONSTANT && LA8_0 <= Weight)) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall483);
							exprList42=exprList();
							state._fsp--;

							stream_exprList.add(exprList42.getTree());
							}
							break;

					}

					char_literal43=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall486);  
					stream_CParen.add(char_literal43);

					// AST REWRITE
					// elements: exprList, LAdd
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 94:31: -> ^( FUNC_CALL LAdd ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:34: ^( FUNC_CALL LAdd ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LAdd.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:51: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:6: LRemove '(' ( exprList )? ')'
					{
					LRemove44=(Token)match(input,LRemove,FOLLOW_LRemove_in_functionCall507);  
					stream_LRemove.add(LRemove44);

					char_literal45=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall509);  
					stream_OParen.add(char_literal45);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:18: ( exprList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==Assert||LA9_0==Bool||LA9_0==COLOR_CONSTANT||(LA9_0 >= Copy && LA9_0 <= Curve)||LA9_0==Ellipse||(LA9_0 >= Excl && LA9_0 <= Expand)||LA9_0==Fill||(LA9_0 >= Group && LA9_0 <= Hide)||LA9_0==Identifier||LA9_0==LAdd||(LA9_0 >= LRemove && LA9_0 <= LShape)||(LA9_0 >= Line && LA9_0 <= Merge)||LA9_0==Move||(LA9_0 >= NoFill && LA9_0 <= Number)||(LA9_0 >= OBracket && LA9_0 <= OParen)||(LA9_0 >= PI_CONSTANT && LA9_0 <= Polygon)||(LA9_0 >= Print && LA9_0 <= Println)||LA9_0==Rect||LA9_0==Rotate||(LA9_0 >= Sine && LA9_0 <= Size)||(LA9_0 >= String && LA9_0 <= Subtract)||(LA9_0 >= WIDTH_CONSTANT && LA9_0 <= Weight)) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:18: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall511);
							exprList46=exprList();
							state._fsp--;

							stream_exprList.add(exprList46.getTree());
							}
							break;

					}

					char_literal47=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall514);  
					stream_CParen.add(char_literal47);

					// AST REWRITE
					// elements: exprList, LRemove
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 95:34: -> ^( FUNC_CALL LRemove ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:37: ^( FUNC_CALL LRemove ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LRemove.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:57: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:6: primitiveCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveCall_in_functionCall535);
					primitiveCall48=primitiveCall();
					state._fsp--;

					adaptor.addChild(root_0, primitiveCall48.getTree());

					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:6: transformCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_transformCall_in_functionCall542);
					transformCall49=transformCall();
					state._fsp--;

					adaptor.addChild(root_0, transformCall49.getTree());

					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:6: mathCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_mathCall_in_functionCall549);
					mathCall50=mathCall();
					state._fsp--;

					adaptor.addChild(root_0, mathCall50.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class primitiveCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveCall"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:3: primitiveCall : ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) );
	public final PogoParser.primitiveCall_return primitiveCall() throws RecognitionException {
		PogoParser.primitiveCall_return retval = new PogoParser.primitiveCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Ellipse51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		Token Line55=null;
		Token char_literal56=null;
		Token char_literal58=null;
		Token Rect59=null;
		Token char_literal60=null;
		Token char_literal62=null;
		Token Curve63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		Token Polygon67=null;
		Token char_literal68=null;
		Token char_literal70=null;
		Token LShape71=null;
		Token char_literal72=null;
		Token char_literal74=null;
		Token Point75=null;
		Token char_literal76=null;
		Token char_literal78=null;
		ParserRuleReturnScope exprList53 =null;
		ParserRuleReturnScope exprList57 =null;
		ParserRuleReturnScope exprList61 =null;
		ParserRuleReturnScope exprList65 =null;
		ParserRuleReturnScope exprList69 =null;
		ParserRuleReturnScope exprList73 =null;
		ParserRuleReturnScope exprList77 =null;

		Object Ellipse51_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		Object Line55_tree=null;
		Object char_literal56_tree=null;
		Object char_literal58_tree=null;
		Object Rect59_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;
		Object Curve63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;
		Object Polygon67_tree=null;
		Object char_literal68_tree=null;
		Object char_literal70_tree=null;
		Object LShape71_tree=null;
		Object char_literal72_tree=null;
		Object char_literal74_tree=null;
		Object Point75_tree=null;
		Object char_literal76_tree=null;
		Object char_literal78_tree=null;
		RewriteRuleTokenStream stream_Polygon=new RewriteRuleTokenStream(adaptor,"token Polygon");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_LShape=new RewriteRuleTokenStream(adaptor,"token LShape");
		RewriteRuleTokenStream stream_Rect=new RewriteRuleTokenStream(adaptor,"token Rect");
		RewriteRuleTokenStream stream_Curve=new RewriteRuleTokenStream(adaptor,"token Curve");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Line=new RewriteRuleTokenStream(adaptor,"token Line");
		RewriteRuleTokenStream stream_Ellipse=new RewriteRuleTokenStream(adaptor,"token Ellipse");
		RewriteRuleTokenStream stream_Point=new RewriteRuleTokenStream(adaptor,"token Point");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:4: ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) )
			int alt18=7;
			switch ( input.LA(1) ) {
			case Ellipse:
				{
				alt18=1;
				}
				break;
			case Line:
				{
				alt18=2;
				}
				break;
			case Rect:
				{
				alt18=3;
				}
				break;
			case Curve:
				{
				alt18=4;
				}
				break;
			case Polygon:
				{
				alt18=5;
				}
				break;
			case LShape:
				{
				alt18=6;
				}
				break;
			case Point:
				{
				alt18=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:5: Ellipse '(' ( exprList )? ')'
					{
					Ellipse51=(Token)match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall569);  
					stream_Ellipse.add(Ellipse51);

					char_literal52=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall571);  
					stream_OParen.add(char_literal52);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:17: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==Assert||LA11_0==Bool||LA11_0==COLOR_CONSTANT||(LA11_0 >= Copy && LA11_0 <= Curve)||LA11_0==Ellipse||(LA11_0 >= Excl && LA11_0 <= Expand)||LA11_0==Fill||(LA11_0 >= Group && LA11_0 <= Hide)||LA11_0==Identifier||LA11_0==LAdd||(LA11_0 >= LRemove && LA11_0 <= LShape)||(LA11_0 >= Line && LA11_0 <= Merge)||LA11_0==Move||(LA11_0 >= NoFill && LA11_0 <= Number)||(LA11_0 >= OBracket && LA11_0 <= OParen)||(LA11_0 >= PI_CONSTANT && LA11_0 <= Polygon)||(LA11_0 >= Print && LA11_0 <= Println)||LA11_0==Rect||LA11_0==Rotate||(LA11_0 >= Sine && LA11_0 <= Size)||(LA11_0 >= String && LA11_0 <= Subtract)||(LA11_0 >= WIDTH_CONSTANT && LA11_0 <= Weight)) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall573);
							exprList53=exprList();
							state._fsp--;

							stream_exprList.add(exprList53.getTree());
							}
							break;

					}

					char_literal54=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall576);  
					stream_CParen.add(char_literal54);

					// AST REWRITE
					// elements: Ellipse, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 103:33: -> ^( FUNC_CALL Ellipse ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:36: ^( FUNC_CALL Ellipse ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Ellipse.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:56: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:5: Line '(' ( exprList )? ')'
					{
					Line55=(Token)match(input,Line,FOLLOW_Line_in_primitiveCall596);  
					stream_Line.add(Line55);

					char_literal56=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall598);  
					stream_OParen.add(char_literal56);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:14: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==Assert||LA12_0==Bool||LA12_0==COLOR_CONSTANT||(LA12_0 >= Copy && LA12_0 <= Curve)||LA12_0==Ellipse||(LA12_0 >= Excl && LA12_0 <= Expand)||LA12_0==Fill||(LA12_0 >= Group && LA12_0 <= Hide)||LA12_0==Identifier||LA12_0==LAdd||(LA12_0 >= LRemove && LA12_0 <= LShape)||(LA12_0 >= Line && LA12_0 <= Merge)||LA12_0==Move||(LA12_0 >= NoFill && LA12_0 <= Number)||(LA12_0 >= OBracket && LA12_0 <= OParen)||(LA12_0 >= PI_CONSTANT && LA12_0 <= Polygon)||(LA12_0 >= Print && LA12_0 <= Println)||LA12_0==Rect||LA12_0==Rotate||(LA12_0 >= Sine && LA12_0 <= Size)||(LA12_0 >= String && LA12_0 <= Subtract)||(LA12_0 >= WIDTH_CONSTANT && LA12_0 <= Weight)) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall600);
							exprList57=exprList();
							state._fsp--;

							stream_exprList.add(exprList57.getTree());
							}
							break;

					}

					char_literal58=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall603);  
					stream_CParen.add(char_literal58);

					// AST REWRITE
					// elements: exprList, Line
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 104:30: -> ^( FUNC_CALL Line ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:33: ^( FUNC_CALL Line ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Line.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:50: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:5: Rect '(' ( exprList )? ')'
					{
					Rect59=(Token)match(input,Rect,FOLLOW_Rect_in_primitiveCall623);  
					stream_Rect.add(Rect59);

					char_literal60=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall625);  
					stream_OParen.add(char_literal60);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:14: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==Assert||LA13_0==Bool||LA13_0==COLOR_CONSTANT||(LA13_0 >= Copy && LA13_0 <= Curve)||LA13_0==Ellipse||(LA13_0 >= Excl && LA13_0 <= Expand)||LA13_0==Fill||(LA13_0 >= Group && LA13_0 <= Hide)||LA13_0==Identifier||LA13_0==LAdd||(LA13_0 >= LRemove && LA13_0 <= LShape)||(LA13_0 >= Line && LA13_0 <= Merge)||LA13_0==Move||(LA13_0 >= NoFill && LA13_0 <= Number)||(LA13_0 >= OBracket && LA13_0 <= OParen)||(LA13_0 >= PI_CONSTANT && LA13_0 <= Polygon)||(LA13_0 >= Print && LA13_0 <= Println)||LA13_0==Rect||LA13_0==Rotate||(LA13_0 >= Sine && LA13_0 <= Size)||(LA13_0 >= String && LA13_0 <= Subtract)||(LA13_0 >= WIDTH_CONSTANT && LA13_0 <= Weight)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall627);
							exprList61=exprList();
							state._fsp--;

							stream_exprList.add(exprList61.getTree());
							}
							break;

					}

					char_literal62=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall630);  
					stream_CParen.add(char_literal62);

					// AST REWRITE
					// elements: Rect, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 105:30: -> ^( FUNC_CALL Rect ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:33: ^( FUNC_CALL Rect ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rect.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:50: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:5: Curve '(' ( exprList )? ')'
					{
					Curve63=(Token)match(input,Curve,FOLLOW_Curve_in_primitiveCall650);  
					stream_Curve.add(Curve63);

					char_literal64=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall652);  
					stream_OParen.add(char_literal64);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:15: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==Assert||LA14_0==Bool||LA14_0==COLOR_CONSTANT||(LA14_0 >= Copy && LA14_0 <= Curve)||LA14_0==Ellipse||(LA14_0 >= Excl && LA14_0 <= Expand)||LA14_0==Fill||(LA14_0 >= Group && LA14_0 <= Hide)||LA14_0==Identifier||LA14_0==LAdd||(LA14_0 >= LRemove && LA14_0 <= LShape)||(LA14_0 >= Line && LA14_0 <= Merge)||LA14_0==Move||(LA14_0 >= NoFill && LA14_0 <= Number)||(LA14_0 >= OBracket && LA14_0 <= OParen)||(LA14_0 >= PI_CONSTANT && LA14_0 <= Polygon)||(LA14_0 >= Print && LA14_0 <= Println)||LA14_0==Rect||LA14_0==Rotate||(LA14_0 >= Sine && LA14_0 <= Size)||(LA14_0 >= String && LA14_0 <= Subtract)||(LA14_0 >= WIDTH_CONSTANT && LA14_0 <= Weight)) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall654);
							exprList65=exprList();
							state._fsp--;

							stream_exprList.add(exprList65.getTree());
							}
							break;

					}

					char_literal66=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall657);  
					stream_CParen.add(char_literal66);

					// AST REWRITE
					// elements: Curve, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 106:29: -> ^( FUNC_CALL Curve ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:33: ^( FUNC_CALL Curve ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Curve.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:51: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:5: Polygon '(' ( exprList )? ')'
					{
					Polygon67=(Token)match(input,Polygon,FOLLOW_Polygon_in_primitiveCall675);  
					stream_Polygon.add(Polygon67);

					char_literal68=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall677);  
					stream_OParen.add(char_literal68);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:17: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==Assert||LA15_0==Bool||LA15_0==COLOR_CONSTANT||(LA15_0 >= Copy && LA15_0 <= Curve)||LA15_0==Ellipse||(LA15_0 >= Excl && LA15_0 <= Expand)||LA15_0==Fill||(LA15_0 >= Group && LA15_0 <= Hide)||LA15_0==Identifier||LA15_0==LAdd||(LA15_0 >= LRemove && LA15_0 <= LShape)||(LA15_0 >= Line && LA15_0 <= Merge)||LA15_0==Move||(LA15_0 >= NoFill && LA15_0 <= Number)||(LA15_0 >= OBracket && LA15_0 <= OParen)||(LA15_0 >= PI_CONSTANT && LA15_0 <= Polygon)||(LA15_0 >= Print && LA15_0 <= Println)||LA15_0==Rect||LA15_0==Rotate||(LA15_0 >= Sine && LA15_0 <= Size)||(LA15_0 >= String && LA15_0 <= Subtract)||(LA15_0 >= WIDTH_CONSTANT && LA15_0 <= Weight)) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall679);
							exprList69=exprList();
							state._fsp--;

							stream_exprList.add(exprList69.getTree());
							}
							break;

					}

					char_literal70=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall682);  
					stream_CParen.add(char_literal70);

					// AST REWRITE
					// elements: Polygon, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 107:31: -> ^( FUNC_CALL Polygon ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:35: ^( FUNC_CALL Polygon ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Polygon.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:55: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:5: LShape '(' ( exprList )? ')'
					{
					LShape71=(Token)match(input,LShape,FOLLOW_LShape_in_primitiveCall700);  
					stream_LShape.add(LShape71);

					char_literal72=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall702);  
					stream_OParen.add(char_literal72);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:16: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==Assert||LA16_0==Bool||LA16_0==COLOR_CONSTANT||(LA16_0 >= Copy && LA16_0 <= Curve)||LA16_0==Ellipse||(LA16_0 >= Excl && LA16_0 <= Expand)||LA16_0==Fill||(LA16_0 >= Group && LA16_0 <= Hide)||LA16_0==Identifier||LA16_0==LAdd||(LA16_0 >= LRemove && LA16_0 <= LShape)||(LA16_0 >= Line && LA16_0 <= Merge)||LA16_0==Move||(LA16_0 >= NoFill && LA16_0 <= Number)||(LA16_0 >= OBracket && LA16_0 <= OParen)||(LA16_0 >= PI_CONSTANT && LA16_0 <= Polygon)||(LA16_0 >= Print && LA16_0 <= Println)||LA16_0==Rect||LA16_0==Rotate||(LA16_0 >= Sine && LA16_0 <= Size)||(LA16_0 >= String && LA16_0 <= Subtract)||(LA16_0 >= WIDTH_CONSTANT && LA16_0 <= Weight)) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall704);
							exprList73=exprList();
							state._fsp--;

							stream_exprList.add(exprList73.getTree());
							}
							break;

					}

					char_literal74=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall707);  
					stream_CParen.add(char_literal74);

					// AST REWRITE
					// elements: exprList, LShape
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 108:30: -> ^( FUNC_CALL LShape ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:34: ^( FUNC_CALL LShape ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LShape.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:53: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:6: Point '(' ( exprList )? ')'
					{
					Point75=(Token)match(input,Point,FOLLOW_Point_in_primitiveCall726);  
					stream_Point.add(Point75);

					char_literal76=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall728);  
					stream_OParen.add(char_literal76);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:16: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==Assert||LA17_0==Bool||LA17_0==COLOR_CONSTANT||(LA17_0 >= Copy && LA17_0 <= Curve)||LA17_0==Ellipse||(LA17_0 >= Excl && LA17_0 <= Expand)||LA17_0==Fill||(LA17_0 >= Group && LA17_0 <= Hide)||LA17_0==Identifier||LA17_0==LAdd||(LA17_0 >= LRemove && LA17_0 <= LShape)||(LA17_0 >= Line && LA17_0 <= Merge)||LA17_0==Move||(LA17_0 >= NoFill && LA17_0 <= Number)||(LA17_0 >= OBracket && LA17_0 <= OParen)||(LA17_0 >= PI_CONSTANT && LA17_0 <= Polygon)||(LA17_0 >= Print && LA17_0 <= Println)||LA17_0==Rect||LA17_0==Rotate||(LA17_0 >= Sine && LA17_0 <= Size)||(LA17_0 >= String && LA17_0 <= Subtract)||(LA17_0 >= WIDTH_CONSTANT && LA17_0 <= Weight)) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall730);
							exprList77=exprList();
							state._fsp--;

							stream_exprList.add(exprList77.getTree());
							}
							break;

					}

					char_literal78=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall733);  
					stream_CParen.add(char_literal78);

					// AST REWRITE
					// elements: exprList, Point
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 109:30: -> ^( FUNC_CALL Point ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:34: ^( FUNC_CALL Point ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Point.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:52: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primitiveCall"


	public static class transformCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "transformCall"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:3: transformCall : ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) );
	public final PogoParser.transformCall_return transformCall() throws RecognitionException {
		PogoParser.transformCall_return retval = new PogoParser.transformCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Move79=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token Copy83=null;
		Token char_literal84=null;
		Token char_literal86=null;
		Token Rotate87=null;
		Token char_literal88=null;
		Token char_literal90=null;
		Token Fill91=null;
		Token char_literal92=null;
		Token char_literal94=null;
		Token Stroke95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		Token NoFill99=null;
		Token char_literal100=null;
		Token char_literal102=null;
		Token NoStroke103=null;
		Token char_literal104=null;
		Token char_literal106=null;
		Token Weight107=null;
		Token char_literal108=null;
		Token char_literal110=null;
		Token Hide111=null;
		Token char_literal112=null;
		Token char_literal114=null;
		Token Group115=null;
		Token char_literal116=null;
		Token char_literal118=null;
		Token Expand119=null;
		Token char_literal120=null;
		Token char_literal122=null;
		Token Merge123=null;
		Token char_literal124=null;
		Token char_literal126=null;
		ParserRuleReturnScope exprList81 =null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope exprList89 =null;
		ParserRuleReturnScope exprList93 =null;
		ParserRuleReturnScope exprList97 =null;
		ParserRuleReturnScope expression101 =null;
		ParserRuleReturnScope expression105 =null;
		ParserRuleReturnScope exprList109 =null;
		ParserRuleReturnScope expression113 =null;
		ParserRuleReturnScope exprList117 =null;
		ParserRuleReturnScope expression121 =null;
		ParserRuleReturnScope expression125 =null;

		Object Move79_tree=null;
		Object char_literal80_tree=null;
		Object char_literal82_tree=null;
		Object Copy83_tree=null;
		Object char_literal84_tree=null;
		Object char_literal86_tree=null;
		Object Rotate87_tree=null;
		Object char_literal88_tree=null;
		Object char_literal90_tree=null;
		Object Fill91_tree=null;
		Object char_literal92_tree=null;
		Object char_literal94_tree=null;
		Object Stroke95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;
		Object NoFill99_tree=null;
		Object char_literal100_tree=null;
		Object char_literal102_tree=null;
		Object NoStroke103_tree=null;
		Object char_literal104_tree=null;
		Object char_literal106_tree=null;
		Object Weight107_tree=null;
		Object char_literal108_tree=null;
		Object char_literal110_tree=null;
		Object Hide111_tree=null;
		Object char_literal112_tree=null;
		Object char_literal114_tree=null;
		Object Group115_tree=null;
		Object char_literal116_tree=null;
		Object char_literal118_tree=null;
		Object Expand119_tree=null;
		Object char_literal120_tree=null;
		Object char_literal122_tree=null;
		Object Merge123_tree=null;
		Object char_literal124_tree=null;
		Object char_literal126_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Stroke=new RewriteRuleTokenStream(adaptor,"token Stroke");
		RewriteRuleTokenStream stream_NoFill=new RewriteRuleTokenStream(adaptor,"token NoFill");
		RewriteRuleTokenStream stream_Group=new RewriteRuleTokenStream(adaptor,"token Group");
		RewriteRuleTokenStream stream_Copy=new RewriteRuleTokenStream(adaptor,"token Copy");
		RewriteRuleTokenStream stream_NoStroke=new RewriteRuleTokenStream(adaptor,"token NoStroke");
		RewriteRuleTokenStream stream_Weight=new RewriteRuleTokenStream(adaptor,"token Weight");
		RewriteRuleTokenStream stream_Hide=new RewriteRuleTokenStream(adaptor,"token Hide");
		RewriteRuleTokenStream stream_Merge=new RewriteRuleTokenStream(adaptor,"token Merge");
		RewriteRuleTokenStream stream_Move=new RewriteRuleTokenStream(adaptor,"token Move");
		RewriteRuleTokenStream stream_Rotate=new RewriteRuleTokenStream(adaptor,"token Rotate");
		RewriteRuleTokenStream stream_Fill=new RewriteRuleTokenStream(adaptor,"token Fill");
		RewriteRuleTokenStream stream_Expand=new RewriteRuleTokenStream(adaptor,"token Expand");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:4: ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) )
			int alt25=12;
			switch ( input.LA(1) ) {
			case Move:
				{
				alt25=1;
				}
				break;
			case Copy:
				{
				alt25=2;
				}
				break;
			case Rotate:
				{
				alt25=3;
				}
				break;
			case Fill:
				{
				alt25=4;
				}
				break;
			case Stroke:
				{
				alt25=5;
				}
				break;
			case NoFill:
				{
				alt25=6;
				}
				break;
			case NoStroke:
				{
				alt25=7;
				}
				break;
			case Weight:
				{
				alt25=8;
				}
				break;
			case Hide:
				{
				alt25=9;
				}
				break;
			case Group:
				{
				alt25=10;
				}
				break;
			case Expand:
				{
				alt25=11;
				}
				break;
			case Merge:
				{
				alt25=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:6: Move '(' ( exprList )? ')'
					{
					Move79=(Token)match(input,Move,FOLLOW_Move_in_transformCall764);  
					stream_Move.add(Move79);

					char_literal80=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall766);  
					stream_OParen.add(char_literal80);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:15: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==Assert||LA19_0==Bool||LA19_0==COLOR_CONSTANT||(LA19_0 >= Copy && LA19_0 <= Curve)||LA19_0==Ellipse||(LA19_0 >= Excl && LA19_0 <= Expand)||LA19_0==Fill||(LA19_0 >= Group && LA19_0 <= Hide)||LA19_0==Identifier||LA19_0==LAdd||(LA19_0 >= LRemove && LA19_0 <= LShape)||(LA19_0 >= Line && LA19_0 <= Merge)||LA19_0==Move||(LA19_0 >= NoFill && LA19_0 <= Number)||(LA19_0 >= OBracket && LA19_0 <= OParen)||(LA19_0 >= PI_CONSTANT && LA19_0 <= Polygon)||(LA19_0 >= Print && LA19_0 <= Println)||LA19_0==Rect||LA19_0==Rotate||(LA19_0 >= Sine && LA19_0 <= Size)||(LA19_0 >= String && LA19_0 <= Subtract)||(LA19_0 >= WIDTH_CONSTANT && LA19_0 <= Weight)) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall768);
							exprList81=exprList();
							state._fsp--;

							stream_exprList.add(exprList81.getTree());
							}
							break;

					}

					char_literal82=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall771);  
					stream_CParen.add(char_literal82);

					// AST REWRITE
					// elements: Move, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 113:29: -> ^( FUNC_CALL Move ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:32: ^( FUNC_CALL Move ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Move.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:49: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:6: Copy '(' expression ')'
					{
					Copy83=(Token)match(input,Copy,FOLLOW_Copy_in_transformCall790);  
					stream_Copy.add(Copy83);

					char_literal84=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall792);  
					stream_OParen.add(char_literal84);

					pushFollow(FOLLOW_expression_in_transformCall794);
					expression85=expression();
					state._fsp--;

					stream_expression.add(expression85.getTree());
					char_literal86=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall796);  
					stream_CParen.add(char_literal86);

					// AST REWRITE
					// elements: Copy, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 114:30: -> ^( FUNC_CALL Copy expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:33: ^( FUNC_CALL Copy expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Copy.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:6: Rotate '(' ( exprList )? ')'
					{
					Rotate87=(Token)match(input,Rotate,FOLLOW_Rotate_in_transformCall813);  
					stream_Rotate.add(Rotate87);

					char_literal88=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall815);  
					stream_OParen.add(char_literal88);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:17: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==Assert||LA20_0==Bool||LA20_0==COLOR_CONSTANT||(LA20_0 >= Copy && LA20_0 <= Curve)||LA20_0==Ellipse||(LA20_0 >= Excl && LA20_0 <= Expand)||LA20_0==Fill||(LA20_0 >= Group && LA20_0 <= Hide)||LA20_0==Identifier||LA20_0==LAdd||(LA20_0 >= LRemove && LA20_0 <= LShape)||(LA20_0 >= Line && LA20_0 <= Merge)||LA20_0==Move||(LA20_0 >= NoFill && LA20_0 <= Number)||(LA20_0 >= OBracket && LA20_0 <= OParen)||(LA20_0 >= PI_CONSTANT && LA20_0 <= Polygon)||(LA20_0 >= Print && LA20_0 <= Println)||LA20_0==Rect||LA20_0==Rotate||(LA20_0 >= Sine && LA20_0 <= Size)||(LA20_0 >= String && LA20_0 <= Subtract)||(LA20_0 >= WIDTH_CONSTANT && LA20_0 <= Weight)) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall817);
							exprList89=exprList();
							state._fsp--;

							stream_exprList.add(exprList89.getTree());
							}
							break;

					}

					char_literal90=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall820);  
					stream_CParen.add(char_literal90);

					// AST REWRITE
					// elements: Rotate, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 115:30: -> ^( FUNC_CALL Rotate ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:33: ^( FUNC_CALL Rotate ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rotate.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:52: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:6: Fill '(' ( exprList )? ')'
					{
					Fill91=(Token)match(input,Fill,FOLLOW_Fill_in_transformCall837);  
					stream_Fill.add(Fill91);

					char_literal92=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall839);  
					stream_OParen.add(char_literal92);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:15: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==Assert||LA21_0==Bool||LA21_0==COLOR_CONSTANT||(LA21_0 >= Copy && LA21_0 <= Curve)||LA21_0==Ellipse||(LA21_0 >= Excl && LA21_0 <= Expand)||LA21_0==Fill||(LA21_0 >= Group && LA21_0 <= Hide)||LA21_0==Identifier||LA21_0==LAdd||(LA21_0 >= LRemove && LA21_0 <= LShape)||(LA21_0 >= Line && LA21_0 <= Merge)||LA21_0==Move||(LA21_0 >= NoFill && LA21_0 <= Number)||(LA21_0 >= OBracket && LA21_0 <= OParen)||(LA21_0 >= PI_CONSTANT && LA21_0 <= Polygon)||(LA21_0 >= Print && LA21_0 <= Println)||LA21_0==Rect||LA21_0==Rotate||(LA21_0 >= Sine && LA21_0 <= Size)||(LA21_0 >= String && LA21_0 <= Subtract)||(LA21_0 >= WIDTH_CONSTANT && LA21_0 <= Weight)) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall841);
							exprList93=exprList();
							state._fsp--;

							stream_exprList.add(exprList93.getTree());
							}
							break;

					}

					char_literal94=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall844);  
					stream_CParen.add(char_literal94);

					// AST REWRITE
					// elements: Fill, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:28: -> ^( FUNC_CALL Fill ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:31: ^( FUNC_CALL Fill ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Fill.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:48: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:6: Stroke '(' ( exprList )? ')'
					{
					Stroke95=(Token)match(input,Stroke,FOLLOW_Stroke_in_transformCall861);  
					stream_Stroke.add(Stroke95);

					char_literal96=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall863);  
					stream_OParen.add(char_literal96);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:17: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==Assert||LA22_0==Bool||LA22_0==COLOR_CONSTANT||(LA22_0 >= Copy && LA22_0 <= Curve)||LA22_0==Ellipse||(LA22_0 >= Excl && LA22_0 <= Expand)||LA22_0==Fill||(LA22_0 >= Group && LA22_0 <= Hide)||LA22_0==Identifier||LA22_0==LAdd||(LA22_0 >= LRemove && LA22_0 <= LShape)||(LA22_0 >= Line && LA22_0 <= Merge)||LA22_0==Move||(LA22_0 >= NoFill && LA22_0 <= Number)||(LA22_0 >= OBracket && LA22_0 <= OParen)||(LA22_0 >= PI_CONSTANT && LA22_0 <= Polygon)||(LA22_0 >= Print && LA22_0 <= Println)||LA22_0==Rect||LA22_0==Rotate||(LA22_0 >= Sine && LA22_0 <= Size)||(LA22_0 >= String && LA22_0 <= Subtract)||(LA22_0 >= WIDTH_CONSTANT && LA22_0 <= Weight)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall865);
							exprList97=exprList();
							state._fsp--;

							stream_exprList.add(exprList97.getTree());
							}
							break;

					}

					char_literal98=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall868);  
					stream_CParen.add(char_literal98);

					// AST REWRITE
					// elements: exprList, Stroke
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:30: -> ^( FUNC_CALL Stroke ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:33: ^( FUNC_CALL Stroke ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Stroke.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:52: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:6: NoFill '(' expression ')'
					{
					NoFill99=(Token)match(input,NoFill,FOLLOW_NoFill_in_transformCall885);  
					stream_NoFill.add(NoFill99);

					char_literal100=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall887);  
					stream_OParen.add(char_literal100);

					pushFollow(FOLLOW_expression_in_transformCall889);
					expression101=expression();
					state._fsp--;

					stream_expression.add(expression101.getTree());
					char_literal102=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall891);  
					stream_CParen.add(char_literal102);

					// AST REWRITE
					// elements: expression, NoFill
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:31: -> ^( FUNC_CALL NoFill expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:34: ^( FUNC_CALL NoFill expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_NoFill.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:6: NoStroke '(' expression ')'
					{
					NoStroke103=(Token)match(input,NoStroke,FOLLOW_NoStroke_in_transformCall907);  
					stream_NoStroke.add(NoStroke103);

					char_literal104=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall909);  
					stream_OParen.add(char_literal104);

					pushFollow(FOLLOW_expression_in_transformCall911);
					expression105=expression();
					state._fsp--;

					stream_expression.add(expression105.getTree());
					char_literal106=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall913);  
					stream_CParen.add(char_literal106);

					// AST REWRITE
					// elements: NoStroke, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 119:33: -> ^( FUNC_CALL NoStroke expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:36: ^( FUNC_CALL NoStroke expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_NoStroke.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:6: Weight '(' ( exprList )? ')'
					{
					Weight107=(Token)match(input,Weight,FOLLOW_Weight_in_transformCall929);  
					stream_Weight.add(Weight107);

					char_literal108=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall931);  
					stream_OParen.add(char_literal108);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:17: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==Assert||LA23_0==Bool||LA23_0==COLOR_CONSTANT||(LA23_0 >= Copy && LA23_0 <= Curve)||LA23_0==Ellipse||(LA23_0 >= Excl && LA23_0 <= Expand)||LA23_0==Fill||(LA23_0 >= Group && LA23_0 <= Hide)||LA23_0==Identifier||LA23_0==LAdd||(LA23_0 >= LRemove && LA23_0 <= LShape)||(LA23_0 >= Line && LA23_0 <= Merge)||LA23_0==Move||(LA23_0 >= NoFill && LA23_0 <= Number)||(LA23_0 >= OBracket && LA23_0 <= OParen)||(LA23_0 >= PI_CONSTANT && LA23_0 <= Polygon)||(LA23_0 >= Print && LA23_0 <= Println)||LA23_0==Rect||LA23_0==Rotate||(LA23_0 >= Sine && LA23_0 <= Size)||(LA23_0 >= String && LA23_0 <= Subtract)||(LA23_0 >= WIDTH_CONSTANT && LA23_0 <= Weight)) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall933);
							exprList109=exprList();
							state._fsp--;

							stream_exprList.add(exprList109.getTree());
							}
							break;

					}

					char_literal110=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall936);  
					stream_CParen.add(char_literal110);

					// AST REWRITE
					// elements: exprList, Weight
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 120:30: -> ^( FUNC_CALL Weight ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:33: ^( FUNC_CALL Weight ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Weight.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:52: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:6: Hide '(' expression ')'
					{
					Hide111=(Token)match(input,Hide,FOLLOW_Hide_in_transformCall953);  
					stream_Hide.add(Hide111);

					char_literal112=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall955);  
					stream_OParen.add(char_literal112);

					pushFollow(FOLLOW_expression_in_transformCall957);
					expression113=expression();
					state._fsp--;

					stream_expression.add(expression113.getTree());
					char_literal114=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall959);  
					stream_CParen.add(char_literal114);

					// AST REWRITE
					// elements: Hide, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 121:29: -> ^( FUNC_CALL Hide expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:121:32: ^( FUNC_CALL Hide expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Hide.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:6: Group '(' ( exprList )? ')'
					{
					Group115=(Token)match(input,Group,FOLLOW_Group_in_transformCall975);  
					stream_Group.add(Group115);

					char_literal116=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall977);  
					stream_OParen.add(char_literal116);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:16: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==Assert||LA24_0==Bool||LA24_0==COLOR_CONSTANT||(LA24_0 >= Copy && LA24_0 <= Curve)||LA24_0==Ellipse||(LA24_0 >= Excl && LA24_0 <= Expand)||LA24_0==Fill||(LA24_0 >= Group && LA24_0 <= Hide)||LA24_0==Identifier||LA24_0==LAdd||(LA24_0 >= LRemove && LA24_0 <= LShape)||(LA24_0 >= Line && LA24_0 <= Merge)||LA24_0==Move||(LA24_0 >= NoFill && LA24_0 <= Number)||(LA24_0 >= OBracket && LA24_0 <= OParen)||(LA24_0 >= PI_CONSTANT && LA24_0 <= Polygon)||(LA24_0 >= Print && LA24_0 <= Println)||LA24_0==Rect||LA24_0==Rotate||(LA24_0 >= Sine && LA24_0 <= Size)||(LA24_0 >= String && LA24_0 <= Subtract)||(LA24_0 >= WIDTH_CONSTANT && LA24_0 <= Weight)) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall979);
							exprList117=exprList();
							state._fsp--;

							stream_exprList.add(exprList117.getTree());
							}
							break;

					}

					char_literal118=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall982);  
					stream_CParen.add(char_literal118);

					// AST REWRITE
					// elements: exprList, Group
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:29: -> ^( FUNC_CALL Group ( exprList )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:32: ^( FUNC_CALL Group ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Group.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:50: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:6: Expand '(' expression ')'
					{
					Expand119=(Token)match(input,Expand,FOLLOW_Expand_in_transformCall999);  
					stream_Expand.add(Expand119);

					char_literal120=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1001);  
					stream_OParen.add(char_literal120);

					pushFollow(FOLLOW_expression_in_transformCall1003);
					expression121=expression();
					state._fsp--;

					stream_expression.add(expression121.getTree());
					char_literal122=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1005);  
					stream_CParen.add(char_literal122);

					// AST REWRITE
					// elements: expression, Expand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 123:31: -> ^( FUNC_CALL Expand expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:34: ^( FUNC_CALL Expand expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Expand.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 12 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:6: Merge '(' expression ')'
					{
					Merge123=(Token)match(input,Merge,FOLLOW_Merge_in_transformCall1021);  
					stream_Merge.add(Merge123);

					char_literal124=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1023);  
					stream_OParen.add(char_literal124);

					pushFollow(FOLLOW_expression_in_transformCall1025);
					expression125=expression();
					state._fsp--;

					stream_expression.add(expression125.getTree());
					char_literal126=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1027);  
					stream_CParen.add(char_literal126);

					// AST REWRITE
					// elements: Merge, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 124:30: -> ^( FUNC_CALL Merge expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:33: ^( FUNC_CALL Merge expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Merge.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "transformCall"


	public static class mathCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mathCall"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:4: mathCall : ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) );
	public final PogoParser.mathCall_return mathCall() throws RecognitionException {
		PogoParser.mathCall_return retval = new PogoParser.mathCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Cosine127=null;
		Token char_literal128=null;
		Token char_literal130=null;
		Token Sine131=null;
		Token char_literal132=null;
		Token char_literal134=null;
		ParserRuleReturnScope expression129 =null;
		ParserRuleReturnScope expression133 =null;

		Object Cosine127_tree=null;
		Object char_literal128_tree=null;
		Object char_literal130_tree=null;
		Object Sine131_tree=null;
		Object char_literal132_tree=null;
		Object char_literal134_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Sine=new RewriteRuleTokenStream(adaptor,"token Sine");
		RewriteRuleTokenStream stream_Cosine=new RewriteRuleTokenStream(adaptor,"token Cosine");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:5: ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==Cosine) ) {
				alt26=1;
			}
			else if ( (LA26_0==Sine) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:6: Cosine '(' expression ')'
					{
					Cosine127=(Token)match(input,Cosine,FOLLOW_Cosine_in_mathCall1057);  
					stream_Cosine.add(Cosine127);

					char_literal128=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1059);  
					stream_OParen.add(char_literal128);

					pushFollow(FOLLOW_expression_in_mathCall1061);
					expression129=expression();
					state._fsp--;

					stream_expression.add(expression129.getTree());
					char_literal130=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1063);  
					stream_CParen.add(char_literal130);

					// AST REWRITE
					// elements: expression, Cosine
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 128:34: -> ^( FUNC_CALL Cosine expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:37: ^( FUNC_CALL Cosine expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Cosine.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:6: Sine '(' expression ')'
					{
					Sine131=(Token)match(input,Sine,FOLLOW_Sine_in_mathCall1082);  
					stream_Sine.add(Sine131);

					char_literal132=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1084);  
					stream_OParen.add(char_literal132);

					pushFollow(FOLLOW_expression_in_mathCall1086);
					expression133=expression();
					state._fsp--;

					stream_expression.add(expression133.getTree());
					char_literal134=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1088);  
					stream_CParen.add(char_literal134);

					// AST REWRITE
					// elements: Sine, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 129:32: -> ^( FUNC_CALL Sine expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:35: ^( FUNC_CALL Sine expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Sine.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mathCall"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final PogoParser.ifStatement_return ifStatement() throws RecognitionException {
		PogoParser.ifStatement_return retval = new PogoParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token End138=null;
		ParserRuleReturnScope ifStat135 =null;
		ParserRuleReturnScope elseIfStat136 =null;
		ParserRuleReturnScope elseStat137 =null;

		Object End138_tree=null;
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:6: ifStat ( elseIfStat )* ( elseStat )? End
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement1122);
			ifStat135=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat135.getTree());
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:13: ( elseIfStat )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==Else) ) {
					int LA27_1 = input.LA(2);
					if ( (LA27_1==If) ) {
						alt27=1;
					}

				}

				switch (alt27) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1124);
					elseIfStat136=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat136.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:25: ( elseStat )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==Else) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1127);
					elseStat137=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat137.getTree());
					}
					break;

			}

			End138=(Token)match(input,End,FOLLOW_End_in_ifStatement1130);  
			stream_End.add(End138);

			// AST REWRITE
			// elements: ifStat, elseStat, elseIfStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 135:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:54: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:66: ( elseStat )?
				if ( stream_elseStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseStat.nextTree());
				}
				stream_elseStat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class ifStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStat"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.ifStat_return ifStat() throws RecognitionException {
		PogoParser.ifStat_return retval = new PogoParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If139=null;
		Token Do141=null;
		ParserRuleReturnScope expression140 =null;
		ParserRuleReturnScope block142 =null;

		Object If139_tree=null;
		Object Do141_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:3: ( If expression Do block -> ^( EXP expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:6: If expression Do block
			{
			If139=(Token)match(input,If,FOLLOW_If_in_ifStat1159);  
			stream_If.add(If139);

			pushFollow(FOLLOW_expression_in_ifStat1161);
			expression140=expression();
			state._fsp--;

			stream_expression.add(expression140.getTree());
			Do141=(Token)match(input,Do,FOLLOW_Do_in_ifStat1163);  
			stream_Do.add(Do141);

			pushFollow(FOLLOW_block_in_ifStat1165);
			block142=block();
			state._fsp--;

			stream_block.add(block142.getTree());
			// AST REWRITE
			// elements: expression, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 140:29: -> ^( EXP expression block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:32: ^( EXP expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStat"


	public static class elseIfStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseIfStat"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
	public final PogoParser.elseIfStat_return elseIfStat() throws RecognitionException {
		PogoParser.elseIfStat_return retval = new PogoParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else143=null;
		Token If144=null;
		Token Do146=null;
		ParserRuleReturnScope expression145 =null;
		ParserRuleReturnScope block147 =null;

		Object Else143_tree=null;
		Object If144_tree=null;
		Object Do146_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:3: ( Else If expression Do block -> ^( EXP expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:6: Else If expression Do block
			{
			Else143=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat1189);  
			stream_Else.add(Else143);

			If144=(Token)match(input,If,FOLLOW_If_in_elseIfStat1191);  
			stream_If.add(If144);

			pushFollow(FOLLOW_expression_in_elseIfStat1193);
			expression145=expression();
			state._fsp--;

			stream_expression.add(expression145.getTree());
			Do146=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat1195);  
			stream_Do.add(Do146);

			pushFollow(FOLLOW_block_in_elseIfStat1197);
			block147=block();
			state._fsp--;

			stream_block.add(block147.getTree());
			// AST REWRITE
			// elements: expression, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 144:34: -> ^( EXP expression block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:37: ^( EXP expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseIfStat"


	public static class elseStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseStat"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:1: elseStat : Else Do block -> ^( EXP block ) ;
	public final PogoParser.elseStat_return elseStat() throws RecognitionException {
		PogoParser.elseStat_return retval = new PogoParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else148=null;
		Token Do149=null;
		ParserRuleReturnScope block150 =null;

		Object Else148_tree=null;
		Object Do149_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:3: ( Else Do block -> ^( EXP block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:6: Else Do block
			{
			Else148=(Token)match(input,Else,FOLLOW_Else_in_elseStat1221);  
			stream_Else.add(Else148);

			Do149=(Token)match(input,Do,FOLLOW_Do_in_elseStat1223);  
			stream_Do.add(Do149);

			pushFollow(FOLLOW_block_in_elseStat1225);
			block150=block();
			state._fsp--;

			stream_block.add(block150.getTree());
			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 148:20: -> ^( EXP block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:23: ^( EXP block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseStat"


	public static class functionDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDecl"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:1: functionDecl : Def Identifier '(' ( idList )? ')' Do block End ;
	public final PogoParser.functionDecl_return functionDecl() throws RecognitionException {
		PogoParser.functionDecl_return retval = new PogoParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Def151=null;
		Token Identifier152=null;
		Token char_literal153=null;
		Token char_literal155=null;
		Token Do156=null;
		Token End158=null;
		ParserRuleReturnScope idList154 =null;
		ParserRuleReturnScope block157 =null;

		Object Def151_tree=null;
		Object Identifier152_tree=null;
		Object char_literal153_tree=null;
		Object char_literal155_tree=null;
		Object Do156_tree=null;
		Object End158_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:3: ( Def Identifier '(' ( idList )? ')' Do block End )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:6: Def Identifier '(' ( idList )? ')' Do block End
			{
			root_0 = (Object)adaptor.nil();


			Def151=(Token)match(input,Def,FOLLOW_Def_in_functionDecl1247); 
			Def151_tree = (Object)adaptor.create(Def151);
			adaptor.addChild(root_0, Def151_tree);

			Identifier152=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl1249); 
			Identifier152_tree = (Object)adaptor.create(Identifier152);
			adaptor.addChild(root_0, Identifier152_tree);

			char_literal153=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl1251); 
			char_literal153_tree = (Object)adaptor.create(char_literal153);
			adaptor.addChild(root_0, char_literal153_tree);

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:25: ( idList )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==Identifier) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl1253);
					idList154=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList154.getTree());

					}
					break;

			}

			char_literal155=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl1256); 
			char_literal155_tree = (Object)adaptor.create(char_literal155);
			adaptor.addChild(root_0, char_literal155_tree);

			Do156=(Token)match(input,Do,FOLLOW_Do_in_functionDecl1258); 
			Do156_tree = (Object)adaptor.create(Do156);
			adaptor.addChild(root_0, Do156_tree);

			pushFollow(FOLLOW_block_in_functionDecl1260);
			block157=block();
			state._fsp--;

			adaptor.addChild(root_0, block157.getTree());

			End158=(Token)match(input,End,FOLLOW_End_in_functionDecl1262); 
			End158_tree = (Object)adaptor.create(End158);
			adaptor.addChild(root_0, End158_tree);

			defineFunction((Identifier152!=null?Identifier152.getText():null), (idList154!=null?((Object)idList154.getTree()):null), (block157!=null?((Object)block157.getTree()):null));
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionDecl"


	public static class forStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forStatement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:1: forStatement : For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) ;
	public final PogoParser.forStatement_return forStatement() throws RecognitionException {
		PogoParser.forStatement_return retval = new PogoParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For159=null;
		Token Identifier160=null;
		Token char_literal161=null;
		Token Do163=null;
		Token Do165=null;
		Token End167=null;
		ParserRuleReturnScope expression162 =null;
		ParserRuleReturnScope expression164 =null;
		ParserRuleReturnScope block166 =null;

		Object For159_tree=null;
		Object Identifier160_tree=null;
		Object char_literal161_tree=null;
		Object Do163_tree=null;
		Object Do165_tree=null;
		Object End167_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:3: ( For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:6: For Identifier '=' expression Do expression Do block End
			{
			For159=(Token)match(input,For,FOLLOW_For_in_forStatement1284);  
			stream_For.add(For159);

			Identifier160=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement1286);  
			stream_Identifier.add(Identifier160);

			char_literal161=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement1288);  
			stream_Assign.add(char_literal161);

			pushFollow(FOLLOW_expression_in_forStatement1290);
			expression162=expression();
			state._fsp--;

			stream_expression.add(expression162.getTree());
			Do163=(Token)match(input,Do,FOLLOW_Do_in_forStatement1292);  
			stream_Do.add(Do163);

			pushFollow(FOLLOW_expression_in_forStatement1294);
			expression164=expression();
			state._fsp--;

			stream_expression.add(expression164.getTree());
			Do165=(Token)match(input,Do,FOLLOW_Do_in_forStatement1296);  
			stream_Do.add(Do165);

			pushFollow(FOLLOW_block_in_forStatement1298);
			block166=block();
			state._fsp--;

			stream_block.add(block166.getTree());
			End167=(Token)match(input,End,FOLLOW_End_in_forStatement1300);  
			stream_End.add(End167);

			// AST REWRITE
			// elements: Identifier, For, block, expression, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 158:6: -> ^( For Identifier expression expression block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:9: ^( For Identifier expression expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_For.nextNode(), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forStatement"


	public static class repeatStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "repeatStatement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:1: repeatStatement : Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) ;
	public final PogoParser.repeatStatement_return repeatStatement() throws RecognitionException {
		PogoParser.repeatStatement_return retval = new PogoParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Repeat168=null;
		Token Identifier169=null;
		Token char_literal170=null;
		Token Do172=null;
		Token char_literal174=null;
		Token Do176=null;
		Token End178=null;
		ParserRuleReturnScope expression171 =null;
		ParserRuleReturnScope expression173 =null;
		ParserRuleReturnScope expression175 =null;
		ParserRuleReturnScope block177 =null;

		Object Repeat168_tree=null;
		Object Identifier169_tree=null;
		Object char_literal170_tree=null;
		Object Do172_tree=null;
		Object char_literal174_tree=null;
		Object Do176_tree=null;
		Object End178_tree=null;
		RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Repeat=new RewriteRuleTokenStream(adaptor,"token Repeat");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:3: ( Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:5: Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End
			{
			Repeat168=(Token)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1333);  
			stream_Repeat.add(Repeat168);

			Identifier169=(Token)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1335);  
			stream_Identifier.add(Identifier169);

			char_literal170=(Token)match(input,Assign,FOLLOW_Assign_in_repeatStatement1337);  
			stream_Assign.add(char_literal170);

			pushFollow(FOLLOW_expression_in_repeatStatement1339);
			expression171=expression();
			state._fsp--;

			stream_expression.add(expression171.getTree());
			Do172=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1341);  
			stream_Do.add(Do172);

			pushFollow(FOLLOW_expression_in_repeatStatement1343);
			expression173=expression();
			state._fsp--;

			stream_expression.add(expression173.getTree());
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:52: ( '|' expression )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==116) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:53: '|' expression
					{
					char_literal174=(Token)match(input,116,FOLLOW_116_in_repeatStatement1346);  
					stream_116.add(char_literal174);

					pushFollow(FOLLOW_expression_in_repeatStatement1348);
					expression175=expression();
					state._fsp--;

					stream_expression.add(expression175.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			Do176=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1352);  
			stream_Do.add(Do176);

			pushFollow(FOLLOW_block_in_repeatStatement1354);
			block177=block();
			state._fsp--;

			stream_block.add(block177.getTree());
			End178=(Token)match(input,End,FOLLOW_End_in_repeatStatement1356);  
			stream_End.add(End178);

			// AST REWRITE
			// elements: Identifier, expression, Repeat, block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 162:83: -> ^( Repeat Identifier expression expression block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:86: ^( Repeat Identifier expression expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_Repeat.nextNode(), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "repeatStatement"


	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:165:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
	public final PogoParser.whileStatement_return whileStatement() throws RecognitionException {
		PogoParser.whileStatement_return retval = new PogoParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While179=null;
		Token Do181=null;
		Token End183=null;
		ParserRuleReturnScope expression180 =null;
		ParserRuleReturnScope block182 =null;

		Object While179_tree=null;
		Object Do181_tree=null;
		Object End183_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:3: ( While expression Do block End -> ^( While expression block ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:6: While expression Do block End
			{
			While179=(Token)match(input,While,FOLLOW_While_in_whileStatement1384);  
			stream_While.add(While179);

			pushFollow(FOLLOW_expression_in_whileStatement1386);
			expression180=expression();
			state._fsp--;

			stream_expression.add(expression180.getTree());
			Do181=(Token)match(input,Do,FOLLOW_Do_in_whileStatement1388);  
			stream_Do.add(Do181);

			pushFollow(FOLLOW_block_in_whileStatement1390);
			block182=block();
			state._fsp--;

			stream_block.add(block182.getTree());
			End183=(Token)match(input,End,FOLLOW_End_in_whileStatement1392);  
			stream_End.add(End183);

			// AST REWRITE
			// elements: expression, While, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 166:36: -> ^( While expression block )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:39: ^( While expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_While.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStatement"


	public static class idList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "idList"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final PogoParser.idList_return idList() throws RecognitionException {
		PogoParser.idList_return retval = new PogoParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier184=null;
		Token char_literal185=null;
		Token Identifier186=null;

		Object Identifier184_tree=null;
		Object char_literal185_tree=null;
		Object Identifier186_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:6: Identifier ( ',' Identifier )*
			{
			Identifier184=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1416);  
			stream_Identifier.add(Identifier184);

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:17: ( ',' Identifier )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==Comma) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:18: ',' Identifier
					{
					char_literal185=(Token)match(input,Comma,FOLLOW_Comma_in_idList1419);  
					stream_Comma.add(char_literal185);

					Identifier186=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1421);  
					stream_Identifier.add(Identifier186);

					}
					break;

				default :
					break loop31;
				}
			}

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 170:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:170:38: ^( ID_LIST ( Identifier )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID_LIST, "ID_LIST"), root_1);
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "idList"


	public static class exprList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprList"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final PogoParser.exprList_return exprList() throws RecognitionException {
		PogoParser.exprList_return retval = new PogoParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal188=null;
		ParserRuleReturnScope expression187 =null;
		ParserRuleReturnScope expression189 =null;

		Object char_literal188_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList1446);
			expression187=expression();
			state._fsp--;

			stream_expression.add(expression187.getTree());
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:17: ( ',' expression )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Comma) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:18: ',' expression
					{
					char_literal188=(Token)match(input,Comma,FOLLOW_Comma_in_exprList1449);  
					stream_Comma.add(char_literal188);

					pushFollow(FOLLOW_expression_in_exprList1451);
					expression189=expression();
					state._fsp--;

					stream_expression.add(expression189.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 174:35: -> ^( EXP_LIST ( expression )+ )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:38: ^( EXP_LIST ( expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_LIST, "EXP_LIST"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprList"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:1: expression : condExpr ;
	public final PogoParser.expression_return expression() throws RecognitionException {
		PogoParser.expression_return retval = new PogoParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr190 =null;


		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:178:3: ( condExpr )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:178:6: condExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExpr_in_expression1476);
			condExpr190=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr190.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class condExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condExpr"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final PogoParser.condExpr_return condExpr() throws RecognitionException {
		PogoParser.condExpr_return retval = new PogoParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal192=null;
		Token char_literal193=null;
		Token In194=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr191 =null;
		ParserRuleReturnScope expression195 =null;

		Object char_literal192_tree=null;
		Object char_literal193_tree=null;
		Object In194_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:6: ( orExpr -> orExpr )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr1491);
			orExpr191=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr191.getTree());
			// AST REWRITE
			// elements: orExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 182:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt33=3;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==QMark) ) {
				alt33=1;
			}
			else if ( (LA33_0==In) ) {
				alt33=2;
			}
			switch (alt33) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:8: '?' a= expression ':' b= expression
					{
					char_literal192=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr1506);  
					stream_QMark.add(char_literal192);

					pushFollow(FOLLOW_expression_in_condExpr1510);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal193=(Token)match(input,Do,FOLLOW_Do_in_condExpr1512);  
					stream_Do.add(char_literal193);

					pushFollow(FOLLOW_expression_in_condExpr1516);
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: a, b, orExpr
					// token labels: 
					// rule labels: retval, b, a
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 183:42: -> ^( TERNARY orExpr $a $b)
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:45: ^( TERNARY orExpr $a $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERNARY, "TERNARY"), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_a.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:8: In expression
					{
					In194=(Token)match(input,In,FOLLOW_In_in_condExpr1539);  
					stream_In.add(In194);

					pushFollow(FOLLOW_expression_in_condExpr1541);
					expression195=expression();
					state._fsp--;

					stream_expression.add(expression195.getTree());
					// AST REWRITE
					// elements: In, expression, orExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 184:42: -> ^( In orExpr expression )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:45: ^( In orExpr expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_In.nextNode(), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condExpr"


	public static class orExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orExpr"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final PogoParser.orExpr_return orExpr() throws RecognitionException {
		PogoParser.orExpr_return retval = new PogoParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal197=null;
		ParserRuleReturnScope andExpr196 =null;
		ParserRuleReturnScope andExpr198 =null;

		Object string_literal197_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:3: ( andExpr ( '||' ^ andExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr1593);
			andExpr196=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr196.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:14: ( '||' ^ andExpr )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==117) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:189:15: '||' ^ andExpr
					{
					string_literal197=(Token)match(input,117,FOLLOW_117_in_orExpr1596); 
					string_literal197_tree = (Object)adaptor.create(string_literal197);
					root_0 = (Object)adaptor.becomeRoot(string_literal197_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr1599);
					andExpr198=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr198.getTree());

					}
					break;

				default :
					break loop34;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:192:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final PogoParser.andExpr_return andExpr() throws RecognitionException {
		PogoParser.andExpr_return retval = new PogoParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal200=null;
		ParserRuleReturnScope equExpr199 =null;
		ParserRuleReturnScope equExpr201 =null;

		Object string_literal200_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:3: ( equExpr ( '&&' ^ equExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr1615);
			equExpr199=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr199.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:14: ( '&&' ^ equExpr )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==114) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:193:15: '&&' ^ equExpr
					{
					string_literal200=(Token)match(input,114,FOLLOW_114_in_andExpr1618); 
					string_literal200_tree = (Object)adaptor.create(string_literal200);
					root_0 = (Object)adaptor.becomeRoot(string_literal200_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr1621);
					equExpr201=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr201.getTree());

					}
					break;

				default :
					break loop35;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andExpr"


	public static class equExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equExpr"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:196:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final PogoParser.equExpr_return equExpr() throws RecognitionException {
		PogoParser.equExpr_return retval = new PogoParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set203=null;
		ParserRuleReturnScope relExpr202 =null;
		ParserRuleReturnScope relExpr204 =null;

		Object set203_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr1637);
			relExpr202=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr202.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==Equals||LA36_0==NEquals) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:15: ( '==' | '!=' ) ^ relExpr
					{
					set203=input.LT(1);
					set203=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set203), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr1649);
					relExpr204=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr204.getTree());

					}
					break;

				default :
					break loop36;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equExpr"


	public static class relExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relExpr"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:200:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final PogoParser.relExpr_return relExpr() throws RecognitionException {
		PogoParser.relExpr_return retval = new PogoParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set206=null;
		ParserRuleReturnScope addExpr205 =null;
		ParserRuleReturnScope addExpr207 =null;

		Object set206_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:201:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:201:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr1665);
			addExpr205=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr205.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:201:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( ((LA37_0 >= GT && LA37_0 <= GTEquals)||(LA37_0 >= LT && LA37_0 <= LTEquals)) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:201:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set206=input.LT(1);
					set206=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set206), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr1685);
					addExpr207=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr207.getTree());

					}
					break;

				default :
					break loop37;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final PogoParser.addExpr_return addExpr() throws RecognitionException {
		PogoParser.addExpr_return retval = new PogoParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set209=null;
		ParserRuleReturnScope mulExpr208 =null;
		ParserRuleReturnScope mulExpr210 =null;

		Object set209_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1701);
			mulExpr208=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr208.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==Add||LA38_0==Subtract) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:15: ( '+' | '-' ) ^ mulExpr
					{
					set209=input.LT(1);
					set209=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set209), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr1713);
					mulExpr210=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr210.getTree());

					}
					break;

				default :
					break loop38;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final PogoParser.mulExpr_return mulExpr() throws RecognitionException {
		PogoParser.mulExpr_return retval = new PogoParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set212=null;
		ParserRuleReturnScope powExpr211 =null;
		ParserRuleReturnScope powExpr213 =null;

		Object set212_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:209:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:209:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1729);
			powExpr211=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr211.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:209:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==Divide||LA39_0==Modulus||LA39_0==Multiply) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:209:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set212=input.LT(1);
					set212=input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulus||input.LA(1)==Multiply ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set212), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr1745);
					powExpr213=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr213.getTree());

					}
					break;

				default :
					break loop39;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulExpr"


	public static class powExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powExpr"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final PogoParser.powExpr_return powExpr() throws RecognitionException {
		PogoParser.powExpr_return retval = new PogoParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal215=null;
		ParserRuleReturnScope unaryExpr214 =null;
		ParserRuleReturnScope unaryExpr216 =null;

		Object char_literal215_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:213:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:213:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1761);
			unaryExpr214=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr214.getTree());

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:213:16: ( '^' ^ unaryExpr )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==Pow) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:213:17: '^' ^ unaryExpr
					{
					char_literal215=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1764); 
					char_literal215_tree = (Object)adaptor.create(char_literal215);
					root_0 = (Object)adaptor.becomeRoot(char_literal215_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1767);
					unaryExpr216=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr216.getTree());

					}
					break;

				default :
					break loop40;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final PogoParser.unaryExpr_return unaryExpr() throws RecognitionException {
		PogoParser.unaryExpr_return retval = new PogoParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal217=null;
		Token char_literal219=null;
		ParserRuleReturnScope atom218 =null;
		ParserRuleReturnScope atom220 =null;
		ParserRuleReturnScope atom221 =null;

		Object char_literal217_tree=null;
		Object char_literal219_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt41=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt41=1;
				}
				break;
			case Excl:
				{
				alt41=2;
				}
				break;
			case Assert:
			case Bool:
			case COLOR_CONSTANT:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
			case Group:
			case HEIGHT_CONSTANT:
			case Hide:
			case Identifier:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Merge:
			case Move:
			case NoFill:
			case NoStroke:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case PI_CONSTANT:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Rect:
			case Rotate:
			case Sine:
			case Size:
			case String:
			case Stroke:
			case WIDTH_CONSTANT:
			case Weight:
				{
				alt41=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:6: '-' atom
					{
					char_literal217=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1785);  
					stream_Subtract.add(char_literal217);

					pushFollow(FOLLOW_atom_in_unaryExpr1787);
					atom218=atom();
					state._fsp--;

					stream_atom.add(atom218.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 217:15: -> ^( UNARY_MIN atom )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:18: ^( UNARY_MIN atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MIN, "UNARY_MIN"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:218:6: '!' atom
					{
					char_literal219=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1802);  
					stream_Excl.add(char_literal219);

					pushFollow(FOLLOW_atom_in_unaryExpr1804);
					atom220=atom();
					state._fsp--;

					stream_atom.add(atom220.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 218:15: -> ^( NEGATE atom )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:218:18: ^( NEGATE atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATE, "NEGATE"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:219:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr1819);
					atom221=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom221.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryExpr"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:222:1: atom : ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
	public final PogoParser.atom_return atom() throws RecognitionException {
		PogoParser.atom_return retval = new PogoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number222=null;
		Token Bool223=null;
		Token Null224=null;
		Token COLOR_CONSTANT226=null;
		Token PI_CONSTANT227=null;
		Token WIDTH_CONSTANT228=null;
		Token HEIGHT_CONSTANT229=null;
		ParserRuleReturnScope lookup225 =null;

		Object Number222_tree=null;
		Object Bool223_tree=null;
		Object Null224_tree=null;
		Object COLOR_CONSTANT226_tree=null;
		Object PI_CONSTANT227_tree=null;
		Object WIDTH_CONSTANT228_tree=null;
		Object HEIGHT_CONSTANT229_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:3: ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt42=8;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt42=1;
				}
				break;
			case Bool:
				{
				alt42=2;
				}
				break;
			case Null:
				{
				alt42=3;
				}
				break;
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
			case Group:
			case Hide:
			case Identifier:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Merge:
			case Move:
			case NoFill:
			case NoStroke:
			case OBracket:
			case OParen:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Rect:
			case Rotate:
			case Sine:
			case Size:
			case String:
			case Stroke:
			case Weight:
				{
				alt42=4;
				}
				break;
			case COLOR_CONSTANT:
				{
				alt42=5;
				}
				break;
			case PI_CONSTANT:
				{
				alt42=6;
				}
				break;
			case WIDTH_CONSTANT:
				{
				alt42=7;
				}
				break;
			case HEIGHT_CONSTANT:
				{
				alt42=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number222=(Token)match(input,Number,FOLLOW_Number_in_atom1833); 
					Number222_tree = (Object)adaptor.create(Number222);
					adaptor.addChild(root_0, Number222_tree);

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool223=(Token)match(input,Bool,FOLLOW_Bool_in_atom1840); 
					Bool223_tree = (Object)adaptor.create(Bool223);
					adaptor.addChild(root_0, Bool223_tree);

					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:225:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null224=(Token)match(input,Null,FOLLOW_Null_in_atom1847); 
					Null224_tree = (Object)adaptor.create(Null224);
					adaptor.addChild(root_0, Null224_tree);

					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:226:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom1854);
					lookup225=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup225.getTree());

					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:227:5: COLOR_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					COLOR_CONSTANT226=(Token)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_atom1860); 
					COLOR_CONSTANT226_tree = (Object)adaptor.create(COLOR_CONSTANT226);
					adaptor.addChild(root_0, COLOR_CONSTANT226_tree);

					}
					break;
				case 6 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:5: PI_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					PI_CONSTANT227=(Token)match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_atom1866); 
					PI_CONSTANT227_tree = (Object)adaptor.create(PI_CONSTANT227);
					adaptor.addChild(root_0, PI_CONSTANT227_tree);

					}
					break;
				case 7 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:5: WIDTH_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					WIDTH_CONSTANT228=(Token)match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_atom1872); 
					WIDTH_CONSTANT228_tree = (Object)adaptor.create(WIDTH_CONSTANT228);
					adaptor.addChild(root_0, WIDTH_CONSTANT228_tree);

					}
					break;
				case 8 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:230:5: HEIGHT_CONSTANT
					{
					root_0 = (Object)adaptor.nil();


					HEIGHT_CONSTANT229=(Token)match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_atom1878); 
					HEIGHT_CONSTANT229_tree = (Object)adaptor.create(HEIGHT_CONSTANT229);
					adaptor.addChild(root_0, HEIGHT_CONSTANT229_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final PogoParser.list_return list() throws RecognitionException {
		PogoParser.list_return retval = new PogoParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal230=null;
		Token char_literal232=null;
		ParserRuleReturnScope exprList231 =null;

		Object char_literal230_tree=null;
		Object char_literal232_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:6: '[' ( exprList )? ']'
			{
			char_literal230=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1892);  
			stream_OBracket.add(char_literal230);

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:10: ( exprList )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Assert||LA43_0==Bool||LA43_0==COLOR_CONSTANT||(LA43_0 >= Copy && LA43_0 <= Curve)||LA43_0==Ellipse||(LA43_0 >= Excl && LA43_0 <= Expand)||LA43_0==Fill||(LA43_0 >= Group && LA43_0 <= Hide)||LA43_0==Identifier||LA43_0==LAdd||(LA43_0 >= LRemove && LA43_0 <= LShape)||(LA43_0 >= Line && LA43_0 <= Merge)||LA43_0==Move||(LA43_0 >= NoFill && LA43_0 <= Number)||(LA43_0 >= OBracket && LA43_0 <= OParen)||(LA43_0 >= PI_CONSTANT && LA43_0 <= Polygon)||(LA43_0 >= Print && LA43_0 <= Println)||LA43_0==Rect||LA43_0==Rotate||(LA43_0 >= Sine && LA43_0 <= Size)||(LA43_0 >= String && LA43_0 <= Subtract)||(LA43_0 >= WIDTH_CONSTANT && LA43_0 <= Weight)) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list1894);
					exprList231=exprList();
					state._fsp--;

					stream_exprList.add(exprList231.getTree());
					}
					break;

			}

			char_literal232=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1897);  
			stream_CBracket.add(char_literal232);

			// AST REWRITE
			// elements: exprList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 234:24: -> ^( LIST ( exprList )? )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:34: ( exprList )?
				if ( stream_exprList.hasNext() ) {
					adaptor.addChild(root_1, stream_exprList.nextTree());
				}
				stream_exprList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list"


	public static class lookup_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lookup"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:1: lookup : ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final PogoParser.lookup_return lookup() throws RecognitionException {
		PogoParser.lookup_return retval = new PogoParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier238=null;
		Token String241=null;
		Token char_literal243=null;
		Token char_literal245=null;
		ParserRuleReturnScope functionCall233 =null;
		ParserRuleReturnScope indexes234 =null;
		ParserRuleReturnScope dotProperty235 =null;
		ParserRuleReturnScope list236 =null;
		ParserRuleReturnScope indexes237 =null;
		ParserRuleReturnScope indexes239 =null;
		ParserRuleReturnScope dotProperty240 =null;
		ParserRuleReturnScope indexes242 =null;
		ParserRuleReturnScope expression244 =null;
		ParserRuleReturnScope indexes246 =null;

		Object Identifier238_tree=null;
		Object String241_tree=null;
		Object char_literal243_tree=null;
		Object char_literal245_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_dotProperty=new RewriteRuleSubtreeStream(adaptor,"rule dotProperty");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:3: ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt51=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA51_1 = input.LA(2);
				if ( (LA51_1==OParen) ) {
					alt51=1;
				}
				else if ( (LA51_1==Add||LA51_1==CBracket||(LA51_1 >= CParen && LA51_1 <= Comma)||(LA51_1 >= Divide && LA51_1 <= Do)||(LA51_1 >= DotEnd && LA51_1 <= DotY)||LA51_1==Equals||(LA51_1 >= GT && LA51_1 <= GTEquals)||LA51_1==In||(LA51_1 >= LT && LA51_1 <= LTEquals)||LA51_1==Modulus||LA51_1==Multiply||LA51_1==NEquals||LA51_1==OBracket||LA51_1==Pow||LA51_1==QMark||LA51_1==Subtract||(LA51_1 >= 114 && LA51_1 <= 117)) ) {
					alt51=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 51, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Assert:
			case Copy:
			case Cosine:
			case Curve:
			case Ellipse:
			case Expand:
			case Fill:
			case Group:
			case Hide:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Merge:
			case Move:
			case NoFill:
			case NoStroke:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Rect:
			case Rotate:
			case Sine:
			case Size:
			case Stroke:
			case Weight:
				{
				alt51=1;
				}
				break;
			case OBracket:
				{
				alt51=2;
				}
				break;
			case String:
				{
				alt51=4;
				}
				break;
			case OParen:
				{
				alt51=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:6: functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					{
					pushFollow(FOLLOW_functionCall_in_lookup1920);
					functionCall233=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall233.getTree());
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:19: ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==Add||LA45_0==CBracket||(LA45_0 >= CParen && LA45_0 <= Comma)||(LA45_0 >= Divide && LA45_0 <= Do)||LA45_0==Equals||(LA45_0 >= GT && LA45_0 <= GTEquals)||LA45_0==In||(LA45_0 >= LT && LA45_0 <= LTEquals)||LA45_0==Modulus||LA45_0==Multiply||LA45_0==NEquals||LA45_0==OBracket||LA45_0==Pow||LA45_0==QMark||LA45_0==Subtract||(LA45_0 >= 114 && LA45_0 <= 117)) ) {
						alt45=1;
					}
					else if ( ((LA45_0 >= DotEnd && LA45_0 <= DotY)) ) {
						alt45=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 45, 0, input);
						throw nvae;
					}

					switch (alt45) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:20: ( indexes )?
							{
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:20: ( indexes )?
							int alt44=2;
							int LA44_0 = input.LA(1);
							if ( (LA44_0==OBracket) ) {
								alt44=1;
							}
							switch (alt44) {
								case 1 :
									// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:20: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup1923);
									indexes234=indexes();
									state._fsp--;

									stream_indexes.add(indexes234.getTree());
									}
									break;

							}

							// AST REWRITE
							// elements: functionCall, indexes
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 238:30: -> ^( LOOKUP functionCall ( indexes )? )
							{
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:33: ^( LOOKUP functionCall ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:55: ( indexes )?
								if ( stream_indexes.hasNext() ) {
									adaptor.addChild(root_1, stream_indexes.nextTree());
								}
								stream_indexes.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:67: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup1940);
							dotProperty235=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty235.getTree());
							// AST REWRITE
							// elements: functionCall, dotProperty
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 238:80: -> ^( DOTPROPERTY functionCall dotProperty )
							{
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:83: ^( DOTPROPERTY functionCall dotProperty )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTPROPERTY, "DOTPROPERTY"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								adaptor.addChild(root_1, stream_dotProperty.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup1965);
					list236=list();
					state._fsp--;

					stream_list.add(list236.getTree());
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:11: ( indexes )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==OBracket) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1967);
							indexes237=indexes();
							state._fsp--;

							stream_indexes.add(indexes237.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 239:34: -> ^( LOOKUP list ( indexes )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:51: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:6: Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					{
					Identifier238=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup2000);  
					stream_Identifier.add(Identifier238);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:17: ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==Add||LA48_0==CBracket||(LA48_0 >= CParen && LA48_0 <= Comma)||(LA48_0 >= Divide && LA48_0 <= Do)||LA48_0==Equals||(LA48_0 >= GT && LA48_0 <= GTEquals)||LA48_0==In||(LA48_0 >= LT && LA48_0 <= LTEquals)||LA48_0==Modulus||LA48_0==Multiply||LA48_0==NEquals||LA48_0==OBracket||LA48_0==Pow||LA48_0==QMark||LA48_0==Subtract||(LA48_0 >= 114 && LA48_0 <= 117)) ) {
						alt48=1;
					}
					else if ( ((LA48_0 >= DotEnd && LA48_0 <= DotY)) ) {
						alt48=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}

					switch (alt48) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:18: ( indexes )?
							{
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:18: ( indexes )?
							int alt47=2;
							int LA47_0 = input.LA(1);
							if ( (LA47_0==OBracket) ) {
								alt47=1;
							}
							switch (alt47) {
								case 1 :
									// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:18: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2003);
									indexes239=indexes();
									state._fsp--;

									stream_indexes.add(indexes239.getTree());
									}
									break;

							}

							// AST REWRITE
							// elements: Identifier, indexes
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 240:28: -> ^( LOOKUP Identifier ( indexes )? )
							{
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:31: ^( LOOKUP Identifier ( indexes )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:51: ( indexes )?
								if ( stream_indexes.hasNext() ) {
									adaptor.addChild(root_1, stream_indexes.nextTree());
								}
								stream_indexes.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:63: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2020);
							dotProperty240=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty240.getTree());
							// AST REWRITE
							// elements: dotProperty, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 240:76: -> ^( DOTPROPERTY Identifier dotProperty )
							{
								// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:79: ^( DOTPROPERTY Identifier dotProperty )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTPROPERTY, "DOTPROPERTY"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								adaptor.addChild(root_1, stream_dotProperty.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 4 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:6: String ( indexes )?
					{
					String241=(Token)match(input,String,FOLLOW_String_in_lookup2040);  
					stream_String.add(String241);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:13: ( indexes )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==OBracket) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2042);
							indexes242=indexes();
							state._fsp--;

							stream_indexes.add(indexes242.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: String, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 241:34: -> ^( LOOKUP String ( indexes )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:53: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:6: '(' expression ')' ( indexes )?
					{
					char_literal243=(Token)match(input,OParen,FOLLOW_OParen_in_lookup2073);  
					stream_OParen.add(char_literal243);

					pushFollow(FOLLOW_expression_in_lookup2075);
					expression244=expression();
					state._fsp--;

					stream_expression.add(expression244.getTree());
					char_literal245=(Token)match(input,CParen,FOLLOW_CParen_in_lookup2077);  
					stream_CParen.add(char_literal245);

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:25: ( indexes )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==OBracket) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2079);
							indexes246=indexes();
							state._fsp--;

							stream_indexes.add(indexes246.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 242:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:57: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookup"


	public static class indexes_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "indexes"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:4: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final PogoParser.indexes_return indexes() throws RecognitionException {
		PogoParser.indexes_return retval = new PogoParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal247=null;
		Token char_literal249=null;
		ParserRuleReturnScope expression248 =null;

		Object char_literal247_tree=null;
		Object char_literal249_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:250:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:250:6: ( '[' expression ']' )+
			{
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:250:6: ( '[' expression ']' )+
			int cnt52=0;
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==OBracket) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:250:7: '[' expression ']'
					{
					char_literal247=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes2123);  
					stream_OBracket.add(char_literal247);

					pushFollow(FOLLOW_expression_in_indexes2125);
					expression248=expression();
					state._fsp--;

					stream_expression.add(expression248.getTree());
					char_literal249=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes2127);  
					stream_CBracket.add(char_literal249);

					}
					break;

				default :
					if ( cnt52 >= 1 ) break loop52;
					EarlyExitException eee = new EarlyExitException(52, input);
					throw eee;
				}
				cnt52++;
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 250:28: -> ^( INDEXES ( expression )+ )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:250:31: ^( INDEXES ( expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEXES, "INDEXES"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexes"


	public static class dotProperty_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dotProperty"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:3: dotProperty : ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) ;
	public final PogoParser.dotProperty_return dotProperty() throws RecognitionException {
		PogoParser.dotProperty_return retval = new PogoParser.dotProperty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope dotExpression250 =null;

		RewriteRuleSubtreeStream stream_dotExpression=new RewriteRuleSubtreeStream(adaptor,"rule dotExpression");

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:3: ( ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:6: ( dotExpression )+
			{
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:6: ( dotExpression )+
			int cnt53=0;
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( ((LA53_0 >= DotEnd && LA53_0 <= DotY)) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:7: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2158);
					dotExpression250=dotExpression();
					state._fsp--;

					stream_dotExpression.add(dotExpression250.getTree());
					}
					break;

				default :
					if ( cnt53 >= 1 ) break loop53;
					EarlyExitException eee = new EarlyExitException(53, input);
					throw eee;
				}
				cnt53++;
			}

			// AST REWRITE
			// elements: dotExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 254:23: -> ^( DOT ( dotExpression )+ )
			{
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:254:26: ^( DOT ( dotExpression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOT, "DOT"), root_1);
				if ( !(stream_dotExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_dotExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_dotExpression.nextTree());
				}
				stream_dotExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dotProperty"


	public static class dotExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dotExpression"
	// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:258:3: dotExpression : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
	public final PogoParser.dotExpression_return dotExpression() throws RecognitionException {
		PogoParser.dotExpression_return retval = new PogoParser.dotExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set251=null;

		Object set251_tree=null;

		try {
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
			{
			root_0 = (Object)adaptor.nil();


			set251=input.LT(1);
			if ( (input.LA(1) >= DotEnd && input.LA(1) <= DotY) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set251));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dotExpression"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_parse167 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block187 = new BitSet(new long[]{0x98A64200008E0082L,0x000B0263C6C062CCL});
	public static final BitSet FOLLOW_functionDecl_in_block191 = new BitSet(new long[]{0x98A64200008E0082L,0x000B0263C6C062CCL});
	public static final BitSet FOLLOW_Return_in_block196 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_block198 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_block200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement242 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement257 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_statement259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment306 = new BitSet(new long[]{0x0000000000000100L,0x0000000000040000L});
	public static final BitSet FOLLOW_indexes_in_assignment308 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment311 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_assignment313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_functionCall349 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_functionCall351 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_functionCall374 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_functionCall376 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_functionCall400 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_functionCall402 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_functionCall427 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_functionCall429 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_functionCall453 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_functionCall455 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAdd_in_functionCall479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_functionCall481 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_functionCall483 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LRemove_in_functionCall507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_functionCall509 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_functionCall511 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionCall514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall571 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall573 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Line_in_primitiveCall596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall598 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall600 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall625 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall627 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall652 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall654 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall677 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall679 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall702 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall704 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Point_in_primitiveCall726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall728 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall730 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Move_in_transformCall764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall766 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_transformCall768 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Copy_in_transformCall790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall792 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_transformCall794 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rotate_in_transformCall813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall815 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_transformCall817 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Fill_in_transformCall837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall839 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_transformCall841 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Stroke_in_transformCall861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall863 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_transformCall865 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoFill_in_transformCall885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall887 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_transformCall889 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall909 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_transformCall911 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Weight_in_transformCall929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall931 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_transformCall933 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hide_in_transformCall953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall955 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_transformCall957 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Group_in_transformCall975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall977 = new BitSet(new long[]{0x88E26200000E6480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_transformCall979 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Expand_in_transformCall999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1001 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_transformCall1003 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Merge_in_transformCall1021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1023 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_transformCall1025 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1059 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_mathCall1061 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sine_in_mathCall1082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1084 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_mathCall1086 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1122 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1124 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1127 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_End_in_ifStatement1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat1159 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_ifStat1161 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_ifStat1163 = new BitSet(new long[]{0x98A64200008E0080L,0x000B0263C6C062CCL});
	public static final BitSet FOLLOW_block_in_ifStat1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat1189 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_If_in_elseIfStat1191 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_elseIfStat1193 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_elseIfStat1195 = new BitSet(new long[]{0x98A64200008E0080L,0x000B0263C6C062CCL});
	public static final BitSet FOLLOW_block_in_elseIfStat1197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat1221 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_elseStat1223 = new BitSet(new long[]{0x98A64200008E0080L,0x000B0263C6C062CCL});
	public static final BitSet FOLLOW_block_in_elseStat1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl1247 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl1249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl1251 = new BitSet(new long[]{0x0800000000004000L});
	public static final BitSet FOLLOW_idList_in_functionDecl1253 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl1256 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_functionDecl1258 = new BitSet(new long[]{0x98A64A00008E0080L,0x000B0263C6C062CCL});
	public static final BitSet FOLLOW_block_in_functionDecl1260 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_End_in_functionDecl1262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement1284 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1286 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_forStatement1288 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_forStatement1290 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1292 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_forStatement1294 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1296 = new BitSet(new long[]{0x98A64A00008E0080L,0x000B0263C6C062CCL});
	public static final BitSet FOLLOW_block_in_forStatement1298 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_End_in_forStatement1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1333 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1335 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_repeatStatement1337 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1339 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1341 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1343 = new BitSet(new long[]{0x0000000004000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_repeatStatement1346 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1348 = new BitSet(new long[]{0x0000000004000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1352 = new BitSet(new long[]{0x98A64A00008E0080L,0x000B0263C6C062CCL});
	public static final BitSet FOLLOW_block_in_repeatStatement1354 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_End_in_repeatStatement1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement1384 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_whileStatement1386 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_whileStatement1388 = new BitSet(new long[]{0x98A64A00008E0080L,0x000B0263C6C062CCL});
	public static final BitSet FOLLOW_block_in_whileStatement1390 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_End_in_whileStatement1392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList1416 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_idList1419 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_Identifier_in_idList1421 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expression_in_exprList1446 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_exprList1449 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_exprList1451 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_condExpr_in_expression1476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr1491 = new BitSet(new long[]{0x2000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_QMark_in_condExpr1506 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_condExpr1510 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Do_in_condExpr1512 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_condExpr1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr1539 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_condExpr1541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1593 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_orExpr1596 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_andExpr_in_orExpr1599 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1615 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_andExpr1618 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_equExpr_in_andExpr1621 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1637 = new BitSet(new long[]{0x0000100000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_set_in_equExpr1640 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_relExpr_in_equExpr1649 = new BitSet(new long[]{0x0000100000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1665 = new BitSet(new long[]{0x0018000000000002L,0x0000000000000030L});
	public static final BitSet FOLLOW_set_in_relExpr1668 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_addExpr_in_relExpr1685 = new BitSet(new long[]{0x0018000000000002L,0x0000000000000030L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1701 = new BitSet(new long[]{0x0000000000000022L,0x0000040000000000L});
	public static final BitSet FOLLOW_set_in_addExpr1704 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1713 = new BitSet(new long[]{0x0000000000000022L,0x0000040000000000L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1729 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000500L});
	public static final BitSet FOLLOW_set_in_mulExpr1732 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1745 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000500L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1761 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_Pow_in_powExpr1764 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1767 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr1785 = new BitSet(new long[]{0x88E24200000E2480L,0x0001836246EDE2CCL});
	public static final BitSet FOLLOW_atom_in_unaryExpr1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr1802 = new BitSet(new long[]{0x88E24200000E2480L,0x0001836246EDE2CCL});
	public static final BitSet FOLLOW_atom_in_unaryExpr1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom1833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom1847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom1854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_atom1860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_atom1866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_atom1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_atom1878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list1892 = new BitSet(new long[]{0x88E26200000E3480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_exprList_in_list1894 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_list1897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup1920 = new BitSet(new long[]{0x0000007FF0000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_indexes_in_lookup1923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup1940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup1965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_indexes_in_lookup1967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup2000 = new BitSet(new long[]{0x0000007FF0000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_indexes_in_lookup2003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup2040 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_indexes_in_lookup2042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup2073 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_lookup2075 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CParen_in_lookup2077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_indexes_in_lookup2079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes2123 = new BitSet(new long[]{0x88E26200000E2480L,0x0001876246EDE2CCL});
	public static final BitSet FOLLOW_expression_in_indexes2125 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_indexes2127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2158 = new BitSet(new long[]{0x0000007FF0000002L});
}
