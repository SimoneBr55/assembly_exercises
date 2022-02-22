package phonebook.classes.objects;

import phonebook.interfaces.PhoneBook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    ArrayList<Person> pb;

    public PhoneBookList() {
        this.pb = new ArrayList<>();
    }

    public PhoneBookList(ArrayList<Person> pb) {
        this.pb = pb;
    }

    @Override
    public void addPerson(Person p) {
        pb.add(p);
    }


    @Override
    public Person searchByName(String name) { // without outputting a list it will return just the first
        for (Person p : pb) {
            if (p.getName().equals(name)) {
                return p;
            }

        }
        return null;
    }

    @Override
    public Person searchByLastname(String lastname) {
        for (Person p : pb) {
            if (p.getLastName().equals(lastname)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Person searchByPhone(String phone) {
        for (Person p : pb) {
            if (p.getPhone().equals(phone)) {
                return p;
            }
        }
        return null;
    }
}

