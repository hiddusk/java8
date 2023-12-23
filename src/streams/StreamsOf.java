package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOf {
    public static void main(String[] args) {
        List<Integer> result = Stream.of(1,2,3,4,5).collect(Collectors.toList());
        System.out.println(result);
    }
}
