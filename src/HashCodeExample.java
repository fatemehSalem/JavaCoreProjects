public class HashCodeExample {
    public static void main(String[] args) {
        String a = "100";
        String b = "100";

        int i = 90;
        int j = 90;

        System.out.println("HashCode of a = " + a + ": " + a.hashCode());
        System.out.println("HashCode of b = " + b + ": " + b.hashCode());

        System.out.println("HashCode of i = " + i + ": " + Integer.hashCode(i));
        System.out.println("HashCode of j = " + j + ": " + Integer.hashCode(j));

        String c = "500";
        System.out.println("HashCode of c = " + c + ": " + c.hashCode());

    }
}
