import com.sun.tools.javac.Main;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static boolean logedIn = false;
    public static String usernameCurrent = "";
    private static ComputerEquipment computerEquipment;
    private static boolean repeat;
    public static List<Object> itemsInCart = new ArrayList<Object>();
    public static List<Object> itemsReturned = new ArrayList<Object>();
    public static int currentTotal = 0;
    public static void main(String[] args) throws ParseException {


        if(logedIn) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome " + usernameCurrent + "! Tech Stack v.1.0.1.\n");
            System.out.println(".___________. _______   ______  __    __          _______.___________.    ___       ______  __  ___ \n" +
                    "|           ||   ____| /      ||  |  |  |        /       |           |   /   \\     /      ||  |/  / \n" +
                    "`---|  |----`|  |__   |  ,----'|  |__|  |       |   (----`---|  |----`  /  ^  \\   |  ,----'|  '  /  \n" +
                    "    |  |     |   __|  |  |     |   __   |        \\   \\       |  |      /  /_\\  \\  |  |     |    <   \n" +
                    "    |  |     |  |____ |  `----.|  |  |  |    .----)   |      |  |     /  _____  \\ |  `----.|  .  \\  \n" +
                    "    |__|     |_______| \\______||__|  |__|    |_______/       |__|    /__/     \\__\\ \\______||__|\\__\\\n");
            System.out.println("Current net gain from sales is: " + currentTotal + " EUR" );
            System.out.println("Main menu");
            System.out.println("1. Adding items.");
            System.out.println("2. Deleting items.");
            System.out.println("3. Buying items.");
            System.out.println("4. Returning items.");
            System.out.println("5. Searching for items.");
            System.out.println("6. Sold items");
            System.out.println("7. Returned items");
            System.out.println("8. Logout");

            List<Object> items = DataManipulation.Reading.readObjects();

            int result = scanner.nextInt();

            if (result < 1 || result > 8) {
                System.out.println("Please enter a correct number corresponding to the menu.");
                System.out.println("Press anything to continue");
                scanner.next();
                main(args);
            } else {
                switch (result) {
                    case 1:
                    // Option for adding the item
                        repeat = Interface.InterfaceImplementation.AddingItem(args);

                        main(args);

                        break;
                    case 2:
                        repeat = Interface.InterfaceImplementation.DeletingItems(args);

                        main(args);

                        break;
                    case 3:
                        System.out.println("Current total net gain is " + currentTotal + " EUR");
                        Object item = Interface.InterfaceImplementation.BuyingItems(args);
                        if(item instanceof Boolean && !(Boolean) item) {
                        main(args);
                        } else {
                            if(item instanceof ComputerEquipment) {
                                itemsInCart.add(item);
                                currentTotal += ((ComputerEquipment) item).getPrice();
                            } else if(item instanceof HouseholdItem) {
                                itemsInCart.add(item);
                                currentTotal += ((HouseholdItem) item).getPrice();
                            } else if(item instanceof KitchenUtensil) {
                                itemsInCart.add(item);
                                currentTotal += ((KitchenUtensil) item).getPrice();
                            } else if(item instanceof MobileEquipment) {
                                itemsInCart.add(item);
                                currentTotal += ((MobileEquipment) item).getPrice();
                            } else if(item instanceof MusicEquipment) {
                                itemsInCart.add(item);
                                currentTotal += ((MusicEquipment) item).getPrice();
                            } else if (item instanceof VideoEquipment) {
                                itemsInCart.add(item);
                                currentTotal += ((VideoEquipment) item).getPrice();
                            } else if (item instanceof VirtualReality) {
                                itemsInCart.add(item);
                                currentTotal += ((VirtualReality) item).getPrice();
                            }
                        }
                        main(args);
                        break;
                    case 4:

                        System.out.println("Please enter the number of the item you want to return.\n");



                        items = itemsInCart;
                        int index = 0;
                        for (Object itemCurrent : items) {
                            System.out.println(String.valueOf(index + 1) + ". " + itemCurrent);
                            index += 1;
                        }
                        int toRemove = -1;
                        if (scanner.hasNextInt()) {
                            toRemove = scanner.nextInt();
                        } else {
                            main(args);
                        }

                        itemsReturned.add(itemsInCart.get(toRemove - 1));
                        List<Object> removed = Interface.InterfaceImplementation.ReturningItems(itemsInCart ,args, toRemove);
                        currentTotal = 0;
                        for (Object remove : removed) {
                            if(remove instanceof ComputerEquipment) {

                                currentTotal += ((ComputerEquipment) remove).getPrice();
                            } else if(remove instanceof HouseholdItem) {

                                currentTotal += ((HouseholdItem) remove).getPrice();
                            } else if(remove instanceof KitchenUtensil) {

                                currentTotal += ((KitchenUtensil) remove).getPrice();
                            } else if(remove instanceof MobileEquipment) {

                                currentTotal += ((MobileEquipment) remove).getPrice();
                            } else if(remove instanceof MusicEquipment) {

                                currentTotal += ((MusicEquipment) remove).getPrice();
                            } else if (remove instanceof VideoEquipment) {

                                currentTotal += ((VideoEquipment) remove).getPrice();
                            } else if (remove instanceof VirtualReality) {

                                currentTotal += ((VirtualReality) remove).getPrice();
                            }
                        }
                        main(args);
                        break;
                    case 5:
                        Interface.InterfaceImplementation.Sort();
                        main(args);
                        break;
                    case 6:

                        int indexSold = 0;
                        for (Object itemCurrent : itemsInCart) {
                            System.out.println(String.valueOf(indexSold + 1) + ". " + itemCurrent);
                            indexSold += 1;
                        }
                        scanner.next();

                        main(args);
                        break;
                        case 7:
                            int indexReturned = 0;
                            for (Object itemCurrent : itemsReturned) {
                                System.out.println(String.valueOf(indexReturned + 1) + ". " + itemCurrent);
                                indexReturned += 1;
                            }
                            scanner.next();
                            main(args);
                            break;
                    case 8:
                        logedIn = false;
                        usernameCurrent = "";
                        main(args);
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
            System.out.println("Don't have an account? Press number 1 for registration, anything else for password.\n");
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

        if(DataManipulation.Reading.checkUser(username, password)) {
            return true;
        }

        return false;
    }

    private static void createUser(String usernameRegistration, String passowrd) {
    }
}
