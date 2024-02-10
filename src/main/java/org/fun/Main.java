package org.fun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String phone = "Iphone 15";
        String phone2 = "Samsung Galaxy s24";
        String phone3 = "Xiaomi Redmi K60";


        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Choose one of the following");
            System.out.println(phone + "," + phone2 + "," + phone3 + " or exit to exit program.");
            String phoneName = input.nextLine();

            if (phoneName.equalsIgnoreCase("exit")) {
                keepRunning = false;
            } else {
                phoneInfo.displayPhoneInfo(phoneName);
            }
        }
        System.out.println("Program closed");
        input.close();
    }
}