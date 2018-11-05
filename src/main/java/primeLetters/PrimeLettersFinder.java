package primeLetters;

import java.util.Scanner;

public class PrimeLettersFinder {

    public Scanner scanner = new Scanner(System.in);

    private int i, j, scope, sqrt;


    public void programInitiation() {
        System.out.println("Hello! This is a program which helps you to find prime letters in the scope which you choose :)\n" +
                "To start write the upper limit of the range of numbers you want to check");
        scope = scanner.nextInt();
    }

    public void primeLettersFinding() {
        int lettersTable[] = new int[scope + 1];

        for (i = 0; i <= scope; i++) lettersTable[i] = i;

        sqrt = (int) Math.floor(Math.sqrt(scope));

        for (i = 2; i <= sqrt; i++) {
            if (lettersTable[i] != 0) {
                j = i + i;
                while (j <= scope) {
                    lettersTable[j] = 0;
                    j = j + i;
                }
            }
        }
        System.out.println("Prime Letters in the scope from 2 to " + scope + ":");
        for (i = 2; i <= scope; i++) if (lettersTable[i] != 0) System.out.print(i + ", ");
    }
}

