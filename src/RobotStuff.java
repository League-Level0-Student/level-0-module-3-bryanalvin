import org.jointheleague.graphical.robot.Robot;

public class RobotStuff {
	static Robot Platinum = new Robot("batman");

	public static void main(String[] args) {
		drawSquare();
		drawCircle();
		drawTriangle();
	}

	static void drawCircle() {
		Platinum.penDown();
		for (int i = 0; i < 360; i++) {
			Platinum.move(1);
			Platinum.turn(1);
		}
	}

	static void drawTriangle() {
	Platinum.penDown();
	Platinum.move(50);
	Platinum.turn(120);
	Platinum.move(50);
	Platinum.turn(120);
	Platinum.move(50);
	Platinum.turn(120);
	Platinum.move(50);
	
	
	
	
	
	
}

	static void drawSquare() {
		Platinum.penDown();
		Platinum.move(50);
		Platinum.turn(90);
		Platinum.move(50);
		Platinum.turn(90);
		Platinum.move(50);
		Platinum.turn(90);
		Platinum.move(50);

	}

}
