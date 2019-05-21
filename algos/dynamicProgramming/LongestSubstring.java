package learning.algos.dynamicProgramming;

public class LongestSubstring {
    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";

        System.out.println(longestCommonSubstring(str1.toCharArray(), str2.toCharArray()));
    }

    public static int longestCommonSubstring(char[] str1, char[] str2) {
        int memory[][] = new int[str1.length + 1][str2.length + 1];

        int max = 0;
        for (int i = 0; i <= str1.length; i++) {
            for (int j = 0; j <= str2.length; j++) {
                if (i == 0 || j == 0) {
                    continue;
                }
                if (str1[i - 1] == str2[j - 1]) {
                    memory[i][j] = memory[i - 1][j - 1] + 1;
                    if (max < memory[i][j]) {
                        max = memory[i][j];
                    }
                }
            }
        }
        return max;
    }
}
