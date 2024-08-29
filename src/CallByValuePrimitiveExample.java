public class CallByValuePrimitiveExample {
    public static void main(String[] args) {
        int number = 10;  // Original value
        System.out.println("Before changeValue: " + number);  // Output: 10

        changeValue(number);  // Pass the copy of the value to the method
        System.out.println("After changeValue: " + number);   // Output: 10
    }

    public static void changeValue(int num) {
        num = 20;  // Change the value of the copy
        System.out.println("Inside changeValue: " + num);  // Output: 20
    }
}