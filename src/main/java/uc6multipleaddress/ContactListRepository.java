package uc6multipleaddress;

import java.util.ArrayList;

public class ContactListRepository {
    public ArrayList<Person> contactListRepo = new ArrayList<Person>();
    public String repoName;

    public void add(Person person) {
        contactListRepo.add(person);
        System.out.println(person);
    }

    public void setContactRepoName(String next) {
        // TODO Auto-generated method stub
        this.repoName = next;
    }
}
