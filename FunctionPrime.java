public class Prime {
    static void Primer(int a) {
        if (a % 2 != 0) {
            System.out.println(a + " is a Prime number!");
        } else {
            System.out.println(a + " is not a Prime number!");
        }
    }
    public static void main(String[] args) {
        int n = 13;
        Primer(n);
    }
}
