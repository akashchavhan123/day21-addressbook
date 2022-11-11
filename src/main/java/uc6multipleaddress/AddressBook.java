package uc6multipleaddress;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
//		first use case
        AddressBook addressBook = new AddressBook();

        Scanner scanner = new Scanner(System.in);
//
        // second use case to store multiple contacts
        AddressBookRepo addressBookRepo = new AddressBookRepo();

        System.out.println("Enter how many address books you want to create?");
        int addressBookCount = scanner.nextInt();
        for(int i = 0; i < addressBookCount; i++) {

            ContactListRepository contactListRepository = new ContactListRepository();
            System.out.println("how may contacts you would like to create in address book " + (i + 1));
            int inputCount = scanner.nextInt(); // 2

            System.out.println("Enter the name of address book");

            contactListRepository.setContactRepoName(scanner.next());

            for (int j = 0; j < inputCount; j++) {
                Person contact = addressBook.createContact(scanner);
                contactListRepository.add(contact);
            }

            addressBookRepo.add(contactListRepository);
        }

        System.out.println("The address books you have created are as below");
        for (int i = 0; i <addressBookRepo.addressBooks.size(); i++) {

            ContactListRepository contactRepo = addressBookRepo.addressBooks.get(i);
            String repoName = contactRepo.repoName;
            System.out.println(repoName);
            System.out.println(contactRepo.contactListRepo);
        }

        // edit contact
        addressBook.editContact(addressBookRepo);
//
        // delete contact
        addressBook.deleteContact(addressBookRepo);
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

    //ContactListRepository contactListRepository
    public void editContact(AddressBookRepo addressBookRepo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First name you want to edit:");
        String Enteredname = scanner.next();

//		Iterator<Person> iterator = contactListRepository.contactListRepo.listIterator();
        System.out.println("Choose field you want to Edit:");
        System.out.println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State\t6.Email");

        for (int j = 0; j < addressBookRepo.addressBooks.size(); j++) {
            ContactListRepository contactRepo = addressBookRepo.addressBooks.get(j);
            for (int i = 0; i < contactRepo.contactListRepo.size(); i++) {
                Person person = contactRepo.contactListRepo.get(i);
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
        }

        System.out.println("After Editing Contact");
        for (int i = 0; i <addressBookRepo.addressBooks.size(); i++) {
            ContactListRepository contactRepoInfo = addressBookRepo.addressBooks.get(i);
            String repoName = contactRepoInfo.repoName;
            System.out.println(repoName);
            System.out.println(contactRepoInfo.contactListRepo);
        }
    }


    public void deleteContact(AddressBookRepo addressBookRepo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First name you want to delete:");
        String pFname = scanner.next();

        for (int j = 0; j < addressBookRepo.addressBooks.size(); j++) {
            ContactListRepository contactRepo = addressBookRepo.addressBooks.get(j);
            for (int i = 0; i < contactRepo.contactListRepo.size(); i++) {
                Person person = contactRepo.contactListRepo.get(i);
                if (pFname.equals(person.getFname())) {
                    contactRepo.contactListRepo.remove(person);
                }
            }
        }

        System.out.println("After Deleting the Address Book Repo is");
        for (int i = 0; i <addressBookRepo.addressBooks.size(); i++) {
            ContactListRepository contactRepoInfo = addressBookRepo.addressBooks.get(i);
            String repoName = contactRepoInfo.repoName;
            System.out.println(repoName);
            System.out.println(contactRepoInfo.contactListRepo);
        }
    }
}
