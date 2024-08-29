public class single {

    public  static single s= new single();
  private single()
  {

  }



public static single getobject()
{
    return s;
}
}

class B
{
    public static void main(String[] args) {

          single s1= single.getobject();
    }
}

