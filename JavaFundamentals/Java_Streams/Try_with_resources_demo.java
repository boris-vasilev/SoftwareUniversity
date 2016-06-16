import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by boris on 6/14/2016.
 */
public class Try_with_resources_demo {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream(new File("text.txt"))){
           int r = fis.read();
        }catch (IOException ioex){
            ioex.printStackTrace();
            //System.out.println(ioex.getMessage());
        }
        System.out.println("Program continues to run");
    }
}
//TRY WITH RESOURCES
//much better way to close streams (used after JDK v7)

