public class CheckCompileTime {
    public static void main(String[] args) {
        int result = divide(10, 2);
        System.out.println("Result: " + result);

        // This will cause a runtime error
        result = divide(10, 0);
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
