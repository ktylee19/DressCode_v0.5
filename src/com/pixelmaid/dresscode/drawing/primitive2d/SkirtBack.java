package com.pixelmaid.dresscode.drawing.primitive2d;

import processing.core.PShape;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;

//class used for importing in pre-defined svg vector objects

public class SkirtBack extends LShape {
    private String shapePath = ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/32_back.svg").toString(); //
    private PShape shape; //processing PShape
    private Embedded canvas; //
    private double x=0; //x coordinate of shape
    private double y= 0; //y coordinate of shape
    private double width = 0;
    private double height = 0;
    
    public SkirtBack() {
        this.setOrigin(new Point(0,0));
    }

    //returns current shape path
    public String getPath(){
        return this.shapePath;
    }
    
    public void loadShape(){
        this.shape = this.canvas.loadShape(this.shapePath);
        System.out.println("loaded shape succesfully");
        this.width = this.shape.width;
        this.height = this.shape.height;
        this.setOrigin(new Point(this.width/2,this.height/2));
        
    }
    
    //returns current drawing canvas
    public Embedded getCanvas(){
        return this.canvas;
    }
    
    //set current drawing canvas (needed to load the shape, TODO: should eventually work around this)
    public void setCanvas(Embedded e){
        this.canvas = e;
        
    }
    
    
    @Override
    public SkirtBack copy(){
        SkirtBack s = new SkirtBack();
        
        s.setPath(this.getPath());
        s.setCanvas(this.getCanvas());
        s.loadShape();
        copyParameters(this,s);
        return s;
    }


    @Override
    public void draw(Embedded e) {
        if(!this.getHide()){
        e.pushMatrix();
        e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
        e.rotate((float)Math.toRadians(getRotation()));
        e.scale((float)getScaleX(),(float)getScaleY());
        e.shape(shape,(float)(x-this.width/2),(float)(y-this.height/2));
        
        e.popMatrix();
        
        if(this.getDrawOrigin()){
            this.drawOrigin(e);
        }
        }
    }
    
    

    @Override
    public void print(Embedded e) {
        if(!this.getHide()){
        e.pushMatrix();
        e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
        e.rotate((float)Math.toRadians(getRotation()));
        e.shape(shape,(float)(x-this.width/2),(float)(y-this.height/2));
        e.popMatrix();
        }
        
    }

        

}
