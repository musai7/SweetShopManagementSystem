package com.workshop.sweetshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
}
