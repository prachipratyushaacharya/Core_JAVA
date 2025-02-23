// Program to average of all digits in the given number
public class Q_2 {
    public static void main(String[] args) {
        int n = 321875;
        float sum = 0, count = 0;
        while (n != 0) {
            float d = n % 10;
            sum += d;
            count++;
            n = n / 10;
        }

        float avg = sum / count;
        System.out.println("Average of numbers is: " + avg);
    }
}