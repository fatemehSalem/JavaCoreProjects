import java.util.Arrays;
import java.util.stream.Collectors;

public class RunLambdaPredicate {
    public static void main(String[] args) {
        //************* without lambda ****************//
        //arrays can indeed be converted to stream using the Arrays.stream method or the Stream.of method.
        // While directly calling stream() on an array like you can on a collection (e.g., List) is not possible,
//        String[] names = {"Apple", "Banana", "Avocado", "Cherry"};
//        //Stream.of(names)
//        Arrays.stream(names).filter(new Predicate<>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("A");
//            }
//        }).collect(Collectors.toList());
        //************* with lambda ****************//

        String[] names = {"Apple", "Banana", "Avocado", "Cherry"};
        Arrays.stream(names).filter(s -> s.startsWith("A")).collect(Collectors.toList());
    }
}
