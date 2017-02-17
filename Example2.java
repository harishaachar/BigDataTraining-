class Example2
{
      private int var;
      public Example2()
      {
             //code for default one
             var = 10;
      }
      public Example2(int num)
      {
             //code for parameterized one
             var = num;
      }
      public int getValue()
      {
              return var;
      }
      public static void main(String args[])
      {
              Example2 obj2 = new Example2();
              System.out.println("var is: "+obj2.getValue());
      }
}