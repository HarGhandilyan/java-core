package homework;

public class ForExamples {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + 1);
            if (i != 999) {
                System.out.print("-");
            }
        }

        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
        System.out.println();


        int Nums[] = {2, 5, 4, 6, 8, 2, 1, 9, 8};
        int max = Nums[0];
        for (int i = 0; i < Nums.length; i++) {
            if (Nums[i] > max) {
                max = Nums[i];

            }

        }
        System.out.print(max);
    }


}




