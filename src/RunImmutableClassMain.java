import java.util.ArrayList;
import java.util.List;

public class RunImmutableClassMain {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "New York");
        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("Spring");
        Employee emp1 = new Employee("John", address, skills);

        // Trying to mutate the original objects outside Employee should not affect emp1
        address = new Address("456 New Ave", "Boston");
        skills.add("Docker");

        System.out.println(emp1);
    }
}
