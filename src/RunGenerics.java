public class RunGenerics {
    public static void main(String[] args) {
    Box<Integer , Double> box = new Box<>(10 , 20.08);
    System.out.println(box.multiItems());

    }
}
