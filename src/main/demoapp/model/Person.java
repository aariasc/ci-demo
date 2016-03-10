package demoapp.model;

import java.util.Date;

/**
* This class represents a Person entity, which handles first name, last name
* and hire date.  This information is stored in the database
*/
public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private Date hireDate;
	
	public Person(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
}
