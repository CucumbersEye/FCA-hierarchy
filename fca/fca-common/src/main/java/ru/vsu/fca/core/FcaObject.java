package ru.vsu.fca.core;

public class FcaObject {
	
	private String name;
	private int id;
	private int[] attributes;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int[] getAttributes() {
		return attributes;
	}
	public void setAttributes(int[] attributes) {
		this.attributes = attributes;
	}
}
