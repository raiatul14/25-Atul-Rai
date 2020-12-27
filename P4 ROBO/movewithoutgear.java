import ch.aplu.robotsim.*;

public class movewithoutgear {
    movewithoutgear() {
        TurtleRobot robot = new TurtleRobot();
        robot.forward(100);
        robot.left(45);
        robot.forward(200);
        robot.right(90);
        robot.backward(100);
        robot.exit();
    }

    public static void main(String args[]) {
        movewithoutgear m = new movewithoutgear();
    }
}
