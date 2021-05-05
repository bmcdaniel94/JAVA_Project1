package project1pkg;
/*
 * Benjamin McDaniel
 * Project1
 */

import java.util.ArrayList;

public class Patient implements PatientADT{
	private String patientName;
	private String patientID;
	private String patientTraumas;
	private ArrayList<String> ACE;
	
	public Patient() {
		patientName = "John Doe";
		patientID = "00000";
		patientTraumas = "none";
	}
	
	public Patient(String n, String id, String t) {
		patientName = n;
		patientID = id;
		patientTraumas = t;
	}
	
	public void setId (String id) {
		patientID = id;
	}
	public String getId () {
		return patientID;
	}
	
	public void setName (String name) {
		patientName = name;
	}
	
	public String getName () {
		return patientName;
	}
	
	public void addACE (String ace) {
		ACE.add(ace);
	}
	
	public void removeACE (String ace) {
		ACE.remove(ace);
	}
	
	public ArrayList<String> getACEs () {
		return ACE;
	}
	
	public String toString() {
		return patientID+ " " +patientName+"\n";
	}
}
