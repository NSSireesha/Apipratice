import java.awt.image.ImageProducer;
import java.net.Inet4Address;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Swa {

    public static void main(String[] args) {
        String Str1 = "Ram";
        String str2 = "Sita";

        Str1 = Str1 + str2; //helloworld

        str2 = Str1.substring(0, (Str1.length() - str2.length()));//hello


        System.out.println("String2 is" + str2);//hello

        Str1 = Str1.substring(str2.length(), Str1.length());

        System.out.println(Str1);


        String elements[] = {"Amazon", "flipkart", "Amazon"};

        Set<String> store = new HashSet<String>();

        for (String element : elements) {
            if (store.add(element) == false) {
                System.out.println(element);
            }
        }


        String word = "java";
        char[] word1 = word.toCharArray();

        for (Character ch : word1) {
            Map<Character, Integer> map1 = new HashMap<Character, Integer>();


            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);

            }

        }



    }
}

