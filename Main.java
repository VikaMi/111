import devcat.Cat;
import devpeople.People;

import java.lang.*;

public class Main {

//    інкапсуляція - механізм мови програмування, який обмежує доступ до складових об'єкта компонентів


    static Cat cat = new Cat();
    static People people = new People();


    public static void main(String[] args) {

        cat.setName("Бакс");
        cat.setPoroda("Персицький");
        cat.setAge(3);


        people.setName("Віка");
        people.setLastName("Міщанин");
        people.setAge(18);
        people.setCat(cat);

        System.out.println(people);
        cat.say();

        for(int i = 1; i <= 100; i++){
            Number number = new Number();
            number.setN(i);
            System.out.println(number);
        }




    }


}


