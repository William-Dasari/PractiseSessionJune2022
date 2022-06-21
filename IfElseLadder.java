import java.util.Scanner;
public class IfElseLadder
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int x=n%2;
        if(x==0)
        {
            if(n>=2 && n<=5)
                System.out.println("even number in between 2to5");
            else if(n>=6 && n<=20)
                System.out.println("even number in between to 20");
            else
                System.out.println("even number greater than 20");
        }
        else
            System.out.println("Odd number");
    }
}
