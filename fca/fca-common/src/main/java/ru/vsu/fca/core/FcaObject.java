package ru.vsu.fca.core;
/**
 * Класс для работы с объектами.
 * @author qqmber
 *
 */
public class FcaObject {
	
	private String name;
	private int id;
	private int[] attributes;
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/***
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return
	 */
	public int[] getAttributes() {
		return attributes;
	}
	
	/**
	 * 
	 * @param attributes
	 */
	public void setAttributes(int[] attributes) {
		this.attributes = attributes;
	}
}
