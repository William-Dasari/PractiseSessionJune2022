import java.io.*;
public class Day8FileWriter
{
    public static void main (String []arg)
    {
        try
        {
            File f = new File("Test1.txt");
            f.createNewFile();
            FileWriter filewriter=new FileWriter("Test1.txt",true);
            filewriter.write(100);
            filewriter.write("\n");
            filewriter.write("welcome to new world");
            filewriter.write('\n');
            filewriter.write("stage1");
            filewriter.flush();
            filewriter.close();
            FileReader filereader=new FileReader(f);
            int i=filereader.read();
            while(i!=-1){
                System.out.print((char) i);
                i=filereader.read();
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
