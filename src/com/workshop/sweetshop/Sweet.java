package com.workshop.sweetshop;

import java.util.List;
import java.util.Objects;

public class Sweet {

	enum Shape {
		TRIANGLE, SQUARE, ROUND, CONE
	}

	enum Colour {
		RED, GREEN, BLUE, ORANGE
	}

	String name;
	Shape shape;
	Colour colour;
	int price;
	List<String> ingredients;

	@Override
	public String toString() {
		return "Sweet [name=" + name + ", shape=" + shape + ", colour=" + colour + ", price=" + price + ", ingredients="
				+ ingredients + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, ingredients, name, price, shape);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweet other = (Sweet) obj;
		return Objects.equals(colour, other.colour) && Objects.equals(ingredients, other.ingredients)
				&& Objects.equals(name, other.name) && price == other.price && Objects.equals(shape, other.shape);
	}

}
