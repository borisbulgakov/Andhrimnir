package ua.nure.bulgakov.practice1;

public class Part2 {

    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i < args.length; i++) {
            res = res + Integer.valueOf(args[i]);
        }
        System.out.println(res);
    }
}
