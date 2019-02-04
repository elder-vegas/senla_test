package task_1;

import java.io.*;
import java.util.ArrayList;

public class PrimalNumbers {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(reader.readLine());
            ArrayList<Integer> lst = new ArrayList<>();

            for (int i = 2; i <= n; i++) {
                boolean is_primal = true;
                for (Integer number : lst) {
                    if (i % number == 0) {
                        is_primal = false;
                        break;
                    }
                }
                if (is_primal) {
                    lst.add(i);
                }
            }

            System.out.print(lst.toString());
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
