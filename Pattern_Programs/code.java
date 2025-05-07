
class code {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Loop");
            break;
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
