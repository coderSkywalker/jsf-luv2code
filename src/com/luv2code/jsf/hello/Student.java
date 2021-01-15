package com.luv2code.jsf.hello;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;


@ManagedBean()
public class Student {
	
	
	private int freePasses;
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteProgrammingLanguage;
	private String email;
	private String postalCode;
	private String phoneNumber;
	private String studentCode;

	private List<String> countryOptions;
	private List<String> languageOptions;
	
	private List<String> favoriteProgrammingLanguages;
	
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
	
	
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
		
		languageOptions = new ArrayList<String>();
		
		languageOptions.add("Assembler");
		languageOptions.add("C");
		languageOptions.add("C#");
		languageOptions.add("C++");
		languageOptions.add("Fortran");
		languageOptions.add("Java");
		languageOptions.add("PHP");
		
	}
	
	public Student(String firstName, String lastName, String country, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.email = email;
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
	
	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
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
	
	public List<String> getLanguageOptions() {
		return languageOptions;
	}

	public List<String> getFavoriteProgrammingLanguages() {
		return favoriteProgrammingLanguages;
	}

	public void setFavoriteProgrammingLanguages(List<String> favoriteProgrammingLanguages) {
		this.favoriteProgrammingLanguages = favoriteProgrammingLanguages;
	}

	public SimpleDateFormat getSimpleDateFormat() {
		return simpleDateFormat;
	}

	public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		this.simpleDateFormat = simpleDateFormat;
	}
	
	
	public String getCurrentTime() {
		return simpleDateFormat.format(Calendar.getInstance().getTime());
	}
	
	
	/*
	 * method to custom validation
	 */
	public void validateTheStudentCode(FacesContext context, UIComponent component,
										Object value) throws ValidatorException {
		
		if ( value == null ) {
			return;
		}
		
		String data = value.toString();
		
		// Student code must start with PK if not, throw exception
		if ( !data.startsWith("PK")) {
			FacesMessage message = new FacesMessage("Student code must start with PK");
			throw new ValidatorException(message);
		}
		
		
	}

}





