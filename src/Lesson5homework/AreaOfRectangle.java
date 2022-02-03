package Lesson5homework;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.println("Enter the length of the first rectangle:");
        float LengthFrist = reader.nextFloat();
        System.out.println("Enter the width of the first rectangle:");
        float WidthFrist=reader.nextFloat();
        float AreaFrist=LengthFrist*WidthFrist;

        System.out.println("Enter the length of the second rectangle:");
        float LengthSecond = reader.nextFloat();
        System.out.println("Enter the width of the second rectangle:");
        float WidthSecond=reader.nextFloat();
        float AreaSecond=LengthSecond*WidthSecond;

        if (AreaFrist > AreaSecond)
            System.out.println("The area of the first rectangle is larger");
        else
            System.out.println("The area of the second rectangle is larger");






    }
}
