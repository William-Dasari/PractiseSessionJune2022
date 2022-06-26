import java.io.File;
import java.io.IOException;

public class Day7Files
{
    public static void main (String []args) throws IOException
    {
        File file=new File("abc.txt");
        System.out.println(file.exists());//1 false 2 true
        System.out.println(file.createNewFile());//1 true 2 false
        File files=new File("Folder");
        System.out.println(files.exists());//1 false 2 true
        System.out.println(files.mkdir());//1  true 2false
    }

}
