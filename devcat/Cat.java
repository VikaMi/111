package devcat;

public class Cat {

    private int Age;
    private String poroda;
    private String Name;

    public int getAge() {
        return Age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void say(){
        System.out.println("М'яв");
    }


    @Override
    public String toString() {
        return "devcat.Cat[ім'я: " + Name + ", порода: " + poroda + " - " + Age + "роки.]";
    }
}
