package learning.algos.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class LeCandy {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int testCasesCount = Integer.parseInt(br.readLine());

            while (testCasesCount-- > 0) {
                String nca[] = br.readLine().split(" ");
                int c = Integer.parseInt(nca[1]);

                // get numbers
                String data[] = br.readLine().split(" ");
                Set<Integer> set1 = new HashSet<>();

                for (String str : data) {
                    set1.add(Integer.parseInt(str));
                }

                boolean isPossible = true;

                int count = 0;

                for (Integer i : set1) {
                    count += i;
                    c -= i;
                    if (i > c) {
                        isPossible = false;
                        break;
                    }
                }

                System.out.println(isPossible ? "Yes" : "No");


            }
        }
    }
}
