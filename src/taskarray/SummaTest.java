package taskarray;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SummaTest {

    @Test
    public void getSum() {
        int[] in = {10, 2, 3, 4, 50};
        int expected = 60;
        int result = Summa.getSum(in);
        assertThat(result, is(expected));
    }
}