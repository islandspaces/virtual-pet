package vpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		VirtualPet pet = new VirtualPet();
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		System.out.println("**** This is a Virtual Pet Game ****");

		System.out.println(" ");

		System.out.println("Pet Name: " + pet.getName());
		System.out.println(" ");
		System.out.println(pet.getName() + "'s Initial State: ");
		System.out.println(" ");
		System.out.println("Hunger: " + pet.getHunger());
		System.out.println("Thirst: " + pet.getThirst());
		System.out.println("Boredom: " + pet.getBoredom());
		System.out.println("Tiredness: " + pet.getTiredness());
		System.out.println("Sleep: " + pet.getSleep());
		System.out.println(" ");

		System.out.println("1: Feed Horace");
		System.out.println("2: Water Horace");
		System.out.println("3: Play with Horace");
		System.out.println("4: Put Horace to Sleep");
		System.out.println("5: Do Nothing");
		System.out.println(" ");

		do {
			System.out.println("To play, Enter a Number that Corresponds to the Above Actions or enter 0 to quit: ");
			userInput = input.nextInt();

			switch (userInput) {
			case 1:
				System.out.println("You've fed " + pet.getName() + "!");
				pet.feedPet();
				break;
			case 2:
				System.out.println("You've watered " + pet.getName()+ "!");
				pet.waterPet();
				break;
			case 3:
				System.out.println("You're palying with " + pet.getName()+ "!");
				pet.playWithPet();
				break;
			case 4:
				System.out.println("You're putting " + pet.getName()+ "to sleep!");
				pet.putPetToSleep();
				break;
			case 5:
				System.out.println("You're not doing anything to " + pet.getName()+ "!");
				pet.doNothing();
				break;

			}
			System.out.println(pet.getName() + "'s Current State");
			System.out.println(" ");
			System.out.println("Hunger: " + pet.getHunger());
			System.out.println("Thirst: " + pet.getThirst());
			System.out.println("Boredom: " + pet.getBoredom());
			System.out.println("Tiredness: " + pet.getTiredness());
			System.out.println("Sleep: " + pet.getSleep());
			System.out.println(" ");

		} while (userInput != 0);
		pet.tick();
	}

}
