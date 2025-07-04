import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDigitsinList {

    public static void main(String[] args){

        List<Long> lists = Arrays.asList(2L,3L,4L,5L,6L);
        Map<Long,Long> count = lists.stream()
                .collect(Collectors.groupingBy(list->list,Collectors.counting()));

        count.forEach((key, value) -> System.out.println("Value: " + key + ", Count: " + value));
    }
}
