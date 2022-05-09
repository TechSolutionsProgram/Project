package stringproblems;

public class stringTointeger {



        public static void main(String args[]){
            //Declaring String variable
            String word="200";
            //Converting String into int using  class Integer.parseInt() and Integer.valueOf()
            int number1 = Integer.parseInt(word);
            int number=Integer.valueOf(word);
            //Printing value of number and number1
            System.out.println(number1);
            System.out.println(number);

    }
}
