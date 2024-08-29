public class reversestring {

    public static void main(String[] args) {


        String str = "halloween";

        String revstr="";
        for (int i = str.length() - 1; i >= 0; i--)
        {
          revstr=revstr+  str.charAt(i);
        }

        System.out.println(revstr);

        if (revstr.equalsIgnoreCase(str))
        {
            System.out.println("pallindorme");
        }
    }
}
