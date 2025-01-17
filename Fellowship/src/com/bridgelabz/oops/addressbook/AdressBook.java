package com.bridgelabz.oops.addressbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

class AddressBook {
	
	static List<Person> listOfPersons= new ArrayList<Person>();
	static Scanner sc= new Scanner(System.in);
	//ObjectMapper objectMapper = new ObjectMapper();
	
	 	public void addPerson() throws JsonGenerationException, JsonMappingException, IOException {
		Person person = new Person();
		System.out.println("Enter first name");
		person.setFirstName(sc.next());
		System.out.println("Enter last name");
		person.setLastName(sc.next());
		System.out.println("Enter contact number");
		person.setContactNo(sc.nextLong());

		// Function call to add the address details of the person
		
		person.setAddress(addressDetails());
		listOfPersons.add(person);
		//objectMapper.writeValue(new File("/home/user/Downloads/RELEASE/GaneshM/ganesh.json"), listOfPersons);
	}

	public Address addressDetails() {
		Address address = new Address();
		System.out.println("Enter street");
		address.setStreet(sc.next());
		System.out.println("Enter city");
		address.setCity(sc.next());
		System.out.println("Enter state");
		address.setState(sc.next());
		System.out.println("Enter zipcode");
		address.setZipcode(sc.nextLong());
		return address;
	}

	public void editPerson() {
		System.out.println("Enter the details of the person whose information needs to be modified");
		System.out.println("Enter first name");
		String firstName = sc.next();
		System.out.println("Enter last name");
		String lastName = sc.next();
		Optional<Person> optional = listOfPersons.parallelStream()
				.filter(person -> firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName()))
				.findAny();
		if (optional.isPresent())
			editUpdate(optional.get());
		else
			System.out.println("Person of that name is not present");
	}

	public void editUpdate(Person per) {
		do {
			System.out.println("Enter the choice you want modify");
			System.out.println("1:Contact Number  2:Address");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the new contact number");
				long newContact = sc.nextLong();
				per.setContactNo(newContact);
				System.out.println("Your contact number is updated");
				break;
			case 2:
				Address address = per.getAddress();

				// Function call to modify the address details of the specified person
				addressUpdate(address);

				per.setAddress(address);
				break;
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		} while (per != null);
	}

	public void addressUpdate(Address address) {
		do {
			System.out.println("Enter the details of address you want to change");
			System.out.println("1:Street\n2:City\n3:State\n4:Zipcode");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the street");
				String newStreet = sc.next();
				address.setStreet(newStreet);
				System.out.println("Your street is updated");
				break;
			case 2:
				System.out.println("Enter the city");
				String newCity = sc.next();
				address.setCity(newCity);
				System.out.println("Your city is updated");
				break;
			case 3:
				System.out.println("Enter the state");
				String newState = sc.next();
				address.setState(newState);
				System.out.println("Your state is updated");
				break;
			case 4:
				System.out.println("Enter the zipcode");
				long newZip = sc.nextLong();
				address.setZipcode(newZip);
				System.out.println("Your zip code has been updated");
				break;
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		} while (address != null);
	}

	public void display() {
	listOfPersons.forEach(person->{
			System.out.println("First Name: " + person.getFirstName());
			System.out.println("Last Name: " + person.getLastName());
			System.out.println("Contact Number: " + person.getContactNo());
			Address add = person.getAddress();
			System.out.println("Street: " + add.getStreet());
			System.out.println("City: " + add.getCity());
			System.out.println("State: " + add.getState());
			System.out.println("Zip code: " + add.getZipcode());
			System.out.println("-------------------------------------");
		});
	}


	public void deletePerson() {
		System.out.println("Enter the details of person to delete");
		System.out.println("Enter first name");
		String firstName = sc.next();
		System.out.println("Enter last name");
		String lastName = sc.next();
		if (!listOfPersons.isEmpty()) {
			boolean isRemoved = 
					listOfPersons.removeIf(person -> firstName.equals(person.getFirstName()) 
					&& lastName.equals(person.getLastName()));
			if (isRemoved)
				System.out.println("The person has been deleted");
			else
				System.out.println("The person of that name does'nt exist");
		} else
			System.out.println("Address Book is empty!");
	}

	
	public void sortByLastName() {
		Collections.sort(listOfPersons, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));
	}

	
	public void sortByZipCode() {
		Collections.sort(listOfPersons,
				(person1, person2) -> person1.getAddress().getZipcode() > person2.getAddress().getZipcode() ? 1
						: person1.getAddress().getZipcode() < person2.getAddress().getZipcode() ? -1
								: person1.getAddress().getZipcode() == person2.getAddress().getZipcode() ? 0 : -10);

	}
}