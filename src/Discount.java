import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        int num = input.nextInt();
        float discount=0;
       double total=0;
        if(num<500)
        {
            System.out.println("The final payable amount is "+num);
        }
       else if(num>=500 && num<=1000 )
        {
          discount=(float)0.1*num;
          total=num-discount;
            System.out.println("The final payable amount is "+total);
        }
        else
        {
            discount=(float)0.2*num;
            total=num-discount;
            System.out.println("The final payable amount is "+total);
        }

    }
}