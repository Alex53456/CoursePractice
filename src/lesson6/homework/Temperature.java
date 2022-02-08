package lesson6.homework;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxTemp = 73.5;
        double minTemp = -44.8;
        double temperature = scanner.nextDouble();
        scanner.close();
        if (temperature > minTemp) {
            System.out.println("Porridge is too hot.");
        }  else if (temperature > maxTemp) {
            System.out.println("Porridge is too cold.");
        }  else {
            System.out.println("Porridge is just right.");
        }

    }
}
