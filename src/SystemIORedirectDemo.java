import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by parashan on 7/8/2017.
 */
public class SystemIORedirectDemo {
    public static void main(String[] args) {
  try{
      FileOutputStream fos = new FileOutputStream("C:\\Users\\parashan\\Desktop\\cv.txt");
      PrintStream ps =new PrintStream(fos);
      System.setErr(ps);
      System.err.print("Hello , How are you");
      System.err.print("note that this content is saved to cv.txt file");
  }catch(Exception e){
      System.out.println("IO Exception occur"+ e.getMessage());
  }
    }
}
