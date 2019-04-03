import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Process {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line;
		java.lang.Process process = Runtime.getRuntime().exec("tasklist.exe");
		BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
		while ((line = input.readLine()) != null) {
		    if (line.startsWith("java.exe")) // I only want the processes that have 'java.exe' for a name.
		        System.out.println(line);
		}
		
	}

}
