package task_4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FourBooleanValues {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            ArrayList<Boolean> lst = new ArrayList<>();

            for (int i = 0; i < 4; i++) {
                lst.add(Boolean.parseBoolean(reader.readLine()));
            }

            System.out.print(Collections.frequency(lst, true) == 2);
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
