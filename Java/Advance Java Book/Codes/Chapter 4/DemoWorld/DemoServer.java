import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;
public class DemoServer implements DemoInterface
{
public DemoServer() 
{
       super();
    }
private String message;
  public DemoServer(String msg) throws RemoteException {
    message = msg;
  }
  public String SayDemo() throws RemoteException {
    return message;
  }
  public static void main (String[] argv) 
  {
    try {	DemoInterface h = new DemoServer("Hello");
      	DemoInterface stub = (DemoInterface)   UnicastRemoteObject.exportObject(h, 0);
	Registry registry = LocateRegistry.getRegistry();
	registry.rebind ("Hello", stub);
      System.out.println ("Server is connected and ready for  operation.");
    } 
  catch (Exception e) {
      System.out.println ("Server not connected: " + e);
    }
} 

}
