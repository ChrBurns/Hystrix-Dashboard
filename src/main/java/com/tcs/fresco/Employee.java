package com.tcs.fresco;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {

    private String name;
    private String location;
    private int id;
    private String education;
    private int yearsOfEmployment;


    public Employee(int id, String name, String education, String location, int yearsOfEmployment) {
        super();
        this.name = name;
        this.location = location;
        this.id = id;
        this.education = education;
        this.setYearsOfEmployment(yearsOfEmployment);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }

	public int getYearsOfEmployment() {
		return yearsOfEmployment;
	}

	public void setYearsOfEmployment(int yearsOfEmployment) {
		this.yearsOfEmployment = yearsOfEmployment;
	}

}
