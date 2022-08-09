public class Recursion {
    public int getFibonacci(int fibonacciNTerm){
        if(fibonacciNTerm < 0){
            return -1;
        }
        if (fibonacciNTerm == 0 || fibonacciNTerm == 1)
        {
            return fibonacciNTerm;
        }
        return getFibonacci(fibonacciNTerm - 1) + getFibonacci( fibonacciNTerm - 2);
    }
    public String decimalToBinary(int decimalValue){
        if (decimalValue == 1) {
            return String.valueOf(1);
        }
         int remainder = decimalValue%2;

        return decimalToBinary(decimalValue/2) + remainder;
    }
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int fibonacciNthTerm = 10;
        System.out.println("The " + fibonacciNthTerm +"th fibonacci number is : " + recursion.getFibonacci(fibonacciNthTerm));
        System.out.println(recursion.decimalToBinary(8));
    }
}
