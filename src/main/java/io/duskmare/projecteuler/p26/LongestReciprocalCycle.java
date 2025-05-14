package io.duskmare.projecteuler.p26;

import java.util.ArrayList;
import java.util.List;

public class LongestReciprocalCycle {
    public static int cyclesByLongDivision(int d) {
        int num = 10;
        List<Integer> remainders = new ArrayList<>();
        while (true) {
            int remainder = num % d;
            if (remainder == 0) {
                return 0;
            }
            if (remainders.contains(remainder)) {
                break;
            }
            remainders.add(remainder);
            num = remainder;
            while (num < d) {
                num *= 10;
            }
        }

        return remainders.size();
    }

    public static int longestReciprocalCycle(int n) {
        int maxCycles = 0;
        int value = 2;

        for (int i = 2; i < n; i++) {
            int cycles = cyclesByLongDivision(i);
            if (cycles > maxCycles) {
                maxCycles = cycles;
                value = i;
            }
        }
        return value;
    }


    public static void main(String[] args) {
        System.out.println(longestReciprocalCycle(1000));
    }
}
