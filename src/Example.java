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
        person1.sayHobby();

    }
}
