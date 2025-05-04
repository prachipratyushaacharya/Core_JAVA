import java.util.Scanner;

class Student {
    private String name;
    private Double fee;
    private String course;

    public void SetName(String name) {
        this.name = name;
    }

    public void SetFee(double fee) {
        this.fee = fee;
    }

    public void SetCourse(String course) {
        this.course = course;
    }

    public String GetName() {
        return this.name;
    }

    public Double GetSallary() {
        return this.fee;
    }

    public String GetGender() {
        return this.course;
    }
}

public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter details");
        String name = sc.nextLine();
        Double fee = sc.nextDouble();
        String course = sc.nextLine();

        Student obj = new Student();

        obj.SetName(name);
        obj.SetCourse(course);
        obj.SetFee(fee);

        System.out.println(
                "Details: " + obj.GetName() + "," + obj.GetSallary() + "," + obj.GetGender());
        sc.close();

    }
}
