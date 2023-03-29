package Sorting;

public class CountingSort {
    //Best case: O(n)
    //But potentially costs more memory
    //Time-memory trade off
    //values must be positive
    //Values should be present in the range
    public void sort(int[] array){
        int maxValue = max(array);
        int[] counts = new int[maxValue];

        for(int i = 0; i < array.length; i++){
            counts[array[i]]++;
        }

        int currentIndex = 0;
        for(int i = 0; i < counts.length; i++){
            currentIndex = addValue(array, i, counts[i], currentIndex);
        }
    }

    private int addValue(int[] array, int value, int iterations, int currentIndex){
        for(int i = 0; i < iterations; i++){
            array[currentIndex++] = value;
        }
        return currentIndex;
    }

    private int max(int[] array){
        int value = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > value){
                value = array[i];
            }
        }
        return value + 1;
    }
}
