package ProxyExample;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    String saysHello() throws RemoteException;
}
