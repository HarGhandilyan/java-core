package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int Nums[] = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int h = Nums.length;

        for (int i = 0; i < h; i++) {
            System.out.print(Nums[i] + " ");
        }

        System.out.println();

        System.out.println(Nums[0]);

        System.out.println(Nums[h - 1]);


        System.out.println(h);

        int i = h - 1;
        int min = Nums[0];
        for (int j = 0; j < h - 1; j++) {
            if (Nums[i] < min) {
                min = Nums[i];

            }

        }
        System.out.println(min);
        int couples = 0;
        for (int j = 0; j < h; j++) {
            if (Nums[j] % 2 == 0) {
                couples = (couples + 1);

            }
        }
        System.out.println(couples);
        int x = 0;
        for (int j = 0; j < h; j++) {
            if (Nums[j] % 2 != 0) {
                x = (x + 1);
            }

        }
        System.out.println(x);
        int y = Nums[0];
        for (int j = 1; j < h; j++) {
            y = (y + Nums[j]);
        }
        System.out.println(y);
        System.out.println(y / 2);
    }
}









