//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		for (int i = 0; i < 35 ; i++) {
			
		
		//1. Create a new Robot
		Robot DIO=new Robot("batman");
		//3. Ask the user what color they would like the robot to draw
		String Vegetables=JOptionPane.showInputDialog("What color would you like DIO to draw");
		//5. Use an if/else statement to set the pen color that the user requested
if (Vegetables.equals("blue")) {
	DIO.setPenColor(Color.blue);
	
}

else if (Vegetables.equals("red")) {
	DIO.setPenColor(Color.red);
}
else if (Vegetables.equals("green")) {
	DIO.setPenColor(Color.green);
}
else {
	
	DIO.setRandomPenColor();
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		DIO.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
DIO.penDown();
DIO.move(50);
DIO.turn(90);
DIO.move(50);
DIO.turn(90);
DIO.move(50);
DIO.turn(90);
DIO.move(50);

	}
}
}