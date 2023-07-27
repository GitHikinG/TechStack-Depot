import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Galaxy", MobileEquipment.Type.PHONE, 599.99, MobileEquipment.Color.BLUE, 20.1, true);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the version of the program 1.0. Current items for sale are:");
        System.out.println(phone1.toString());
        scanner.next();

    }
}
