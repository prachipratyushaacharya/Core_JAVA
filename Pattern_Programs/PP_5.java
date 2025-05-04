public class PP_5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i + j == 8) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}