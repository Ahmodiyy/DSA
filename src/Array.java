import java.util.Arrays;
import java.util.Random;

public class Array {
    int[] singleDimensionalArray;
    int[] twoDimensionalArray;

    public Array(int[] singleDimensionalArray) {
        this.singleDimensionalArray = singleDimensionalArray;
    }

    public void insertIntoSingleDimensionalArray(){
        for (int index = 0; index<singleDimensionalArray.length; index++){
            singleDimensionalArray[index] = new Random().nextInt();
            System.out.println(Arrays.toString(singleDimensionalArray));
        }
    }

    public void deleteElementInSingleDimensionalArray(int indexOfElementToDelete){
        try {
            singleDimensionalArray[indexOfElementToDelete] = 0;
            System.out.println(Arrays.toString(singleDimensionalArray));
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public void traverseSingleDimensionalArray(){
        for (int i : singleDimensionalArray) {
            System.out.println(i);
        }
    }

    public void searchElementInAnArray(int elementToSearchFor){
        for (int i : singleDimensionalArray) {
            if (i == elementToSearchFor) System.out.println("found " + elementToSearchFor);
        }
    }

    public static void main(String[] args) {
        Array array = new Array(new int[5]);
        array.insertIntoSingleDimensionalArray();
        array.deleteElementInSingleDimensionalArray(4);
        array.traverseSingleDimensionalArray();
        array.searchElementInAnArray(0);
    }
}
