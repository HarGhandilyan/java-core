package homework;

//1st
public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");


            }
            System.out.println();

        }
        System.out.println();
        //2nd
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
        //3rd
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");


            }
            System.out.println();
        }
        System.out.println();
        //4rd
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            for (int k = 5; k > i; k--) {
                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println();
//5
        for (int i = 0; i < 5; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");


            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");


            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");


            }
            System.out.println();

        }
    }
}







