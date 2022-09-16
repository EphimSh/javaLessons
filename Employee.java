package homework5.company.javaLessons;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int telephoneNumber;
    private int salary;
    private int age;

    private int accessTotal;
    public Employee(String name, String position, String email, int telephoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
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
        this.accessTotal++;
        return salary;
    }

    public void setSalary(int salary) {
        if(salary < 1000000){
            this.salary = salary;
        }

    }

    public int getAge() {
        this.accessTotal++;
        return age;
    }

    public void setAge(int age) {
        if(age < 100){
            this.age = age;
        }

    }
    public void printInformation() {
        System.out.printf("Employee information: %n name: %s %n position: %s %n email: %s %n tel.number %s %n salary: %s %n age: %s",
                name, position, email, telephoneNumber, salary, age);
        System.out.println();
    }
}
