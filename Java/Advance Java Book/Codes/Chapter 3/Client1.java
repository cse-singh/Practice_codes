import java.io.*;
import java.net.*;
class Client1
{
	public static void main(String args[ ]) 
	throws Exception
	{
  		//create client socket with same port number
		Socket s = new Socket("localhost", 777);
		//to read data coming from server, attach InputStream to the socket
		InputStream obj = s.getInputStream();
		//to read data from the socket into the client, use BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(obj));
		//receive strings
		String str;
		while((str = br.readLine()) != null)
		System.out.println("From server: "+str);
		//close connection by closing the streams and sockets
		br.close();
		s.close();
	}
}
