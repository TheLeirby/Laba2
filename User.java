package Laba2;
import java.util.List;
import java.util.OptionalDouble;
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;

    public User(int id, String firstName, String lastName, int age, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getCountry() {
        return country;
    }
    public static boolean olderSeven(List<User> users) {
        return users.stream()
                .allMatch(user -> user.getAge() > 7);
    }
    public static double averageAge(List<User> users) {
        OptionalDouble averageAge = users.stream()
                .mapToInt(User::getAge)
                .average();
        return averageAge.orElse(0);
    }
    public static long countDistinctCountries(List<User> users) {
        return users.stream()
                .map(User::getCountry)
                .distinct()
                .count();
    }

    @Override
    public String toString() {
        return  "|\t"+id + "\t|\t"+  firstName + "\t|\t" + lastName + "\t|\t" + age + "\t|\t" + country +"\t|";
    }
}
