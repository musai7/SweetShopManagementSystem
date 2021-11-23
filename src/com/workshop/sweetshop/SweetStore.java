package com.workshop.sweetshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.workshop.sweetshop.Sweet.Shape;

public class SweetStore {

	private Set<Sweet> sweetList = new HashSet();

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

	public void updateSweet(Sweet sweet1) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter given for update \n enter 1 : for name\n enter 2 : for price \n "
				+ "enter 3 : for shape \n enter 4 : for colour ");
		int check = scanner.nextInt();
		switch (check) {
		case 1:
			System.out.println("enter updated name : ");
			String name = scanner.next();
			sweet1.setName(name);
			break;
		case 2:
			System.out.println("enter updated price : ");
			int price1 = scanner.nextInt();
			sweet1.setPrice(price1);
			break;
//		System.out.println("enter updated colour : ");
//		String colour = scanner.next();
//		sweet1.setColour(colour);
//		System.out.println("enter updated shape : ");
//		String shape = scanner.next();
//		sweet1.setShape(shape);
		case 3:
			System.out.println(
					" enter below number for update shape \n enter 1 : for TRIANGLE \n enter 2 : SQUARE \n enter 3 : ROUND");
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
			break;
		case 4:
			System.out.println(
					" enter below number for update colour \n enter 1 : for Red \n enter 2 : for green \n enter 3 : for blue");
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
			break;

		}
	}
}