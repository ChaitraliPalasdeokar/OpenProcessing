import processing.core.PApplet;

import javax.jws.soap.SOAPBinding;

public class TestProcessing_OOP extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int TOTAL_NO_OF_BALLS = 4;

    Ball balls[]=new Ball[TOTAL_NO_OF_BALLS];
    public static void main(String[] args) {
        PApplet.main("TestProcessing_OOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);

    }

    @Override
    public void setup() {
        super.setup();
        for(int itr=0;itr<TOTAL_NO_OF_BALLS;itr++) {
            balls[itr]=new Ball(this,itr+1,itr+1);
        }

    }

    @Override
    public void draw() {
        getBackground();
        for(int itr=0;itr<TOTAL_NO_OF_BALLS;itr++) {
            balls[itr].drawMovingCircle();
        }
    }

    private void getBackground() {
        background(0);
    }


}

class Ball {
   private PApplet sketch;
    private int height,speed,startposition=0;
    public static final int DIAMETER = 20;

    Ball(PApplet sketch,int height,int speed){
        this.startposition=startposition;
        this.sketch=sketch;
        this.height=height;
        this.speed=speed;
    }

    void drawMovingCircle(){

        sketch.ellipse(this.startposition,height*(TestProcessing_OOP.HEIGHT/5),DIAMETER,DIAMETER);
        this.startposition=this.startposition+this.speed;

    }

}

