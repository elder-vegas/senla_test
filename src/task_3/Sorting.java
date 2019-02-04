package task_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the array numbers. Dot means end of entry");

            String str;
            ArrayList<Integer> lst = new ArrayList<>();
            while (!(str = reader.readLine()).equals(".")) {
                lst.add(Integer.parseInt(str));
            }

            lst.sort(Collections.reverseOrder());

            System.out.print(lst.toString());
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
