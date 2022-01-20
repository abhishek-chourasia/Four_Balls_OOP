import processing.core.PApplet;

public class RollTheBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    Ball FirstBall = new Ball(0, HEIGHT/5, 10);
    Ball SecondBall = new Ball(0, (HEIGHT*2)/5, 10);
    Ball ThirdBall = new Ball(0, (HEIGHT*3)/5, 10);
    Ball FourthBall = new Ball(0, (HEIGHT*4)/5, 10);

    public static void main(String[] args) {

        PApplet.main("RollTheBalls", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        RollFirstBall();
        RollSecondBall();
        RollThirdBall();
        RollFourthBall();
    }

    private void RollFirstBall() {
        ellipse(FirstBall.Width, FirstBall.Height, FirstBall.Diameter, FirstBall.Diameter);
        FirstBall.Width += 1;
    }

    private void RollSecondBall() {
        ellipse(SecondBall.Width,SecondBall.Height, SecondBall.Diameter, SecondBall.Diameter);
        SecondBall.Width += 2;
    }

    private void RollThirdBall() {
        ellipse(ThirdBall.Width, ThirdBall.Height, ThirdBall.Diameter, ThirdBall.Diameter);
        ThirdBall.Width += 3;
    }

    private void RollFourthBall() {
        ellipse(FourthBall.Width, FourthBall.Height, FourthBall.Diameter, FourthBall.Diameter);
        FourthBall.Width += 4;
    }

}
