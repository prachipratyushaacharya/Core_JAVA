//Program to check the number contains zero or not

//method 1
class Q_1 {
    public static void main(String[] args) {
        int n = 321875, count = 0;
        while (n != 0) {
            int d = n % 10;
            if (d == 0) {
                System.out.println("Zero Found");
                count = 1;
                break;
            }
            n = n / 10;
        }

        if (count == 0) {
            System.out.println("Zero Not found");
        }
    }

}

// method 2

// class Q_1 {
// public static void main(String[] args) {
// int n = 321875;
// boolean found = false;
// while (n != 0) {
// int d = n % 10;
// if (d == 0) {
// found = true;
// System.out.println("Zero Found");
// }

// n = n / 10;
// }
// if (!found) {
// System.out.println("Zero not found");
// }
// }
// }
