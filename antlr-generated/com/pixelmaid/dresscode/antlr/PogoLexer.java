<<<<<<< HEAD
// $ANTLR 3.5 /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-03-11 15:53:17
=======
// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-04-04 14:31:39
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173

  package com.pixelmaid.dresscode.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PogoLexer extends Lexer {
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

	int implicitLineJoiningLevel = 0;
	int startPos=-1;


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PogoLexer() {} 
	public PogoLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PogoLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g"; }

	// $ANTLR start "T__114"
	public final void mT__114() throws RecognitionException {
		try {
			int _type = T__114;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:10:8: ( '&&' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:10:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__114"

	// $ANTLR start "T__115"
	public final void mT__115() throws RecognitionException {
		try {
			int _type = T__115;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:11:8: ( ';' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:11:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__115"

	// $ANTLR start "T__116"
	public final void mT__116() throws RecognitionException {
		try {
			int _type = T__116;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:12:8: ( '|' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:12:10: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__116"

	// $ANTLR start "T__117"
	public final void mT__117() throws RecognitionException {
		try {
			int _type = T__117;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:13:8: ( '||' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:13:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__117"

	// $ANTLR start "Ellipse"
	public final void mEllipse() throws RecognitionException {
		try {
			int _type = Ellipse;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:294:9: ( 'ellipse' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:294:11: 'ellipse'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:303:9: ( 'ellipse' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:303:11: 'ellipse'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("ellipse"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Ellipse"

	// $ANTLR start "Rect"
	public final void mRect() throws RecognitionException {
		try {
			int _type = Rect;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:295:6: ( 'rect' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:295:8: 'rect'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:304:6: ( 'rect' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:304:8: 'rect'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("rect"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Rect"

	// $ANTLR start "Line"
	public final void mLine() throws RecognitionException {
		try {
			int _type = Line;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:296:6: ( 'line' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:296:8: 'line'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:305:6: ( 'line' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:305:8: 'line'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("line"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Line"

	// $ANTLR start "Curve"
	public final void mCurve() throws RecognitionException {
		try {
			int _type = Curve;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:7: ( 'curve' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:297:9: 'curve'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:306:7: ( 'curve' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:306:9: 'curve'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("curve"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Curve"

	// $ANTLR start "Quad"
	public final void mQuad() throws RecognitionException {
		try {
			int _type = Quad;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:298:6: ( 'quad' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:298:8: 'quad'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:307:6: ( 'quad' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:307:8: 'quad'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("quad"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Quad"

	// $ANTLR start "Point"
	public final void mPoint() throws RecognitionException {
		try {
			int _type = Point;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:7: ( 'point' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:9: 'point'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:308:7: ( 'point' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:308:9: 'point'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("point"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Point"

	// $ANTLR start "Triangle"
	public final void mTriangle() throws RecognitionException {
		try {
			int _type = Triangle;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:300:9: ( 'triangle' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:300:11: 'triangle'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:309:9: ( 'triangle' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:309:11: 'triangle'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("triangle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Triangle"

	// $ANTLR start "Polygon"
	public final void mPolygon() throws RecognitionException {
		try {
			int _type = Polygon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:301:9: ( 'poly' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:301:11: 'poly'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:310:9: ( 'poly' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:310:11: 'poly'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("poly"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Polygon"

	// $ANTLR start "LShape"
	public final void mLShape() throws RecognitionException {
		try {
			int _type = LShape;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:302:8: ( 'import' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:302:10: 'import'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:311:8: ( 'import' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:311:10: 'import'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("import"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LShape"

	// $ANTLR start "Cosine"
	public final void mCosine() throws RecognitionException {
		try {
			int _type = Cosine;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:305:8: ( 'cos' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:305:9: 'cos'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:314:8: ( 'cos' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:314:9: 'cos'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("cos"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Cosine"

	// $ANTLR start "Sine"
	public final void mSine() throws RecognitionException {
		try {
			int _type = Sine;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:306:6: ( 'sin' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:306:8: 'sin'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:6: ( 'sin' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:8: 'sin'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("sin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Sine"

	// $ANTLR start "Move"
	public final void mMove() throws RecognitionException {
		try {
			int _type = Move;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:309:6: ( 'move' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:309:8: 'move'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:318:6: ( 'move' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:318:8: 'move'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("move"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Move"

	// $ANTLR start "Copy"
	public final void mCopy() throws RecognitionException {
		try {
			int _type = Copy;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:310:6: ( 'copy' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:310:8: 'copy'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:319:6: ( 'copy' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:319:8: 'copy'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("copy"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Copy"

	// $ANTLR start "Rotate"
	public final void mRotate() throws RecognitionException {
		try {
			int _type = Rotate;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:311:8: ( 'rotate' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:311:10: 'rotate'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:320:8: ( 'rotate' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:320:10: 'rotate'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("rotate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Rotate"

	// $ANTLR start "Scale"
	public final void mScale() throws RecognitionException {
		try {
			int _type = Scale;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:312:7: ( 'scale' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:312:9: 'scale'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:321:7: ( 'scale' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:321:9: 'scale'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("scale"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Scale"

	// $ANTLR start "Fill"
	public final void mFill() throws RecognitionException {
		try {
			int _type = Fill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:313:6: ( 'fill' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:313:8: 'fill'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:322:6: ( 'fill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:322:8: 'fill'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("fill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Fill"

	// $ANTLR start "Stroke"
	public final void mStroke() throws RecognitionException {
		try {
			int _type = Stroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:314:8: ( 'stroke' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:314:10: 'stroke'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:323:8: ( 'stroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:323:10: 'stroke'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("stroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Stroke"

	// $ANTLR start "NoFill"
	public final void mNoFill() throws RecognitionException {
		try {
			int _type = NoFill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:8: ( 'noFill' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:315:10: 'noFill'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:324:8: ( 'noFill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:324:10: 'noFill'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("noFill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NoFill"

	// $ANTLR start "NoStroke"
	public final void mNoStroke() throws RecognitionException {
		try {
			int _type = NoStroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:316:10: ( 'noStroke' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:316:12: 'noStroke'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:325:10: ( 'noStroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:325:12: 'noStroke'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("noStroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NoStroke"

	// $ANTLR start "Weight"
	public final void mWeight() throws RecognitionException {
		try {
			int _type = Weight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:8: ( 'weight' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:317:10: 'weight'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:326:8: ( 'weight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:326:10: 'weight'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("weight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Weight"

	// $ANTLR start "Hide"
	public final void mHide() throws RecognitionException {
		try {
			int _type = Hide;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:318:6: ( 'hide' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:318:8: 'hide'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:327:6: ( 'hide' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:327:8: 'hide'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("hide"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Hide"

	// $ANTLR start "Group"
	public final void mGroup() throws RecognitionException {
		try {
			int _type = Group;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:319:7: ( 'group' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:319:9: 'group'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:328:7: ( 'group' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:328:9: 'group'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("group"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Group"

	// $ANTLR start "Expand"
	public final void mExpand() throws RecognitionException {
		try {
			int _type = Expand;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:320:9: ( 'expand' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:320:11: 'expand'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:329:9: ( 'expand' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:329:11: 'expand'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("expand"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Expand"

	// $ANTLR start "Merge"
	public final void mMerge() throws RecognitionException {
		try {
			int _type = Merge;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:321:7: ( 'merge' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:321:9: 'merge'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:330:7: ( 'merge' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:330:9: 'merge'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("merge"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Merge"

	// $ANTLR start "DotX"
	public final void mDotX() throws RecognitionException {
		try {
			int _type = DotX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:325:6: ( '.x' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:325:8: '.x'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:334:6: ( '.x' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:334:8: '.x'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".x"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotX"

	// $ANTLR start "DotY"
	public final void mDotY() throws RecognitionException {
		try {
			int _type = DotY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:326:7: ( '.y' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:326:9: '.y'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:7: ( '.y' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:9: '.y'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".y"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotY"

	// $ANTLR start "DotStart"
	public final void mDotStart() throws RecognitionException {
		try {
			int _type = DotStart;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:327:10: ( '.start' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:327:12: '.start'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:10: ( '.start' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:12: '.start'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".start"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotStart"

	// $ANTLR start "DotEnd"
	public final void mDotEnd() throws RecognitionException {
		try {
			int _type = DotEnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:328:8: ( '.end' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:328:10: '.end'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:337:8: ( '.end' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:337:10: '.end'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotEnd"

	// $ANTLR start "DotOrigin"
	public final void mDotOrigin() throws RecognitionException {
		try {
			int _type = DotOrigin;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:329:11: ( '.origin' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:329:13: '.origin'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:11: ( '.origin' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:13: '.origin'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".origin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotOrigin"

	// $ANTLR start "DotRotation"
	public final void mDotRotation() throws RecognitionException {
		try {
			int _type = DotRotation;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:330:13: ( '.rotation' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:330:15: '.rotation'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:339:13: ( '.rotation' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:339:15: '.rotation'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".rotation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotRotation"

	// $ANTLR start "DotWidth"
	public final void mDotWidth() throws RecognitionException {
		try {
			int _type = DotWidth;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:10: ( '.width' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:12: '.width'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:340:10: ( '.width' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:340:12: '.width'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".width"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotWidth"

	// $ANTLR start "DotHeight"
	public final void mDotHeight() throws RecognitionException {
		try {
			int _type = DotHeight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:332:11: ( '.height' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:332:13: '.height'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:11: ( '.height' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:13: '.height'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".height"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotHeight"

	// $ANTLR start "DotStroke"
	public final void mDotStroke() throws RecognitionException {
		try {
			int _type = DotStroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:333:11: ( '.stroke' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:333:13: '.stroke'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:342:11: ( '.stroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:342:13: '.stroke'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".stroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotStroke"

	// $ANTLR start "DotFill"
	public final void mDotFill() throws RecognitionException {
		try {
			int _type = DotFill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:334:9: ( '.fill' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:334:11: '.fill'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:343:9: ( '.fill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:343:11: '.fill'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".fill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotFill"

	// $ANTLR start "DotWeight"
	public final void mDotWeight() throws RecognitionException {
		try {
			int _type = DotWeight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:11: ( '.weight' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:13: '.weight'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:344:11: ( '.weight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:344:13: '.weight'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(".weight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotWeight"

	// $ANTLR start "COLOR_CONSTANT"
	public final void mCOLOR_CONSTANT() throws RecognitionException {
		try {
			int _type = COLOR_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:15: ( 'RED' | 'BLUE' | 'GREEN' | 'PURPLE' | 'YELLOW' | 'ORANGE' | 'PINK' | 'BLACK' | 'WHITE' | 'GREY' )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:15: ( 'RED' | 'BLUE' | 'GREEN' | 'PURPLE' | 'YELLOW' | 'ORANGE' | 'PINK' | 'BLACK' | 'WHITE' | 'GREY' )
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			int alt1=10;
			switch ( input.LA(1) ) {
			case 'R':
				{
				alt1=1;
				}
				break;
			case 'B':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='L') ) {
					int LA1_8 = input.LA(3);
					if ( (LA1_8=='U') ) {
						alt1=2;
					}
					else if ( (LA1_8=='A') ) {
						alt1=8;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 8, input);
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
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'G':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='R') ) {
					int LA1_9 = input.LA(3);
					if ( (LA1_9=='E') ) {
						int LA1_14 = input.LA(4);
						if ( (LA1_14=='E') ) {
							alt1=3;
						}
						else if ( (LA1_14=='Y') ) {
							alt1=10;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 9, input);
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
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'P':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='U') ) {
					alt1=4;
				}
				else if ( (LA1_4=='I') ) {
					alt1=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'Y':
				{
				alt1=5;
				}
				break;
			case 'O':
				{
				alt1=6;
				}
				break;
			case 'W':
				{
				alt1=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:17: 'RED'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:17: 'RED'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("RED"); 

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:23: 'BLUE'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:23: 'BLUE'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("BLUE"); 

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:30: 'GREEN'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:30: 'GREEN'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("GREEN"); 

					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:38: 'PURPLE'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:38: 'PURPLE'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("PURPLE"); 

					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:47: 'YELLOW'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:47: 'YELLOW'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("YELLOW"); 

					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:56: 'ORANGE'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:56: 'ORANGE'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("ORANGE"); 

					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:65: 'PINK'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:65: 'PINK'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("PINK"); 

					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:72: 'BLACK'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:72: 'BLACK'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("BLACK"); 

					}
					break;
				case 9 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:80: 'WHITE'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:80: 'WHITE'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("WHITE"); 

					}
					break;
				case 10 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:88: 'GREY'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:88: 'GREY'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("GREY"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLOR_CONSTANT"

	// $ANTLR start "WIDTH_CONSTANT"
	public final void mWIDTH_CONSTANT() throws RecognitionException {
		try {
			int _type = WIDTH_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:340:15: ( 'WIDTH' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:340:17: 'WIDTH'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:349:15: ( 'WIDTH' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:349:17: 'WIDTH'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("WIDTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WIDTH_CONSTANT"

	// $ANTLR start "HEIGHT_CONSTANT"
	public final void mHEIGHT_CONSTANT() throws RecognitionException {
		try {
			int _type = HEIGHT_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:16: ( 'HEIGHT' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:18: 'HEIGHT'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:16: ( 'HEIGHT' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:18: 'HEIGHT'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("HEIGHT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEIGHT_CONSTANT"

	// $ANTLR start "PI_CONSTANT"
	public final void mPI_CONSTANT() throws RecognitionException {
		try {
			int _type = PI_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:343:12: ( 'PI' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:343:14: 'PI'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:352:12: ( 'PI' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:352:14: 'PI'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("PI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PI_CONSTANT"

	// $ANTLR start "LAdd"
	public final void mLAdd() throws RecognitionException {
		try {
			int _type = LAdd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:346:6: ( 'add' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:346:8: 'add'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:6: ( 'add' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:8: 'add'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("add"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAdd"

	// $ANTLR start "LRemove"
	public final void mLRemove() throws RecognitionException {
		try {
			int _type = LRemove;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:9: ( 'remove' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:11: 'remove'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:356:9: ( 'remove' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:356:11: 'remove'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("remove"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LRemove"

	// $ANTLR start "Println"
	public final void mPrintln() throws RecognitionException {
		try {
			int _type = Println;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:349:10: ( 'println' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:349:12: 'println'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:358:10: ( 'println' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:358:12: 'println'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("println"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Println"

	// $ANTLR start "Print"
	public final void mPrint() throws RecognitionException {
		try {
			int _type = Print;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:10: ( 'print' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:12: 'print'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:10: ( 'print' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:12: 'print'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Print"

	// $ANTLR start "Assert"
	public final void mAssert() throws RecognitionException {
		try {
			int _type = Assert;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:351:10: ( 'assert' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:351:12: 'assert'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:10: ( 'assert' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:12: 'assert'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("assert"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Assert"

	// $ANTLR start "Size"
	public final void mSize() throws RecognitionException {
		try {
			int _type = Size;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:352:10: ( 'size' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:352:12: 'size'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:10: ( 'size' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:12: 'size'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("size"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Size"

	// $ANTLR start "Def"
	public final void mDef() throws RecognitionException {
		try {
			int _type = Def;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:353:10: ( 'def' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:353:12: 'def'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:10: ( 'def' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:12: 'def'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("def"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Def"

	// $ANTLR start "If"
	public final void mIf() throws RecognitionException {
		try {
			int _type = If;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:354:10: ( 'if' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:354:12: 'if'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:10: ( 'if' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:12: 'if'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "If"

	// $ANTLR start "Else"
	public final void mElse() throws RecognitionException {
		try {
			int _type = Else;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:10: ( 'else' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:12: 'else'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:10: ( 'else' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:12: 'else'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Else"

	// $ANTLR start "Return"
	public final void mReturn() throws RecognitionException {
		try {
			int _type = Return;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:356:10: ( 'return' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:356:12: 'return'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:365:10: ( 'return' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:365:12: 'return'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Return"

	// $ANTLR start "For"
	public final void mFor() throws RecognitionException {
		try {
			int _type = For;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:357:10: ( 'for' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:357:12: 'for'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:366:10: ( 'for' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:366:12: 'for'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "For"

	// $ANTLR start "Repeat"
	public final void mRepeat() throws RecognitionException {
		try {
			int _type = Repeat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:358:9: ( 'repeat' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:358:11: 'repeat'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:367:9: ( 'repeat' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:367:11: 'repeat'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("repeat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Repeat"

	// $ANTLR start "While"
	public final void mWhile() throws RecognitionException {
		try {
			int _type = While;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:10: ( 'while' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:12: 'while'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:10: ( 'while' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:12: 'while'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "While"

	// $ANTLR start "To"
	public final void mTo() throws RecognitionException {
		try {
			int _type = To;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:10: ( 'to' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:12: 'to'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:10: ( 'to' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:12: 'to'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "To"

	// $ANTLR start "Do"
	public final void mDo() throws RecognitionException {
		try {
			int _type = Do;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:10: ( ':' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:12: ':'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:10: ( ':' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:12: ':'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Do"

	// $ANTLR start "End"
	public final void mEnd() throws RecognitionException {
		try {
			int _type = End;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:6: ( 'end' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:7: 'end'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:6: ( 'end' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:7: 'end'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "End"

	// $ANTLR start "In"
	public final void mIn() throws RecognitionException {
		try {
			int _type = In;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:10: ( 'in' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:12: 'in'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:10: ( 'in' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:12: 'in'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "In"

	// $ANTLR start "Null"
	public final void mNull() throws RecognitionException {
		try {
			int _type = Null;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:10: ( 'null' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:12: 'null'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:10: ( 'null' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:12: 'null'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Null"

	// $ANTLR start "Or"
	public final void mOr() throws RecognitionException {
		try {
			int _type = Or;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:366:10: ( 'or' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:366:12: 'or'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:375:10: ( 'or' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:375:12: 'or'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Or"

	// $ANTLR start "And"
	public final void mAnd() throws RecognitionException {
		try {
			int _type = And;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:367:10: ( 'and' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:367:12: 'and'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:10: ( 'and' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:12: 'and'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "And"

	// $ANTLR start "Equals"
	public final void mEquals() throws RecognitionException {
		try {
			int _type = Equals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:10: ( '==' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:12: '=='
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:10: ( '==' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:12: '=='
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Equals"

	// $ANTLR start "NEquals"
	public final void mNEquals() throws RecognitionException {
		try {
			int _type = NEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:10: ( '!=' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:12: '!='
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:10: ( '!=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:12: '!='
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEquals"

	// $ANTLR start "GTEquals"
	public final void mGTEquals() throws RecognitionException {
		try {
			int _type = GTEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:10: ( '>=' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:12: '>='
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:379:10: ( '>=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:379:12: '>='
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEquals"

	// $ANTLR start "LTEquals"
	public final void mLTEquals() throws RecognitionException {
		try {
			int _type = LTEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:10: ( '<=' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:12: '<='
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:380:10: ( '<=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:380:12: '<='
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEquals"

	// $ANTLR start "Pow"
	public final void mPow() throws RecognitionException {
		try {
			int _type = Pow;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:10: ( '^' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:12: '^'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:381:10: ( '^' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:381:12: '^'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Pow"

	// $ANTLR start "Excl"
	public final void mExcl() throws RecognitionException {
		try {
			int _type = Excl;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:10: ( '!' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:12: '!'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:382:10: ( '!' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:382:12: '!'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Excl"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:374:10: ( '>' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:374:12: '>'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:383:10: ( '>' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:383:12: '>'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:375:10: ( '<' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:375:12: '<'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:384:10: ( '<' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:384:12: '<'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "Add"
	public final void mAdd() throws RecognitionException {
		try {
			int _type = Add;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:10: ( '+' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:12: '+'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:10: ( '+' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:12: '+'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Add"

	// $ANTLR start "Subtract"
	public final void mSubtract() throws RecognitionException {
		try {
			int _type = Subtract;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:10: ( '-' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:12: '-'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:10: ( '-' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:12: '-'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Subtract"

	// $ANTLR start "Multiply"
	public final void mMultiply() throws RecognitionException {
		try {
			int _type = Multiply;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:10: ( '*' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:12: '*'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:387:10: ( '*' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:387:12: '*'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Multiply"

	// $ANTLR start "Divide"
	public final void mDivide() throws RecognitionException {
		try {
			int _type = Divide;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:379:10: ( '/' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:379:12: '/'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:388:10: ( '/' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:388:12: '/'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Divide"

	// $ANTLR start "Modulus"
	public final void mModulus() throws RecognitionException {
		try {
			int _type = Modulus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:380:10: ( '%' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:380:12: '%'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:389:10: ( '%' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:389:12: '%'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Modulus"

	// $ANTLR start "OBrace"
	public final void mOBrace() throws RecognitionException {
		try {
			int _type = OBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:381:10: ( '{' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:381:12: '{'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:390:10: ( '{' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:390:12: '{'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBrace"

	// $ANTLR start "CBrace"
	public final void mCBrace() throws RecognitionException {
		try {
			int _type = CBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:382:10: ( '}' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:382:12: '}'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:391:10: ( '}' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:391:12: '}'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CBrace"

	// $ANTLR start "OBracket"
	public final void mOBracket() throws RecognitionException {
		try {
			int _type = OBracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:383:10: ( '[' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:383:12: '['
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:392:10: ( '[' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:392:12: '['
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBracket"

	// $ANTLR start "CBracket"
	public final void mCBracket() throws RecognitionException {
		try {
			int _type = CBracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:384:10: ( ']' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:384:12: ']'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:393:10: ( ']' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:393:12: ']'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CBracket"

	// $ANTLR start "OParen"
	public final void mOParen() throws RecognitionException {
		try {
			int _type = OParen;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:10: ( '(' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:12: '('
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:394:10: ( '(' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:394:12: '('
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OParen"

	// $ANTLR start "CParen"
	public final void mCParen() throws RecognitionException {
		try {
			int _type = CParen;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:10: ( ')' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:12: ')'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:395:10: ( ')' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:395:12: ')'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CParen"

	// $ANTLR start "Assign"
	public final void mAssign() throws RecognitionException {
		try {
			int _type = Assign;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:388:10: ( '=' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:388:12: '='
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:397:10: ( '=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:397:12: '='
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Assign"

	// $ANTLR start "Comma"
	public final void mComma() throws RecognitionException {
		try {
			int _type = Comma;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:389:10: ( ',' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:389:12: ','
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:10: ( ',' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:12: ','
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comma"

	// $ANTLR start "QMark"
	public final void mQMark() throws RecognitionException {
		try {
			int _type = QMark;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:390:10: ( '?' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:390:12: '?'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:399:10: ( '?' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:399:12: '?'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QMark"

	// $ANTLR start "Dot"
	public final void mDot() throws RecognitionException {
		try {
			int _type = Dot;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:392:5: ( '.' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:392:7: '.'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:401:5: ( '.' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:401:7: '.'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dot"

	// $ANTLR start "Bool"
	public final void mBool() throws RecognitionException {
		try {
			int _type = Bool;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:395:3: ( 'true' | 'false' )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:404:3: ( 'true' | 'false' )
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='t') ) {
				alt2=1;
			}
			else if ( (LA2_0=='f') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:395:6: 'true'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:404:6: 'true'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("true"); 

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:396:6: 'false'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:405:6: 'false'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Bool"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:3: ( Int ( Dot ( Digit )* )? )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:6: Int ( Dot ( Digit )* )?
			{
			mInt(); 

			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:10: ( Dot ( Digit )* )?
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:3: ( Int ( Dot ( Digit )* )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:6: Int ( Dot ( Digit )* )?
			{
			mInt(); 

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:10: ( Dot ( Digit )* )?
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:11: Dot ( Digit )*
					{
					mDot(); 

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:15: ( Digit )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:11: Dot ( Digit )*
					{
					mDot(); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:15: ( Digit )*
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:404:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:404:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:413:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:413:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:404:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:413:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\"') ) {
				alt8=1;
			}
			else if ( (LA8_0=='\'') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
					{
					match('\"'); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
					{
					match('\"'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					loop6:
					while (true) {
						int alt6=3;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}
						else if ( (LA6_0=='\\') ) {
							alt6=2;
						}

						switch (alt6) {
						case 1 :
<<<<<<< HEAD
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:12: ~ ( '\"' | '\\\\' )
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:12: ~ ( '\"' | '\\\\' )
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
<<<<<<< HEAD
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:29: '\\\\' ( '\\\\' | '\"' )
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:29: '\\\\' ( '\\\\' | '\"' )
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
							{
							match('\\'); 
							if ( input.LA(1)=='\"'||input.LA(1)=='\\' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					match('\"'); 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:412:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
					{
					match('\''); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:412:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
					{
					match('\''); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					loop7:
					while (true) {
						int alt7=3;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}
						else if ( (LA7_0=='\\') ) {
							alt7=2;
						}

						switch (alt7) {
						case 1 :
<<<<<<< HEAD
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:412:12: ~ ( '\\'' | '\\\\' )
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:12: ~ ( '\\'' | '\\\\' )
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
<<<<<<< HEAD
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:412:29: '\\\\' ( '\\\\' | '\\'' )
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:29: '\\\\' ( '\\\\' | '\\'' )
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
							{
							match('\\'); 
							if ( input.LA(1)=='\''||input.LA(1)=='\\' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					match('\''); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;

			  setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "Comment"
	public final void mComment() throws RecognitionException {
		try {
			int _type = Comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:416:3: ( '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( . )* '*/' )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:425:3: ( '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( . )* '*/' )
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='/') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='/') ) {
					alt11=1;
				}
				else if ( (LA11_1=='*') ) {
					alt11=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:416:6: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); 

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:416:11: (~ ( '\\n' | '\\r' ) )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:425:6: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:425:11: (~ ( '\\n' | '\\r' ) )*
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					skip();
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:417:6: '/*' ( . )* '*/'
					{
					match("/*"); 

					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:417:11: ( . )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:6: '/*' ( . )* '*/'
					{
					match("/*"); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:11: ( . )*
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0=='*') ) {
							int LA10_1 = input.LA(2);
							if ( (LA10_1=='/') ) {
								alt10=2;
							}
							else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
								alt10=1;
							}

						}
						else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
<<<<<<< HEAD
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:417:11: .
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:11: .
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
							{
							matchAny(); 
							}
							break;

						default :
							break loop10;
						}
					}

					match("*/"); 

					skip();
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comment"

	// $ANTLR start "Space"
	public final void mSpace() throws RecognitionException {
		try {
			int _type = Space;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:3: ( ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+ )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
			{
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:3: ( ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+ )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||(LA12_0 >= '\f' && LA12_0 <= '\r')||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Space"

	// $ANTLR start "Int"
	public final void mInt() throws RecognitionException {
		try {
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:468:3: ( '1' .. '9' ( Digit )* | '0' )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:3: ( '1' .. '9' ( Digit )* | '0' )
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= '1' && LA14_0 <= '9')) ) {
				alt14=1;
			}
			else if ( (LA14_0=='0') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:468:6: '1' .. '9' ( Digit )*
					{
					matchRange('1','9'); 
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:468:15: ( Digit )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:6: '1' .. '9' ( Digit )*
					{
					matchRange('1','9'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:15: ( Digit )*
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop13;
						}
					}

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:469:6: '0'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:478:6: '0'
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
					{
					match('0'); 
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Int"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
<<<<<<< HEAD
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:473:3: ( '0' .. '9' )
			// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:482:3: ( '0' .. '9' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
>>>>>>> 614c77daf7e2cf91dc6c0a3984f4efa85d66d173
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:8: ( T__114 | T__115 | T__116 | T__117 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | LShape | Cosine | Sine | Move | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Group | Expand | Merge | DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotStroke | DotFill | DotWeight | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | For | Repeat | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | Space )
		int alt15=92;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:10: T__114
				{
				mT__114(); 

				}
				break;
			case 2 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:17: T__115
				{
				mT__115(); 

				}
				break;
			case 3 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:24: T__116
				{
				mT__116(); 

				}
				break;
			case 4 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:31: T__117
				{
				mT__117(); 

				}
				break;
			case 5 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:38: Ellipse
				{
				mEllipse(); 

				}
				break;
			case 6 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:46: Rect
				{
				mRect(); 

				}
				break;
			case 7 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:51: Line
				{
				mLine(); 

				}
				break;
			case 8 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:56: Curve
				{
				mCurve(); 

				}
				break;
			case 9 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:62: Quad
				{
				mQuad(); 

				}
				break;
			case 10 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:67: Point
				{
				mPoint(); 

				}
				break;
			case 11 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:73: Triangle
				{
				mTriangle(); 

				}
				break;
			case 12 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:82: Polygon
				{
				mPolygon(); 

				}
				break;
			case 13 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:90: LShape
				{
				mLShape(); 

				}
				break;
			case 14 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:97: Cosine
				{
				mCosine(); 

				}
				break;
			case 15 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:104: Sine
				{
				mSine(); 

				}
				break;
			case 16 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:109: Move
				{
				mMove(); 

				}
				break;
			case 17 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:114: Copy
				{
				mCopy(); 

				}
				break;
			case 18 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:119: Rotate
				{
				mRotate(); 

				}
				break;
			case 19 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:126: Scale
				{
				mScale(); 

				}
				break;
			case 20 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:132: Fill
				{
				mFill(); 

				}
				break;
			case 21 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:137: Stroke
				{
				mStroke(); 

				}
				break;
			case 22 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:144: NoFill
				{
				mNoFill(); 

				}
				break;
			case 23 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:151: NoStroke
				{
				mNoStroke(); 

				}
				break;
			case 24 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:160: Weight
				{
				mWeight(); 

				}
				break;
			case 25 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:167: Hide
				{
				mHide(); 

				}
				break;
			case 26 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:172: Group
				{
				mGroup(); 

				}
				break;
			case 27 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:178: Expand
				{
				mExpand(); 

				}
				break;
			case 28 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:185: Merge
				{
				mMerge(); 

				}
				break;
			case 29 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:191: DotX
				{
				mDotX(); 

				}
				break;
			case 30 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:196: DotY
				{
				mDotY(); 

				}
				break;
			case 31 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:201: DotStart
				{
				mDotStart(); 

				}
				break;
			case 32 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:210: DotEnd
				{
				mDotEnd(); 

				}
				break;
			case 33 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:217: DotOrigin
				{
				mDotOrigin(); 

				}
				break;
			case 34 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:227: DotRotation
				{
				mDotRotation(); 

				}
				break;
			case 35 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:239: DotWidth
				{
				mDotWidth(); 

				}
				break;
			case 36 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:248: DotHeight
				{
				mDotHeight(); 

				}
				break;
			case 37 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:258: DotStroke
				{
				mDotStroke(); 

				}
				break;
			case 38 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:268: DotFill
				{
				mDotFill(); 

				}
				break;
			case 39 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:276: DotWeight
				{
				mDotWeight(); 

				}
				break;
			case 40 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:286: COLOR_CONSTANT
				{
				mCOLOR_CONSTANT(); 

				}
				break;
			case 41 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:301: WIDTH_CONSTANT
				{
				mWIDTH_CONSTANT(); 

				}
				break;
			case 42 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:316: HEIGHT_CONSTANT
				{
				mHEIGHT_CONSTANT(); 

				}
				break;
			case 43 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:332: PI_CONSTANT
				{
				mPI_CONSTANT(); 

				}
				break;
			case 44 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:344: LAdd
				{
				mLAdd(); 

				}
				break;
			case 45 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:349: LRemove
				{
				mLRemove(); 

				}
				break;
			case 46 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:357: Println
				{
				mPrintln(); 

				}
				break;
			case 47 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:365: Print
				{
				mPrint(); 

				}
				break;
			case 48 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:371: Assert
				{
				mAssert(); 

				}
				break;
			case 49 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:378: Size
				{
				mSize(); 

				}
				break;
			case 50 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:383: Def
				{
				mDef(); 

				}
				break;
			case 51 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:387: If
				{
				mIf(); 

				}
				break;
			case 52 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:390: Else
				{
				mElse(); 

				}
				break;
			case 53 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:395: Return
				{
				mReturn(); 

				}
				break;
			case 54 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:402: For
				{
				mFor(); 

				}
				break;
			case 55 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:406: Repeat
				{
				mRepeat(); 

				}
				break;
			case 56 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:413: While
				{
				mWhile(); 

				}
				break;
			case 57 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:419: To
				{
				mTo(); 

				}
				break;
			case 58 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:422: Do
				{
				mDo(); 

				}
				break;
			case 59 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:425: End
				{
				mEnd(); 

				}
				break;
			case 60 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:429: In
				{
				mIn(); 

				}
				break;
			case 61 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:432: Null
				{
				mNull(); 

				}
				break;
			case 62 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:437: Or
				{
				mOr(); 

				}
				break;
			case 63 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:440: And
				{
				mAnd(); 

				}
				break;
			case 64 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:444: Equals
				{
				mEquals(); 

				}
				break;
			case 65 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:451: NEquals
				{
				mNEquals(); 

				}
				break;
			case 66 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:459: GTEquals
				{
				mGTEquals(); 

				}
				break;
			case 67 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:468: LTEquals
				{
				mLTEquals(); 

				}
				break;
			case 68 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:477: Pow
				{
				mPow(); 

				}
				break;
			case 69 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:481: Excl
				{
				mExcl(); 

				}
				break;
			case 70 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:486: GT
				{
				mGT(); 

				}
				break;
			case 71 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:489: LT
				{
				mLT(); 

				}
				break;
			case 72 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:492: Add
				{
				mAdd(); 

				}
				break;
			case 73 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:496: Subtract
				{
				mSubtract(); 

				}
				break;
			case 74 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:505: Multiply
				{
				mMultiply(); 

				}
				break;
			case 75 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:514: Divide
				{
				mDivide(); 

				}
				break;
			case 76 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:521: Modulus
				{
				mModulus(); 

				}
				break;
			case 77 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:529: OBrace
				{
				mOBrace(); 

				}
				break;
			case 78 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:536: CBrace
				{
				mCBrace(); 

				}
				break;
			case 79 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:543: OBracket
				{
				mOBracket(); 

				}
				break;
			case 80 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:552: CBracket
				{
				mCBracket(); 

				}
				break;
			case 81 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:561: OParen
				{
				mOParen(); 

				}
				break;
			case 82 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:568: CParen
				{
				mCParen(); 

				}
				break;
			case 83 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:575: Assign
				{
				mAssign(); 

				}
				break;
			case 84 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:582: Comma
				{
				mComma(); 

				}
				break;
			case 85 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:588: QMark
				{
				mQMark(); 

				}
				break;
			case 86 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:594: Dot
				{
				mDot(); 

				}
				break;
			case 87 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:598: Bool
				{
				mBool(); 

				}
				break;
			case 88 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:603: Number
				{
				mNumber(); 

				}
				break;
			case 89 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:610: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 90 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:621: String
				{
				mString(); 

				}
				break;
			case 91 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:628: Comment
				{
				mComment(); 

				}
				break;
			case 92 :
				// /Users/Katie/Documents/Java/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:636: Space
				{
				mSpace(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\3\uffff\1\67\17\63\1\137\12\63\1\uffff\1\63\1\160\1\162\1\164\1\166\4"+
		"\uffff\1\170\17\uffff\14\63\1\u008c\1\63\1\u008e\1\u008f\16\63\12\uffff"+
		"\4\63\1\u00a9\11\63\1\u00b3\12\uffff\3\63\1\u00b7\7\63\1\u00bf\7\63\1"+
		"\uffff\1\63\2\uffff\1\u00c8\6\63\1\u00cf\10\63\3\uffff\1\u00da\5\63\1"+
		"\uffff\5\63\1\u00e6\1\63\1\u00e8\1\u00e9\1\uffff\1\63\1\u00eb\1\63\1\uffff"+
		"\1\u00ed\4\63\1\u00f2\1\63\1\uffff\1\u00f4\1\u00f5\1\63\1\u00f7\2\63\1"+
		"\u00fa\1\63\1\uffff\1\u00fc\2\63\1\u00ff\1\63\1\u0101\1\uffff\3\63\1\u0105"+
		"\2\63\1\u0108\1\63\3\uffff\1\u00da\2\63\1\u00da\1\63\1\u00da\5\63\1\uffff"+
		"\1\63\2\uffff\1\63\1\uffff\1\63\1\uffff\4\63\1\uffff\1\u0119\2\uffff\1"+
		"\u011a\1\uffff\1\u011c\1\63\1\uffff\1\63\1\uffff\1\u011f\1\63\1\uffff"+
		"\1\u0121\1\uffff\1\u00fa\2\63\1\uffff\1\63\1\u0125\1\uffff\1\u0126\2\u00da"+
		"\3\63\1\u00da\1\u012a\3\63\1\u012e\1\u012f\1\u0130\1\u0131\1\u0132\2\uffff"+
		"\1\63\1\uffff\1\63\1\u0135\1\uffff\1\u0136\1\uffff\1\u0137\1\63\1\u0139"+
		"\2\uffff\3\u00da\1\uffff\1\u013a\1\u013b\1\u013c\5\uffff\1\u013d\1\63"+
		"\3\uffff\1\63\5\uffff\1\u0140\1\u0141\2\uffff";
	static final String DFA15_eofS =
		"\u0142\uffff";
	static final String DFA15_minS =
		"\1\11\2\uffff\1\174\1\154\1\145\1\151\1\157\1\165\2\157\1\146\1\143\1"+
		"\145\1\141\1\157\1\145\1\151\1\162\1\145\1\105\1\114\1\122\1\111\1\105"+
		"\1\122\1\110\1\105\1\144\1\145\1\uffff\1\162\4\75\4\uffff\1\52\17\uffff"+
		"\1\154\1\160\1\144\1\143\1\164\1\156\1\162\1\160\1\141\3\151\1\60\1\160"+
		"\2\60\1\156\1\141\1\162\1\166\1\162\1\154\1\162\1\154\1\106\1\154\2\151"+
		"\1\144\1\157\2\uffff\1\164\3\uffff\1\145\3\uffff\1\104\1\101\1\105\1\122"+
		"\1\60\1\114\1\101\1\111\1\104\1\111\1\144\1\163\1\144\1\146\1\60\12\uffff"+
		"\1\151\1\145\1\141\1\60\1\164\1\157\1\165\1\145\1\141\1\145\1\166\1\60"+
		"\1\171\1\144\1\156\1\171\1\156\1\141\1\145\1\uffff\1\157\2\uffff\1\60"+
		"\1\145\1\154\1\157\1\145\1\147\1\154\1\60\1\163\1\151\1\164\1\154\1\147"+
		"\1\154\1\145\1\165\1\141\2\uffff\1\60\1\105\1\103\1\105\1\120\1\113\1"+
		"\uffff\1\114\1\116\2\124\1\107\1\60\1\145\2\60\1\uffff\1\160\1\60\1\156"+
		"\1\uffff\1\60\1\166\1\162\1\141\1\164\1\60\1\145\1\uffff\2\60\1\164\1"+
		"\60\1\164\1\156\1\60\1\162\1\uffff\1\60\1\145\1\153\1\60\1\145\1\60\1"+
		"\uffff\1\145\1\154\1\162\1\60\1\150\1\145\1\60\1\160\3\uffff\1\60\1\113"+
		"\1\116\1\60\1\114\1\60\1\117\1\107\1\105\2\110\1\uffff\1\162\2\uffff\1"+
		"\163\1\uffff\1\144\1\uffff\1\145\1\156\1\164\1\145\1\uffff\1\60\2\uffff"+
		"\1\60\1\uffff\1\60\1\147\1\uffff\1\164\1\uffff\1\60\1\145\1\uffff\1\60"+
		"\1\uffff\1\60\1\154\1\157\1\uffff\1\164\1\60\1\uffff\3\60\1\105\1\127"+
		"\1\105\2\60\1\124\1\164\1\145\5\60\2\uffff\1\156\1\uffff\1\154\1\60\1"+
		"\uffff\1\60\1\uffff\1\60\1\153\1\60\2\uffff\3\60\1\uffff\3\60\5\uffff"+
		"\1\60\1\145\3\uffff\1\145\5\uffff\2\60\2\uffff";
	static final String DFA15_maxS =
		"\1\175\2\uffff\1\174\1\170\1\157\1\151\2\165\2\162\1\156\1\164\2\157\1"+
		"\165\1\150\1\151\1\162\1\171\1\105\1\114\1\122\1\125\1\105\1\122\1\111"+
		"\1\105\1\163\1\145\1\uffff\1\162\4\75\4\uffff\1\57\17\uffff\1\163\1\160"+
		"\1\144\2\164\1\156\1\162\1\163\1\141\1\154\1\151\1\165\1\172\1\160\3\172"+
		"\1\141\1\162\1\166\1\162\1\154\1\162\1\154\1\123\1\154\2\151\1\144\1\157"+
		"\2\uffff\1\164\3\uffff\1\151\3\uffff\1\104\1\125\1\105\1\122\1\172\1\114"+
		"\1\101\1\111\1\104\1\111\1\144\1\163\1\144\1\146\1\172\12\uffff\1\151"+
		"\1\145\1\141\1\172\1\164\1\157\1\165\1\145\1\141\1\145\1\166\1\172\1\171"+
		"\1\144\1\156\1\171\1\156\1\141\1\145\1\uffff\1\157\2\uffff\1\172\1\145"+
		"\1\154\1\157\1\145\1\147\1\154\1\172\1\163\1\151\1\164\1\154\1\147\1\154"+
		"\1\145\1\165\1\162\2\uffff\1\172\1\105\1\103\1\131\1\120\1\113\1\uffff"+
		"\1\114\1\116\2\124\1\107\1\172\1\145\2\172\1\uffff\1\160\1\172\1\156\1"+
		"\uffff\1\172\1\166\1\162\1\141\1\164\1\172\1\145\1\uffff\2\172\1\164\1"+
		"\172\1\164\1\156\1\172\1\162\1\uffff\1\172\1\145\1\153\1\172\1\145\1\172"+
		"\1\uffff\1\145\1\154\1\162\1\172\1\150\1\145\1\172\1\160\3\uffff\1\172"+
		"\1\113\1\116\1\172\1\114\1\172\1\117\1\107\1\105\2\110\1\uffff\1\162\2"+
		"\uffff\1\163\1\uffff\1\144\1\uffff\1\145\1\156\1\164\1\145\1\uffff\1\172"+
		"\2\uffff\1\172\1\uffff\1\172\1\147\1\uffff\1\164\1\uffff\1\172\1\145\1"+
		"\uffff\1\172\1\uffff\1\172\1\154\1\157\1\uffff\1\164\1\172\1\uffff\3\172"+
		"\1\105\1\127\1\105\2\172\1\124\1\164\1\145\5\172\2\uffff\1\156\1\uffff"+
		"\1\154\1\172\1\uffff\1\172\1\uffff\1\172\1\153\1\172\2\uffff\3\172\1\uffff"+
		"\3\172\5\uffff\1\172\1\145\3\uffff\1\145\5\uffff\2\172\2\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\33\uffff\1\72\5\uffff\1\104\1\110\1\111\1\112\1\uffff"+
		"\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\124\1\125\1\130\1\131\1\132"+
		"\1\134\1\4\1\3\36\uffff\1\35\1\36\1\uffff\1\40\1\41\1\42\1\uffff\1\44"+
		"\1\46\1\126\17\uffff\1\100\1\123\1\101\1\105\1\102\1\106\1\103\1\107\1"+
		"\133\1\113\23\uffff\1\71\1\uffff\1\63\1\74\21\uffff\1\43\1\47\6\uffff"+
		"\1\53\11\uffff\1\76\3\uffff\1\73\7\uffff\1\16\10\uffff\1\17\6\uffff\1"+
		"\66\10\uffff\1\37\1\45\1\50\13\uffff\1\54\1\uffff\1\77\1\62\1\uffff\1"+
		"\64\1\uffff\1\6\4\uffff\1\7\1\uffff\1\21\1\11\1\uffff\1\14\2\uffff\1\127"+
		"\1\uffff\1\61\2\uffff\1\20\1\uffff\1\24\3\uffff\1\75\2\uffff\1\31\20\uffff"+
		"\1\10\1\12\1\uffff\1\57\2\uffff\1\23\1\uffff\1\34\3\uffff\1\70\1\32\3"+
		"\uffff\1\51\3\uffff\1\33\1\55\1\65\1\67\1\22\2\uffff\1\15\1\25\1\26\1"+
		"\uffff\1\30\1\52\1\60\1\5\1\56\2\uffff\1\13\1\27";
	static final String DFA15_specialS =
		"\u0142\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\65\1\uffff\2\65\22\uffff\1\65\1\41\1\64\2\uffff\1\51\1\1\1\64\1\56"+
			"\1\57\1\47\1\45\1\60\1\46\1\23\1\50\12\62\1\36\1\2\1\43\1\40\1\42\1\61"+
			"\1\uffff\1\63\1\25\4\63\1\26\1\33\6\63\1\31\1\27\1\63\1\24\4\63\1\32"+
			"\1\63\1\30\1\63\1\54\1\uffff\1\55\1\44\1\63\1\uffff\1\34\1\63\1\7\1\35"+
			"\1\4\1\16\1\22\1\21\1\13\2\63\1\6\1\15\1\17\1\37\1\11\1\10\1\5\1\14\1"+
			"\12\2\63\1\20\3\63\1\52\1\3\1\53",
			"",
			"",
			"\1\66",
			"\1\70\1\uffff\1\72\11\uffff\1\71",
			"\1\73\11\uffff\1\74",
			"\1\75",
			"\1\77\5\uffff\1\76",
			"\1\100",
			"\1\101\2\uffff\1\102",
			"\1\104\2\uffff\1\103",
			"\1\106\6\uffff\1\105\1\107",
			"\1\111\5\uffff\1\110\12\uffff\1\112",
			"\1\114\11\uffff\1\113",
			"\1\117\7\uffff\1\115\5\uffff\1\116",
			"\1\120\5\uffff\1\121",
			"\1\122\2\uffff\1\123",
			"\1\124",
			"\1\125",
			"\1\131\1\136\1\uffff\1\135\6\uffff\1\132\2\uffff\1\133\1\130\3\uffff"+
			"\1\134\1\126\1\127",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\144\13\uffff\1\143",
			"\1\145",
			"\1\146",
			"\1\147\1\150",
			"\1\151",
			"\1\152\11\uffff\1\154\4\uffff\1\153",
			"\1\155",
			"",
			"\1\156",
			"\1\157",
			"\1\161",
			"\1\163",
			"\1\165",
			"",
			"",
			"",
			"",
			"\1\167\4\uffff\1\167",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\171\6\uffff\1\172",
			"\1\173",
			"\1\174",
			"\1\175\11\uffff\1\176\2\uffff\1\u0080\3\uffff\1\177",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0085\2\uffff\1\u0084",
			"\1\u0086",
			"\1\u0087\2\uffff\1\u0088",
			"\1\u0089",
			"\1\u008a\13\uffff\1\u008b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u008d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0090\13\uffff\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099\14\uffff\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"",
			"",
			"\1\u00a0",
			"",
			"",
			"",
			"\1\u00a2\3\uffff\1\u00a1",
			"",
			"",
			"",
			"\1\u00a3",
			"\1\u00a5\23\uffff\1\u00a4",
			"\1\u00a6",
			"\1\u00a7",
			"\12\63\7\uffff\15\63\1\u00a8\14\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"",
			"\1\u00c7",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8\20\uffff\1\u00d9",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd\23\uffff\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00e7",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u00ea",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00ec",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00f3",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00f6",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00f8",
			"\1\u00f9",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00fb",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00fd",
			"\1\u00fe",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0100",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0106",
			"\1\u0107",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0109",
			"",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u010a",
			"\1\u010b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u010c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"",
			"\1\u0112",
			"",
			"",
			"\1\u0113",
			"",
			"\1\u0114",
			"",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u011b\16\63",
			"\1\u011d",
			"",
			"\1\u011e",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0120",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0122",
			"\1\u0123",
			"",
			"\1\u0124",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"\1\u0133",
			"",
			"\1\u0134",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0138",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u013e",
			"",
			"",
			"",
			"\1\u013f",
			"",
			"",
			"",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__114 | T__115 | T__116 | T__117 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | LShape | Cosine | Sine | Move | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Group | Expand | Merge | DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotStroke | DotFill | DotWeight | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | For | Repeat | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | Space );";
		}
	}

}
