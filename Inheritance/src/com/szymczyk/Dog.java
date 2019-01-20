package com.szymczyk;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
    }

    private void chew(){
        System.out.println("Dog chew");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat meat");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog walk");
        move(5);
    }

    public void run(){
        System.out.println("Dog run");
        move(10);
    }



}

