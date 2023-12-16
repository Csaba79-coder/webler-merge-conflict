package hu.webler;

import hu.webler.domain.Dog;

public class Main {

    public static void main(String[] args) {

        System.out.println("Yes, it is me, Webler!");

        Dog dog = new Dog("Bodri", true, 3, "brown");
        System.out.println(dog);
    }
}
