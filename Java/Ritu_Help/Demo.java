import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileSystemNotFoundException;
public class Demo
{
  private static final Reader Demo = null;

public static void main(String[] args)
  	throws FileSystemNotFoundException
  	{
	  FileReader file;
	try {
		file = new FileReader("mam.txt");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  BufferedReader bf=new BufferedReader(Demo);
	  String st;
	try {
		st = bf.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  int sum =0;
	 // int count=0;
	  try {
		while((st=bf.readLine())!=null)
		  {
			  StringTokenizer stn = new StringTokenizer(st);
			 // String rn = stn.nextToken();
			 // String name= stn.nextToken();
			  int MemUsage = Integer.parseInt(stn.nextToken());

			  sum = sum+MemUsage;
			 // count++;
			  System.out.printf("Total memory=%d\n", sum);
		  }
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	}
}