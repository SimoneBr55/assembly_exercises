package phonebook.interfaces;

import phonebook.classes.objects.Person;

public interface PhoneBook {
    void addPerson(Person p);

    Person searchByName(String name);

    Person searchByLastname(String lastname);

    Person searchByPhone(String phone);
}
