package homework5.company.javaLessons;

public class Employee {
    public String name;
    protected String position;
    public String email;
    public int telephoneNumber;
    public int salary;
    public int age;

    public Employee(String name, String position, String email, int telephoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
    public void printInformation() {
        System.out.printf("Employee information: %n name: %s %n position: %s %n email: %s %n tel.number %s %n salary: %s %n age: %s",
                name, position, email, telephoneNumber, salary, age);
        System.out.println();
    }
}
