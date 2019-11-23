package com.ibm.helloworld.service;

import com.ibm.helloworld.model.Person;

public class EditServiceImp implements EditService {
	
	private static Person person;
	private static String [] carModels= {"Ford","Nissan"};
	
	static {
		person=new Person();
		person.setFirstName("Bruce");
		person.setLastName("Phillips");
		person.setSport("basketball");
		person.setGender("not sure");
		person.setResidency("KS");
		person.setOver21(true);
		person.setCarModels(carModels);
		
	}
	public Person getPerson() {
		return EditServiceImp.person;
	}

	public void savePerson(Person personBean) {
		EditServiceImp.person.setFirstName(personBean.getFirstName() );
		EditServiceImp.person.setLastName(personBean.getLastName() );
		EditServiceImp.person.setSport(personBean.getSport() );
		EditServiceImp.person.setGender( personBean.getGender() );
		EditServiceImp.person.setResidency( personBean.getResidency() );
		EditServiceImp.person.setOver21( personBean.isOver21() );
		EditServiceImp.person.setCarModels(personBean.getCarModels() );
		
	}

}
