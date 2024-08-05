public class HashCodeExample {
    public static void main(String[] args) {
        String a = "100";
        String b = "100";
        System.out.println("HashCode of a = " + a + ": " + a.hashCode());
        System.out.println("HashCode of b = " + b + ": " + b.hashCode());

        String c = "500";
        System.out.println("HashCode of c = " + c + ": " + c.hashCode());

    }
}
