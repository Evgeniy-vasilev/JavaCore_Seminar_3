package org.example;

public class Methods {
    /**
     * Метод увеличивает з/п сотрудников старше 45 лет на 5000
     */
    public static void increaser(Employee[] emp) {
        for (Employee employee : emp) {
            if (employee.getAge() > 45) {
                employee.increaseSalary(5000);
            }
        }
        System.out.println("\nПосле повышения з/п:");
    }

    /**
     * Тот же метод, но возраст и размер повышения параметры метода.
     * @param emp -массив с сотрудниками
     * @param age - возраст
     * @param amount - размер увеличения з/п
     */
    public static void increaser2(Employee[] emp, int age, int amount){
        for (Employee employee : emp) {
            if(age > 45 && employee.getAge() == age){
                employee.salary += amount;
            }
        }
        System.out.println("\nПосле повышения з/п:");
    }

    /**
     * Метод (принимающие на вход массив сотрудников),
     * вычисляющий средний возраст сотрудников
     * @param emp  - массив сотрудников
     */
    public static void averageAge (Employee[] emp){
        double averAge = 0;
        for (Employee employee : emp) {
            averAge += employee.getAge();
        }
        System.out.println("Aver. age = " + (averAge / emp.length));
    }

    public static void averageSalary (Employee[] emp) {
        double averSal = 0;
        for (Employee employee : emp) {
            averSal += employee.salary;
        }
        System.out.println("Aver. salary = " + (averSal / emp.length));
    }
}
