package machine;

import java.util.Scanner;

public class Global {
    public static final int espressoWaterQua = 250;
    public static final int espressoPrice = 4;
    public static final int espressoCoffeBeansQua = 16;

    public static final int latteWaterQua = 350;
    public static final int latteMilkQua = 75;
    public static final int latteCoffeBeansQua = 20;
    public static final int lattePrice = 7;

    public static final int cappuccinoWaterQua = 200;
    public static final int cappuccinoMilkQua = 100;
    public static final int cappuccinoCoffeBeansQua = 12;
    public static final int cappuccinoPrice = 6;

    public static final Scanner sc = new Scanner(System.in);

    public static int currentWater = 400;
    public static int currentMilk = 540;
    public static int currentCoffeeBeans = 120;
    public static int disposableCups = 9;
    public static int money = 550;
}