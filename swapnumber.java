package stringproblems;

public class swapnumber {

    public static void main(String[] args) {

        int a =3, b =5;

        System.out.println("Before Swap");
        System.out.println("a " + a +'\n' +"b " +b);
        /*
        a = a - b; // 3 -5 = -2
        b = a + b; // -2 + 5 = 3
        a =b + b;   // 2 + 2 = 4 */
        a = a+b; // a = 8
        b = a -b; // b = 3
        a = a - b; // a = 5
        System.out.println("After swap");
        System.out.println("a " + a +'\n' +"b " +b);
    }
}
/*
Swap two numbers without using the third Variable
ex ., a=2 nd b=4 nd o/p ->a=4,b=2
 */