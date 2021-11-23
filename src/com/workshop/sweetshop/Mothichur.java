package com.workshop.sweetshop;

import java.util.ArrayList;

public class Mothichur extends Sweet {
	public Mothichur() {
		name = "mothichur";
		shape = Shape.SQUARE;
		colour = Colour.RED;
		ingredients = new ArrayList();
		ingredients.add("sugar");
		ingredients.add("oil");
	}
}
