//Datatypes maximum and minimum values//

import java.util.Scanner;
public class Day6DataTypes
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);

        //System.out.println("Enter the Integer value to Check suitable datatype");
        //Long number=scanner.nextLong();

        try
        {
        System.out.println("Enter the Integer value to Check suitable datatype");
        Long number=scanner.nextLong();

            if (number >= -128 && number <= 127)
                System.out.println(number + " can be stored in byte,short,int and long \n preferred datatype --> 'byte'");
            else if (number >= -32678 && number <= 32767)
                System.out.println(number + " can be stored in short,int and long \n preferred datatype --> 'short'");
            else if (number >= -2147483648 && number <= 2147483647)
                System.out.println(number + " can be stored in int and long \n preferred datatype --> 'int'");
            else if (number >= -9223372036854775808L && number <= 9223372036854775807L)
                System.out.println(number + " That's a very large number \n Haha :-D I'm 'long' and im the only option for you");
            //else
               // System.out.println(":-C Sorry Invalid number \n but don't worry enter a number number");
        }
        catch(Exception e)
        {
            System.out.println(":-C Sorry Invalid number \n but don't worry enter a number number\n"+e);
        }
    }
}
