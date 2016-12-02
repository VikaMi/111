public class People {

    String name;
    String lastName;
    int age;

    Cat cat;


    @Override
    public String toString() {
        return  "People[Ім'я: " + name + ", Прізвище: " + lastName + ", - " + age + "років; є кіт:" + cat + "]";
    }
}
