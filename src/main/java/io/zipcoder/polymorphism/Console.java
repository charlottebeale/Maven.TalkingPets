package io.zipcoder.polymorphism;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {
    private final Scanner input;
    private final PrintStream output;

    public Console(InputStream in, PrintStream out){
        this.input = new Scanner(in);
        this.output = out;
    }

    public static Integer getNumberOfPets(String response) {
        Scanner scan = new Scanner(System.in);
        print(response);
        Integer numberOfPets = Integer.valueOf(scan.nextLine());
        scan.close();
        return numberOfPets;
    }

    private static void print(String response) {
        print(response);
    }


    public static String getType(String response) {
        Scanner scan = new Scanner(System.in);
        print(response);
        String type = scan.nextLine();
        scan.close();
        return type;

    }

    public static String  getNameOfPets(String response) {
        Scanner scan= new Scanner(System.in);
        print(response);
        String name = scan.nextLine();
        scan.close();
        return name;
    }
}
