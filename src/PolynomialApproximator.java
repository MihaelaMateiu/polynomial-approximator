import java.util.Scanner;

public class PolynomialApproximator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please introduce a degree for the polynomial(positive, nonzero value): ");
        int m = sc.nextInt();

        //generates the constant term of the polynomial
        System.out.print("1   ");

        //generates x₁ to each power from 1 to m
        for (int i = 1; i <= m; i++) {
            System.out.print("x\u2081" + "^" + i + "  ");
        }
        System.out.print("   ");

        //generates x₂ to each power from 1 to m
        for (int j = 1; j <= m; j++) {
            System.out.print("x\u2082" + "^" + j + "  ");
        }
        System.out.print("   ");

        //generates the product terms x₁x₂ with all needed combinations of powers
        for (int sumOfPowers = 2; sumOfPowers <= m; sumOfPowers++) {
            int p1 = 1, p2 = sumOfPowers - 1; //power of x₁, respectively x₂
            while ((p1 <= sumOfPowers - 1) && (p2 >= 1)) {
                System.out.print("x\u2081" + "^" + p1 + "*" + "x\u2082" + "^" + p2 + "  ");
                p1 = p1 + 1;
                p2 = p2 - 1;
            }
            System.out.print("   ");
        }
    }
}

