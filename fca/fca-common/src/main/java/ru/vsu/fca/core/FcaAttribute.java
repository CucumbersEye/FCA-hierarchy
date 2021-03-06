package ru.vsu.fca.core;

/**
 * Класс для хранения информации об атрибуте.
 *
 * @author qqmber
 */
public class FcaAttribute {

	/**
	 * Имя/сигнатура поля/метода.
	 */
	private String name;

	/**
	 * Идентификатор (номер столбца объектно-признаковой матрицы)
	 * поля/метода.
	 */
	private int id;

	public String getName() {
		return name;
	}

	/**
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

}
