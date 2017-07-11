        import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;
public class FileOStream{
    public static void main(String args[]){
        try{

            FileOutputStream fout=new FileOutputStream("C:\\Users\\parashan\\Desktop\\aa.txt",false/*append*/);
            String s="Hello there!!";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(IOException e){System.out.println(e);}
    }
}


