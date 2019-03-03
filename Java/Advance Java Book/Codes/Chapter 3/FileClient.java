import java.io.*;
import java.net.*;

class FileClient
{
	public static void main(String args[ ]) throws Exception
	{
    
		//Create client socket
		Socket s = new Socket("localhost", 8888);
    		//accept filename from keyboard 
		BufferedReader kb = new BufferedReader(new
		 InputStreamReader(System.in));

		System.out.print("Enter filename: ");
		String fname = kb.readLine();

		//send filename to the server using DataOutputStream
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		out.writeBytes(fname+"\n");

		//to read data coming from the server
		BufferedReader  in = new BufferedReader(new
		 InputStreamReader(s.getInputStream()));

		String str;

		//read first line from server into str
		str = in.readLine();
     
		//if file is found server returns "Yes", else "No"   
		if(str.equals("Yes"))
		{    
			//read and display the file contents coming from server
			while((str = in.readLine()) != null)
			System.out.println(str);
   
			//close connection by closing the streams.
			kb.close();
			out.close();
			in.close();
			s.close();
		}
		else System.out.println("File not found");
     
	}
}

