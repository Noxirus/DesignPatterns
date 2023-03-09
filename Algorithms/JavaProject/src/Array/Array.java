package Array;

public class Array {
    private int[] array;
    int index = 0;

    public Array(int length) {
        this.array = new int[length];
    }

    public int max(){
        int largest = array[0];
        for(int i = 0; i < index; i++){
            if(largest < array[i]){
                largest = array[i];
            }
        }

        return largest;
    }

    public void reverse(){
        int[] reversedArray = new int[index];
        for(int i = 0; i < index; i++){
            reversedArray[i] = array[(index - 1) - i];
        }
        array = reversedArray;
    }

    public void insertAt(int number, int indexRequest){
        if(outOfBounds(indexRequest)){
            throw new IllegalArgumentException();
        }

        if(index > array.length - 1){
            array = increaseArraySize(array);
        }

        for(int i = index - 1; i >= indexRequest; i--){
            array[i + 1] = array[i];
        }

        array[indexRequest] = number;

        index++;
    }

    public void insert(int number){
        if(index > array.length - 1){
            array = increaseArraySize(array);
        }

        array[index] = number;
        index++;
    }

    public int indexOf(int indexRequest){
        if(outOfBounds(indexRequest)){
            throw new IllegalArgumentException();
        }

        return array[indexRequest];
    }

    public void removeAt(int indexRequest){
        if(outOfBounds(indexRequest)){
            throw new IllegalArgumentException();
        }

        for(int i = indexRequest; i < index - 1; i++){
            array[i] = array[i + 1];
        }
        index--;
    }

    private Boolean outOfBounds(int indexRequest) {
        return indexRequest < 0 || indexRequest >= index;
    }

    public String printArray(){
        StringBuilder printString = new StringBuilder();
        printString.append("[");
        for(int i = 0; i < index; i++){
            printString.append(array[i] + ", ");
        }
        printString.append("]");
        return printString.toString();
    }

    int[] increaseArraySize(int[] currentArray){
        int[] newSizeArray = new int[currentArray.length + 1];
        for(int i = 0; i < currentArray.length; i++){
            newSizeArray[i] = currentArray[i];
        }
        return newSizeArray;
    }
}
