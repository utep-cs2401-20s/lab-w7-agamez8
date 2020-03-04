public class SortOfSort {
    public static void main(String[] args) {
        int[] array1 = {2, 7, 1, 3, 0, 9, 6, 5};
        //sortOfSort(array1);
    }

    public void sortOfSort(int[] array) {
        if (array.length <= -1)
            return;

        //variables
        int temp;
        int highIn = array.length - 1;
        int lowIn = 0;
        int counter = 0;
        int max;

        //iterate through array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    max = array[j];
                }
            }
            if(highIn > lowIn){
                if(counter < 2){
                    temp = array[highIn];
                    array[highIn] = max;

                }
            }
        }
    }
}


