package org.example;

public class sclass {
    public static sclass c;
    private sclass()
    {

    }



    public static sclass getobj ()
    {
        c= new sclass();
        return c;
    }
}

class B
{
    public static void main(String[] args) {
        sclass c1= sclass.getobj();

    }
}