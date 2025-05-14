package io.duskmare.projecteuler.p3;

public class LargestPrimeFactor {
    private static boolean isPrime(long n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long getLargestPrimeFactor(long num) {
        long start = (long) Math.sqrt(num);
        while (start > 0) {
            if (isPrime(start) && num % start == 0) {
                break;
            }
            start--;
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrimeFactor(600851475143L));
    }
}

