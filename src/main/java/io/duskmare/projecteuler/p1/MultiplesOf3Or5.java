package io.duskmare.projecteuler.p1;

/**
 * Hello world!
 */
public class MultiplesOf3Or5 {
    public static int getMultipleSum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum += ((i % 3 == 0) || (i % 5 == 0)) ? i : 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getMultipleSum(1000));
    }
}
