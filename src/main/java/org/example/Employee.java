package org.example;

import lombok.*;
import java.time.LocalDate;


/**
 * Класс "Сотрудник" с аннотациями
 */

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    private static final int CURRENT_YEAR = 2023;
    String surname;
    String name;
    String middleName;
    String position;
    int phoneNumber;
    double salary;
    int birth;

    public int getAge() {
        return CURRENT_YEAR - birth;
    }

    /**
     * Метод, выводящий всю доступную информацию об объекте
     */
    public void info() {
        System.out.println("Employee: surname - " + surname +
                ", name - " + name +
                ", middleName - " + middleName +
                ", position - " + position +
                ", phoneNumber - " + phoneNumber +
                ", salary - " + salary +
                ", age - " + getAge());
    }

    /**
     * Увеличение з/п на 5000
     *
     * @param amount - сумма, на которую увеличивается з/п
     */
    public void increaseSalary(int amount) {
        this.salary += amount;
    }

    /**
     * Прототип компаратора - метод внутри класса сотрудника, сравнивающий
     * две даты, представленные в виде трёх чисел гггг-мм-дд, без использования
     * условного оператора.
     *
     * @param date1 - первая дата
     * @param date2 - вторая дата
     */
    public static void dateEquals(LocalDate date1, LocalDate date2) {
        if (date1.equals(date2)) System.out.println("dates are equals");
        else if (date1.isAfter(date2)) {
            System.out.println(date1 + " comes after " + date2);
        } else if (date1.isBefore(date2)) {
            System.out.println(date1 + " comes before " + date2);
        }
    }
}
