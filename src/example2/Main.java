package example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Math.random() * 100);
        }
        Optional<Double> result = list.stream()
                .map(a -> Math.pow(a, 2))
                .reduce(Double::sum);
        System.out.println(result.orElse(null));
    }
}
