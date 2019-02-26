
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "April 5th";
		String dadsBirthday = "June 30th";
		String myBirthday = "May 13th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String Beat = JOptionPane.showInputDialog("Who's birthday do you want");
		// 3. Print out what the user typed
		System.out.println(Beat);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (Beat.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		if (Beat.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
			// 6. if user asked for your name
			// print myBirthday
		}
		if (Beat.equals("Me")) {

			JOptionPane.showMessageDialog(null, myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println(Beat);
			JOptionPane.showMessageDialog(null, "Sorry i don't remember that persons birthday");
		}

	}

}
