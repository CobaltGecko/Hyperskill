package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static Machine machine = new Machine(550, 400, 540, 120, 9);
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        boolean active = true;
        while (active) {
            String input;
            String coffeeInputString;
            int water;
            int milk;
            int beans;
            int cups;

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            input = scan.nextLine();

            switch (input) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    coffeeInputString = scan.nextLine();
                    if (!(coffeeInputString.equals("back"))) {
                        int coffeeInput = Integer.parseInt(coffeeInputString);
                        machine.buy(coffeeInput);
                    }
                        break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water = Integer.parseInt(scan.nextLine());
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk = Integer.parseInt(scan.nextLine());
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans = Integer.parseInt(scan.nextLine());
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups = Integer.parseInt(scan.nextLine());

                    machine.fill(water, milk, beans, cups);
                    break;
                case "take":
                    machine.take();
                    break;
                case "remaining":
                    machine.stats();
                    break;
                case "exit":
                    active = false;
                    break;
            }
        }
    }
}

