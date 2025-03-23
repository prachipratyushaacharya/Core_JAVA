
class Employee {
    private int id;
    private String name;
    private int sallary;

    public Employee(int id, String name, int sallary) {
        this.id = id;
        this.name = name;
        this.sallary = sallary;
    }

    public String toString() {
        return this.id + "," + this.name + "," + this.sallary;
    }
}

public class Code3 {
    public static void main(String[] args) {
        Employee obj = new Employee(101, "Amar", 35000);
        System.out.println(obj);
    }
}