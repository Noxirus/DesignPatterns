package Searching;

public class ExponentialSearch {
    //Worst case complexity: O (log i)
    public int search(int[] array, int target){
        int bound = 1;
        while(bound < array.length && array[bound] < target)
            bound *= 2;

        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);

        return new BinarySearch().searchRecursive(array, target, left, right);
    }
}
