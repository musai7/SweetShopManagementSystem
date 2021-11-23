package com.workshop.sweetshop;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	
	
	public void printAllSweets(Set<Sweet> sweetList) {
//		for (int i = 0; i < sweetList.size(); i++) {
//			System.out.println(sweetList.get(i));
//		}
		
		for(Sweet sweet : sweetList) {
			System.out.println(sweet);
		}
	}

	public int showUserMenu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter \n 1.add Sweet \n 2.remove Sweet " 
						+ "\n 3.update sweet \n 4.print sweet \n " + Application.EXIT_VALUE + ".Exit  ");
		int input = sc.nextInt();
		return input;
	}
}
