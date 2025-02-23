//program to find the second largest digit in the given number
public class Q_3 {
    public static void main(String[] args) {
        int n = 9527482;
        int f = 0, s = 0;
        while (n != 0) {
            int d = n % 10;
            if (d > f) {
                s = f;
                f = d;
            } else if (d > s) {
                s = d;
            }
        }
        System.out.println(s + "is the second largest number");
    }
}