// The entry point of the actual program
public class Main {
  public static void main(String[] args) {
    
    /*
    An Object is used to store data in instance variables. 
    It’s a storage/executor that holds and executes the data the set class determines.
    */

      // Create an object of the HelloWorld class
      HelloWorld helloObject = new HelloWorld("Hello, World!");  // 'helloObject' is an instance of HelloWorld

      // Call the method on the object
      helloObject.printMessage();  // Outputs: Hello, World!

      /*
      Classes are like the definition of a word, 
      while objects are the actual word being defined. 
      So an object(helloObject) is defined by its class(HelloWorld). 
       */
  }
}