import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunLambdaPredicate {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
    }
}
