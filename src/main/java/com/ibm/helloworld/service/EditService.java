package com.ibm.helloworld.service;

import com.ibm.helloworld.model.Person;

public interface EditService {
	public Person getPerson();
	public void savePerson(Person personBean);
}
