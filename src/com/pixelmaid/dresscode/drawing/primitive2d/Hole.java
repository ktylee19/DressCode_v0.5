package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;

import processing.core.PApplet;


import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;

//class for holes inside of polygons. cannot be called independently
public class Hole extends Polygon {
	
		@Override
		public void draw(Embedded e){
			
		    ArrayList<Point> points = this.getPoints();
			e.beginShape();
			for(int i=0;i<points.size();i++){
				e.vertex((float)points.get(i).getX(),(float)points.get(i).getY());
			}
			e.endShape(PApplet.CLOSE);
		}
}