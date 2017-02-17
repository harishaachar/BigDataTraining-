import java.io.*;
 
public class CompareTwoFilePaths {
 
  public static void main(String[] args) {
   
    //create first file object
    File file1 = new File("C://FileIO//demo1.txt");
   
    //create second file object
    File file2 =  new File("C://FileIO//demo1.txt");
   
   
    /*
     * To compare file paths use,
     * int compareTo(File file) method of Java File class.
     *
     * This method returns 0 of both paths are same, integer less than 0 if
     * file path is less than that of argument, and positive integer if the
     * file path is grater than that of argument.
     */
   
     if(file1.compareTo(file2) == 0)
     {
       System.out.println("Both paths are same!");
     }
     else
     {
       System.out.println("Paths are not same!");
     }
  }
}

/* compare 2 files */