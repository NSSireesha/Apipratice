public class secondhigh {

    public static void main(String[] args) {

        int array[] = {11, 9, 8, 7};


        int max= array[0];
        int secondmax= array[0];

        for (int i=0; i<array.length;i++)
        {
            if(array[i]>max)
            {
                secondmax=max;
                max= array[i];
            }

            if ( array[i] <max && array[i]> secondmax)
            {
                secondmax= array[i];
            }
        }

        System.out.println(secondmax);
    }
}



