// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scan.nextInt();
        
        int[] sales = new int[numSalespeople];
        int sum = 0;
        int maxSale = Integer.MIN_VALUE;
        int minSale = Integer.MAX_VALUE;
        int maxSaleId = -1;
        int minSaleId = -1;
        
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            sum += sales[i];
            
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSaleId = i;
            }
            
            if (sales[i] < minSale) {
                minSale = sales[i];
                minSaleId = i;
            }
        }
        
        double average = (double) sum / numSalespeople;

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + " " + sales[i]);
        }

        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sale: " + average);
        System.out.println("Salesperson " + (maxSaleId + 1) + " had the highest sale with $" + maxSale);
        System.out.println("Salesperson " + (minSaleId + 1) + " had the lowest sale with $" + minSale);

        System.out.print("\nEnter a value to find salespeople who exceeded that amount: ");
        int threshold = scan.nextInt();
        int countExceeding = 0;

        System.out.println("Salespeople who exceeded " + threshold + ":");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > threshold) {
                System.out.println(" Salesperson " + (i + 1) + " with sales of $" + sales[i]);
                countExceeding++;
            }
        }

        System.out.println("Total number of salespeople who exceeded " + threshold + ": " + countExceeding);
    }
}

