package ua.nure.bulgakov.practice1;

import java.util.Arrays;

public class Part6 {
    
    private static boolean isPrime(int i, int[] res, int lastPrime) {
        int root = (int) Math.sqrt(i);
        for (int j = 0; j < lastPrime; ++j) {
            if (i % res[j] == 0) {
                return false;
            }
            if (res[j] > root) {
                return true;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        final int[] res = new int[Integer.valueOf(args[0])];
        int lastPrime = 2;
        for (int i = 0; i < res.length; ++i) {
            res[i] = lastPrime++;
            while (!isPrime(lastPrime, res, i)) {
                lastPrime++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
