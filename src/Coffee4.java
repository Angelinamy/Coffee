import java.util.Scanner;

public class Coffee4 {
    static int water = 50;
    static int milk = 50;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {

        String buy = "buy";
        String fill = "fill";
        String take = "take";
        String remaining = "remaining";
        String exit = "exit";

        boolean isWorking = true;
        while (isWorking) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();
            if (exit.equals(action)) {
                isWorking = false;
            }
            if (remaining.equals(action)) {
                printState();
            }

            if (buy.equals(action)) {
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case ("1"): {
                        if (water >= 250 && beans >= 16) {
                            water = water - 250;
                            beans = beans - 16;
                            money = money + 4;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        } else {
                            System.out.println("Sorry, I haven't enough resources :(");
                            break;
                        }
                    }
                    case ("2"): {
                        if (water >= 350 && beans >= 20 && milk >= 75) {
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            money += 7;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        } else {
                            System.out.println("Sorry, I haven't enough resources :(");
                            break;
                        }
                    }
                    case ("3"): {
                        if (water >= 200 && beans >= 12 && milk >= 100) {
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            money += 6;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        } else {
                            System.out.println("Sorry, I haven't enough resources :(");
                            break;
                        }
                    }
                    case ("back"): {
                        break;
                    }
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
            }
            if (take.equals(action)) {
                System.out.println("I gave you $" + money);
                money = 0;
            }

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

    public static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}
