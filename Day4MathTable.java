import java.util.Scanner;
public class Day4MathTable
{
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int sum;
        int i;
        for (i=1;i<=10;i++){
            sum=i*number;
            System.out.println(number+" * "+i+" = "+sum);
        }
    }
}
