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
	
	public FcaObject getObjectById(int id){
		FcaObject obj;
		obj = this.objects.get(id);
		return obj;
	}
	
	public FcaAttribute getAttributeById(int id){
		FcaAttribute attr;
		attr = this.attributes.get(id);
		return attr;
	}
	
	public int[] addElement(int[] attrVector){
		return null;
	}
	
	//алгоритм на языке java 
	  public static void qSort(int[][] A, int low, int high) {
	      int i = low;                
	      int j = high;
	      int x = A[(low+high)/2][1];  // x - опорный элемент посредине между low и high
	      do {
	          while(A[i][1] < x) ++i;  // поиск элемента для переноса в старшую часть
	          while(A[j][1] > x) --j;  // поиск элемента для переноса в младшую часть
	          if(i <= j){           
	              // обмен элементов местами:
	              int[] temp = A[i];
	              A[i] = A[j];
	              A[j] = temp;
	              // переход к следующим элементам:
	              i++; j--;
	          }
	      } while(i < j);
	      if(low < j) qSort(A, low, j);
	      if(i < high) qSort(A, i, high);
	  }
}
