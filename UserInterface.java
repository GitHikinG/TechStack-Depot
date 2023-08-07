import com.sun.tools.javac.Main;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {

    public static boolean logedIn = false;
    public static String usernameCurrent = "";
    private static ComputerEquipment computerEquipment;

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
                    // Option for adding the item
                        AddingItem(args);
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

    public static void AddingItem(String args[]) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of item do you want to add?\n");


        System.out.println("1. Computer equipment\n");
        System.out.println("2. Household item\n");
        System.out.println("3. Kitchen utensil\n");
        System.out.println("4. Mobile equipment\n");
        System.out.println("5. Video equipment\n");
        System.out.println("6. Virtual reality\n");

        int answer = scanner.nextInt();

        if(answer > 6 || answer < 1) {
            main(args);
        } else {
            switch (answer) {
                case 1:
                    computerEquipment = new ComputerEquipment();
                    System.out.println("Fill out the name of the item\n");
                    computerEquipment.setName(scanner.nextLine());
                    System.out.println("Choose the color:\n");
                    System.out.println("1. Yellow\n");
                    System.out.println("2. Blue\n");
                    System.out.println("3. Green\n");
                    System.out.println("4. Gray\n");
                    System.out.println("5. Black\n");
                    System.out.println("6. White\n");
                    int color = scanner.nextInt();
                    if(color>6||color<1) {
                        main(args);
                    } else {
                        if(color == 1) {
                            computerEquipment.setColor(ComputerEquipment.Color.YELLOW);
                        } else if (color == 2) {
                            computerEquipment.setColor(ComputerEquipment.Color.BLUE);
                        } else if( color == 3) {
                            computerEquipment.setColor(ComputerEquipment.Color.GREEN);
                        } else if (color == 4) {
                            computerEquipment.setColor(ComputerEquipment.Color.GRAY);
                        } else if (color == 5) {
                            computerEquipment.setColor(ComputerEquipment.Color.BLACK);
                        } else if (color == 6) {
                            computerEquipment.setColor(ComputerEquipment.Color.WHITE);
                        }
                     }
                    System.out.println("Is the item laptop or an individual component?\n");
                    System.out.println("1. Laptop\n");
                    System.out.println("2. Component\n");


                    int type = scanner.nextInt();
                    if(type > 2 || type < 1) {

                        main(args);
                    }

                    if (type == 1) {
                        computerEquipment.setType(ComputerEquipment.TypeEquipment.LAPTOP);
                    } else {
                        computerEquipment.setType(ComputerEquipment.TypeEquipment.COMPONENT);

                    }
                    System.out.println("Please enter the price of the item.");
                    double price = scanner.nextDouble();

                    computerEquipment.setPrice(price);

                    System.out.println("How many years of warranty does the item provide?");
                    int warranty = scanner.nextInt();

                    computerEquipment.setYearsOfWarranty(warranty);

                    System.out.println("Do you want to enter some special offers?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");

                    int offer = scanner.nextInt();


                    ArrayList<SpecialOffer> offers = new ArrayList<>();
                    if(offer == 1) {

                        while(true) {

                            scanner.nextLine();

                            System.out.print("Please enter the start date of the special offer. Format (31/01/1999\n");
                            String start = scanner.nextLine();


                            System.out.println("Please enter the end date of the special offer. Format (31/01/1999\n");
                            String end = scanner.nextLine();

                            System.out.println("Enter the name of the special offer?\n");
                            String name = scanner.nextLine();
                            System.out.println("Please enter the amount of discount in %?\n");
                            Double discount = scanner.nextDouble();
                            Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse(start);
                            Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse(end);
                            SpecialOffer offerCurrent = new SpecialOffer(startDate, endDate, name, discount);
                            offers.add(offerCurrent);
                            System.out.println("If you want to continue press 1, otherwise anything else.\n");
                            int continueAnswer = scanner.nextInt();
                            try {
                                if (continueAnswer == 1) {
                                    continue;
                                } else {
                                    break;
                                }
                            } catch(Exception ee) {
                                break;
                            }

                        }
                    }
                    computerEquipment.setOffers(offers);
                    System.out.println("Please enter the name of the manufacturer\n");
                    String manufacturerName = scanner.nextLine();
                    System.out.println("Please enter the country of the manufacturer\n");
                    String country = scanner.nextLine();
                    System.out.println("Please enter the legal status of the manufacturer\n");
                    String status = scanner.nextLine();
                    Manufacturer manufacturer = new Manufacturer(manufacturerName, country, status);
                    computerEquipment.setManufacturer(manufacturer);

                    if(computerEquipment.getType() == ComputerEquipment.TypeEquipment.COMPONENT) {
                        Component component = new Component();
                        System.out.println("Please enter the type of the component\n");
                        System.out.println("1. SSD\n");
                        System.out.println("2. VIDEOCARD\n");
                        System.out.println("3. RAM\n");
                        System.out.println("4. COOLING\n");

                        int typeResult= scanner.nextInt();

                        if(typeResult > 4 || typeResult < 1) {
                            main(args);
                        } else if (typeResult == 1) {
                            component.setType(Component.Type.SSD);
                        } else if (typeResult == 2) {
                            component.setType(Component.Type.VIDEOCARD);
                        } else if (typeResult == 3) {
                            component.setType(Component.Type.RAM);
                        } else if (typeResult == 4) {
                            component.setType(Component.Type.COOLING);
                        }

                        component.setName(computerEquipment.getName());
                        component.setColor(computerEquipment.getColor());
                        component.setPrice(computerEquipment.getPrice());
                        component.setYearsOfWarranty(computerEquipment.getYearsOfWarranty());
                        component.setOffers(computerEquipment.getOffers());
                        component.setManufacturer(computerEquipment.getManufacturer());
                        component.setType(computerEquipment.getType());

                    } else {
                        Laptop component = new Laptop();
                        System.out.println("Please enter the amount of ram\n");
                        int ram = scanner.nextInt();

                        System.out.println("Please enter the amount of storage\n");
                        int storage = scanner.nextInt();

                        component.setName(computerEquipment.getName());
                        component.setColor(computerEquipment.getColor());
                        component.setPrice(computerEquipment.getPrice());
                        component.setYearsOfWarranty(computerEquipment.getYearsOfWarranty());
                        component.setOffers(computerEquipment.getOffers());
                        component.setManufacturer(computerEquipment.getManufacturer());
                        component.setType(computerEquipment.getType());
                        component.setRam(ram);
                        component.setStorage(storage);
                    }

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
