/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package select.a.option;

import java.util.Scanner;

/**
 *
 * @author joao
 */
public class SelectAOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Choose an option:");
        System.out.println("1. Play a game");
        System.out.println("2. Exit");

        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Great choice! Let's play a game.");
                // Add game logic here if desired
                break;
            case 2:
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        // Additional logic, if necessary

        System.out.println("Thank you for using this program!");
    }
}
