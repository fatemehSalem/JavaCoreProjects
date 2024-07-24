import java.util.Arrays;
import java.util.Comparator;

public class GeneralRun {
    public static void main(String[] args) {
      String[] names = {"Sarah" , "Ali" , "Alice" , "Fatemeh"};
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}
