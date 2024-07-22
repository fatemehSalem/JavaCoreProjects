public class GeneralRun {
    public static void main(String[] args) {
       Animal animal = new Dog(); //Upcasting
       animal.makeSound();
       animal.identify(); //Dynamic Dispatch: subclass method has been invoked
    }
}
