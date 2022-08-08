public class Recursion {
    public int getFibonacci(int fibonacciNTerm){
        return getFibonacci(fibonacciNTerm - 1) + getFibonacci( fibonacciNTerm - 2);
    }
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println("welcome back to java");
    }
}
