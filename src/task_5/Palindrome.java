package task_5;

import java.io.*;

public class Palindrome {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            char[] str = reader.readLine().toCharArray();
            String answer = isPalindrome(str) ? "This word is palindrome" : "This word is not palindrome";

            System.out.print(answer);
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private static boolean isPalindrome(char[] word) {
        for (int i = 0; i < (word.length / 2); i++) {
            if (word[i] != word[word.length -1 - i]) return false;
        }

        return true;
    }
}
