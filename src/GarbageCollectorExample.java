public class GarbageCollectorExample {
    public static void main(String[] args) {
        GarbageCollectorExample example1 = new GarbageCollectorExample();
        GarbageCollectorExample example2 = new GarbageCollectorExample();

        example1 = null;
        example2 = null;

        System.gc();

    }
}
