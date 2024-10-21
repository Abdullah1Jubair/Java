import java.util.Scanner;
public class scanner_class {
    public static void main(String[]args)
    {
       
        Scanner sc = new Scanner (System.in );  
        System.out.println("Please enter a number");
        int num1 = sc.nextInt();
        System.out.println(num1);
        System.out.println("please enter a fractiona number");
        double num2 = sc.nextDouble();
        System.out.println(num2);

    }
}
 