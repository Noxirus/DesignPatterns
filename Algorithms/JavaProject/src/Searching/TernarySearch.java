package Searching;

public class TernarySearch {
    //Worst case: log base 3 N
    // More comparisons for each step
    // Meaning its a larger worst case scenario than log base 2 N
    public int search(int[] array, int target){
       return search(array, target, 0, array.length - 1);
    }

    private int search(int[] array, int target, int left, int right){
        if(left > right)
            return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if(array[mid1] == target)
            return mid1;

        if(array[mid2] == target)
            return mid2;

        if(target < array[mid1])
            return search(array, target, left, mid1 - 1);
        if(target > array[mid2])
            return search(array, target, mid2 + 1, right);

        return search(array, target, mid1 + 1, mid2 - 1);
    }
}
