public class BooleanCalculator {
    public static void main(String[] args) {
        int a = 3, b = -4, c = 1;
        boolean t = true, f = false;

        if (a >= b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (-b / a == c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if ((t || !f) == (2 * c <= c)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if ((!t == f) != (b + c / a > a - b * c)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}