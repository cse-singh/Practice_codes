/* DemoInterface.java*/
import java.rmi.Remote; 
import java.rmi.RemoteException; 
public interface DemoInterface extends Remote
{
    public String SayDemo() throws RemoteException;
}
