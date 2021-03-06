package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String petStr = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
			int MaxLevel = 30;
			for (int i = 0; i <= 6; i++){
			// 3. Use showOptionDialog to ask he user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What action do you want to take?", "Acition Picker", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet", "Walk", "Groom" }, null);
			System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				Pet();
			}
			if (task == 1) {
				Walk();
			}
			if (task == 2) {
				Groom();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= MaxLevel) {
				System.out.println("Max");
				JOptionPane.showMessageDialog(null, "You love your pet!");
				break;
			}
		}

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static int Pet(){
		happinessLevel = happinessLevel + 5;
		return happinessLevel;
	}
	public static int Walk() {
		happinessLevel = happinessLevel + 10;
		return happinessLevel;
	}
	public static int Groom() {
		happinessLevel = happinessLevel + 15;
		return happinessLevel;
	}
}