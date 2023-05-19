import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayTest{
    @Test
    public void sortArray(){
        int[] array = {5, 8, 3, 9, 1, 6};
        SortArray.sortArray(array);
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 6, 8, 9}, array);
    }

    @Test
    public void sortArray2(){
        int[] array = {30, 40, 20, 10, 50};
        SortArray.sortArray(array);
        Assertions.assertArrayEquals(new int[]{10, 20, 30, 40, 50}, array);
    }
}
