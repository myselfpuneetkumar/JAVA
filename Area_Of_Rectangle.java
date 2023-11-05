import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        int a = sc.nextInt();
        System.out.println("Enter the width of rectangle : ");
        int b = sc.nextInt();
        int area = a * b;
        System.out.println("Area of rectangle is : "  + area);
        sc.close();
    }
    
}