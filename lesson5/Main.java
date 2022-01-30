public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Константин Алексеевич","junior-разработчик","ivanovka@google.com","89032354536",30000,25);
        employees[1] = new Employee("Петров Максим Николаевич","middle-разработчик","petrovmn@google.com","89049854986",80000,31);
        employees[2] = new Employee("Сидоров Олег Владимирович","middle-разработчик","ovsidorov@mail.ru","89578390265",80000,28);
        employees[3] = new Employee("Алексеев Михаил Александрович","senior-разработчик","alekseev@mail.ru","89048590289",150000,42);
        employees[4] = new Employee("Михайлов Степан Иванович","teamLead","simihailov@google.com","89513900958",230000,49);

        for (Employee i: employees) {
            if (i.getAge() > 40) {
                i.empInfo();
                System.out.println();
            }
        }

    }

}
