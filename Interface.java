import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Interface {
    public static class InterfaceImplementation {
        private static ComputerEquipment computerEquipment;

        public static boolean AddingItem(String args[]) throws ParseException {
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
                return false;
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
