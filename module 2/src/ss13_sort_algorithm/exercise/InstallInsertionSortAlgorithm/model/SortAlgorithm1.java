package ss13_sort_algorithm.exercise.InstallInsertionSortAlgorithm.model;

public class SortAlgorithm1 {

    public static void sortAlgorithm1(int [] array) {
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;

        }
    }

}
