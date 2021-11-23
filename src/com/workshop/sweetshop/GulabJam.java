package com.workshop.sweetshop;

import java.util.ArrayList;

public class GulabJam extends Sweet {
	public GulabJam(){
		name = "gulabjam";
		shape = Shape.ROUND;
		colour = Colour.ORANGE;
		ingredients = new ArrayList();
		ingredients.add("sugar");
		ingredients.add("oil");
	}
}
