package com.workshop.sweetshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.workshop.sweetshop.Sweet.Colour;
import com.workshop.sweetshop.Sweet.Shape;

public class SweetStore {

	private static SweetStore instance;
	private Set<Sweet> sweetList = new HashSet();
	
	private SweetStore() {
		
	}
	
	public static SweetStore getInstance() {
		
		if(instance == null) {
			instance = new SweetStore();
		}
		return instance;
	}
	
	public void add(Sweet sweet) {
		sweetList.add(sweet);
	}

	public Set getList() {
		return sweetList;
	}

	public void delete(Sweet sweet) {
		sweetList.remove(sweet);
	}

	public Sweet getSweet(String stringName) {
		for (Sweet sweet : sweetList) {
			if (sweet.name.equals(stringName)) {
				return sweet;
			}
		}
		return null;
	}

	public Shape setShape(Sweet sweet1) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(
				" enter below number for set shape \n enter 1 : for TRIANGLE \n enter 2 : SQUARE \n enter 3 : ROUND");
		int shape = scanner.nextInt();
		switch (shape) {

		case 1:
			sweet1.shape = Sweet.Shape.TRIANGLE;

			break;
		case 2:
			sweet1.shape = Sweet.Shape.SQUARE;
			break;
		case 3:
			sweet1.shape = Sweet.Shape.ROUND;
			break;
		}
		return sweet1.shape;
	}

	public void updateSweet(Sweet sweet1) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter given for update \n enter 1 : for name\n enter 2 : for price \n "
				+ "enter 3 : for shape \n enter 4 : for colour\n enter5 : for ingreadiants ");
		int check = scanner.nextInt();
		switch (check) {
			case 1:
				setName(sweet1);
				break;
			case 2:
				setPrice(sweet1);
				break;
			case 3:
				setShape(sweet1);
				break;
	
			case 4:
				setColour(sweet1);
				break;
			case 5:
				setIngreadiants(sweet1);
				break;
		}
	}

	public List<String> setIngreadiants(Sweet sweet1) {

		System.out.println("enter set ingridiants : ");
		Scanner scanner = new Scanner(System.in);

		String newingrediants = scanner.nextLine();
		if(sweet1.ingredients != null) {
			sweet1.ingredients.clear();
		}
		String newingrediantArr[] = newingrediants.split(" ");
		sweet1.ingredients = Arrays.asList(newingrediantArr);
		return sweet1.ingredients;
	}

	public int setPrice(Sweet sweet1) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter set price : ");
		int price1 = scanner.nextInt();
		sweet1.setPrice(price1);
		return price1;
	}

	public String setName(Sweet sweet1) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter set name : ");
		String name = scanner.next();
		sweet1.setName(name);
		return name;
	}

	public  Colour setColour(Sweet sweet1) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(
				" enter below number for set colour \n enter 1 : for Red \n enter 2 : for green \n enter 3 : for blue");
		int colour = scanner.nextInt();
		switch (colour) {

		case 1:
			sweet1.colour = Sweet.Colour.RED;
			break;
		case 2:
			sweet1.colour = Sweet.Colour.GREEN;
			break;
		case 3:
			sweet1.colour = Sweet.Colour.BLUE;
			break;
		}
		return sweet1.colour;
	}
}