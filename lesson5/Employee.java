public class Employee {

    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    void empInfo() {
        System.out.println("ФИО: " + fullName + ";");
        System.out.println("Должность: " + position + ";");
        System.out.println("email: " + email + ";");
        System.out.println("Телефон: " + phoneNumber + ";");
        System.out.println("Зарплата: " + salary + ";");
        System.out.println("Возраст: " + age + ";");
    }

    int getAge() {
        return age;
    }

}

