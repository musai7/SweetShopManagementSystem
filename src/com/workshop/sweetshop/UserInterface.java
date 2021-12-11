package com.workshop.sweetshop;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.workshop.sweetshop.Sweet.Colour;

public class UserInterface {

	public static UserInterface instance;

	private UserInterface() {

	}

	public static UserInterface getInstance() {

		if (instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}

	public void printAllSweets(Set<Sweet> sweetList) {

//		for (Sweet sweet : sweetList) {
//			System.out.println(sweet);
//		}
		sweetList.stream().forEach(System.out :: println);
	}
	
	public void printAllGreenSweets(Set<Sweet> sweetList) {
		
		sweetList.stream().filter(sweet -> sweet.colour.equals(Colour.GREEN)).forEach(System.out ::println);	
	}

	public int showUserMenu() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter \n 1.add Sweet \n 2.remove Sweet " + "\n 3.update sweet \n 4.print sweet "
				+ "\n 5.for print green colour sweet \n "+ Application.EXIT_VALUE + ".Exit  ");
		int input = sc.nextInt();
		return input;
	}
}
