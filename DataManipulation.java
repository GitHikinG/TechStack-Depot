import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataManipulation {
    private static String userFileName = "Auth.txt";
    private static String itemsFileName = "Store.txt";
    public static class Writting {
       public static void writeUser (User user) {
           try {
               File myObj = new File(userFileName);
               if (myObj.createNewFile()) {
                   FileWriter myWriter = new FileWriter(userFileName);
                   myWriter.write(user.getName() + ";" + user.getSurname() + ";" + user.getUsername() + ";" + user.getPassword() + ";" + user.getEmail() + "\n");
                   myWriter.close();
                   System.out.println("Successfully wrote to the file.");
               } else {
                   FileWriter myWriter = new FileWriter(userFileName);
                   myWriter.write("Files in Java might be tricky, but it is fun enough!");
                   myWriter.close();
                   System.out.println("Successfully wrote to the file.");
               }
           } catch (IOException e) {
                   System.out.println("An error occurred.");
                   e.printStackTrace();
                   System.exit(0);
           }
       }
    }


    public static class Reading {

    }
}
