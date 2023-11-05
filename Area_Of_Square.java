import java.util.Scanner;

public class Area_Of_Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side : ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of square is : "  + area);
        sc.close();
    }
    
}
