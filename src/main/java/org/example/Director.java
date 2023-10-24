package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Director extends Employee {
    /**
     * Класс "Директор"
     * @param surname - фамилия
     * @param name - имя
     * @param middleName - отчество
     * @param position - должность
     * @param phoneNumber - номер телефона
     * @param salary - зарплата
     * @param birth - дата рождения
     */
    public Director(String surname, String name, String middleName,
                    String position, int phoneNumber, double salary, int birth) {
        super(surname, name, middleName, position, phoneNumber, salary, birth);
    }

    /**
     * Статический метод повышения зарплаты. Поднимает заработную плату всем, кроме руководителей.
     *
     * @param emp -массив сотрудников
     */
    public static void increaseWithoutDirector(Employee[] emp) {
        for (Employee employee : emp) {
            if (employee.getPosition() != "Director") {
                employee.increaseSalary(5000);
            }
        }
        System.out.println("\nПосле повышения з/п:");
    }

}
