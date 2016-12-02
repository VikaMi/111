public class Cat {

    int Age;
    String poroda;
    String Name;


    void say(){
        System.out.println("М'яв");
    }


    @Override
    public String toString() {
        return "Cat[ім'я: " + Name + ", порода: " + poroda + " - " + Age + "роки.]";
    }
}
