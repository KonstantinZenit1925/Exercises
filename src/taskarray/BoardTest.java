package taskarray;
// проверка первый метод возвращает размер массива,
// второй - количество элементов в ряду, номер которого мы передаем в метод.
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void getCountRow() {
        int[][] in = {{1}, {2, 3}, {4, 5, 6}};
        int expected = 3;
        int result = Board.getCountRow(in);
        assertThat(result, is(expected));
    }
    @Test
    public void getCountCellInRow() {
        int[][] in = {{1}, {2, 3}, {4, 5, 6}};
        int expected = 3;
        int result = Board.getCountCellInRow(in, 2);
        assertThat(result, is(expected));
    }
}