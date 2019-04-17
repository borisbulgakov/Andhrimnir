package ua.nure.bulgakov.practice1;

public class Part4 {

    public static void main(String[] args) {
        int res = 0;
        if (Integer.valueOf(args[0]) > Integer.valueOf(args[1])) {
            for (int i = 1; i <= Integer.valueOf(args[1]); i++) {
                if ((Integer.valueOf(args[0]) % i == 0) & (Integer.valueOf(args[1]) % i == 0)) {
                    res = i;
                }
            }
        }
        else {
            for (int i = 1; i <= Integer.valueOf(args[0]); i++) {
                if ((Integer.valueOf(args[0]) % i == 0) & (Integer.valueOf(args[1]) % i == 0)) {
                    res = i;
                }
            }
        }
        System.out.println(res);
    }
}
