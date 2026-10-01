package com.Vehcle1;

import java.util.ArrayList;
import java.util.Scanner;

class SalesEmployee {

    String employeeName;
    int employeeId;

    SalesEmployee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }
}

class PerformanceEmployee extends SalesEmployee {

    ArrayList<Double> salesEntries = new ArrayList<>();

    double totalSales;
    double averageSales;
    String performanceGrade;

    PerformanceEmployee(String employeeName, int employeeId) {
        super(employeeName, employeeId);
    }

    void addSales(double sales) {

        if (sales <= 0) {
            System.out.println("Invalid sales amount. Sales must be greater than 0.");
            return;
        }

        salesEntries.add(sales);
        System.out.println("Sales entry added successfully.");
    }

    void recalculatePerformance() {

        if (salesEntries.isEmpty()) {
            System.out.println("No sales entries available to calculate performance.");
            return;
        }

        totalSales = 0;

        for (double sales : salesEntries) {
            totalSales = totalSales + sales;
        }

        averageSales = totalSales / salesEntries.size();

        if (averageSales >= 20000) {
            performanceGrade = "A";
        } 
        else if (averageSales >= 15000) {
            performanceGrade = "B";
        } 
        else if (averageSales >= 10000) {
            performanceGrade = "C";
        } 
        else {
            performanceGrade = "D";
        }

        System.out.println("Performance result generated successfully.");
    }

    void viewSummary() {

        System.out.println("\n--- Performance Summary ---");

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);

        System.out.println("Sales Entries: " + salesEntries);

        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Sales: " + averageSales);
        System.out.println("Performance Grade: " + performanceGrade);
    }
}

public class Example3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        PerformanceEmployee employee =
                new PerformanceEmployee(name, id);

        System.out.println("\nPerformance profile has been created...");

        while (true) {

            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Sales");
            System.out.println("2. Recalculate Result");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Sales Amount: ");
                    double sales = sc.nextDouble();

                    employee.addSales(sales);
                    break;

                case 2:
                    employee.recalculatePerformance();
                    break;

                case 3:
                    employee.viewSummary();
                    break;

                case 4:
                    System.out.println("Thank you! Program exited.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        }
    }
}