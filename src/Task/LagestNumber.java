package Task;

import java.util.Scanner;

public class LagestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple numbers");
        String multipleNumbers = input.nextLine();
        String [] numbers = multipleNumbers.split("\\s");
        int largestNumber = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (String number : numbers){
            int current = Integer.parseInt(number);
            if (current > largestNumber){
                secondLargest = largestNumber;
                largestNumber = current;
            } else if (current > secondLargest && current != largestNumber) {
                secondLargest = current;
            }
        }
        System.out.println("The second largest number is: " + secondLargest);

        }

        }


