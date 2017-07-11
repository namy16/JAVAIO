
import java.io.*;
class SequenceInputStreamDemo{
    public static void main(String[] args)throws Exception{

        //SequenceInputStream is used to combine multiple InputStreams
        //into a single stream
        FileInputStream fin1=new FileInputStream("C:\\Users\\parashan\\Desktop\\a.txt");
        FileInputStream fin2=new FileInputStream("C:\\Users\\parashan\\Desktop\\aa.txt");
        FileInputStream fin3=new FileInputStream("C:\\Users\\parashan\\Desktop\\abc.txt");

        FileOutputStream fout=new FileOutputStream("C:\\Users\\parashan\\Desktop\\abcd.txt",false);
        //below overloaded constructor can also be used, to combine more than 2 streams
        //SequenceInputStream(Enumeration<? extends InputStream> e)

        SequenceInputStream sis =new SequenceInputStream(fin2,fin1);

        SequenceInputStream sis1 = new SequenceInputStream(sis,fin3);

   /*//DataInputStream dis = new DataInputStream(sis1);
   InputStreamReader isr = new InputStreamReader(sis1);
   BufferedReader br = new BufferedReader(isr);*/

        int i;
        while((i=sis1.read())!=-1)
        {
            fout.write(i);
            System.out.print((char)i);
        }
   /*String str;

   while(!((str = br.readLine()).equals("xyz")))
   {

      System.out.println(str);

   }*/

        //sis.close();
        sis1.close();
        fout.close();
        fin1.close();
        fin2.close();
        fin3.close();
    }
}
