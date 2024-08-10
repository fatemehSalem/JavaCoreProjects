import java.util.Optional;

public class FlatMapExample {
    public static void main(String[] args) {
        Optional<String> s = Optional.of("input");
        System.out.println(s.map(FlatMapExample::getOutput));
        System.out.println(s.flatMap(FlatMapExample::getOutputOpt));
    }

    static String getOutput(String input) {
        return input == null ? null : "output of map" + input;
    }
    static Optional<String> getOutputOpt(String input) {
        return input == null ? Optional.empty() : Optional.of("output of flatMap " + input);
    }
}
