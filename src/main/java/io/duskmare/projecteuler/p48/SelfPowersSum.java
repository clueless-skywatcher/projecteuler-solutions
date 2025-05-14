package io.duskmare.projecteuler.p48;

import java.math.BigInteger;

public class SelfPowersSum {
    public static BigInteger selfPowers(int num, int lastNdigits) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= num; i++) {
            BigInteger integer = BigInteger.valueOf(i);
            sum = sum.add(integer.pow(i));
        }
        return sum.mod(BigInteger.TEN.pow(lastNdigits));
    }

    public static void main(String[] args) {
        System.out.println(selfPowers(1000, 10));
    }
}
