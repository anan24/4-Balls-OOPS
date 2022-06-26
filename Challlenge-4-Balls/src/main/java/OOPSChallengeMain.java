import processing.core.PApplet;

public class OOPSChallengeMain extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;

    private Ball ball1 = new Ball(1,1*HEIGHT/5);
    private Ball ball2 = new Ball(2,2*HEIGHT/5);
    private Ball ball3 = new Ball(3,3*HEIGHT/5);
    private Ball ball4 = new Ball(4,4*HEIGHT/5);

    public static void main(String[] args) {
        PApplet.main("OOPSChallengeMain",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        this.ball1.moveBall(this);
        this.ball2.moveBall(this);
        this.ball3.moveBall(this);
        this.ball4.moveBall(this);
    }
}
