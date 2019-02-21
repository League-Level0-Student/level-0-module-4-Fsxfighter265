package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String NicklesStr = JOptionPane.showInputDialog("How many Nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int Nicklesint = Integer.parseInt(NicklesStr);
		// Ask the user how many dimes they have, and convert their answer
		String DimesStr = JOptionPane.showInputDialog("How many Dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
		int Dimesint = Integer.parseInt(DimesStr);
		// Calculate how much money the user has and save it in a double variable 
		double Total = Nicklesint * 0.05 + Dimesint * .1;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "Your total is: $" + Total);
	}
}

