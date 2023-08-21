import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Interface {
    public static class InterfaceImplementation {
        private static ComputerEquipment computerEquipment;
        private static HouseholdItem householdItem;
        private static KitchenUtensil kitchenUtensil;
        private static MusicEquipment musicEquipment;
        private static MobileEquipment mobileEquipment;
        private static VideoEquipment videoEquipment;
        private static VirtualReality virtualReality;

        public static boolean AddingItem(String args[]) throws ParseException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What kind of item do you want to add?\n");


            System.out.println("1. Computer equipment\n");
            System.out.println("2. Household item\n");
            System.out.println("3. Music equipment\n");
            System.out.println("4. Mobile equipment\n");
            System.out.println("5. Video equipment\n");
            System.out.println("6. Virtual reality\n");
            System.out.println("404. Main menu");


            int answer = scanner.nextInt();

            if(answer > 6 || answer < 1) {
                return false;
            } else {
                switch (answer) {
                    case 1:
                        computerEquipment = new ComputerEquipment();
                        System.out.println("Fill out the name of the item\n");
                        scanner.nextLine();
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
                            return false;
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

                            return false;
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
                                System.out.println("If you want to continue press 1, otherwise any other number.\n");
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
                        System.out.print("Please enter the name of the manufacturer\n");
                        scanner.nextLine();
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
                                return false;
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
                            DataManipulation.Writting.writeItem(component);
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
                            DataManipulation.Writting.writeItem(component);

                        }

                        break;
                    case 2:
                        householdItem = new HouseholdItem();
                        System.out.println("Fill out the name of the item\n");
                        scanner.nextLine();
                        householdItem.setName(scanner.nextLine());
                        System.out.println("Choose the color:\n");
                        System.out.println("1. Yellow\n");
                        System.out.println("2. Blue\n");
                        System.out.println("3. Green\n");
                        System.out.println("4. Gray\n");
                        System.out.println("5. Black\n");
                        System.out.println("6. White\n");
                        color = scanner.nextInt();
                        if(color>6||color<1) {
                            return false;
                        } else {
                            if(color == 1) {
                                householdItem.setColor(HouseholdItem.Color.YELLOW);
                            } else if (color == 2) {
                                householdItem.setColor(HouseholdItem.Color.BLUE);
                            } else if( color == 3) {
                                householdItem.setColor(HouseholdItem.Color.GREEN);
                            } else if (color == 4) {
                                householdItem.setColor(HouseholdItem.Color.GRAY);
                            } else if (color == 5) {
                                householdItem.setColor(HouseholdItem.Color.BLACK);
                            } else if (color == 6) {
                                householdItem.setColor(HouseholdItem.Color.WHITE);
                            }
                        }
                        System.out.println("Is the item a washing machine or an individual utensil?\n");
                        System.out.println("1. Washing\n");
                        System.out.println("2. Utensil\n");


                        type = scanner.nextInt();
                        if(type > 2 || type < 1) {

                            return false;
                        }

                        if (type == 1) {
                            householdItem.setType(HouseholdItem.TypeHousehold.WASHING);
                        } else {
                            householdItem.setType(HouseholdItem.TypeHousehold.UTENSIL);
                        }

                        System.out.println("Please enter the price of the item.");
                        price = scanner.nextDouble();

                        householdItem.setPrice(price);

                        System.out.println("What is the eco level?");
                        int eco = scanner.nextInt();

                        householdItem.setEcoLevel(eco);

                        System.out.println("Do you want to enter some special offers?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");

                        offer = scanner.nextInt();


                        offers = new ArrayList<>();
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
                                System.out.println("If you want to continue press 1, otherwise any other number.\n");
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
                        householdItem.setOffers(offers);
                        System.out.print("Please enter the name of the manufacturer\n");
                        scanner.nextLine();
                        manufacturerName = scanner.nextLine();
                        System.out.println("Please enter the country of the manufacturer\n");
                        country = scanner.nextLine();
                        System.out.println("Please enter the legal status of the manufacturer\n");
                        status = scanner.nextLine();
                        manufacturer = new Manufacturer(manufacturerName, country, status);
                        householdItem.setManufacturer(manufacturer);

                        if(householdItem.getType() == HouseholdItem.TypeHousehold.UTENSIL) {
                            KitchenUtensil component = new KitchenUtensil();
                            System.out.print("Enter the weight of the object");
                            component.setWeight(scanner.nextDouble());
                            component.setName(householdItem.getName());
                            component.setColor(householdItem.getColor());
                            component.setPrice(householdItem.getPrice());
                            component.setOffers(householdItem.getOffers());
                            component.setManufacturer(computerEquipment.getManufacturer());
                            component.setType(householdItem.getType());
                            DataManipulation.Writting.writeItem(component);
                        } else {
                            WashingMachine component = new WashingMachine();
                            System.out.print("Enter the weight of the object");
                            component.setRotations(scanner.nextInt());
                            component.setName(householdItem.getName());
                            component.setColor(householdItem.getColor());
                            component.setPrice(householdItem.getPrice());
                            component.setOffers(householdItem.getOffers());
                            component.setManufacturer(householdItem.getManufacturer());
                            component.setType(householdItem.getType());
                            DataManipulation.Writting.writeItem(component);
                        }
                        break;
                    case 3:
                        musicEquipment = new MusicEquipment();
                        System.out.println("Fill out the name of the item\n");
                        scanner.nextLine();
                        musicEquipment.setName(scanner.nextLine());
                        System.out.println("Choose the color:\n");

                        System.out.println("1. Yellow\n");
                        System.out.println("2. Blue\n");
                        System.out.println("3. Green\n");
                        System.out.println("4. Gray\n");
                        System.out.println("5. Black\n");
                        System.out.println("6. White\n");
                        color = scanner.nextInt();
                        if(color>6||color<1) {
                            return false;
                        } else {
                            if(color == 1) {
                                musicEquipment.setColor(MusicEquipment.Color.YELLOW);
                            } else if (color == 2) {
                                musicEquipment.setColor(MusicEquipment.Color.BLUE);
                            } else if( color == 3) {
                                musicEquipment.setColor(MusicEquipment.Color.GREEN);
                            } else if (color == 4) {
                                musicEquipment.setColor(MusicEquipment.Color.GRAY);
                            } else if (color == 5) {
                                musicEquipment.setColor(MusicEquipment.Color.BLACK);
                            } else if (color == 6) {
                                musicEquipment.setColor(MusicEquipment.Color.WHITE);
                            }
                        }
                        System.out.println("Is the item headphone or a microphone?\n");
                        System.out.println("1. Headphone\n");
                        System.out.println("2. Microphone\n");


                        type = scanner.nextInt();
                        if(type > 2 || type < 1) {

                            return false;
                        }

                        if (type == 1) {
                            musicEquipment.setType(MusicEquipment.Type.HEADPHONE);
                        } else {
                            musicEquipment.setType(MusicEquipment.Type.MICROPHONE);
                        }

                        System.out.println("Please enter the price of the item.");
                        price = scanner.nextDouble();

                        musicEquipment.setPrice(price);

                        System.out.print("What is the strength?");

                        String strength = scanner.nextLine();

                        musicEquipment.setStrength(strength);
                        scanner.nextLine();
                        System.out.println("Do you want to enter some special offers?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");

                        offer = scanner.nextInt();


                        offers = new ArrayList<>();
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
                                System.out.println("If you want to continue press 1, otherwise any other number.\n");
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
                        musicEquipment.setOffers(offers);
                        System.out.print("Please enter the name of the manufacturer\n");
                        scanner.nextLine();
                        manufacturerName = scanner.nextLine();
                        System.out.println("Please enter the country of the manufacturer\n");
                        country = scanner.nextLine();
                        System.out.println("Please enter the legal status of the manufacturer\n");
                        status = scanner.nextLine();
                        manufacturer = new Manufacturer(manufacturerName, country, status);
                        musicEquipment.setManufacturer(manufacturer);

                        if(musicEquipment.getType() == MusicEquipment.Type.HEADPHONE) {
                            Headphone component = new Headphone();
                            System.out.print("Is the component wireless?");
                            component.setWireless(scanner.nextBoolean());
                            component.setName(musicEquipment.getName());
                            component.setColor(musicEquipment.getColor());
                            component.setPrice(musicEquipment.getPrice());
                            component.setOffers(musicEquipment.getOffers());
                            component.setManufacturer(musicEquipment.getManufacturer());
                            component.setType(musicEquipment.getType());
                            DataManipulation.Writting.writeItem(component);
                        } else {
                            Microphone component = new Microphone();
                            System.out.print("Enter the weight of the object");
                            component.setOperatingPrinciple(scanner.nextLine());
                            component.setName(musicEquipment.getName());
                            component.setColor(musicEquipment.getColor());
                            component.setPrice(musicEquipment.getPrice());
                            component.setOffers(musicEquipment.getOffers());
                            component.setManufacturer(musicEquipment.getManufacturer());
                            component.setType(musicEquipment.getType());
                            DataManipulation.Writting.writeItem(component);
                        }
                        break;
                    case 4:
                        mobileEquipment = new MobileEquipment();
                        System.out.println("Fill out the name of the item\n");
                        scanner.nextLine();
                        mobileEquipment.setName(scanner.nextLine());
                        System.out.println("Choose the color:\n");
                        System.out.println("1. Yellow\n");
                        System.out.println("2. Blue\n");
                        System.out.println("3. Green\n");
                        System.out.println("4. Gray\n");
                        System.out.println("5. Black\n");
                        System.out.println("6. White\n");
                        color = scanner.nextInt();
                        if(color>6||color<1) {
                            return false;
                        } else {
                            if(color == 1) {
                                mobileEquipment.setColor(MobileEquipment.Color.YELLOW);
                            } else if (color == 2) {
                                mobileEquipment.setColor(MobileEquipment.Color.BLUE);
                            } else if( color == 3) {
                                mobileEquipment.setColor(MobileEquipment.Color.GREEN);
                            } else if (color == 4) {
                                mobileEquipment.setColor(MobileEquipment.Color.GRAY);
                            } else if (color == 5) {
                                mobileEquipment.setColor(MobileEquipment.Color.BLACK);
                            } else if (color == 6) {
                                mobileEquipment.setColor(MobileEquipment.Color.WHITE);
                            }
                        }
                        System.out.println("Is the item phone or a case?\n");
                        System.out.println("1. Phone\n");
                        System.out.println("2. Case\n");


                        type = scanner.nextInt();
                        if(type > 2 || type < 1) {

                            return false;
                        }

                        if (type == 1) {
                            mobileEquipment.setType(MobileEquipment.Type.PHONE);
                        } else {
                            mobileEquipment.setType(MobileEquipment.Type.CASE);
                        }

                        System.out.println("Please enter the price of the item.");
                        price = scanner.nextDouble();

                        mobileEquipment.setPrice(price);

                        System.out.print("What is the size?");
                        double size = scanner.nextDouble();

                        mobileEquipment.setSize(size);

                        System.out.println("Do you want to enter some special offers?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");

                        offer = scanner.nextInt();


                        offers = new ArrayList<>();
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
                                System.out.println("If you want to continue press 1, otherwise any other number.\n");
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
                        mobileEquipment.setOffers(offers);
                        System.out.print("Please enter the name of the manufacturer\n");
                        scanner.nextLine();
                        manufacturerName = scanner.nextLine();
                        System.out.println("Please enter the country of the manufacturer\n");
                        country = scanner.nextLine();
                        System.out.println("Please enter the legal status of the manufacturer\n");
                        status = scanner.nextLine();
                        manufacturer = new Manufacturer(manufacturerName, country, status);
                        mobileEquipment.setManufacturer(manufacturer);

                        if(mobileEquipment.getType() == MobileEquipment.Type.PHONE) {
                            MobilePhone component = new MobilePhone();
                            System.out.print("Does the phone have the fast charging?");
                            component.setFastCharging(scanner.nextBoolean());
                            component.setName(mobileEquipment.getName());
                            component.setColor(mobileEquipment.getColor());
                            component.setPrice(mobileEquipment.getPrice());
                            component.setOffers(mobileEquipment.getOffers());
                            component.setManufacturer(mobileEquipment.getManufacturer());
                            component.setType(mobileEquipment.getType());
                            DataManipulation.Writting.writeItem(component);
                        } else {
                            MobileCase component = new MobileCase();
                            System.out.print("Enter the logo.");
                            component.setLogo(scanner.nextLine());
                            component.setName(mobileEquipment.getName());
                            component.setColor(mobileEquipment.getColor());
                            component.setPrice(mobileEquipment.getPrice());
                            component.setOffers(mobileEquipment.getOffers());
                            component.setManufacturer(mobileEquipment.getManufacturer());
                            component.setType(mobileEquipment.getType());
                            DataManipulation.Writting.writeItem(component);
                        }
                        break;
                    case 5:
                        videoEquipment = new VideoEquipment();
                        System.out.println("Fill out the name of the item\n");
                        scanner.nextLine();
                        mobileEquipment.setName(scanner.nextLine());
                        System.out.println("Choose the color:\n");
                        System.out.println("1. Yellow\n");
                        System.out.println("2. Blue\n");
                        System.out.println("3. Green\n");
                        System.out.println("4. Gray\n");
                        System.out.println("5. Black\n");
                        System.out.println("6. White\n");
                        color = scanner.nextInt();
                        if(color>6||color<1) {
                            return false;
                        } else {
                            if(color == 1) {
                                videoEquipment.setColor(VideoEquipment.Color.YELLOW);
                            } else if (color == 2) {
                                videoEquipment.setColor(VideoEquipment.Color.BLUE);
                            } else if( color == 3) {
                                videoEquipment.setColor(VideoEquipment.Color.GREEN);
                            } else if (color == 4) {
                                videoEquipment.setColor(VideoEquipment.Color.GRAY);
                            } else if (color == 5) {
                                videoEquipment.setColor(VideoEquipment.Color.BLACK);
                            } else if (color == 6) {
                                videoEquipment.setColor(VideoEquipment.Color.WHITE);
                            }
                        }
                        System.out.println("Is the item monitor or a TV?\n");
                        System.out.println("1. Monitor\n");
                        System.out.println("2. TV\n");


                        type = scanner.nextInt();
                        if(type > 2 || type < 1) {

                            return false;
                        }

                        if (type == 1) {
                            videoEquipment.setType(VideoEquipment.Type.MONITOR);
                        } else {
                            videoEquipment.setType(VideoEquipment.Type.TV);
                        }

                        System.out.println("Please enter the price of the item.");
                        price = scanner.nextDouble();

                        videoEquipment.setPrice(price);

                        System.out.print("What is the diameter?");
                        double diameter = scanner.nextDouble();

                        System.out.print("What is the resolution?");
                        String resolution = scanner.nextLine();

                        videoEquipment.setDiameter(diameter);
                        videoEquipment.setResolution(resolution);

                        System.out.println("Do you want to enter some special offers?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");

                        offer = scanner.nextInt();


                        offers = new ArrayList<>();
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
                                System.out.println("If you want to continue press 1, otherwise any other number.\n");
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
                        videoEquipment.setOffers(offers);
                        System.out.print("Please enter the name of the manufacturer\n");

                        scanner.nextLine();
                        manufacturerName = scanner.nextLine();
                        System.out.println("Please enter the country of the manufacturer\n");
                        country = scanner.nextLine();
                        System.out.println("Please enter the legal status of the manufacturer\n");
                        status = scanner.nextLine();
                        manufacturer = new Manufacturer(manufacturerName, country, status);
                        videoEquipment.setManufacturer(manufacturer);

                        if(videoEquipment.getType() == VideoEquipment.Type.MONITOR) {
                            Monitor component = new Monitor();
                            System.out.print("Does the phone have the fast charging?");
                            component.setAndroid(scanner.nextBoolean());
                            component.setName(videoEquipment.getName());
                            component.setColor(videoEquipment.getColor());
                            component.setPrice(videoEquipment.getPrice());
                            component.setOffers(videoEquipment.getOffers());
                            component.setManufacturer(videoEquipment.getManufacturer());
                            component.setType(videoEquipment.getType());
                            DataManipulation.Writting.writeItem(component);
                        } else {
                            Tv component = new Tv();
                            System.out.print("Enter the logo.");
                            component.setTypeTv(scanner.nextLine());
                            component.setName(videoEquipment.getName());
                            component.setColor(videoEquipment.getColor());
                            component.setPrice(videoEquipment.getPrice());
                            component.setOffers(videoEquipment.getOffers());
                            component.setManufacturer(videoEquipment.getManufacturer());
                            component.setType(videoEquipment.getType());
                            DataManipulation.Writting.writeItem(component);
                        }
                        break;
                    case 6:
                        virtualReality = new VirtualReality();
                        System.out.println("Fill out the name of the item\n");
                        scanner.nextLine();
                        virtualReality.setName(scanner.nextLine());
                        System.out.println("Choose the color:\n");
                        System.out.println("1. Yellow\n");
                        System.out.println("2. Blue\n");
                        System.out.println("3. Green\n");
                        System.out.println("4. Gray\n");
                        System.out.println("5. Black\n");
                        System.out.println("6. White\n");
                        color = scanner.nextInt();
                        if(color>6||color<1) {
                            return false;
                        } else {
                            if(color == 1) {
                                virtualReality.setColor(VirtualReality.Color.YELLOW);
                            } else if (color == 2) {
                                virtualReality.setColor(VirtualReality.Color.BLUE);
                            } else if( color == 3) {
                                virtualReality.setColor(VirtualReality.Color.GREEN);
                            } else if (color == 4) {
                                virtualReality.setColor(VirtualReality.Color.GRAY);
                            } else if (color == 5) {
                                virtualReality.setColor(VirtualReality.Color.BLACK);
                            } else if (color == 6) {
                                virtualReality.setColor(VirtualReality.Color.WHITE);
                            }
                        }
                        System.out.println("Is the item VrController or is it wearable?\n");
                        System.out.println("1. VrController\n");
                        System.out.println("2. VrGlasses\n");


                        type = scanner.nextInt();
                        if(type > 2 || type < 1) {

                            return false;
                        }

                        if (type == 1) {
                            virtualReality.setType(VirtualReality.TypeReality.CONTROLLER);
                        } else {
                            virtualReality.setType(VirtualReality.TypeReality.GLASSES);
                        }

                        System.out.println("Please enter the price of the item.");
                        price = scanner.nextDouble();
                        virtualReality.setPrice(price);



                        System.out.print("What is the type of technology?");
                        String technologyType = scanner.nextLine();

                        virtualReality.setTypeOfTechnology(technologyType);
                        virtualReality.setTypeOfTechnology(technologyType);

                        System.out.println("Do you want to enter some special offers?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");

                        offer = scanner.nextInt();


                        offers = new ArrayList<>();
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
                                System.out.println("If you want to continue press 1, otherwise any other number.\n");
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
                        virtualReality.setOffer(offers);
                        System.out.println("Please enter the name of the manufacturer\n");
                        scanner.nextLine();
                        manufacturerName = scanner.nextLine();
                        System.out.println("Please enter the country of the manufacturer\n");
                        country = scanner.nextLine();
                        System.out.println("Please enter the legal status of the manufacturer\n");
                        status = scanner.nextLine();
                        manufacturer = new Manufacturer(manufacturerName, country, status);
                        virtualReality.setManufacturer(manufacturer);

                        if(virtualReality.getType() == VirtualReality.TypeReality.CONTROLLER) {
                            VrController component = new VrController();
                            System.out.print("How many buttons does the controller have?");
                            component.setNumberOfButtons(scanner.nextInt());
                            component.setName(virtualReality.getName());
                            component.setColor(virtualReality.getColor());
                            component.setPrice(virtualReality.getPrice());
                            component.setOffer(virtualReality.getOffer());
                            component.setManufacturer(virtualReality.getManufacturer());
                            component.setType(virtualReality.getType());
                            DataManipulation.Writting.writeItem(component);
                        } else {
                            VrGlasses component = new VrGlasses();
                            System.out.print("What is the techology?\n1.Non immersive\n2.Semi immersive\n3.Fully immersive");
                            if(scanner.nextInt() == 1) {
                                component.setTypeGlasses(VrGlasses.TypeGlasses.NONIMMERSIVE);
                            } else if (scanner.nextInt() == 2) {
                                component.setTypeGlasses(VrGlasses.TypeGlasses.SEMIIMMERSIVE);

                            } else if (scanner.nextInt() == 3) {
                                component.setTypeGlasses(VrGlasses.TypeGlasses.FULLYIMMERSIVE);

                            }
                            component.setName(virtualReality.getName());
                            component.setColor(virtualReality.getColor());
                            component.setPrice(virtualReality.getPrice());
                            component.setOffer(virtualReality.getOffer());
                            component.setManufacturer(virtualReality.getManufacturer());
                            component.setType(virtualReality.getType());
                            DataManipulation.Writting.writeItem(component);
                        }
                        break;

                }
            }
            return true;
        }

        public static boolean DeletingItems(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the number of the item you want to delete.\n");

                List<Object> items = new ArrayList<Object>();

                items = DataManipulation.Reading.readObjects();
                int index = 0;
                for (Object item : items) {
                    System.out.println(String.valueOf(index + 1) + ". " + item);
                    index += 1;
                }


                Integer indexToDelete = scanner.nextInt();
                DataManipulation.Delete.deleteItem(indexToDelete - 1);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public static Object BuyingItems(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the number of the item you want to buy.\n");

                List<Object> items = new ArrayList<Object>();

                items = DataManipulation.Reading.readObjects();
                int index = 0;
                for (Object item : items) {
                    System.out.println(String.valueOf(index + 1) + ". " + item);
                    index += 1;
                }


                Integer indexToBuy = scanner.nextInt() - 1;

                return items.get(indexToBuy);
            } catch (Exception e) {
                return false;
            }
        }

        public static List<Object> ReturningItems(List<Object> cart, String[] args, int indexToRemove) {
            try {

                Integer indexToReturn = indexToRemove - 1;
                Object toRemove = cart.get(indexToReturn);
                cart.remove(toRemove);
                return cart;
            } catch (Exception e) {
                return cart;
            }
        }

        public static void Sort() {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please choose the criteria for sorting");
                System.out.println("1. Price range");
                System.out.println("2. Item type");
                System.out.println("3. Special offer");
                int sortChoice = scanner.nextInt();
                List<Object> itemsRead = DataManipulation.Reading.readObjects();
                if(sortChoice < 1 || sortChoice > 3) {
                    return;
                } else {
                    switch(sortChoice) {
                        case 1:
                            System.out.println("Please enter the starting price point");
                            int priceFrom = scanner.nextInt();
                            System.out.println("Please enter the end price point");
                            int priceTo = scanner.nextInt();
                            System.out.println("Items in that range are:");

                            List<Object> items = new ArrayList<Object>();

                            List<Object> itemsAll = DataManipulation.Reading.readObjects();

                            for (Object item : itemsAll) {
                                if(item instanceof ComputerEquipment) {
                                    ComputerEquipment computerEquipment = (ComputerEquipment) item;
                                    if(computerEquipment.getPrice() >= priceFrom && computerEquipment.getPrice() <= priceTo) {
                                        items.add(computerEquipment);
                                    }
                                } else if(item instanceof HouseholdItem) {
                                    HouseholdItem itemInner = (HouseholdItem) item;
                                    if(itemInner.getPrice() >= priceFrom && itemInner.getPrice() <= priceTo) {
                                        items.add(itemInner);
                                    }
                                } else if(item instanceof KitchenUtensil) {
                                    KitchenUtensil kitchen = (KitchenUtensil) item;
                                    if(kitchen.getPrice() >= priceFrom && kitchen.getPrice() <= priceTo) {
                                        items.add(kitchen);
                                    }
                                } else if(item instanceof MobileEquipment) {
                                    MobileEquipment mobile = (MobileEquipment) item;
                                    if(mobile.getPrice() >= priceFrom && mobile.getPrice() <= priceTo) {
                                        items.add(mobile);
                                    }
                                } else if(item instanceof MusicEquipment) {
                                    MusicEquipment music = (MusicEquipment) item;
                                    if(music.getPrice() >= priceFrom && music.getPrice() <= priceTo) {
                                        items.add(music);
                                    }
                                } else if(item instanceof VirtualReality) {
                                    VirtualReality virtual = (VirtualReality) item;
                                    if(virtual.getPrice() >= priceFrom && virtual.getPrice() <= priceTo) {
                                        items.add(virtual);
                                    }
                                }
                            }
                            for (Object item : items) {
                                System.out.println(item);
                            }
                            scanner.next();

                            break;
                        case 2:
                            System.out.println("Please enter the type");
                            System.out.println("1. Computer equipment");
                            System.out.println("2. Household item");
                            System.out.println("3. Kitchen utensil");
                            System.out.println("4. Mobile equipment");
                            System.out.println("5. Music equipment");
                            System.out.println("6. Video equipment");
                            System.out.println("7. Virtual reality");


                            int type = scanner.nextInt();
                            if (type < 1 || type > 7) {
                                return;
                            }
                            System.out.println("Items are:");

                            List<Object> itemsType = new ArrayList<Object>();



                            switch (type) {
                                case 1:
                                    for (Object item : itemsRead) {
                                        if(item instanceof ComputerEquipment) {
                                            itemsType.add(item);
                                        }
                                    }
                                    break;
                                case 2:
                                    for (Object item : itemsRead) {
                                        if(item instanceof HouseholdItem) {
                                            itemsType.add(item);
                                        }
                                    }
                                    break;
                                case 3:
                                    for (Object item : itemsRead) {
                                        if(item instanceof KitchenUtensil) {
                                            itemsType.add(item);
                                        }
                                    }
                                    break;
                                case 4:
                                    for (Object item : itemsRead) {
                                        if(item instanceof MobileEquipment) {
                                            itemsType.add(item);
                                        }
                                    }
                                    break;
                                case 5:
                                    for (Object item : itemsRead) {
                                        if(item instanceof MusicEquipment) {
                                            itemsType.add(item);
                                        }
                                    }
                                    break;
                                case 6:
                                    for (Object item : itemsRead) {
                                        if(item instanceof VideoEquipment) {
                                            itemsType.add(item);
                                        }
                                    }
                                    break;
                                case 7:
                                    for (Object item : itemsRead) {
                                        if(item instanceof VirtualReality) {
                                            itemsType.add(item);
                                        }
                                    }
                                    break;
                            }
                            for (Object item : itemsType) {
                                System.out.println(item);
                            }
                            scanner.next();
                            break;
                        case 3:
                            List<SpecialOffer> offers = new ArrayList<SpecialOffer>();
                            System.out.println("Please choose the criteria");
                            System.out.println("1. Amount in %");
                            System.out.println("2. Name");
                            int amount = scanner.nextInt();
                            if (amount <1|| amount >2) {
                                return;
                            }
                            if(amount == 1) {
                                System.out.println("Please enter the amount of the discount");
                                int discount = scanner.nextInt();
                                if(discount < 0 || discount > 100) {
                                    return;
                                }
                                for (Object item : itemsRead) {
                                    if(item instanceof ComputerEquipment) {
                                        ComputerEquipment computerEquipment = (ComputerEquipment) item;
                                        if(computerEquipment.getOffers() != null) {
                                            for(SpecialOffer offer : computerEquipment.getOffers()) {
                                                if(offer.getAmount() >= discount) {
                                                    offers.add(offer);
                                                }
                                            }
                                        }
                                    } else if(item instanceof HouseholdItem) {
                                        HouseholdItem itemInner = (HouseholdItem) item;
                                        for(SpecialOffer offer : itemInner.getOffers()) {
                                            if(offer.getAmount() >= discount) {
                                                offers.add(offer);
                                            }
                                        }

                                    } else if(item instanceof KitchenUtensil) {
                                        KitchenUtensil kitchen = (KitchenUtensil) item;
                                        for(SpecialOffer offer : kitchen.getOffers()) {
                                            if(offer.getAmount() >= discount) {
                                                offers.add(offer);
                                            }
                                        }

                                    } else if(item instanceof MobileEquipment) {
                                        MobileEquipment mobile = (MobileEquipment) item;
                                        for(SpecialOffer offer : mobile.getOffers()) {
                                            if(offer.getAmount() >= discount) {
                                                offers.add(offer);
                                            }
                                        }

                                    } else if(item instanceof MusicEquipment) {
                                        MusicEquipment music = (MusicEquipment) item;
                                        for(SpecialOffer offer : music.getOffers()) {
                                            if(offer.getAmount() >= discount) {
                                                offers.add(offer);
                                            }
                                        }

                                    } else if(item instanceof VirtualReality) {
                                        VirtualReality virtual = (VirtualReality) item;
                                        for(SpecialOffer offer : virtual.getOffer()) {
                                            if(offer.getAmount() >= discount) {
                                                offers.add(offer);
                                            }
                                        }

                                    }
                                }
                                for (Object item : offers   ) {
                                    System.out.println(item);
                                }
                                scanner.next();
                            } else {
                                System.out.println("Enter the name of the offer");
                                String name = scanner.next();

                                for (Object item : itemsRead) {
                                    if (item instanceof ComputerEquipment) {
                                        ComputerEquipment computerEquipment = (ComputerEquipment) item;
                                        if (computerEquipment.getOffers() != null) {
                                            for (SpecialOffer offer : computerEquipment.getOffers()) {
                                                if (offer.getName().equals(name)) {
                                                    offers.add(offer);
                                                }
                                            }
                                        }
                                    } else if (item instanceof HouseholdItem) {
                                        HouseholdItem itemInner = (HouseholdItem) item;
                                        for (SpecialOffer offer : itemInner.getOffers()) {
                                            if (offer.getName().equals(name)) {
                                                offers.add(offer);
                                            }
                                        }

                                    } else if (item instanceof KitchenUtensil) {
                                        KitchenUtensil kitchen = (KitchenUtensil) item;
                                        for (SpecialOffer offer : kitchen.getOffers()) {
                                            if (offer.getName().equals(name)) {
                                                offers.add(offer);
                                            }
                                        }

                                    } else if (item instanceof MobileEquipment) {
                                        MobileEquipment mobile = (MobileEquipment) item;
                                        for (SpecialOffer offer : mobile.getOffers()) {
                                            if (offer.getName().equals(name)) {
                                                offers.add(offer);
                                            }
                                        }

                                    } else if (item instanceof MusicEquipment) {
                                        MusicEquipment music = (MusicEquipment) item;
                                        for (SpecialOffer offer : music.getOffers()) {
                                            if (offer.getName().equals(name)) {
                                                offers.add(offer);
                                            }
                                        }

                                    } else if (item instanceof VirtualReality) {
                                        VirtualReality virtual = (VirtualReality) item;
                                        for (SpecialOffer offer : virtual.getOffer()) {
                                            if (offer.getName().equals(name)) {
                                                offers.add(offer);
                                            }
                                        }

                                    }
                                }
                                for (Object item : offers   ) {
                                    System.out.println(item);
                                }
                                scanner.next();
                            }
                            break;
                    }
                }
            } catch (Exception e) {
                return;
            }
        }
    }
}
