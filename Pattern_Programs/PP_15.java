public class PP_15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                // for (int k = 3; k <= 6; k++) {
                // for (int l = 1; l <= 4; l++) {
                // int sq = k + l;
                // if (sq % 2 == 0) {
                // System.err.print("*");
                // } else {
                // System.err.println(" ");
                // }
                if ((i - j == 2 && i <= 6) || (i == 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }

        //
        // for (int k = 3; k <= 6; k++) {
        // for (int l = 7; i >= 4; l--) {
        // int sq = k + l;
        // if (sq % 2 == 0) {
        // System.err.print("*");
        // }
        // }
        // }
    }
    // }
    // }
}