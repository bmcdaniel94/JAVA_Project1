package project1pkg;
/*
 * Benjamin McDaniel
 * Project1
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ACE implements AceDataManagerADT{
	private ArrayList<Patient> myPatients;
	//private Risks[] risk;
	private String fileName;
	private String patientListName;
	private Scanner scan;
	
	public ACE(String pL) {
		patientListName = pL;
		myPatients = new ArrayList<Patient>();
	}
	
	public void addPatient(PatientADT p) {
		//patient is added to ArrayList of Patients (myPatients)
		System.out.println("name?: ");
		String x = scan.next();
		System.out.println("\n");
		System.out.println("id?: ");
		String y = scan.next();
		System.out.println("\n");
		System.out.println("# of traumas?: ");
		String z = scan.next();
		System.out.println("\n");
		
		p = new Patient(x,y,z);
		myPatients.add((Patient) p);
		
	}

	public PatientADT getPatient(String id) {
		//search for "id" using iterator to go through the arraylist when found return;
		Patient toReturn;
		
		// if array is 0 just say "not found"
		if (myPatients.size()==0) {
			System.out.println("patient not found");
		}
		for (Patient iterator : myPatients) {
				if(iterator.getId().equals(id)) {
					toReturn = iterator;
					return toReturn;
			}
		}
		return null;
	}

	public ArrayList<String> getRiskFactors(ArrayList<String> aces) {
		// calculate risk factors
		
//		for (Patient iterator : myPatients) {
//			if (iterator.)
//		}
		return null;
		
	}

	public void readFile() {
		BufferedReader lineReader = null;

		try {
			FileReader fr = new FileReader(fileName);
			lineReader = new BufferedReader(fr);			

			lineReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), Charset.forName("UTF-8")));  

			String line = null;
			while ((line = lineReader.readLine())!=null) {
				String n = lineReader.readLine();
				String id = lineReader.readLine();
				String t = lineReader.readLine();
				if (line.equalsIgnoreCase("patient")) {
					Patient s1 = new Patient(n, id, t);
					myPatients.add(s1);
				}
				else {
					System.err.println("Error: Unexpected person type");
				}
			}
		} catch (Exception e) {
			System.err.println("there was a problem with the file.  either no such file or format error");
		} finally {
			if (lineReader != null)
				try {
					lineReader.close();
				} catch (IOException e) {
					System.err.println("could not close BufferedReader");
				}
		}
	}
	public void writeToFile() {
		//doWrite();
	}

	public void writeToFile(String fn) {
		//doWrite(fn);
	}
	
	public String toString() {
		String toReturn = patientListName + "\n";
		for (Patient iterator : myPatients) {
			toReturn = iterator.toString();
		}
		return toReturn;
	}

}
