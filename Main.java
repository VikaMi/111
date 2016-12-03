import devcat.Cat;
import devpeople.People;

import java.lang.*;

public class Main {

//    інкапсуляція - механізм мови програмування, який обмежує доступ до складових об'єкта компонентів
//    конструктор без типу даних

    static Cat cat;
    static People people;


    public static void main(String[] args) {

        cat = new Cat(2, "персицький", "Бакс");

        people = new People("Віка", "Міщанин", 18, cat);
        people.getCat().setName("Джордж");

        System.out.println(people);
        cat.say();

        for(int i = 1; i <= 100; i++){
            Number number = new Number();
            number.setN(i);
            System.out.println(number);
        }




    }


}


