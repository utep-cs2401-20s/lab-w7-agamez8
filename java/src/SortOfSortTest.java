import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortOfSortTest {

    @Test
    public void sortOfSortTest1(){
        //testing the functionality of the method
        int[] array = {2, 7, 1, 3, 0, 9, 6, 5};
        int[] expected = {6, 5, 1, 0, 2, 3, 7, 9};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sortOfSortTest2(){
        //testing the functionality of the method if some numbers are negative
        int[] array = {-3, -6, 3, 2, 0, -1, 4, 8};
        int[] expected = {3, 2, -3, -6, -1, 0, 4, 8};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sortOfSortTest3(){
        //testing the functionality of the method if there appears to be duplicates
        int[] array = {3, 3, 5, 5, 0, 1, 4, 9};
        int[] expected = {5, 4, 1, 0, 3, 3, 5, 9};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sortOfSortTest4(){
        //testing the functionality of the method if the array only has 1 int
        int[] array = {7};
        int[] expected = {7};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sortOfSortTest5(){
        //testing the functionality of the method if the array has negatives, duplicates & is long
        int[] array = {7, 7, -1, -7, -8, 0, 4, 3, 3, -6, 5};
        int[] expected = {5, 4, 0, -1, -8, -7, -6, 3, 3, 7, 7};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(array);
        assertArrayEquals(expected, array);
    }

}