import java.util.Scanner;

class Employee {
    private int num;
    private String name;
    private Double sallary;
    private char gender;

    public void SetName(String name) {
        this.name = name;
    }

    public void SetNum(int num) {
        this.num = num;
    }

    public void SetSallary(double sallary) {
        this.sallary = sallary;
    }

    public void SetGender(char gender) {
        this.gender = gender;
    }

    public String GetName() {
        return this.name;
    }

    public int GetNum() {
        return this.num;
    }

    public Double GetSallary() {
        return this.sallary;
    }

    public char GetGender() {
        return this.gender;
    }
}

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter details");
        int num = sc.nextInt();
        String name = sc.nextLine();
        Double sallary = sc.nextDouble();
        char gender = sc.next().charAt(0);

        Employee obj = new Employee();

        obj.SetName(name);
        obj.SetGender(gender);
        obj.SetNum(num);
        obj.SetSallary(sallary);

        System.out.println(
                "Details: " + obj.GetName() + "," + obj.GetNum() + "," + obj.GetSallary() + "," + obj.GetGender());
        sc.close();

    }
}