import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        int coffee;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cups of coffee you will need: ");
        coffee = scanner.nextInt();
        System.out.println("For " + coffee + " cups of coffee you will need: ");
        System.out.println(coffee * 200 + " ml of water");
        System.out.println(coffee * 50 + " ml of milk");
        System.out.println(coffee * 15 + " g of beans");



    }
}
