package devcat;

public class Cat {

    private int age;
    private String poroda; 
    private String name;

    public Cat(int age, String poroda, String name) {
        this.age = age;
        this.poroda = poroda;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(){
        System.out.println("М'яв");
    }


    @Override
    public String toString() {
        return "devcat.Cat[ім'я: " + name + ", порода: " + poroda + " - " + age + "роки.]";
    }
}
