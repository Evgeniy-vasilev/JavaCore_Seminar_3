package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];

        Employee Petrov = new Employee("Petrov", "Ivan", "Fedorovich",
                "Engineer", 1231254, 60000, 1976);
        employees[0] = Petrov;
        Employee Morozova = new Employee("Morozova", "July", "Aleksandrovna",
                "Project manager", 4563212, 30000, 1986);
        employees[1] = Morozova;
        Employee Sidorov = new Employee("Sidorov", "Petr", "Ivanovich",
                "Manager", 5678212, 40000, 1974);
        employees[2] = Sidorov;
        Employee Ivanov = new Employee("Ivanov", "Sergey", "Petrovich",
                "Developer", 9876212, 60000, 1980);
        employees[3] = Ivanov;
        Employee Vasechkin = new Employee("Vasechkin", "Igor", "Sergeevich",
                "Cleaning", 5635643, 50000, 1982);
        employees[4] = Vasechkin;
        Director Vasiliev = new Director("Vasiliev", "Evgeny", "Virtorovich",
                "Director", 2314231, 550000, 1980);
        employees[5] = Vasiliev;

        /**
         * Вывод в консоль массива сотрудников
         */
        for (Employee employee : employees) {
            employee.info();
        }

        /**
         * Методы повышения з/п и вывод результатов в консоль
         */
        //Methods.increaser(employeesIncrease);
        //Methods.increaser2(employees, 47, 1999);

        for (Employee employee : employees) {
            employee.info();
        }
        System.out.println();

        /**
         * Методы вычисления среднего возраста и средней з/п
         */
        Methods.averageAge(employees);
        Methods.averageSalary(employees);

        Director.increaseWithoutDirector(employees);
        for (Employee employee : employees) {
            employee.info();
        }
        /**
         * Сравнение двух дат
         */
        System.out.println();
        LocalDate date1 = LocalDate.of(2022, 4, 22);
        LocalDate date2 = LocalDate.of(2021, 2, 12);
        Employee.dateEquals(date1, date2);
    }
}