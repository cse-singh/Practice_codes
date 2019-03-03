import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class DemoClient 
{
    public static void main (String[] args) {
if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
}
try
{
Registry reg = LocateRegistry.getRegistry(args[0]);      
DemoInterface h = (DemoInterface) reg.lookup("Hello");
      System.out.println (h.SayDemo());
    } 
  catch (Exception e){
    System.out.println ("DemoClient exception: " + e);
}
 }
}
