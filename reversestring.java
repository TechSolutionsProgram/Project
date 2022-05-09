package stringproblems;

public class reversestring {

    public static void main(String[] args) {

        String reverse = "Hello" ,str ="";

        char [] array = reverse.toCharArray();

        for (int i =reverse.length()-1; i >=0; i--) {

            str =str + array[i];

            }
            System.out.println(str);


        }
    }

// reverse string without using string method