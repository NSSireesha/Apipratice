public class reversenum {

    public static void reverse(int num) {

        if (num < 10) {
            System.out.println(num);
        } else {
            System.out.println(num % 10);
            reverse(num / 10);
        }
    }

    public static void main(String args[])
    {
        reverse(123);
    }
}
