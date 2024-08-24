
public class RunVariables {

    public static void main(String[] args) {
       System.out.println("========== with new String============");

        String s1= new String("Fatemeh");
        String s2= new String("Fatemeh");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println("========== without new String============");

        String s4= "Fatemeh";
        String s5= "Fatemeh";
        System.out.println(s4.equals(s5));
        System.out.println(s4 == s5);

        System.out.println("========== with new String ADD intern============");
        String aS1 = s1.intern();
        String aS2 = s2.intern();
        System.out.println(aS1.equals(aS2));
        System.out.println(aS1 == aS2);

    }

    public void display() {
        int y = 20;  // Stored in stack
        String message = "Hello, Stack and Heap!";  // Reference stored in stack, object stored in heap
        System.out.println(message);  // Reference to the String object
    }
}
