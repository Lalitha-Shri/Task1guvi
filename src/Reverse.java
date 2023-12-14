import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        int sum=0;
        while(num>0)
        {
            int d=num%10;
            sum=(sum*10)+d;
            num=num/10;

        }
        System.out.println("Reversed number is"+ sum);
    }
}
