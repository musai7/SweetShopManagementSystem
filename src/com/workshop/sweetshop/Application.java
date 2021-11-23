package com.workshop.sweetshop;

import java.util.Scanner;

//import javax.management.InvalidApplicationException;

public class Application {
	
	final static int EXIT_VALUE = 7;
	
	SweetStore sweetStore = new SweetStore();

	public static void main(String[] args) {

		System.out.println("welcome to the sweet shop");
		Application application = new Application();

		UserInterface userInterface = new UserInterface();
		while(true) {
			int input = userInterface.showUserMenu();

			application.handleUserSelection(input);
			if(input == EXIT_VALUE) {
				break;
			}
		}
		System.out.println(".......THE END .......");
	}

	private void handleUserSelection(int input) {
		
		UserInterface userInterface = new UserInterface();
		
		switch (input) {
			case 1:
				Laddu laddu = new Laddu();
				laddu.price = 200;
				Mothichur mothichur = new Mothichur();
				Mothichur mothichur2 = new Mothichur();
				mothichur2.price = 250;

				mothichur.price = 250;
				GulabJam gulabJam = new GulabJam();
				gulabJam.price = 300;
	
				sweetStore.add(gulabJam);
				sweetStore.add(laddu);
				sweetStore.add(mothichur);
				sweetStore.add(mothichur2);
				sweetStore.add(mothichur);
				break;
			case 2:
				Scanner scanner = new Scanner(System.in);
				System.out.println("enter A sweet name : ");
				String sweetName = scanner.nextLine();
				Sweet sweet = sweetStore.getSweet(sweetName);
				sweetStore.delete(sweet);
				break;
			case 3:
				break;
			case 4:
				userInterface.printAllSweets(sweetStore.getList());
				break;
			case EXIT_VALUE:
				
				break;
		}
	}
}
