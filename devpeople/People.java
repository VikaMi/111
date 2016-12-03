package devpeople;

import devcat.Cat;

public class People {

    private String name;
    private String lastName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    Cat cat;


    @Override
    public String toString() {
        return  "devpeople.devpeople[Ім'я: " + name + ", Прізвище: " + lastName + ", - " + age + "років; є кіт:" + cat + "]";
    }
}
