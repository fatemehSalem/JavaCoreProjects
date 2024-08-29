public class CallByValueExample {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");  // Create a new Person object
        System.out.println("Before changeName: " + person1.name);  // Output: Alice

        changeName(person1);  // Pass the reference of person1 to the method
        System.out.println("After changeName: " + person1.name);   // Output: Bob

        changeReference(person1);  // Try to change the reference
        System.out.println("After changeReference: " + person1.name);   // Output: Bob
    }

    public static void changeName(Person person) {
        person.name = "Bob";  // Change the state of the object
    }

    public static void changeReference(Person person) {
        person = new Person("Charlie");  // Attempt to change the reference
    }
}