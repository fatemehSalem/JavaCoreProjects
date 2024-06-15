public class RunGenerics {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(11);
        Box<String> box2 = new Box<>("hello");
        System.out.println(box.getItem().getClass().getName());
        System.out.println(box2.getItem().getClass().getName());
    }
}
