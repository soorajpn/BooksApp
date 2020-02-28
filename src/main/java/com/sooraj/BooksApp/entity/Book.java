package com.sooraj.BooksApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity //must added.if anottated it will managed by entity manager
@Table(name="Book")//optional execpt the first time we can name the table manually
public class Book {
	
	@Id //must else cuse an exception no identifier
	@GeneratedValue //to auto generate id
	Long id;
	@Column(name="name")//optional
	String name;
	@Column(name="price")//optional
	Long price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
