package stringproblems;

import java.util.Scanner;

public class countword {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a String");
        String random = kb.next();
        int count =1;
        for (int i = 0; i < random.length()-1; i++) {
            count ++;

        }

        System.out.println(count);
    }


}

