import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int d=num;
        for(int i=1;i<=num;i++)
        {d=num;
            for(int j=1;j<=i;j++)
            {
                System.out.print(d);
                d--;
            }

            for(int j=1;j<=num+1-i;j++)
            {
                System.out.print(num);
               // d--;
            }
            System.out.println();
        }
    }
}