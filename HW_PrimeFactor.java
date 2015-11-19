package hw_primefactor;

import java.util.Scanner;

/**
 *
 * @author Kyo
 */
public class HW_PrimeFactor {

    // Saksukrit  Ek-uru  SE#3
    public static void main(String[] args) {

        int inputnumber, primenumber;
        Scanner in = new Scanner(System.in);

        System.out.println("You want exit ,Enter 0 !!!\n");
        do {
            System.out.print("Enter number : ");
            inputnumber = in.nextInt();

            System.out.print("Prime result : ");
            for (int i = 2; i <= inputnumber; i++) {
                while (inputnumber % i == 0) {
                    primenumber = i;
                    inputnumber = inputnumber / primenumber;
                    System.out.print(primenumber);
                    if (inputnumber >= primenumber) {
                        System.out.print(" x ");
                    }
                }
            }
            System.out.print("\n\n");
        } while (inputnumber != 0);

    }

}
