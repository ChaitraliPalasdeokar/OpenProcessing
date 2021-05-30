import processing.core.PApplet;
public class TestProcessing_OOP extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int TOTAL_NO_OF_BALLS = 4;
    public static int move=0;
    Ball balls[]=new Ball[TOTAL_NO_OF_BALLS];

    public static void main(String[] args) {
        PApplet.main("TestProcessing_OOP",args);
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
//        for(int itr=0;itr<TOTAL_NO_OF_BALLS;itr++) {
//            balls[itr].drawMovingCircle();
//        }
        //System.out.println(balls[0].height+" "+balls[0].speed);
        balls[0].drawCircle();
        //balls[0].moveCircle();
    }


}

class Ball {
    PApplet sketch;
    int height,speed,movecircle=0;

    Ball(PApplet sketch,int height,int speed){
        this.sketch=sketch;
        this.height=height;
        this.speed=speed;
    }

    void drawCircle(){
        //System.out.println(TestProcessing_OOP.HEIGHT);
        System.out.println(movecircle);
        sketch.ellipse(movecircle,height*(TestProcessing_OOP.HEIGHT/5),10,10);
        movecircle+=speed;
    }
    void moveCircle(){
        movecircle+=speed;
    }
}

