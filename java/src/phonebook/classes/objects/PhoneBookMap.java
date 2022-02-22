package phonebook.classes.objects;

import phonebook.interfaces.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Person> pb;

    public PhoneBookMap() {
        this.pb = new HashMap<>();
    }

    public PhoneBookMap(HashMap<String, Person> pb) {
        this.pb = pb;
    }

    @Override
    public void addPerson(Person p) {
        pb.put(p.getPhone(), p);
    }


    @Override
    public Person searchByName(String name) { // without outputting a list it will return just the first
        for (Person p : pb.values()) {
            if (p.getName().equals(name)) {
                return p;
            }

        }
        return null;
    }

    @Override
    public Person searchByLastname(String lastname) {
        for (Person p : pb.values()) {
            if (p.getLastName().equals(lastname)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Person searchByPhone(String phone) {
        for (Person p : pb.values()) {
            if (p.getPhone().equals(phone)) {
                return p;
            }
        }
        return null;
    }
}

