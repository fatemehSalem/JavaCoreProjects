import java.util.Arrays;
import java.util.Comparator;

public class GeneralRun {
    public static void main(String[] args) {
        String[] names = {"Alice" , "Sarah" , "Zahra" , "Ali"};
        Arrays.sort(names, Comparator.naturalOrder());
        for(String s:names)
            System.out.println(s);

    }
}
