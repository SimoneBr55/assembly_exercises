package phonebook;

import phonebook.classes.objects.PhoneBookList;
import phonebook.classes.objects.Person;
import phonebook.classes.objects.PhoneBookMap;

public class App {
    public static void main(String[] args) {
        PhoneBookMap pb = new PhoneBookMap();
        pb.addPerson(new Person("Mario", "Rossi", "3334444777"));
        pb.addPerson(new Person("Ginetto", "Verdi", "3335920132"));
        pb.addPerson(new Person("Fulvio", "Fulvanti", "3332436342"));
        pb.addPerson(new Person("Asdrubale", "Azzo", "3462423131"));

        System.out.println(pb.searchByName("Mario"));

        Person simone = new Person("Simone", "Brazioli", "3333333");
        System.out.println(simone.toString());
    }
}
