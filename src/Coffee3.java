import java.util.Scanner;

public class Coffee3 {
    public static void main(String[] args) {
        int water = 1200;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        String buy = "buy";
        String fill = "fill";
        String take = "take";

        printState(water, milk, beans, cups, money);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write action (buy, fill, take): ");
        String action = scanner.nextLine();

        if (buy.equals(action)) {
            System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case (1):
                    water = water - 250;
                    beans = beans - 16;
                    money = money + 4;
                    break;
                case (2):
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    money += 7;
                    break;
                case (3):
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    money += 6;
                    break;
                default:
                    System.out.println("Enter the number from 1 to 3!");
                    break;
            }
            /*if (choice == 1) {
                water = water - 250;
                beans = beans - 16;
                money = money - 4;
            }
            if (choice == 2) {
                water -= 350;
                milk -= 75;
                beans -= 20;
                money -= 7;

            }
            if (choice == 3){
                water -= 200;
                milk -= 100;
                beans -= 12;
                money -= 6;

            }*/
            cups--;
            printState(water, milk, beans, cups, money);

        }
        if (fill.equals(action)) {
            System.out.print("How many ml of water do you want to add: ");
            int waterToAdd = scanner.nextInt();
            System.out.print("How many ml of milk do you want to add: ");
            int milkToAdd = scanner.nextInt();
            System.out.print("How many grams of coffee beans do you want to add: ");
            int beansToAdd = scanner.nextInt();
            System.out.print("How many disposable cups of coffee do you want to add: ");
            int cupsToAdd = scanner.nextInt();
            water = water + waterToAdd;
            milk = milk + milkToAdd;
            beans = beans + beansToAdd;
            cups = cups + cupsToAdd;
            printState(water, milk, beans, cups, money);
        }
        if (take.equals(action)) {
            System.out.println("I gave you $" + money);
            money = 0;
            printState(water, milk, beans, cups, money);
        }

    }

    public static int minValue(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static void printState(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}

