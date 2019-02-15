package ch.zuehlke.fullstack.ConnectZuehlke.domain;

public class Employee {

    private String firstName;
    private String lastName;
    private int id;
    private String code;

    private Employee() {
    }

    public Employee(String firstName, String lastName, int id) {
        this(firstName, lastName, id, firstName.substring(0, 1) + lastName.substring(0, 2));
    }

    public Employee(String firstName, String lastName, int id, String code) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.code = code.toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

}
