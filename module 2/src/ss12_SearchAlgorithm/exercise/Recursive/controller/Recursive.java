package ss12_SearchAlgorithm.exercise.Recursive.controller;

public class Recursive {

    public int Recursive(int[] array, int left, int right, int value) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (array[mid] == value) {
            return mid;
        }

        if (array[mid] < value) {
            return Recursive(array, mid + 1, right, value);
        }

        return Recursive(array, left, mid - 1, value);
    }

}
