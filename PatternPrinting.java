package Neebal_assignment3;
public class PatternPrinting {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}