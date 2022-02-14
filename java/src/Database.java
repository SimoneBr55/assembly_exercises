import classes.Employee;

public class Database {
    public static void main(String[] args) {
        Employee e = new Employee("Mario", "Rossi", 1800, "Vendite");

        // SAME FUNCTION - PRINT ALL OBJECT
        /*System.out.println(e.name);
        System.out.println(e.lastname);
        System.out.println(e.salary);
        System.out.println(e.department);*/
        //System.out.println(e.toString()); // defining the toString method
        //System.out.println(e); // once defined toString, it automatically links to this

        System.out.println(e.getName());
        System.out.println(e.getSalary());
        e.setSalary(e.getSalary() * 1.2);
        System.out.println(e.getSalary());

    }
}
