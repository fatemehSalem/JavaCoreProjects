public  abstract class Mammal implements MyAnimal{
    @Override
    public void eat() {
        System.out.println("Mammal is eating.");
    }

    @Override
    public abstract void sleep();
}
