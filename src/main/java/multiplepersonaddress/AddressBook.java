package multiplepersonaddress;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
//		first use case
        AddressBook addressBook = new AddressBook();

        Scanner scanner = new Scanner(System.in);
//
        // second use case to store multiple contacts
        ArrayList<Person> contactListRepository = new ArrayList<Person>();
        System.out.println("how may contacts you would like to create?");
        int inputCount = scanner.nextInt(); // 2
        for (int i = 0; i < inputCount; i++) {
            Person contact = addressBook.createContact(scanner);
            contactListRepository.add(contact);
        }
        System.out.println("Repository level Contacts");
        System.out.println(contactListRepository);

        // edit contact
        addressBook.editContact(contactListRepository);

        // delete contact
        addressBook.deleteContact(contactListRepository);
    }

    public Person createContact(Scanner scanner) {

        Person person = new Person();

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

        return person;
    }

    public void editContact(ArrayList<Person> contactListRepository) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First name you want to edit:");
        String Enteredname = scanner.next();

        Iterator<Person> iterator = contactListRepository.listIterator();
        System.out.println("Choose field you want to Edit:");
        System.out.println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State\t6.Email");

        for (int i = 0; i < contactListRepository.size(); i++) {

            Person person = contactListRepository.get(i);

            if (Enteredname.equals(person.getFname())) {

                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Re-Correct your lastname");
                        person.setLname(scanner.next());
                        break;
                    case 2:
                        System.out.println("Re-Correct your Phone Number");
                        person.setPhonenumber(scanner.nextLong());
                        break;
                    case 3:
                        System.out.println("Re-Correct your City");
                        person.setCity(scanner.next());
                        break;
                    case 4:
                        System.out.println("Re-Correct your Zip");
                        person.setZip(scanner.nextLong());
                        break;
                    case 5:
                        System.out.println("Re-Correct your State");
                        person.setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Re-correct your email");
                        person.setEmail(scanner.next());
                        break;
                }
                System.out.println("edited contact details");
                System.out.println(person);
            }
        }
        System.out.println("After Editing Contact");
        System.out.println(contactListRepository);
    }

    public void deleteContact(ArrayList<Person> contactListRepository) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First name you want to delete:");
        String pFname = scanner.next();

        Iterator<Person> iterator = contactListRepository.listIterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();

            if (pFname.equals(person.getFname())) {
                contactListRepository.remove(person);
                System.out.println(contactListRepository);
            }
        }
    }
}
