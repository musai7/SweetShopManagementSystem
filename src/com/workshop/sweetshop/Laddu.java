package com.workshop.sweetshop;

import java.util.ArrayList;

public class Laddu extends Sweet {
	public Laddu() {
		name = "laddu";
		shape = "round";
		colour = "yellow";
		ingredients = new ArrayList();
		ingredients.add("sugar");
		ingredients.add("oil");
	}
}
