package ru.vsu.fca.core;

import java.util.List;

public class FcaObjectSet {
	
	private int[][] matrix;
	private List<FcaAttribute> attributes;
	private List<FcaObject> objects;

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public List<FcaAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<FcaAttribute> attributes) {
		this.attributes = attributes;
	}

	public List<FcaObject> getObjects() {
		return objects;
	}

	public void setObjects(List<FcaObject> objects) {
		this.objects = objects;
	}

	public void sortMatrix(){
		
	}
	
	public String getObjectById(int id){
		return "";
	}
	
	public String getAttributeById(int id){
		return "";
	}
	
	public int[] addElement(int[] attrVector){
		return null;
	}
}
