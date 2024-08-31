public class MethodOverLoadingExample {
    public void test(int k){
        System.out.println(k);
    }
    public int test(short k){
        System.out.println(k);
        return k;
    }
}
