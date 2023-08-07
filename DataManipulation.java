import java.io.*;
import java.util.ArrayList;

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
        public static boolean checkUser(String username, String password) {
            ArrayList<User> users = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(userFileName))) {
                String line = br.readLine();
                while (line != null) {
                    String person[] = line.split(";");
                    User user = new User(person[0], person[1], person[2], person[3], person[4]);
                    users.add(user);
                    line = br.readLine();
                }
            } catch (FileNotFoundException e) {
                return false;
            } catch (IOException e) {
                return false;
            }
            for(User user: users) {
                if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return true;
                }
            }

            return false;
        }
    }
}
