import java.util.Scanner;
public class JavaStringInt
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String name;
        int num;
        int twenty=00;
        int tens=0;
        for(int i=0;i<3;i++)
        {
            name=scanner.next();
            num=scanner.nextInt();
            System.out.printf("%-15s",name);
            if(num>=0 && num<=9) {
                System.out.print(twenty);
                System.out.print(twenty);
                System.out.print(num+"\n");
            }
            else if(num>9 && num<=99){
                System.out.print(tens);
                System.out.print(num+"\n");
            }
            else
                System.out.print(num+"\n");
        }
        //System.out.println(name + "  " + num);
        // I think it is inefficient can do it better

    }
}
