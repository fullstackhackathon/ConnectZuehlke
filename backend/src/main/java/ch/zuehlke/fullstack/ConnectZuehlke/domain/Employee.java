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
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
        setCode(code);
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    private void setCode(String code) {
        this.code = code.toLowerCase();
    }
}
