
package com.bridgelabz.clinique.model;

import java.util.ArrayList;
import java.util.List;

public class Appointment {
	private String docName;
	
	private List<Patient> listOfPatients = new ArrayList<Patient>();
	
	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public List<Patient> getListOfPatients() {
		return listOfPatients;
	}
	
	public void setListOfPatients(List<Patient> listOfPatients) {
		this.listOfPatients = listOfPatients;
	}
	


}
