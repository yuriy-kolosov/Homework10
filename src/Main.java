public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 10");
        System.out.println();
//
        System.out.println("          Задача 10-1");
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println();
//
        System.out.println("          Задача 10-2");
        firstName = "Иван";
        middleName = "Иванович";
        lastName = "Иванов";
        fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Данные Ф.И.О. сотрудника для отчета - " + fullName.toUpperCase());
        System.out.println();
//
        System.out.println("          Задача 10-3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Сотрудник - " + fullName);
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName.replace("ё", "е"));
        System.out.println();
    }
}