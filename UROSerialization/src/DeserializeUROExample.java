import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeUROExample {

    public static void main(String[] args) throws Exception{

        FileInputStream fileIn =
                new FileInputStream("/tmp/uro.ser");
        ObjectInputStream ois = new ObjectInputStream(fileIn);
        Object object = ois.readObject();
        System.out.println("Deserialied something");
        ois.close();
        fileIn.close();
    }
}
