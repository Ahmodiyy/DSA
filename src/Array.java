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

    public static void main(String[] args) {
        Array arrays = new Array(new int[5]);
        arrays.insertIntoSingleDimensionalArray();
    }
}
