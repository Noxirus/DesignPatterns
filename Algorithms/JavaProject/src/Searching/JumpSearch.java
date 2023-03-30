package Searching;

public class JumpSearch {
    //Time complexity: O square root of N
    public int search(int[] array, int target){
        int blockSize = (int)Math.sqrt(array.length);

        var start = 0;
        var next = blockSize;
        while (start < array.length && array[next - 1] < target){
            start = next;
            next += blockSize;
            if(next > array.length)
                next = array.length;

        }
        return searchSection(array, target, start, next);
    }

    private int searchSection(int[] array, int target, int start, int end){
        for(int i = start; i < end; i++){
            if(array[i] == target)
                return i;
        }

        return -1;
    }
}
