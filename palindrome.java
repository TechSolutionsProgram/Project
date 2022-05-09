package stringproblems;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner kb = new Scanner (System.in);
        System.out.println("Enter a String");
        String reverse = kb.next();
        String str ="";

        char [] array = reverse.toCharArray();
        for (int i =reverse.length()-1; i >=0; i--) {
            // storing reverse in str String variable
            str =str + array[i];
            //System.out.println(str);
        }

           if(reverse.equals(str)){
                System.out.println("Yes is palindrome");
            }
            else {
                System.out.println("Not palindrome");
            }



    }
}
