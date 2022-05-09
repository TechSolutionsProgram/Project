package stringproblems;

public class stringproblems {

    public static void main(String[] args) {

        // How to check if two strings are the same ignoring their cases
        String one = "LuckyNumber";
        String two = "luCkynUmber";
        System.out.println("Check ignore case " + one.equalsIgnoreCase(two));

        //How to print duplicate characters from the string

        String s = "helloo";

        int length = s.length();
        char[] convert = s.toCharArray(); // [h e l l o o ]
                                          // [h] == [e]

        for (int i=0; i <length ; i++){
           // System.out.println("i " + i); // 0
            for(int j =i +1; j <length ; j++){ //
                //System.out.println("j = " +j);
                if (convert[i] == convert[j]){ // checking index of i == j
                   System.out.println("Duplicate " + convert[i]);
                    break;
                }
            }
        }




    }

}
/*
H

How many string got created in the below code snippet
String s1 = new String("Hello");
String s2 = new String("Hello");

How to reverse a string in Java without using the reverse method?

How to convert string to integer

How to check if a string is a palindrome

How to count the number of words in a given string sentence

 */