package ua.nure.bulgakov.practice1;


public class Part7 {

    public static int str2int(String number) {
        int res[] = new int[number.length()];
        int resF = 0;
        for (int i = 0; i < number.length(); i++) {
            res[i] = (number.charAt(i)) - 64;
            if (i > 0) {
                res[i - 1] = (int) (res[i - 1] * Math.pow(26, i));
            }
        }
        for (int i = 0; i < res.length; i++) {
            resF += res[i];
        }
        return resF;
    }

    public static String int2str(int number) {
		int i = number;
		StringBuilder sb = new StringBuilder();
		int x;
		while (i != 0) {
			i--;
			x = i % 26;
			sb.insert(0, (char) ('A' + x));
			i /= 26;
		}
		return sb.toString();
    }

    public static String rightColumn(String number) {
		String res;
		int x = str2int(number);
		x++;
		res = int2str(x);
		return res;   
    }

    public static void main(String[] args) {
        System.out.println(str2int(args[0]));
        System.out.println(int2str(Integer.valueOf(args[1])));
        System.out.println(rightColumn(args[2]));
    }
}