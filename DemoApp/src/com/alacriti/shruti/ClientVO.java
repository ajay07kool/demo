package com.alacriti.shruti;

public class ClientVO {

	private int id;
	private int parentId;
	private String name;
	private int age;
	
	
	
	
	public ClientVO(int id, int parentId, String name, int age) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
