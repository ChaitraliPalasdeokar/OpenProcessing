
import processing.core.PApplet;

public class TestProcessing extends PApplet{


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    //states for each circle
    int move1stcircle=0;
    int move2ndcircle=0,move3rdcircle=0,move4thcircle=0;

    public static void main(String[] args) {

    PApplet.main("TestProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        //height and width of the window
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
       // System.out.println("from setup method");
       // ellipse(WIDTH/2,HEIGHT/2,100,100);

    }

    @Override
    public void draw() {
        //getBackground();
        drawCircle1(1,1);

       // drawCircle2(2,2);

        //drawCircle3(3,3);

        //drawCircle4(4,4);

    }

    private void getBackground() {
        background(255);
    }

    private void drawCircle1(int height,int speed) {

        ellipse(move1stcircle,height*(HEIGHT/5), DIAMETER, DIAMETER);
        move1stcircle+=speed;
    }

    private void drawCircle2(int height,int speed) {

        ellipse(move2ndcircle,height*(HEIGHT/5), DIAMETER, DIAMETER);
        move2ndcircle+=speed;
    }


    private void drawCircle3(int height,int speed) {

        ellipse(move3rdcircle,height*(HEIGHT/5), DIAMETER, DIAMETER);
        move3rdcircle+=speed;
    }

    private void drawCircle4(int height,int speed) {

        ellipse(move4thcircle,height*(HEIGHT/5), DIAMETER, DIAMETER);
        move4thcircle+=speed;
    }

}
