public class Class3 {

    class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    //  Polymorphism is demonstrated here as Dog inherits from Animal and can use its methods

   static class Shape {
        void draw() {
            System.out.println("Drawing a shape");
        }
    }

   static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a circle");
        }
    }

    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    
    public static void main(String[] args) {
        // Create an instance of Class3 to access the inner classes
        Class3 class3 = new Class3();
        Shape shape1 = new Shape();
        Shape shape2 = new Circle();
        Shape shape3 = new Rectangle();

        Animal animal = class3.new Animal();    
        Dog dog = class3.new Dog();


        shape1.draw(); // Output: Drawing a shape
        shape2.draw(); // Output: Drawing a circle  
        shape3.draw(); // Output: Drawing a rectangle

        // animal.eat();
        // dog.eat(); // Dog can also eat because it inherits from Animal
        // dog.bark();
    }
}