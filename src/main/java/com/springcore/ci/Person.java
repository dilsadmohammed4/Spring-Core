package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> lang;

	public Person(String name, int personId, Certi certi, List<String> lang) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.lang = lang;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId + "{" + this.certi.getName() + "}" + this.lang;
	}

}
