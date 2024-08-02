import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RunLambdaFunction {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10 , 2 , 22 , 23 , 15 , 12);
        //************** without using lambda *************//
//        nums.stream().map(new Function<Integer, Object>() {
//            @Override
//            public Object apply(Integer num) {
//                return num * 10;
//            }
//        }).toList().forEach(System.out::println);
        //************** with using lambda *************//
        nums.stream().map(num -> num * 10).toList().forEach(System.out::println);
    }


}
