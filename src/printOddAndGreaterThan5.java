import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printOddAndGreaterThan5 {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers = numbers.stream().filter(s->s>=5 && s%2!=0).collect(Collectors.toList());
        System.out.println(numbers);

    }
}
