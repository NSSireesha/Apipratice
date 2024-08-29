import java.util.HashSet;
import java.util.Set;

public class Deup {



        public static void main(String[] args) {


            String arr[]= {"Java", "Java", "C", "Ruby"};

            for(int i=0; i<arr.length;i++)
            {

                for (int j=i+1; j<arr.length;j++)
                {

                    if (arr[i].equals(arr[j]))
                    {
                        System.out.println(arr[i]);
                    }
                }


        }
            String names[]= {"Java", "Java", "C", "Ruby"};
            Set<String> store= new HashSet<String>();
            for (String name:names)
            {
               if ( store.add(name)== false)
               {
                   System.out.println("dupl"+name);
               }
            }
    }

}
