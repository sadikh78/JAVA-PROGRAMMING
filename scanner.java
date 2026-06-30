public import java.util.Scanner;
class variable {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = a + b;
       int d = a - b;
       int e = a * b;
       int f = a / b;
       System.out.println("the sum is: " + c);
       System.out.println("the difference is: " + d);
       System.out.println("the multiply is: " + e);
       System.out.println("the divide is: " + f);
       System.out.println("the name is " + name);
    }
}

//output//
sadikh shaik
20
30
the sum is: 50
the difference is: -10
the multiply is: 600
the divide is: 0
the name is sadikh shaik 
