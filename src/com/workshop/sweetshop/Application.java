package com.workshop.sweetshop;

import java.util.Arrays;
import java.util.Scanner;

import com.workshop.sweetshop.Sweet.Colour;
import com.workshop.sweetshop.Sweet.Shape;

//import javax.management.InvalidApplicationException;

public class Application {

	final static int EXIT_VALUE = 7;

	public static void main(String[] args) {

		System.out.println("welcome to the sweet shop");

		Application application = new Application();
		UserInterface userInterface = UserInterface.getInstance();
		while (true) {
			int input = userInterface.showUserMenu();

			application.handleUserSelection(input);
			if (input == EXIT_VALUE) {
				break;
			}
		}
		System.out.println(".......THE END .......");
	}

	private void handleUserSelection(int input) {

		SweetStore sweetStore = SweetStore.getInstance();
		UserInterface userInterface = UserInterface.getInstance();
		Scanner scanner = new Scanner(System.in);

		switch (input) {
		case 1:

			addSweet();

//				Laddu laddu = new Laddu();
//				laddu.price = 200;
//				Mothichur mothichur = new Mothichur();
//				Mothichur mothichur2 = new Mothichur();
//				mothichur2.price = 250;
//
//				mothichur.price = 250;
//				GulabJam gulabJam = new GulabJam();
//				gulabJam.price = 300;
//	
//				sweetStore.add(gulabJam);
//				sweetStore.add(laddu);
//				sweetStore.add(mothichur);
//				sweetStore.add(mothichur2);
//				sweetStore.add(mothichur);
			break;
		case 2:
			System.out.println("enter A sweet name : ");
			String sweetName = scanner.nextLine();
			Sweet sweet = sweetStore.getSweet(sweetName);
			sweetStore.delete(sweet);
			break;
		case 3:
			System.out.println("enter A sweet name to edit : ");
			Sweet sweet2 = new Sweet();
			String sweetName1 = scanner.nextLine();
			if (sweet2.getName() == sweetName1) {
				Sweet sweet1 = sweetStore.getSweet(sweetName1);
				sweetStore.updateSweet(sweet1);
			} else
				System.out.println("Invalide Sweet Name");
			break;
		case 4:
			userInterface.printAllSweets(sweetStore.getList());
			break;
		case 5:
			userInterface.printAllGreenSweets(sweetStore.getList());
			break;
		case EXIT_VALUE:
			break;
		}
	}

	private void addSweet() {

		SweetStore sweetStore = SweetStore.getInstance();

		Sweet sweet = new Sweet();
		sweet.name =sweetStore.setName(sweet);
		sweet.price = sweetStore.setPrice(sweet);
		sweet.shape = sweetStore.setShape(sweet);
		sweet.colour = sweetStore.setColour(sweet);
		sweet.ingredients = sweetStore.setIngreadiants(sweet);
		
		sweetStore.add(sweet);
	}
}
