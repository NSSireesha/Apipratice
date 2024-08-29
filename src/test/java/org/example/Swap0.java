package org.example;

public class Swap0 {

    public static void main(String[] args) {
        int arr[] = {0, 9, 0, 3, 0, 4, 4};
int arr2[]= new int[arr.length];

for (int i=0, j=0; i<arr.length; i++)
{
    if (arr[i]!=0)
    {
        arr2[j]= arr[i];
        j++;
    }
}

for (int k:arr2)
{
    System.out.println(k);
}

    }




}
