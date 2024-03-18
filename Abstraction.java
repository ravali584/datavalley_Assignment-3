/*It is the process ofhiding the implementation details of a code and exposing only the necessary information to the user
Through the process of abstraction,
a programmer hides all but the relevant data about an object in order to reduce complexity and increase efficiency.  
We can implement abstraction in two ways.
       1.using interfaces
       2.using adstract classes*/


abstract class Animal { 

    private String Animalname; 
    public Animal(String Animalname) { this.Animalname = Animalname; } 
    public abstract void makeSound(); 
    
    public String setName() { return Animalname; } 
    
    } 
    
    // Abstracted class 
    
    class Dog extends Animal { 
    
    public Dog(String Animalname) { super(Animalname); } 
    public void makeSound() 
    
    { 
        System.out.println(setName() + " barks"); 
    
    }
 }
    // Abstracted class 
    
    class Cat extends Animal { 
    
    public Cat(String Animalname) { super(Animalname); } 
    
public void makeSound() 
    
    { 
      System.out.println(setName() + " meoms"); 
    } 
    
    } 
    
    
    // Driver Class 
    
    public class Abstraction { 

    
    public static void main(String[] args) 
    
    { 
        Animal dog = new Dog("Dog"); 
       Animal cat = new Cat("Cat"); 

    
    dog.makeSound(); 
    
    cat.makeSound(); 
    
    } 
    
    }