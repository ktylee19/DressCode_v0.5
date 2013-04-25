package com.pixelmaid.dresscode.data;

import java.util.EventObject;
import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.pixelmaid.dresscode.antlr.PogoLexer;
import com.pixelmaid.dresscode.antlr.PogoParser;
import com.pixelmaid.dresscode.antlr.PogoTreeWalker;
import com.pixelmaid.dresscode.antlr.types.tree.BlockNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.events.EventSource;

//manages the programs generated by the user and runs the parsing and lexing actions on the raw program text
public class InstructionManager extends NodeEvent{
	private PogoLexer lexer;
	private CommonTokenStream tokens;
	private PogoParser parser;
	private CommonTree tree;
	private String error = "";
	public EventSource eventSource;
	private DrawableManager drawableManager;
	private double widthParam,heightParam;
	
	
	public InstructionManager(DrawableManager dm, double w, double h) {
		lexer = new PogoLexer();
		drawableManager = dm;
		widthParam = w;
		heightParam = h;
		
	}
	
	public void setDimensionParams(double width, double height){
		widthParam = width;
		heightParam = height;
	}
		
	
	  public void parseText(String userCode){

	    	//TODO: more efficient method of clearing canvas / parsing code. Right now it just deletes everything and re-interprets/ redraws entire thing
	    	//canvas.clearAllDrawables(); //clear the canvas
	    //	output.setText(""); //clear the output console

	    	
	    	CharStream charStream = new ANTLRStringStream(userCode);

	    	// create an instance of the lexer
	    
	    	lexer.setCharStream(charStream);
	    	// wrap a token-stream around the lexer
	    	tokens = new CommonTokenStream(lexer);
	    	// create the parser
	    	parser = new PogoParser(tokens);

	    	//System.out.println("running");
	    	// walk the tree
	    	
	    	try {
	    		tree = (CommonTree)parser.parse().getTree();

	    		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);

	    		// pass the reference to the Map of functions to the tree walker
	    		PogoTreeWalker walker = new PogoTreeWalker(nodes, parser.functions,drawableManager,widthParam, heightParam);

	    		// get the returned node 
	    		BlockNode returned = walker.walk();

	    		returned.evaluate();
	    		//registers a completed parse event
	    		List<String> errors = walker.getErrors();
	    		System.out.println("errors="+errors);
	    		if(errors.size()!=0){
	    			error = "";
	    			for(int i=0;i<errors.size();i++){
	    				error = error+errors.get(i)+"\n";
	    			}
	    			this.fireEvent(CustomEvent.PARSE_ERROR);
	    		}
	    		this.fireEvent(CustomEvent.PARSE_COMPLETE);

	    	} catch (Exception e) {
	    		e.printStackTrace();
	    		error = e.getMessage();
	    		
	    		//registers a parse error event
	    		this.fireEvent(CustomEvent.PARSE_ERROR);
	    		//output.setText("error at" + error);

	    	}


	    }
	  
	  //gets the current error text;
	  public String getError(){
		  return this.error;
	  }




	  
	
}
