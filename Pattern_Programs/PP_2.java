public class PP_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || j == 1 || i == 7 || j == 7) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}