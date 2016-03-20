package com.arati.learning.rest;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Address {
	public String name;
	public String city;
	public String country;
	
	public Address() {
	}
	
	public Address(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", city=" + city +",country=" + country + "]";
	}

	public JSONObject getAddress(){
		JSONObject addressJson = new JSONObject();
		
		try {
			addressJson.put("name", "arati");
			addressJson.put("city", "bam");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return addressJson;
	}
	
}
