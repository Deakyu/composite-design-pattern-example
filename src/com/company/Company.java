package com.company;

public class Company {

    public static void main(String[] args) {
	    Developer dev1 = new Developer(100, "Deakyu Lee", "Mobile Application Systems Analyst");
	    Developer dev2 = new Developer(101, "Tony Ramos", "Mobile Application Systems Analyst");
	    CompanyDirectory devDirectory = new CompanyDirectory();
	    devDirectory.addEmployee(dev1);
	    devDirectory.addEmployee(dev2);

	    Manager man1 = new Manager(200, "Lenny Hubbart", "Manager");
	    Manager man2 = new Manager(201, "Mariana", "Manager");
	    CompanyDirectory manDirectory = new CompanyDirectory();
	    manDirectory.addEmployee(man1);
	    manDirectory.addEmployee(man2);

	    CompanyDirectory directory = new CompanyDirectory();
	    directory.addEmployee(devDirectory);
	    directory.addEmployee(manDirectory);
	    directory.showEmployeeDetails();
    }
}
