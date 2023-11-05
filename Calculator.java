import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Please Select your Operation.\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison");
        int choice = sc.nextInt();
        switch(choice){
            case 1 :
            System.out.println("The addition is : " + (a+b));
            break;

            case 2 :
            System.out.println("The subtraction is : " + (a-b));
            break;

            case 3 :
            System.out.println("The multiplication is : " + (a*b));
            break;

            case 4 :
            System.out.println("The division is : " + (a/b));
            break;
            default:
            System.out.println("Enter correct operator");
        }
        sc.close();
    }
    
}
