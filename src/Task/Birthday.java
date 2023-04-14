package Task;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Guess my age from 1 - 30");
        int guess = input.nextInt();

        while (true){
            if (guess == 19){
                System.out.println("guess correct");
            }else {
                System.out.println("guess not correct");
            }break;
        }



    }
}
