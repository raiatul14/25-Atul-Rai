import ch.aplu.robotsim.*;

public class movewithgear {
    movewithgear() {
        NxtRobot robot = new NxtRobot();
        Gear gear = new Gear();
        robot.addPart(gear);

        gear.forward(400);
        gear.setSpeed(30);

        gear.left(800);
        gear.forward(200);
        gear.right(480);
        robot.exit();
    }

    public static void main(String args[]) {
        movewithgear m = new movewithgear();
    }
}
