package task_6;

import java.io.*;

public class NoNumbers {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = reader.readLine();
            System.out.println(str.replaceAll("[^\\D]", "" ));
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
