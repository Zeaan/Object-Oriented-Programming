/*
Tip: First refer to the Class "Person", then look at the code executed in main class
     You will find comments which will help you navigate
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        //Constructors helps us to construct new objects.
        //Creating an object named "p1" & "p2" of class "Person".
        //These objects are stored in memory.
        //When we used "Person()", we called a default constructor of Java to create objects "p1" & "p2".
        //However, for learning purpose, we are creating a constructor in "Person" Class.
        Person p1 = new Person();
        Person p2 = new Person();

        //Properties of p1 & p2
        p1.age = 18;
        p1.name = "Zeaan";

        p2.age = 30;
        p2.name = "ABC";

        //Creating another objects but with different constructor
        Person p3 = new Person(15,"DEF");
        Person p4 = new Person(23,"XYZ");

        System.out.println(p1.age+" "+p1.name);
        System.out.println(p2.age+" "+p2.name);
        System.out.println(p3.age+" "+p3.name);
        System.out.println(p4.age+" "+p4.name);

        //Take an analogy of a house. For building a house, you would need a blue print (Classes).
        //However, you can't live in blue-print, so you have to create actual houses (Objects).

        p1.walk();
        p2.eat();
        //This means that Person 1 is walking while Person 2 is eating.

        //Polymorphism.
        //Many forms of a method.
        p1.codes(5);
        p1.codes(5.0);
        p1.codes();

        //See how static works.
        //Because we used static, the output will be 2 because there are 2 objects (p1 and p2) in the Class.
        //Note that it's Person.population (It's property of Class) instead of p1 or p2
        System.out.println(Person.population);

        //Creating a developer object
        Developer d1 = new Developer(22,"JKM");
        d1.walk();

        //Encapsulation
        //Calling a method from different package.
        //package.Class object = new package.Class();
        encapsulation.Encapsulation obj = new encapsulation.Encapsulation();
        obj.doWork();
    }
}

//This is a class named Person. This is like a blue print. With this class, we can make multiple people.
//This class won't store any memory.
class Person{
    //Static means that now "count" is a property of Class, not an object.
    //This means we can access count without making an object.
    //If we want to make variables that are independent of objects, then we use static
    static int population;
    //We created a constructor here
    public Person(){
        //Every time constructor is called, these statements are executed.
        System.out.println("New object was formed");
        population++;
    }
    //We can create constructor in a different way also
    public Person(int person_age, String person_name){
        age = person_age;
        name = person_name;
        //Here, even though there are 4 objects, the population would be 2.
        //This is because population isn't incremented in this constructor.
    }
    public Person(int age){
        //this() will call the first constructor, and will execute all the statements in it.
        //So population will be incremented even though that code isn't in this constructor.
        this();
        //There is another use of this keyword
        //this.age means the age of this class (ie Person), is assigned to the age of main class
        this.age = age;
        this.name = name;
        //If I would have created Person(int age, String name), the the code would be
        //this.age = age
        //this.name = name
    }
    //We are creating properties. Age and name are properties of the person.
    String name;
    int age;
    //We created methods. A person can walk, talk, eat, and perform various tasks.
    void walk(){
        System.out.println(name+" is walking");
    }
    void eat(){
        System.out.println(name+" is eating");
    }

    //Polymorphism. This is a greek word, Poly: Many, Morphism: Forms.
    //Observe that name of the methods are same (ie, Codes), but the arguments is different.
    //Because the argument is different, the method also becomes different.
    void codes(int hours){
        //This method takes number of hours as an argument as Integer.
        System.out.println(name+" is coding for "+hours+" ");
    }
    void codes(double hours){
        //This method takes number of hours as an argument as Double.
        System.out.println(name+" is coding for "+hours+" ");
    }
    void codes(){
        //This method does not take any argument.
        System.out.println(name+" is coding");
    }
}

//Inheritance
//Just like children inherit characteristics from parents, classes can also inherit characteristics.
//Assume Person is the parent class, and Developer is the child class.
//extends is a keyword. The properties of Person will be given to Developer.
class Developer extends Person{
    public Developer(int age, String name){
        //super keyword is used to call it's parent class' constructor.
        //So if we create a Developer object, a person object would also be created, because developer is also a person.
        super(age,name);
    }
}