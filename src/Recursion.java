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
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int fibonacciNthTerm = 10;
        System.out.println("The " + fibonacciNthTerm +"th fibonacci number is : " + recursion.getFibonacci(fibonacciNthTerm));
    }
}
