package learning.algos.learning.algos.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 5};
        int res = 0;

        for (int i : a) {
            res += i;
        }

        System.out.println((a[a.length - 1] * (a[a.length - 1] + 1) / 2) - res);
    }
}
