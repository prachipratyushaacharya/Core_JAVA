class parant {
    int a, b;

    parant(int a, int b) {
        this.a = a;
        this.b = b;

    }

}

class child extends parant {
    int c, d;

    child(int a, int b, int c, int d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    void details() {
        System.out.println(super.a + "," + super.b + "," + this.c + "," + this.d);
    }
}

public class Code4 {
    public static void main(String[] args) {
        child obj = new child(10, 20, 30, 40);
        obj.details();
    }
}
