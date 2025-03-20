package com.ibm.helloworld.action;

import java.util.ArrayList;
import java.util.List;

import com.ibm.helloworld.model.Person;
import com.ibm.helloworld.model.State;
import com.ibm.helloworld.service.EditService;
import com.ibm.helloworld.service.EditServiceImp;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private EditService registerService=new EditServiceImp();
	private Person personBean;
private String [] sports = {"football", "baseball", "basketball" };
	
	private String [] genders = {"male", "female", "not sure" };
	
	private List<State> states ;

	private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};
	
	@Override
	public void validate() {
		
	}
	@Override
	public String input() throws Exception {
		setPersonBean(registerService.getPerson());
		return INPUT;
	}
	@Override
	public String execute() throws Exception {
		registerService.savePerson(getPersonBean());
		return SUCCESS;
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

	public String[] getSports() {
		return sports;
	}

	public void setSports(String[] sports) {
		this.sports = sports;
	}

	public String[] getGenders() {
		return genders;
	}

	public void setGenders(String[] genders) {
		this.genders = genders;
	}

	public List<State> getStates() {
		states = new ArrayList<State>();
		states.add( new State("AZ", "Arizona") );
		states.add( new State("CA", "California") );
		states.add( new State("FL", "Florida") );
		states.add( new State("KS", "Kansas") );
		states.add( new State("NY", "New York") );
		
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public String[] getCarModelsAvailable() {
		return carModelsAvailable;
	}

	public void setCarModelsAvailable(String[] carModelsAvailable) {
		this.carModelsAvailable = carModelsAvailable;
	}
	

}
