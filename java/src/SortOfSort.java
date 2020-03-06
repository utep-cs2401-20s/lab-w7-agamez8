public class SortOfSort {
    public static void main(String[] args) {
        int[] array = {7, 7, -1, -7, -8, 0, 4, 3, 3, -6, 5};
        //6 5 1 0 2 3 7 9
        sortOfSort(array);
        print(array);
    }

    public static void print(int array[]){
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sortOfSort(int[] array) {
        //variables
        int highIn = array.length-1; //array.length-1 reads the integers that we need
        int lowIn = 0;
        int swap = 0;
        int value;
        int index;

        //iterate through array
        for (int i = 0; i < array.length-1; i++){
            index = i;
            int max = array[lowIn];  //max value is set to min value

            //this for loop
            for (int j = lowIn; j <= highIn; j++) {
                if (array[j] >= max) {
                    max = array[j];
                    index = j;
                }
            }
            //if statements set numbers to the position we want to set them to
            if(swap < 2){
                value = array[index];
                array[index] = array[highIn];
                array[highIn] = value;
                highIn--;
                swap++;
            }
            else if(swap < 4){
                value = array[index];
                array[index] = array[lowIn];
                array[lowIn] = value;
                lowIn++;
                swap++;
            }

            //resets
            if(swap == 4){
                swap = 0;
            }
        }//everything goes
    }
}


