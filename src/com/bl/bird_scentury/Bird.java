package com.bl.bird_scentury;

public abstract class Bird {
    String id;
    String colour;
    String name;
    int age;

    abstract void eat ();

    abstract void fly ();

    abstract void swim();
}
