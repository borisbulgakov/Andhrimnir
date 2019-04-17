package ua.nure.bulgakov.practice1;

public class Part5 {

    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < args[0].length(); i++) {
            x = x + Integer.valueOf(args[0].substring(i, i + 1));
        }
        System.out.println(x);
    }
}
