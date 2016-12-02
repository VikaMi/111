public class Main {

    static Cat cat = new Cat();
    static People people = new People();


    public static void main(String[] args) {

        cat.Name = "Бакс";
        cat.poroda = "Персицький";
        cat.Age = 3;


        people.name = "Віка";
        people.lastName = "Міщанин";
        people.age = 18;
        people.cat = cat;

        System.out.println(people);
        cat.say();




    }


}


