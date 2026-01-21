package session07;

class Animal {
    String name;
    int age;

    public void makeSound() {
        System.out.println("Animal is making a sound...");
    }
}

class Cat extends Animal {
    String breed;

    public void bark() {
        System.out.println(name + " is barking...");
    }
}

class Dog extends Animal {
    String color;

    public void meow() {
        System.out.println(name + " is meowing...");
    }
}

public class bai_3 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.name = "Mimi";
        myCat.age = 2;
        myCat.breed = "Persian";

        myCat.makeSound();
        myCat.bark();

        Dog myDog = new Dog();
        myDog.name = "Lulu";
        myDog.age = 3;
        myDog.color = "Black";

        myDog.makeSound();
        myDog.meow();
    }
}