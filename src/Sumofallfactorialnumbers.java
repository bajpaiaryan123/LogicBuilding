public class Sumofallfactorialnumbers {
    public static void main(String[] args) {
                int suming = 0;

                for (int i = 1; i <= 100; i++) {
                    int factorial = 1;
                    for (int j = 1; j <= i; j++) {
                        factorial=factorial*j;
                    }
                    suming=suming+factorial;
                }

                System.out.println("Sum of factorials from 1 to 5: " + suming);
            }
        }



