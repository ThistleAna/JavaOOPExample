public class Example extends Example2 { // this is a class, extends = inherits Example2 methods and variables
    // class = blueprint to create object
    // Imagine we have person object, he has name

    String name; // this object has attribute name

    public void sayName() { // object has method, this method will produce what inside the quote
        System.out.println ("My name is uniques!");
    }

    //polymorphism = same methods name, different parameters, it is also called OVERLOADING
    public void sayName (String name){ // same name with above methods, with String name parameter
        System.out.println ("My name is " + name);
    }

    //main methods
    public static void main(String[] args) {
        Example person1 = new Example(); // creating object person1
        person1.sayName();
        person1.sayName("Abdi");
        person1.sayHobby();

        Example person2 = new Example(); //creating object person2
        person2.sayName();
        person2.sayName("Zakariya");
        person2.sayHobby();

        Example person3 = new Example(); // creating object person3
        person3.sayName();
        person3.sayName("Ohana");
        person3.sayHobby();

    }
}
