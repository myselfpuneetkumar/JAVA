import java.util.Scanner;
public class Area_Of_Circle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Radius of Circle ");
        //Here rd means radius and ar is radius multiply radius.
        int rd=sc.nextInt();
        double pi=3.14;
        double arr=pi*rd*rd;
        //int arr=ar*pi;
        System.out.println("The Area of Circle is:"+arr);
        sc.close();
        
    }
}
