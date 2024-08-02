public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog sound! Huff Huff...");
    }
    public void identify() { //common with SuperClass
        System.out.println("I am a Dog!");
    }

    public void identifyTypesOfDogs() {
        System.out.println("I am a Poodle! ");
    }
}
