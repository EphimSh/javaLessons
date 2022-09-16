package homework5.company.javaLessons;

public class Main {
    public static void main(String[] args) {
        Employee employee0 = new Employee("John","anykeydude", "thisdude@mail.com", 88995544, 80000, 30);
        Employee employee1 = new Employee("Bob","developer", "420@mail.com", 889315544, 120000, 32);
        Employee employee2 = new Employee("Ruslan","devOps", "dushnila@mail.com", 812325544, 500000, 41);
        Employee employee3 = new Employee("Albert","lawyer", "albertmolbert@mail.com", 81235544, 150000, 42);
        Employee employee4 = new Employee("Sam","qa", "e@mail.com", 889912544, 100000, 30);

        Employee[] employees = {employee0,employee1,employee2,employee3,employee4};

        for (Employee employee : employees) {
            if(employee.age > 40)
            employee.printInformation();
        }


    }
}
