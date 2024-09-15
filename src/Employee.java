import java.util.ArrayList;
import java.util.List;

final class Employee {
    private final String name;
    private final Address address;  // Custom object, needs deep copy
    private final List<String> skills;  // List needs deep copy
    // Constructor with all fields
    public Employee(String name, Address address, List<String> skills) {
        this.name = name;
        // Deep copy for Address (custom nested object)
        this.address = address.clone();
        // Deep copy for List (non-custom nested object)
        this.skills = new ArrayList<>(skills);
    }
    // Only getters, no setters
    public String getName() {
        return name;
    }
    public Address getAddress() {
        return address;  // Address is immutable due to deep clone
    }
    public List<String> getSkills() {
        return new ArrayList<>(skills);  // Return deep copy of list
    }
    @Override
    public String toString() {
        return "Employee{name='" + name + "', address=" + address + ", skills=" + skills + '}';
    }
}