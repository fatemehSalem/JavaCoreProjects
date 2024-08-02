import java.util.Optional;

public class Car {
    private final String name;
    private final String model;

    public String getName() {
        return name;
    }

    public Optional<String> getModel() {
        return Optional.ofNullable(model);
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }
}
