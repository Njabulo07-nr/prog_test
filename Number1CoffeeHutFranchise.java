/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1coffeehutfranchise;

/**
 *
 * @author Student
 */
public class Number1CoffeeHutFranchise {
    public static void main(String[] args) {
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        int[][] sales = {
            {500, 300, 125}, // Cape Town
            {450, 250, 100}, // Port Elizabeth
            {480, 175, 120}  // Pretoria
        };

        System.out.println("------------------------------------------------------------------");
        System.out.println("NUMBER 1 COFFEE HUT ");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Enter the number of COFFEE sales for CAPE TOWN:" + 500);
        System.out.println("Enter the number of TEA sales for CAPE TOWN:" + 300);
        System.out.println("Enter the number of BOBA TEA sales for CAPE TOWN:" + 125);
        System.out.println("Enter the number of COFFEE sales for PORT ELIZABETH:" + 450);
        System.out.println("Enter the number of TEA sales for PORT ELIZABETH:" + 250);
        System.out.println("Enter the number of BOBA TEA sales for PORT ELIZABETH:" + 100);
        System.out.println("Enter the number of COFFEE sales for PRETORIA:" + 480);
        System.out.println("Enter the number of TEA sales for PRETORIA:" + 175);
        System.out.println("Enter the number of BOBA TEA sales for PRETORIA:" + 120);
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("NUMBER 1 COFFEE HUT REPORT");
        System.out.println("------------------------------------------------------------------");
        
        System.out.printf("%-18s %-10s %-10s %-12s\n", "", "Coffee", "Tea", "Boba Tea");
        
        int max = 0;
        int[] totals = new int[3];
        
        for(int i = 0; i < cities.length; i++){
            int total = 0;
            System.out.printf("%-18s", cities[i]);
            
            for(int j = 0; j < 3; j++){
               
                System.out.printf("%-10.2f ", (double)sales[i][j]);
                total += sales[i][j];
            }
            totals[i] = total;
            if(total > max){
                max = total;
            }
            System.out.println();
        }
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("PRODUCT SALES TOTAL FOR EACH CITY");
        System.out.println("------------------------------------------------------------------");
        for(int i = 0; i < cities.length; i++){
            // Used printf with %.2f to print totals with .00 decimals
            System.out.printf("%s\t %.2f\n", cities[i], (double)totals[i]);
        }
        
        System.out.println("------------------------------------------------------------------");
        int overallTotal = totals[0] + totals[1] + totals[2];
        System.out.printf("TOTAL SALES FOR CITIES: %.2f\n", (double)overallTotal);
        System.out.println("------------------------------------------------------------------");
    }
}
