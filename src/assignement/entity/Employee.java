package assignement.entity;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private int age;
    private String address;
    private String phone;
    private String email;
    private String designation;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID : " + this.getId() + " LastName :" + this.getLastName() + "FirstName :" + this.getFirstName()
                + "Age :" + this.getAge() + "address:" + this.getAddress() + "phone : " + this.getPhone() + "Email :" + this.getEmail() +
                "Designation :" + this.getDesignation() + "Salary :" + this.getSalary();
    }
}
