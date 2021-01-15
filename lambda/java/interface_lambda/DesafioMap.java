
import java.util.*;
import java.util.function.Function;

public class DesafioMap {
    
    public static void main(String[] args) {
        List<Integer> list =  Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);   

        Function<Integer, String> stringbybin = num -> Integer.toBinaryString(num);
        Function<String, String>  reverse = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binbystr = str -> Integer.parseInt(str, 2);

        list.stream().map(stringbybin.andThen(reverse).andThen(binbystr)).forEach(System.out::println);
    
    }
    
}
