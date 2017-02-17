class Demo
{
   public int myMethod1(int num1, int num2)
   { 
       System.out.println("First myMethod of class Demo");
       return num1+num2;
   }
   public int myMethod2(int var1, int var2)
   {
       System.out.println("Second myMethod of class Demo");
       return var1-var2;
   }
}
class Sample4
{
   public static void main(String args[])
   {
       Demo obj1= new Demo();
       obj1.myMethod1(10,10);
       obj1.myMethod2(20,12);
   }
}