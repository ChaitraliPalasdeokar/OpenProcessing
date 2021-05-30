import processing.core.PApplet;
public class TestProcessing_OOP extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int TOTAL_NO_OF_BALLS = 4;

    Ball balls[]=new Ball[TOTAL_NO_OF_BALLS];

    public static void main(String[] args) {
        PApplet.main("TestProcessing_OOP",args);
//        String[] processingArgs = {"TestProcessing_OOP"};
//        TestProcessing_OOP sketch = new TestProcessing_OOP();
//        PApplet.runSketch(processingArgs,sketch);


    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
        for(int i=0;i<TOTAL_NO_OF_BALLS;i++){
            balls[i]=new Ball(this,i+1,i+1);
        }
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        super.draw();
        for(int itr=0;itr<TOTAL_NO_OF_BALLS;itr++) {
            balls[itr].drawCircle();
        }
        //System.out.println(balls[0].height+" "+balls[0].speed);
        //balls[0].drawCircle();
        //balls[0].moveCircle();
    }


}

class Ball {
    PApplet sketch;
    int height,speed,movecircle=0;
    public static final int DIAMETER = 10;

    Ball(PApplet sketch,int height,int speed){
        this.sketch=sketch;
        this.height=height;
        this.speed=speed;
    }

    void drawCircle(){
        //System.out.println(TestProcessing_OOP.HEIGHT);
        System.out.println(movecircle);
        sketch.ellipse(movecircle,height*(TestProcessing_OOP.HEIGHT/5),DIAMETER,DIAMETER);
        movecircle+=speed;
    }
    void moveCircle(){
        movecircle+=speed;
    }
}

