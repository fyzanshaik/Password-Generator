import java.util.Random;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        //long start = System.nanoTime();

        passwordGenerator passwordGeneratorOBJ = new passwordGenerator();
        StringBuilder password;
        Scanner in = new Scanner(System.in);

        System.out.print("How many characters do you need?: ");
        int letters = in.nextInt();
        System.out.print("Would you like only alphabets(A)/symbols(B) or both(C): ");
        char choice = in.next().charAt(0);

        password = passwordGeneratorOBJ.generator(letters,choice);
        System.out.println(password);
//         long end = System.nanoTime();
//         long execution = end - start;
//         System.out.println("Execution time: " + execution + " nanoseconds");
    }
}

