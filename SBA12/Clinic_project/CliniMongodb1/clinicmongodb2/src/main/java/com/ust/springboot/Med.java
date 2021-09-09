package com.ust.springboot;





import java.lang.reflect.GenericArrayType;

import javax.annotation.processing.Generated;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="medicine")
public class Med {
    
    @Id
    
	private String id;
	
	
	private String medname;
	
	private int price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMedname() {
		return medname;
	}
	public void setMedname(String medname) {
		this.medname = medname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

