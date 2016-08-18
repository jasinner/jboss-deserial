import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExample {

    public static void main(String[] args) throws Exception{

        FileInputStream fileIn =
                new FileInputStream("/tmp/cake.ser");
        ObjectInputStream ois = new ObjectInputStream(fileIn);
        Cake myCake = (Cake) ois.readObject();
        System.out.println(String.format(
                "Found a %s cake with %s icing",
                myCake.getSponge(), myCake.getIcing()));
        ois.close();
        fileIn.close();
    }
}
