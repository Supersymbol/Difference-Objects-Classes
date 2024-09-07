import java.util.Scanner;

/*
A Class is like a set of codes/instructions in other words a foundation of how an object appears and behaves.
Genetic codes are a set of codes/instructions(foundation) for how an animal(or living organism)
appears and behaves(generally speaking anyway).
*/

/// This is an example of class which I HelloWorld
public class HelloWorld {

  // A field(variable/attribute) to store a greeting message
  String message;
  //int would also be a type of field

  // Building block of the class to initialize the message field
  public HelloWorld(String message) {
      this.message = message;
  }

  // Method to print the greeting message
  public void printMessage() {
      System.out.println(message);
  }
}

