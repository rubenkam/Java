import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int a, b;
        System.out.println("Je eerste getal");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        System.out.println("Je 2e getal");
        Scanner out = new Scanner(System.in);
        b = in.nextInt();

        System.out.println(a+" "+"past"+" "+b/a+" "+"keer in"+" "+b+" "+"en er blijft nog"+" "+b%a+" "+"over");


//        System.out.println("Multiplication table of "+n+" is :-");
//
//        for ( c = 1 ; c <= 10 ; c++ )
//            System.out.println(n+"*"+c+" = "+(n*c));







    }
}
