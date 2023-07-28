import com.sun.tools.javac.Main;

import java.util.Scanner;

public class UserInterface {

    public static boolean logedIn = false;
    public static String usernameCurrent = "";

    public static void main(String[] args) {


        if(logedIn) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome " + usernameCurrent + "! Tech Stack v.1.0.1.\n");
            System.out.println(".___________. _______   ______  __    __          _______.___________.    ___       ______  __  ___ \n" +
                    "|           ||   ____| /      ||  |  |  |        /       |           |   /   \\     /      ||  |/  / \n" +
                    "`---|  |----`|  |__   |  ,----'|  |__|  |       |   (----`---|  |----`  /  ^  \\   |  ,----'|  '  /  \n" +
                    "    |  |     |   __|  |  |     |   __   |        \\   \\       |  |      /  /_\\  \\  |  |     |    <   \n" +
                    "    |  |     |  |____ |  `----.|  |  |  |    .----)   |      |  |     /  _____  \\ |  `----.|  .  \\  \n" +
                    "    |__|     |_______| \\______||__|  |__|    |_______/       |__|    /__/     \\__\\ \\______||__|\\__\\\n");
            System.out.println("Main menu\n");
            System.out.println("1. Adding items.\n");
            System.out.println("2. Deleting items.\n");
            System.out.println("3. Buying items.\n");
            System.out.println("4. Returning items.\n");
            System.out.println("5. Searching for items.\n");
            System.out.println("6. Logout\n");


            int result = scanner.nextInt();

            if (result < 1 || result > 6) {
                System.out.println("Please enter a correct number corresponding to the menu.");
                System.out.println("Press anything to continue");
                scanner.next();
                main(args);
            } else {
                switch (result) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;

                }
                scanner.next();
                main(args);

            }
        } else {
            System.out.println("To continue you need to log in\n");
            System.out.println("Please enter your username\n");
            Scanner scanner = new Scanner(System.in);
            String username = scanner.nextLine();
            System.out.println("Don't have an account? Press number 1.\n");
            String registerOption = scanner.nextLine();
            if(!registerOption.equals("1")) {
                System.out.println("Thank you, please enter the password\n");
                String password = scanner.nextLine();
                if(CheckUser(username, password)) {
                    logedIn = !logedIn;
                    usernameCurrent = username;
                    main(args);
                } else {
                    System.out.println("Wrong data.");
                    scanner.next();
                    main(args);
                }
            } else {

                System.out.println("Please enter your name\n");
                String nameRegistration = scanner.nextLine();
                System.out.println("Please enter your surname\n");
                String surnameRegistration = scanner.nextLine();
                System.out.println("Please enter your username\n");
                String usernameRegistration = scanner.nextLine();
                System.out.println("Please enter your email\n");
                String emailRegistration = scanner.nextLine();
                System.out.println("Please enter your password\n");
                String passwordRegistration = scanner.nextLine();

                User user = new User(nameRegistration, surnameRegistration, usernameRegistration, passwordRegistration, emailRegistration);

                DataManipulation.Writting.writeUser(user);
                scanner.next();

            }

        }

    }

    private static boolean CheckUser(String username, String password) {

        return true;
    }

    private static void createUser(String usernameRegistration, String passowrd) {
    }
}
