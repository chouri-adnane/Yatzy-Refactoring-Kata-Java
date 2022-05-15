package yatzy;

import java.util.stream.Collector;

import static java.util.stream.Collectors.reducing;

public class YatzyCollectors {

    public static final Collector<Integer, ?, Integer> intCounting = reducing(0, e -> 1, Integer::sum);

    private YatzyCollectors() {
        throw new UnsupportedOperationException();
    }
}



