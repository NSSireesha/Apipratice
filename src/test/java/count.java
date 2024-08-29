import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class count {

    public static void main(String[] args) {
        String s= "hello";
        String [] arr1= {"a", "b", "c"};
        String [] arr2= {"a1", "b1", "c1"};

    Stream <String> array1 =Arrays.stream(arr1);
        Stream <String> array2 =Arrays.stream(arr2);

        String finalarray[]=Stream.concat(array1, array2).toArray(size-> new String[size]);

        for (String s1:finalarray){

            System.out.println(s1);
        }
        String s3= "halloween";
   //  long count=s3.chars().filter(e->(char)e=='e').count();

        Map<Character,Integer> map1= new HashMap<Character, Integer>();

        char[] chr= s3.toCharArray();

        for (char ch:chr)
        {
            if (map1.containsKey(ch))
            {
                map1.put(ch, map1.get(ch)+1);
            }
            map1.put(ch,1);
        }
Set<Character> chars= map1.keySet();

        for (Character c1:chars)
        {
            if (map1.get(c1)>1)
            {
                System.out.println(c1 +"is"+ map1.get(c1));
            }
        }
     ;
     //System.out.println(count);

    }

}
