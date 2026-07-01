// if,else conditional statements//
import java.util.*;
 class conditional{
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);
         int age =sc.nextInt();
         if(age>=18){
            System.out.println("adult");
         }
         else{
            System.out.println("not adult");
         }
        }   
    }  

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



// if,else conditional statements//
import java.util.*;
 class conditional{
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);
         int x =sc.nextInt();
         if(x%2==0){
            System.out.println("even");
         }
         else{
            System.out.println("odd");
         }
        }   
    } 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 


// if,else if conditional statements//
import java.util.*;
 class conditional{
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);
         int s =sc.nextInt();
         int k =sc.nextInt();
         if(s==k){
            System.out.println("equal");
         }
         else if(s>k){
            System.out.println( "s is greater than k");
         }
         else{
            System.out.println("k is less than s");
         }
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 




// switch conditional statements//
import java.util.*;
 class conditional{
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);
         int button =sc.nextInt();
         switch (button){
            case 1:System.out.println("hello");
                break;
            case 2:System.out.println("assalam alaikum");
                break;
            case 3:System.out.println("vanakam");
                break;
            case 4:System.out.println("bonjour");
                break;
            default:System.out.println("invalid button");
            }
         }
        }

 
