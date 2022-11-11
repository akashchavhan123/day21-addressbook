package uc6multipleaddress;

import java.util.ArrayList;

public class AddressBookRepo {
    public ArrayList<ContactListRepository> addressBooks = new ArrayList<ContactListRepository>();

    public void add(ContactListRepository contactRepo) {
        addressBooks.add(contactRepo);
        System.out.println(addressBooks);
    }
}
