import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by boris on 6/14/2016.
 */
public class Exceptions_demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(new File("text.txt"));
            int r = fis.read();
        }catch (IOException ioex){
            System.out.println(ioex.getMessage());
        }finally {
            if (fis != null){
                fis.close();
            }
        }
    }
}
//TRY WITHOUT RESOURCES
//bad way to close streams (used until JDK v7)