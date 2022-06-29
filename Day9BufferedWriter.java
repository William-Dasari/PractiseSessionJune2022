import java.io.*;
public class Day9BufferedWriter
{
    public static void main (String[] args)
    {
        try
        {
          File file=new File("trial2.txt");
          file.createNewFile();
          BufferedWriter bufferedwriter =new BufferedWriter(new FileWriter(file,true));
          bufferedwriter.write("welcome to new world");
          bufferedwriter.newLine();
          bufferedwriter.write(100);
          bufferedwriter.write("stage2");
          bufferedwriter.newLine();
          bufferedwriter.write("good to see you back");
          bufferedwriter.flush();
          bufferedwriter.close();
          BufferedReader bufferedreader=new BufferedReader(new FileReader(file));
          String line=bufferedreader.readLine();
            int i=0;
          while(line!= null){

              i++;
              System.out.println(+i+line);
            line=bufferedreader.readLine();
        }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
