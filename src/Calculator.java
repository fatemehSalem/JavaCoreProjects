public class Calculator {
    public int divide(int a, int b) {
        return a / b;
	  }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 0);
        System.out.println(result);

    }

}
