import java.util.Scanner;
public class Day5equation
{
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int n=scanner.nextInt();
        for (int i = 0; i <= n; i++)
        {
            a = a + (int) Math.pow(2, i) * b;
            System.out.print(a+" ");
        }
    }
}
