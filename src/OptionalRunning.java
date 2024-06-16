import java.util.Optional;

public class OptionalRunning {
    public static void main(String[] args) {

      Optional<String> optional = Optional.empty();

     optional.map(String::toUpperCase)
                      .ifPresent(System.out::println);
    }
}
