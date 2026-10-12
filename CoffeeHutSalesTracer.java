/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coffeehutsalestracer;

/**
 *
 * @author Student
 */
import java.util.Scanner;


interface IBeverage {
    String getBeverageType();
    String getCity();
    int getTotalSales();
}

public class CoffeeHutSalesTracer {

    
    static class SalesEntry implements IBeverage {
        private String beverageType;
        private String city;
        private int salesAmount;

        public SalesEntry(String beverageType, String city, int salesAmount) {
            this.beverageType = beverageType;
            this.city = city;
            this.salesAmount = salesAmount;
        }

        @Override
        public String getBeverageType() {
            return beverageType;
        }

        @Override
        public String getCity() {
            return city;
        }

        @Override
        public int getTotalSales() {
            return salesAmount;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Select Beverage Type
        String beverageType = selectBeverage(scanner);

        //  Enter City
        System.out.print("enter the city: ");
        String city = scanner.nextLine().trim();

        //  Enter Total Sales Amount
        System.out.print("enter the total sales of " + beverageType + " beverages in " + city + " :");
        int salesAmount = 0;
        if (scanner.hasNextInt()) {
            salesAmount = scanner.nextInt();
        }

        // Create the record using the interface blueprint
        IBeverage record = new SalesEntry(beverageType, city, salesAmount);

        //  Print Summary Report
        System.out.println("\nNUMBER I COFFEE HUT REPORT");
        System.out.println("BEVERAGE TYPOE: " + record.getBeverageType());
        System.out.println("CITY: " + record.getCity().toUpperCase());
        System.out.println("TOTAL: " + record.getTotalSales());

        scanner.close();
    }

    
    private static String selectBeverage(Scanner scanner) {
        while (true) {
            System.out.println("select the beverage type");
            System.out.println("1) COFFEE");
            System.out.println("2) TEA");
            System.out.println("3) BOBA");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    return "COFFEE";
                case "2":
                    return "TEA";
                case "3":
                    return "BOBA";
                default:
                    System.out.println("Invalid selection. Please choose 1, 2, or 3.");
                    break;
            }
        }
    }
}
