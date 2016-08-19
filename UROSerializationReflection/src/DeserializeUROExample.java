import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeUROExample {

    public static void main(String[] args) throws Exception{

        FileInputStream fileIn = 
                new FileInputStream("/tmp/uro.ser");
        ObjectInputStream ois = new ObjectInputStream(fileIn);
        Cake myCake = (Cake) ois.readObject();
        System.out.println(String.format(
                "Found a %s cake with %s icing", 
                myCake.getSponge(), myCake.getIcing()));
        ois.close();
        fileIn.close();
    }
}
