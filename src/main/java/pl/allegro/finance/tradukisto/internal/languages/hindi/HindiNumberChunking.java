package pl.allegro.finance.tradukisto.internal.languages.hindi;

import com.google.common.math.IntMath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class HindiNumberChunking {

    private static final Integer INITIAL_CHUNK_SIZE = 3;
    private static final Integer INITIAL_SPLIT_FACTOR = IntMath.pow(10, INITIAL_CHUNK_SIZE);
    private static final Integer CHUNK_SIZE = 2;
    private static final Integer SPLIT_FACTOR = IntMath.pow(10, CHUNK_SIZE);

    public List<Integer> chunk(Integer value) {
        Deque<Integer> result = new ArrayDeque<>();
        int i = 0;
        while (value > 0) {
            if(i ==0) {
                i++;
                result.addFirst(value % INITIAL_SPLIT_FACTOR);
                value /= INITIAL_SPLIT_FACTOR;
            }
            result.addFirst(value % SPLIT_FACTOR);
            value /= SPLIT_FACTOR;
        }

        return new ArrayList<>(result);
    }
}
