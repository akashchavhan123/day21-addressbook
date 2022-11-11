package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
//		first use case
        AddressBook addressBook = new AddressBook();
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> contactListRepository = new ArrayList<Person>();
        System.out.println("how may contacts you would like to create?");
        int inputCount = scanner.nextInt(); //2
        for(int i=0;i<inputCount;i++) {
            Person contact = addressBook.createContact(person, scanner);
            contactListRepository.add(person);
        }
        System.out.println("Repository level Contacts");
        System.out.println(contactListRepository);
    }

    public Person createContact(Person person, Scanner scanner) {

        System.out.println("Enter the first name:");
        String Fname = scanner.next();
        person.setFname(Fname);

        System.out.println("Enter the last name:");
        String Lname = scanner.next();
        person.setLname(Lname);

        System.out.println("Enter the Phone number");
        Long phonenumber = scanner.nextLong();
        person.setPhonenumber(phonenumber);

        System.out.println("Enetr he city");
        String city = scanner.next();
        person.setCity(city);

        System.out.println("Enter the State");
        String state = scanner.next();
        person.setState(state);

        System.out.println("Enter the Zip code");
        Long Zip = scanner.nextLong();
        person.setZip(Zip);

        System.out.println("Enter the E-mail");
        String email = scanner.next();
        person.setEmail(email);
//		System.out.println(person);
//		scanner.close();
        return person;

    }
}
