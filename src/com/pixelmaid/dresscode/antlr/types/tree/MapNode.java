package com.pixelmaid.dresscode.antlr.types.tree;



import java.util.List;
import java.util.Random;

import com.pixelmaid.dresscode.antlr.types.VarType;

public class MapNode  extends NodeEvent implements DCNode {
	protected List<DCNode> params;
    protected int line;

    public MapNode(List<DCNode> ps, int l) {
        params = ps;
        line = l;
        //System.out.println("created new drawable node at line:"+line);
    }

  @Override
  public VarType evaluate() {
  	
  	try{
  		
  	double value= params.get(0).evaluate().asDouble();
  	double start1= params.get(1).evaluate().asDouble();
	double stop1= params.get(2).evaluate().asDouble();
	double start2= params.get(3).evaluate().asDouble();
	double stop2= params.get(4).evaluate().asDouble();
	
	double range1 = stop1-start1;
	double range2 = stop2-start2;
	
	double ratio = (value-start1)/range1;
	value = Math.max(start1, value);
	value= Math.min(stop1, value);
	
	double returnVal = (range2 * ratio) + start2;

  
  	return new VarType(returnVal);
  	}
  	catch (ClassCastException e){
  		throw new RuntimeException("Illegal cosine function call at line:"+ line+" : " + this);
  	}
  }

}

