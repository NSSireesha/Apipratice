public class prime {

    public static boolean isprime(int num)
    {
        if (num==0|| num==1)
        {
            return false;
        }

        if (num==2)
        {
            return true;
        }

        for (int i=2; i<num/2;i++)
        {
            if (num%2==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(  isprime(7));

    }
}
