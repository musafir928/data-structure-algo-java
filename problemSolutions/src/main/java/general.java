class a {
    int b = 1;
}

public class general {
    public static void main(String[] args) {
        a c1 = new a();
        a c2 = c1;
        System.out.println("" + c1.b + c2.b);

        c1.b = 3;
        System.out.println("" + c1.b + c2.b);

    }
}
