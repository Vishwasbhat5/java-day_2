package com.sonata.dayfive;

public class Book
{
private int id;
private String name;
private int page;

public Book(int id,String name , int page) 
{
this.id =id;
this.name = name;
this.page = page;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPage() {
	return page;
}

public void setPage(int page) {
	this.page = page;
}

public static int Size() {
	// TODO Auto-generated method stub
	return 0;
}










}
