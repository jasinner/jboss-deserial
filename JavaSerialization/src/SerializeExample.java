import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {

    public static void main(String[] args) throws Exception {
           FileOutputStream fileOut =
           new FileOutputStream("/tmp/cake.ser");
           ObjectOutputStream out = 
                   new ObjectOutputStream(fileOut);
           out.writeObject(new Cake("pink", "vanilla"));
           System.out.println("Deserialized cake to /tmp/cake.ser");
           out.close();
           fileOut.close();
    }
}
