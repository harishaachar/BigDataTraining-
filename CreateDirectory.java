import java.io.*;
 
public class CreateDirectory {
 
  public static void main(String[] args) {
   
    //create file object
    File dir = new File("C://FileIO//DemoDirectory");
   
    /*
     * To create directory in the filesystem use,
     * boolean mkdir() method of Java File class.
     *
     * This method returns true if the directory was created successfully, false
     * otherwise.
     */
   
     boolean isDirectoryCreated = dir.mkdir();
   
     if(isDirectoryCreated)
       System.out.println("Directory created successfully");
     else
       System.out.println("Directory was not created successfully");
  }
}

/* Create Directory */