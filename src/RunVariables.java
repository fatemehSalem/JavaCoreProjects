
public class RunVariables {

    public static void main(String[] args) {
        int x = 10;  // Stored in stack
        RunVariables example = new RunVariables();  // Reference stored in stack, object stored in heap
        example.display();
    }

    public void display() {
        int y = 20;  // Stored in stack
        String message = "Hello, Stack and Heap!";  // Reference stored in stack, object stored in heap
        System.out.println(message);  // Reference to the String object
    }
}
