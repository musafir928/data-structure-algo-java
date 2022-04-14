public class child extends parent{
    public void a() {
        System.out.println(x);
        System.out.println(getX());
    }

    public static void main(String[] args) {
        child c = new child();
        c.a();
    }
}
