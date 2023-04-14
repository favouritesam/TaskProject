package Task;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many number you want to sum");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println("enter any number of choice");
            int number = input.nextInt();
            if (number >= 1 && number <= 30) {
                int division = number % 3;
                if (division == 0) {
                    System.out.println("number is divisible by 3");
                }

            }else {
                System.out.println("number is not divisible by 3");
            }
        }

    }

}





