public class fibonacci {

    public static void fib(int num)
    {
        int a=0;
        int b=1;
        int c=1;
for (int i=0; i<num; i++) {
    System.out.println(a);

    a = b;
    b = c;
    c = a + b;
    // System.out.println(c);
}
    }

    public static void main(String[] args) {


        fib(5);
    }
}
