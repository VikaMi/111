package impl;

import devpeople.People;

public class DriverBus implements Transport, Driver {

    private People people;
    private String category;
    private int speed = 60;

    @Override
    public void setCategory(String c) {
        this.category = c;
        people = new People("Bob", "Nickens", 22, null);
    }

    @Override
    public void go() {
        if (people != null) {
            System.out.println("Go");
        } else {
            System.out.println("Don`t go!");
        }
    }

    @Override
    public int getSpeed() {
        return this.speed;

    }
}
