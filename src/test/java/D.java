public class D {

  public static  D d= new D();
    private D()
    {

    }

    public static D getobject()
    {
        return d;
    }
}

class E {
    public static void main(String[] args) {

       D d1= D.getobject();

    }
}