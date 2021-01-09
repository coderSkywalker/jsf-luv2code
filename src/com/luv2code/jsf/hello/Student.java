package com.luv2code.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteProgrammingLanguage;
	
	private List<String> countryOptions;
	
	public Student() {
		countryOptions = new ArrayList<String>();
		
		countryOptions.add("Bahama");
		countryOptions.add("Brazil");
		countryOptions.add("Burundi");
		countryOptions.add("Canada");
		countryOptions.add("Costarica");
		countryOptions.add("Denmark");
		countryOptions.add("Egypt");
		countryOptions.add("France");
		countryOptions.add("Finland");
		countryOptions.add("Germany");
		countryOptions.add("Great Britain");
		countryOptions.add("Haiti");
		countryOptions.add("India");
		countryOptions.add("Ireland");
		countryOptions.add("Italy");
		countryOptions.add("Japan");
		countryOptions.add("Kazakchstan");
		countryOptions.add("Monaco");
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteProgrammingLanguage() {
		return favoriteProgrammingLanguage;
	}
	
	public void setFavoriteProgrammingLanguage(String language) {
		this.favoriteProgrammingLanguage = language;
	}
	
	public List<String> getCountryOptions() {
		return countryOptions;
	}
	
}
