import devcat.Cat;
import devcat.Sportsman;
import devpeople.People;
import impl.DriverBus;
import impl.Transport;

import java.lang.*;

public class Main {

    static Cat cat;
    static People people;


    public static void main(String[] args) {

//        cat = new Cat(2, "персицький", "Бакс");
//        people = new People("Віка", "Міщанин", 18, cat);
//        people.getCat().setName("Джордж");
//
//        for (int i = 1; i <= 100; i++) {
//            Number number = new Number();
//            number.setN(i);
//            System.out.print(number + " ");
//        }
//
//        Sportsman sportsman1 = new Sportsman("Vika", "Mishchanyn", 18, null);
//
//        System.out.println(" ");
//        people.sayHello();
//        sportsman1.setTypeSport("Football");
//        sportsman1.sayHello();

        DriverBus t = new DriverBus();
        System.out.println(t.getSpeed());
//        t.setCategory("B");
        t.go();



    }
}


