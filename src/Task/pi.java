package Task;

public class pi {
        public static void main(String[] args) {
            int piDigit = 0;
            double sign = 0;

            System.out.printf("%3s\t%10s%n", "PiDigit", "Sign");
            for (int i = 1; i <= 200000 ; i++) {
                piDigit += i * 2 + 3;

                if (i % 2 == 0){
                    sign = 4.0 - 4.0 / piDigit;
                }else {
                    sign = 4.0 + 4.0 / piDigit;
                }
                System.out.printf("%3d\t%7s%.14f%n", i," ", sign);
            }


        }
    }


