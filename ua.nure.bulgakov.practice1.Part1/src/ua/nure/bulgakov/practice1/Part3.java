package ua.nure.bulgakov.practice1;

public class Part3 {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i == (args.length - 1)) {
                System.out.println(args[1]);
            } else {
                System.out.print(args[1] + " ");
            }

        }
    }
}
