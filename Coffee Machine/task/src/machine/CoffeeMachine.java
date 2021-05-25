package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        menuAction();
        while (!Global.sc.hasNext("exit")) {
            String action = Global.sc.next();
            chooseAction(action);
        }
    }

    private static void menuAction() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
        System.out.print("> ");
    }

    private static void chooseAction(String action) {
        switch (action) {
            case "buy":
                buy();
                menuAction();
                break;
            case "fill":
                fill();
                menuAction();
                break;
            case "take":
                take();
                menuAction();
                break;
            case "remaining":
                showStatus();
                menuAction();
                break;
            case "exit":
                break;
        }

    }

    private static void showStatus() {
        System.out.printf("The coffee machine has:" +
                "\n%d ml of water" +
                "\n%d ml of milk" +
                "\n%d g of coffee beans" +
                "\n%d disposable cups" +
                "\n$%d of money\n", Global.currentWater, Global.currentMilk, Global.currentCoffeeBeans, Global.disposableCups, Global.money);
    }


    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        System.out.print("> ");
        if (!Global.sc.hasNext("back")) {
            int typeOfCoffee = Global.sc.nextInt();
            if (Global.disposableCups > 0) {
                switch (typeOfCoffee) {
                    case 1:
                        // espresso
                        if (checkAvailability(Global.espressoWaterQua, 0, Global.espressoCoffeBeansQua)) {
                            Global.currentWater -= Global.espressoWaterQua;
                            // Global.currentMilk = Global.currentMilk;
                            Global.currentCoffeeBeans -= Global.espressoCoffeBeansQua;
                            Global.disposableCups -= 1;
                            Global.money += Global.espressoPrice;
                        }
                        break;
                    case 2:
                        // latte
                        if (checkAvailability(Global.latteWaterQua, Global.latteMilkQua, Global.latteCoffeBeansQua)) {
                            Global.currentWater -= Global.latteWaterQua;
                            Global.currentMilk -= Global.latteMilkQua;
                            Global.currentCoffeeBeans -= Global.latteCoffeBeansQua;
                            Global.disposableCups -= 1;
                            Global.money += Global.lattePrice;
                        }

                        break;
                    case 3:
                        // cappuccino
                        if (checkAvailability(Global.cappuccinoWaterQua, Global.cappuccinoMilkQua, Global.cappuccinoCoffeBeansQua)) {
                            Global.currentWater -= Global.cappuccinoWaterQua;
                            Global.currentMilk -= Global.cappuccinoMilkQua;
                            Global.currentCoffeeBeans -= Global.cappuccinoCoffeBeansQua;
                            Global.disposableCups -= 1;
                            Global.money += Global.cappuccinoPrice;
                        }

                        break;
                }
            } else {
                System.out.println("Sorry, not enough disposable cups!");
            }

        } else {
            return;
        }
    }

    private static boolean checkAvailability(int water, int milk, int coffeeBeans) {
        boolean enough = true;
        if (water > Global.currentWater) {
            System.out.println("Sorry, not enough water!");
            enough = false;
        }
        if (milk > Global.currentMilk) {
            System.out.println("Sorry, not enough milk!");
            enough = false;
        }
        if (coffeeBeans > Global.currentCoffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!");
            enough = false;
        }
        if (enough) {
            System.out.println("I have enough resources, making you a coffee!");
        }
        return enough;
    }

    private static void fill() {

        System.out.print("Write how many ml of water you want to add:\n> ");
        int mlOfWater = Global.sc.nextInt();
        System.out.print("Write how many ml of milk you want to add:\n> ");
        int mlOfMilk = Global.sc.nextInt();
        System.out.print("Write how many grams of coffee beans you want to add:\n> ");
        int gramsOfCoffeeBeans = Global.sc.nextInt();
        System.out.print("Write how many disposable cups of coffee you want to add:\n> ");
        int disposableCups = Global.sc.nextInt();

        Global.currentWater += mlOfWater;
        Global.currentMilk += mlOfMilk;
        Global.currentCoffeeBeans += gramsOfCoffeeBeans;
        Global.disposableCups += disposableCups;

        System.out.println();
    }

    private static void take() {
        System.out.printf("I gave you $%d\n", Global.money);
        Global.money = 0;

        System.out.println();
    }


}
