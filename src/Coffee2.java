import java.util.Scanner;

public class Coffee2 {
    public static void main(String[] args) {
        int neededCoffee;
        int neededWater;
        int neededMilk;
        int neededBeans;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many ml of water the coffee machine has: ");
        int availableWater = scanner.nextInt();

        System.out.print("How many ml of milk the coffee machine has: ");
        int availableMilk = scanner.nextInt();

        System.out.print("How many beans the coffee machine has: ");
        int availableBeans = scanner.nextInt();
        int availableCoffee = calculateCups(availableWater, availableMilk, availableBeans);

        System.out.print("How many cups of coffee you will need: ");
        neededCoffee = scanner.nextInt();
        if (availableCoffee >= neededCoffee) {
            if (availableCoffee > neededCoffee) {
                System.out.println("Yes, I can make that amount of coffee (and even " + (availableCoffee - neededCoffee) + " more than that)");
            }
            else {
                System.out.println("Yes, I can make the coffee");
            }
        } else {
            System.out.println("No, I can make only " + availableCoffee + " cup(s) of coffee");
        }
    }
    public static int calculateCups (int availableWater, int availableMilk, int availableBeans){
        int water = availableWater / 200;
        int milk = availableMilk / 50;
        int beans = availableBeans / 15;
        int[] nums = new int[] {water, milk, beans};
        return minValue(nums);
    }
    public static int minValue (int[] nums){
        int min = nums[0];
        for (int i=0; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}




