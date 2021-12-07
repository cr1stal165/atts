import org.junit.jupiter.api.Test;
import vsu.ru.silnov.Range;
import vsu.ru.silnov.RangeSet;

import static org.junit.jupiter.api.Assertions.*;

public class RangeSetTest {

    @Test
    public void checkElement(){
        RangeSet<Integer> rangeSet = new RangeSet<>();
        rangeSet.add(12);
        rangeSet.add(15);
        rangeSet.add(125);

        assertTrue(rangeSet.contains(12));
    }
}
