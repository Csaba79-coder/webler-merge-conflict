package hu.webler.domain;

public class Dog {

    private String name;
    private boolean isMale;
    private int age;
    private String color;

    public Dog() {
    }

    public Dog(String name, boolean isMale, int age, String color) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
