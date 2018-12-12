package learning.algos.learning.algos.arrays;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3};
        int b[] = new int[]{-1, -2, -3, -4};

        System.out.println(getKadaneSum(a));
        System.out.println(getKadaneSum(b));
    }

    private static int getKadaneSum(int a[]) {
        int globalMax = a[0], currentMax = a[0];
        for (int i = 1; i < a.length; i++) {
            currentMax = Integer.max(a[i], currentMax + a[i]);
            globalMax = Integer.max(currentMax, globalMax);
        }

        return globalMax;
    }
}
