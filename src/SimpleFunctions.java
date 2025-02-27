public class SimpleFunctions {
    public static void main(String[] args) {
        // You can test your functions here.
        greet();
        sum(3,9);
        even(4);
        max(new int[]{3,7,2,9});
    }

    // You can create your functions here.
    //greet() method should simply output "Hello World!".
    static void greet() {
        System.out.println("Hello World");
    }
    // sum(x, y) method should receive two double values and return their sum.
    static double sum(double x, double y) {
        return x+y;
    }
    // even(x) method should receive one integer value and return true if it's even or false if it's odd.
    static Boolean even(int x) {
        return (x % 2 == 0);
    }
   // max( []x ) method should receive an integer array and return the largest value.
   static int max(int[] x) {
        int largestVal = x[0];
        for (int i = 0; i < x.length; i++){
            if (x[i] > largestVal) {
                largestVal = x[i];
            }
        }
        return largestVal;
   }
}