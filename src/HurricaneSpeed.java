/*
Pseudocode:
import scanner
declare class
declare method
declare variables for input, speed, category
Prompt user to enter speed
Define conditions for
    Categories 1-5
    outside of category
print category
 */

import java.util.Scanner;

public class HurricaneSpeed {
    public static void main(String[] args) {
        Scanner inputSpeed;
        int speed;
        int category;


        System.out.println("Hurricanes categories are based on wind speeds of 74-157 mph.");
        System.out.println("Enter a number from 74-157.");
        inputSpeed = new Scanner(System.in);
        speed = inputSpeed.nextInt();

        if (speed >= 0 && speed <= 73 ) {
            System.out.println("This is speed is not fast enough to be considered a hurricane.");
            main(new String[] {});
            return;
        } else if (speed >= 74 && speed <= 95) {
            category = 1;
        } else if (speed >= 96 && speed <= 110) {
            category = 2;
        } else if (speed >= 111 && speed <= 129) {
            category = 3;
        } else if (speed >= 130 && speed <= 156) {
            category = 4;
        } else if (speed >= 157) {
            category = 5;
        } else {
            System.out.println("This is not a valid speed.");
            main(new String[] {});
            return;
        }
        System.out.printf("Speeds of %d mph is considered a Category %d hurricane.", speed, category);
    }
}
