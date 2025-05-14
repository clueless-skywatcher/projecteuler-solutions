package io.duskmare.projecteuler.p2;

public class EvenFibonacciNumbers {
    public static long getEvenFibonSum(long n) {
        long term1 = 0;
        long term2 = 1;
        long sum = 0;
        while (true) {
            long term3 = term1 + term2;
            if (term3 >= n) {
                break;
            }
            if ((term3 % 2) == 0) {
                sum += term3;
            }
            term1 = term2;
            term2 = term3;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenFibonSum(100));
    }
}
