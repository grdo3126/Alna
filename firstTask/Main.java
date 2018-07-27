package firstTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hours;
        int minutes;

        Clock clock = new Clock();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter hours (0 - 11):");
            hours = scanner.nextInt();

            System.out.println("Enter minutes (0 - 59):");
            minutes = scanner.nextInt();
        } while (!clock.validation(hours, minutes));

        System.out.println("The angle between minutes' and hours' arrows is: " +
                            clock.countAngleBetweenTwoArrows(hours, minutes));
    }
}
