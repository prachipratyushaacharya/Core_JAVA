public class PP_13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((i + j == 5 && i <= 4) || (i - j == 3 && i >= 4) || (j - i == 3 && j >= 4)
                        || (i + j == 11 && j >= 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}