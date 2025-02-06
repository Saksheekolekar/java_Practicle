package tproject;
 import java.util.*;
public class TrainTickerSystem {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[][] seats = new int[5][10]; // 5 rows and 10 seats per row
        int numSeatsAvailable = 50; // total number of seats available
        boolean quit = false;

        while (!quit) {
            System.out.println("Welcome to the Train Ticket System!");
            System.out.println("1. View Available Seats");
            System.out.println("2. Reserve a Seat");
            System.out.println("3. Cancel a Reservation");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewAvailableSeats(seats);
                    break;
                case 2:
                    reserveSeat(seats, numSeatsAvailable);
                    break;
                case 3:
                    cancelReservation(seats, numSeatsAvailable);
                    break;
                case 4:
                    quit = true;
                    System.out.println("Thank you for using the Train Ticket System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void viewAvailableSeats(int[][] seats)
    {
        System.out.println("Available Seats:");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    System.out.print((j + 1) + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void reserveSeat(int[][] seats, int numSeatsAvailable) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row number (1-5):");
        int row = scanner.nextInt() - 1; // subtract 1 to convert to 0-indexed array
        System.out.println("Enter the seat number (1-10):");
        int seat = scanner.nextInt() - 1; // subtract 1 to convert to 0-indexed array

        if (row < 0 || row >= seats.length || seat < 0 || seat >= seats[row].length) {
            System.out.println("Invalid seat selection.");
        } else if (seats[row][seat] == 1) {
            System.out.println("That seat is already reserved.");
        } else {
            seats[row][seat] = 1;
            numSeatsAvailable--;
            System.out.println("Seat reserved successfully.");
        }
    }

    public static void cancelReservation(int[][] seats, int numSeatsAvailable) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row number (1-5):");
        int row = scanner.nextInt() - 1; // subtract 1 to convert to 0-indexed array
        System.out.println("Enter the seat number (1-10):");
        int seat = scanner.nextInt() - 1; // subtract 1 to convert to 0-indexed array

        if (row < 0 || row >= seats.length || seat < 0 || seat >= seats[row].length) 
        {
            System.out.println("Invalid seat selection.");
        } else if (seats[row][seat] == 0)
        {
            System.out.println("That seat is not currently reserved.");
         } else
         {
            seats[row][seat] = 0;

        numSeatsAvailable++;
        System.out.println("Reservation cancelled successfully.");
          }
   }
}
