package Searching;

import Sorting.QuickSort;

public class BinarySearch {
    //Best case Log n
    //Word case Log n

    public int searchRecursive(int[] array, int target){
        return searchRecursive(array, target, 0, array.length - 1);
    }

    public int searchRecursive(int[] array, int target, int left, int right){
        if(right < left)
            return -1;

        int middle = (left + right) / 2;
        if(array[middle] == target)
            return middle;

        if(target < array[middle])
            return searchRecursive(array, target, left, middle - 1);

        return searchRecursive(array, target, middle + 1, right);
    }

    public int searchIterative(int[] array, int target){
        var left = 0;
        var right = array.length - 1;

        while(left <= right){
            var middle = (left + right) / 2;

            if(array[middle] == target)
                return middle;

            if(target < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }

        return -1;
    }
}
