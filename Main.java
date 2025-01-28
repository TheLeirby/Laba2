package Laba2;

import java.util.Arrays;
import java.util.List;

import static Laba2.User.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "Лисов",      "Михаил",     24, "Россия"),
                new User(2, "Иванов",     "Алекс",      35, "Белорусия"),
                new User(3, "Радина",     "Лариса",     18, "Казахстан"),
                new User(4, "Быкова",     "Дарья",      29, "Узбекистан"),
                new User(5, "Исмаиловна", "Елена",      17, "Россия"),
                new User(6, "Полушина",   "Ева",        45, "Россия"),
                new User(7, "Пешиходов",  "Джо",        75, "США"),
                new User(8, "Буш",        "Джорж",      88, "США"),
                new User(9, "Де портье",  "Жерар",      25, "Франция")
        );
        sortName(users);
        sortAge(users);
        ageOlder(users);
        avg(users);
        countries(users);
    }
    public static void sortName(List<User> users) {
        System.out.println("Сортировка по фамилии:");
        System.out.println("=========================================================");
        System.out.println("|\tid\t|\t Фамилия \t|\tИмя\t|\tВозраст\t|\tСтрана\t|");
        System.out.println("=========================================================");
        users.stream()
                .sorted((u1, u2) -> u1.getLastName().compareTo(u2.getLastName()))
                .forEach(System.out::println);
        System.out.println("=========================================================");

    }
    public static void sortAge(List<User> users) {
        System.out.println();
        System.out.println("Сортировка по возрасту:");
        System.out.println("=========================================================");
        System.out.println("|\tid\t|\t Фамилия \t|\tИмя\t|\tВозраст\t|\tСтрана\t|");
        System.out.println("=========================================================");
        users.stream()
                .sorted((u1, u2) -> Integer.compare(u1.getAge(), u2.getAge()))
                .forEach(System.out::println);
        System.out.println("=========================================================");
    }
    public static void ageOlder(List<User> users) {
        System.out.println();
        boolean allOlder = olderSeven(users);
        System.out.println("Все старше 7 лет: " + allOlder);
    }
    public static void avg(List<User> users) {
        double average = averageAge(users);
        System.out.println("Средний возраст: " + average);
    }
    public static void countries(List<User> users) {
        long distinctCountriesCount = countDistinctCountries(users);
        System.out.println("Число различных стран: " + distinctCountriesCount);
    }
}
