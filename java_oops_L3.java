public class java_oops_L3 {
    public static void main(String[] args) {
        // Animal oye = new Animal();
        // Animal oye2 = new Animal("Rishu");

        // oye.name = "Kinga";
        // oye.legs = 4;

        // oye2.name = "Kaa";
        // oye2.legs = 0;

        // System.out.println(oye.name + " " + oye.legs);
        // oye.walk();
        // // parenthesis means function
        // oye.walk(10);
        
       
        Person p1 = new Person("Shukla ji", 21);
        // System.out.println(Person.count);
        // System.out.println(p1.name + " " +  p1.age);
        System.out.println(Person.count);
        System.out.println(p1.age);
    }

}

 // making a class

//  class Animal{
//     int legs;
//     String name;

//     void walk(){
//         System.out.println(name + " is walking");
//     }

//     void walk(int stepNo){
//         System.out.println(name + " walked " + stepNo + " steps");
//     }

//     // default constructor
//     public Animal(){
//         System.out.println("Calling the constructor");
//     }

//     public Animal(String newName){
//         System.out.println("Calling the constructor with parameters");
//     }
// }


// Can't have two public classes in a java file
 class Person{
    String name;
    int age;

    static int count;
    

    Person(){
       // this("boo", 12);
        // going to the other constructor from 'this'
        count++;
        System.out.println("Person constructor has been called");
    }

    Person(String name, int age){
        // this();      
        // going to default constructor to access its objects and variables like count here,
        //  we also print out some thing if it is mentioned inside the constructor
        this.name = name;
        this.age = age;
        // here we're saving our new names and age from constructor into the object a1
        walking(this);


    }

    void walking(Person obj){
        System.out.println(name + " is walking to the park");
        age += 10;
    }

}

