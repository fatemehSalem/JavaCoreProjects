interface myInt {

    int add(int a, int b);
}
public class RunVariables {

    public static void main(String[] args) {

        // var cannot be used since they
        // require explicit target type
        myInt obj = (a, b) -> (a + b);

        System.out.println(obj.add(2, 3));
    }
}
