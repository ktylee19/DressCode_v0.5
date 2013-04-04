package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.app.Window;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Color;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.drawing.primitive2d.PrimitiveInterface;


public class MergeNode implements DCNode {

	protected DCNode param;

    protected int line;


    
    public MergeNode(DCNode p, int l) {
        param = p;
        line = l;
       
    }

    @Override
    public VarType evaluate() {
    	
    	Drawable dNew= null;
    	try{
    		
    	VarType d= param.evaluate();
    	if(d.isDrawable()){
    		
    		Drawable draw = d.asDrawable();
    		dNew = PolyBoolean.merge(draw);
    		draw .removeFromCanvas();
    		Window.canvas.addDrawable("poly",-1,dNew);
    		return new VarType(dNew);
    		}
    	}
    	
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal expand function call at line:"+ line+" : " + this);
    	}
    	
    	return new VarType(dNew);
    }
    

   
}
