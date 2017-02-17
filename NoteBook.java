class NoteBook{
   /*This is my default constructor. A constructor does
    * not have a return type and it's name
    * should exactly same as class name
    */
   NoteBook(){
      System.out.println("Default constructor");
   }
   public void mymethod()
   {
      System.out.println("Void method of the class");
   }
   public static void main(String args[]){
	/* Creating object of class using default constructor
         * (new NoteBook()) so default constructor would be 
         * invoked 
         */
	NoteBook obj = new NoteBook();
	obj.mymethod();
   }
}
/* Default Contruct*/