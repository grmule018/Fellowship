
package com.bridgelabz.oops.clinique;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.OopsUtility;

public class CliniqueManager {
	static List<Doctor> listOfDoctor = new ArrayList<Doctor>();
	static final String DOCTOR_FILE = "/home/user/Downloads/RELEASE/GaneshM/src/com/bridgelabz/oops/clinique/Doctor.json";
	static List<Patient> listOfPatients = new ArrayList<Patient>();
	static final String PATIENT_FILE = "/home/user/Downloads/RELEASE/GaneshM/src/com/bridgelabz/oops/clinique/Patient.json";
	static List<Appointment> listOfAppointments = new ArrayList<>();
	static final String APPOINTMENT_FILE = "/home/user/Downloads/RELEASE/GaneshM/src/com/bridgelabz/oops/clinique/Appointment.json";
	static Scanner sc=new Scanner(System.in);
	public static void add() throws IOException {
		System.out.println("Enter choice-\n1:To Add Doctor\n2:To Add Patient");
		int choice =sc.nextInt();
		switch (choice) {
		case 1:
			addDoctor();
			break;
		case 2:
			addPatient();
			break;
		}
	}
	public static void addDoctor() throws IOException {
		String string = OopsUtility.readJsonFile(DOCTOR_FILE);
		try {
			listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Doctor doctor = new Doctor();
		System.out.println("Setting id   "+listOfDoctor.size());
		doctor.setId(listOfDoctor.size() + 1);
		System.out.println("Id set");
		System.out.println("Enter the doctor's name");
		doctor.setName(sc.next());
		System.out.println("Enter the specialization");
		doctor.setSpecialization(sc.next());
		System.out.println("Enter the availability");
		doctor.setAvailability(sc.next());
		listOfDoctor.add(doctor);
		System.out.println("Doctor added successfully");
		OopsUtility.writeToFile(DOCTOR_FILE, listOfDoctor);
	}

	public static void addPatient() throws IOException {
		String string = OopsUtility.readJsonFile(PATIENT_FILE);
		try {
			listOfPatients = OopsUtility.userReadValue(string, Patient.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Patient patient = new Patient();
		System.out.println("Setting id");
		patient.setId(listOfPatients.size() + 1);
		System.out.println("Id set");
		System.out.println("Enter the patient's name");
		patient.setName(sc.next());
		System.out.println("Enter the age");
		patient.setAge(sc.nextInt());
		System.out.println("Enter the phone number");
		patient.setPhoneNo(sc.nextLong());
		listOfPatients.add(patient);
		System.out.println("Patient added successfully");
		OopsUtility.writeToFile(PATIENT_FILE, listOfPatients);
	}

	public static void searchDoctor() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter choice- 1:Search by ID \n 2:Search By Name\n 3:Search By Specialization\n4:Search By Availability");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			// Function call that searches doctor by id, in Search.class
			// in com.bridgelabz.util package
			Doctor doctor1 = Search.searchById();
			if (doctor1!=null)
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;

		case 2:
			System.out.println("Searching by name");

			// Function call that searches doctor by name, in Search.class
			// in com.bridgelabz.util package
			List<Doctor> doctor2 = Search.searchByName();

			if (!doctor2.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 3:
			System.out.println("Searching by specialization");

			// Function call that searches doctor by specialization, in Search.class
			// in com.bridgelabz.util package
			List<Doctor> doctor3 = Search.searchBySpecialization();

			if (!doctor3.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 4:

			System.out.println("Searching by availability");
			
			List<Doctor> doctor4 = Search.searchBySpecialization();

			if (!doctor4.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;

		}
	}

	public static void searchPatient() throws IOException {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("1:Search by ID  2:Search By Phone Number");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");

			// Function call that searches patient by id, in Search.class
			// in com.bridgelabz.util package
			Patient patient1 = Search.searchByPatientId();

			if (patient1 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		case 2:
			System.out.println("Searching by Phone Number");

			// Function call that searches patient by phone number, in Search.class
			// in com.bridgelabz.util package
			Patient patient2 = Search.searchByPhoneNo();

			if (patient2 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		}
	}

	
	public static void search() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter choice: 1:Search Doctor  2:Search Patient");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			searchDoctor();
			break;
		case 2:
			searchPatient();
			break;
		}
	}

	
	public static void takeAppointment() throws IOException {
		String string = OopsUtility.readJsonFile(APPOINTMENT_FILE);
		try {
			listOfAppointments = OopsUtility.userReadValue(string, Appointment.class);
			System.out.println("File is not empty");

		} catch (Exception e) {
			System.out.println("File is empty");
		}
		Patient patient = Search.searchByPhoneNo();
		if (patient != null) {

			// Function call to perform various operations on patient
			operation(patient);

		} else {

			// Static function to add patient in case the patient is not in the system
			CliniqueManager.addPatient();

			Patient patient2 = Search.searchByPhoneNo();

			operation(patient2);
		}
		OopsUtility.writeToFile(APPOINTMENT_FILE, listOfAppointments);

	}

	
	public static void displayList(List<Doctor> docList) {
		docList.forEach(doctor-> {
			System.out.println("Doctor's ID: " + doctor.getId());
			System.out.println("Doctor's name: " + doctor.getName());
			System.out.println("Doctor's specialization: " + doctor.getSpecialization());
			System.out.println("Doctor's availability: " + doctor.getAvailability());
		});
	}
	
	public static void searchDoc(List<Doctor> doctorList, Patient patient) {
		System.out.println("Enter id");
		int id = sc.nextInt();
		int flag = 0;
		try {
			for(Doctor doctor: doctorList) {
				if (id == doctor.getId()) {
					for (Appointment appointment : listOfAppointments) {
						if (doctor.getName().equals(appointment.getDocName())) {
							List<Patient> patientAppointmentList = appointment.getListOfPatients();
							if (patientAppointmentList.size() < 5) {
								for (Patient patient2 : patientAppointmentList) {
									if (patient.getId() == patient2.getId()) {
										System.out.println("You have already have an appointment with this doctor");
										flag = 1;
										break;
									} else {
										patientAppointmentList.add(patient);
										appointment.setListOfPatients(patientAppointmentList);
										System.out.println("Appointment is set");
										flag = 1;
										break;
									}
								}

							} else {
								System.out.println("Appointment is full");
								flag = 1;
								break;
							}
						}
					}
					if (flag == 0) {
						Appointment appointment2 = new Appointment();
						List<Patient> patientList1 = new ArrayList<Patient>();
						patientList1.add(patient);
						appointment2.setDocName(doctor.getName());
						appointment2.setListOfPatients(patientList1);
						listOfAppointments.add(appointment2);
						System.out.println("Appointment is set");
					}

				}
			}

		} catch (Exception e) {
			System.out.println("Enter the correct id");
		}
	}
	
	public static void operation(Patient patient) throws IOException {
		System.out.println("Search doctor by- 1:Name 2:Speciality 3:Availability");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			List<Doctor> doctorList = Search.searchByName();
			displayList(doctorList);
			searchDoc(doctorList, patient);
			break;
		case 2:
			List<Doctor> doctorList1 = Search.searchBySpecialization();
			displayList(doctorList1);
			searchDoc(doctorList1, patient);
			break;
		case 3:
			List<Doctor> doctorList2 = Search.searchByAvailability();
			displayList(doctorList2);
			searchDoc(doctorList2, patient);
			break;
		}
	}


	public static void famousDoctor() throws IOException {
		String string = OopsUtility.readJsonFile(APPOINTMENT_FILE);
		Map<String, Integer> map = new HashMap<>();
		try {
			listOfAppointments = OopsUtility.userReadValue(string, Appointment.class);
			for (int i = 0; i < listOfAppointments.size(); i++) {
				Appointment appointment = listOfAppointments.get(i);
				String doctorName = appointment.getDocName();
				Integer numberOfAppointments = appointment.getListOfPatients().size();
				map.put(doctorName, numberOfAppointments);
			}
			int maxValue = Collections.max(map.values());
			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() == maxValue) {
					System.out.println(

							"Famous Doctor Name: " + entry.getKey() + " ---> No of appointments: " + entry.getValue());
				}
			}
		} catch (Exception e) {
			System.out.println("No list of appointments! Can't search for famous doctors");
		}
	}

	/**
	 * Static function to find the famous specialization
	 * 
	 * @throws IOException
	 */
	public static void famousSpecialist() throws IOException {
		String string = OopsUtility.readJsonFile(DOCTOR_FILE);
		List<String> list = new ArrayList<>();
		try {
			listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			for (Doctor doctor : listOfDoctor) {
				for (Doctor doctor1 : listOfDoctor) {
					if (doctor.getSpecialization().equals(doctor1.getSpecialization())) {
						list.add(doctor.getSpecialization());
					}
				}
			}
			int max = 0;
			int curr = 0;
			String currKey = null;
			Set<String> unique = new HashSet<String>(list);
			for (String key : unique) {
				curr = Collections.frequency(list, key);
				if (max < curr) {
					max = curr;
					currKey = key;
				}
			}
			System.out.println("Specialization  " + currKey + " is famours");
		} catch (Exception e) {
			System.out.println("There are no doctors in the system");
		}
	}
}
