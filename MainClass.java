public class MainClass {
  public static void main(String[] args) {
    // Create a function that prints "Hello, World!"
    Function sayHello = () -> System.out.println("Hello, World!");

    // Pass the function as a parameter to the runFunction() method
    runFunction(sayHello);
  }

  public static void runFunction(Function func) {
    func.apply();
  }
}