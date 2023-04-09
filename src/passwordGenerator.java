import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {
    public StringBuilder generator(int letters,char choice) {
        int j = 0;
        char ch;
        Random rand = new Random();
        StringBuilder password = new StringBuilder();
        if (choice == 'A') {
            for (int i = 1; i <= letters; i++) {
                int random_integer = rand.nextInt(123 - 64) + 64;
                ch = (char) random_integer;
                if (ch <= 90) {
                    password.append(ch);
                } else if (ch >= 97) {
                    password.append(ch);
                }
                j++;
            }
            return password;


        } else if (choice == 'B') {
            for (int i = 1; i <= letters; i++) {
                int random_integer = rand.nextInt(10 - 1) + 1;
                if (random_integer > 5) {
                    int a1 = rand.nextInt(64 - 33) + 33;
                    ch = (char) a1;
                    if (ch > 33) {
                        password.append(ch);
                    }
                } else if (random_integer == 5) {
                    int a2 = rand.nextInt(96 - 91) + 91;
                    ch = (char) a2;

                    password.append(ch);

                } else {
                    int a3 = rand.nextInt(126 - 123) + 123;
                    ch = (char) a3;
                    password.append(ch);
                }
                j++;

            }
            //System.out.println("Password = " + password);
            return password;

        } else if (choice == 'C') {
            for (int i = 1; i <= letters; i++) {
                int random_integer = rand.nextInt(127 - 33) + 33;
                ch = (char) random_integer;
                if (ch > 33) {
                    password.append(ch);
                }
                j++;
            }
            return password;

        } else {
            System.out.println("Invalid input. Please make sure you entered Capital letters!");
            return null;
        }
    }
}
