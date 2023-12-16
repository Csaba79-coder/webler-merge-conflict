package hu.webler;

import hu.webler.domain.Dog;

public class Main {

    public static void main(String[] args) {

        System.out.println("Yes, it is me, Webler!");
        Dog dog = Dog.builder()
                .name("Bodri")
                .isMale(true)
                .age(3)
                .color("brown")
                .build();
        System.out.println(dog);
    }
}
