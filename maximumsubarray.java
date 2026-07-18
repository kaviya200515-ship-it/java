import java.io.*;
import java.util.*;

class Result {

    public static long maximumSum(List<Long> a, long m) {

        TreeSet<Long> set = new TreeSet<Long>();
        long max = 0;
        long prefix = 0;

        for (long x : a) {
            prefix = (prefix + x % m) % m;

            if (prefix > max) {
                max = prefix;
            }

            Long higher = set.higher(prefix);

            if (higher != null) {
                max = Math.max(max, (prefix - higher + m) % m);
            }

            set.add(prefix);
        }

        return max;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {

            String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);
            long m = Long.parseLong(firstMultipleInput[1]);

            String[] aTemp = bufferedReader.readLine().trim().split(" ");

            List<Long> a = new ArrayList<Long>();

            for (int i = 0; i < n; i++) {
                a.add(Long.parseLong(aTemp[i]));
            }

            long result = Result.maximumSum(a, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}