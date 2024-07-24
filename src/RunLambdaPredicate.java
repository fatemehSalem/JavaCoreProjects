import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RunLambdaPredicate {
    public static void main(String[] args) {
        //************* without lambda ****************8//
        //arrays can indeed be converted to stream using the Arrays.stream method or the Stream.of method.
        // While directly calling stream() on an array like you can on a collection (e.g., List) is not possible,
        String[] names = {"Apple", "Banana", "Avocado", "Cherry"};
        //Stream.of(names)
        Arrays.stream(names).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        }).collect(Collectors.toList());
    }
}
