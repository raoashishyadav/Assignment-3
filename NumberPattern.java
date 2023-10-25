package Neebal_assignment3;
class NumberPattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print("   ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "  ");
            }

            // Print decreasing numbers
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + "  ");
            }

            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print("   ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "  ");
            }

            // Print decreasing numbers
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + "  ");
            }

            System.out.println();
        }
    }
}