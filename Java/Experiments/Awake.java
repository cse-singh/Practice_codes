import java.util.*;
import java.io.*;
import java.net.*;
import java.awt.*;

// KEEP THE STATIC IP AND ACTUAL INTERNET USE OUT,
// KEEP IT LOCAL, LATER SET IP UP ON RASPBERRY VIA ETHERNET


// should use  socket
// use port 5
// using local machine port and ip for now

class Awake extends Frame
{
	
	public static void main(String[] args) throws IOException, UnknownHostException,ClassNotFoundException, InterruptedException
	{

		InetAddress host = InetAddress.getLocalHost();
		ServerSocket server = new ServerSocket(8888);

		while(true)
		{
			System.out.println("Listening...");
			Socket dude = server.accept();

			if(dude != null)
				System.out.println("Dude online...");

		}

	}	
}
