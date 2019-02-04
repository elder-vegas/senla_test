package task_2;

import java.io.*;
import java.util.ArrayList;

public class FibonacciNumbers {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(reader.readLine());
            ArrayList<Integer> lst = new ArrayList<>();
            int index = 0;

            while (true) {
                int next_number = fibonacci(index++);
                if (next_number > n) break;
                lst.add(next_number);
            }

            System.out.print(lst.toString());
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private static int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
