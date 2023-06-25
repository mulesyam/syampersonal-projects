package com.example.demo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="authority")
public class AuthorityDao {
	@Id
	private int id;
	private String name;
	
	
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
	@Override
	public String toString() {
		return "AuthorityDao [id=" + id + ", name=" + name + "]";
	}
	public AuthorityDao(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public AuthorityDao() {
		super();
	
	}
	
	
	

}
