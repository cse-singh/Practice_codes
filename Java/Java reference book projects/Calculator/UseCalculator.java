package Calculator;

import java.io.*;

class UseCalculator
{
	public static void main(String[] args) {
		
		BufferedReader buffer = new BufferedReader(
			new InputStreamReader(System.in));

		System.out.println("Select the Calculator: Basic - B or Scientific - S.");
		System.out.flush();
		String option = buffer.readLine();
		if(option.lenght() == 1)
		{
			if (option.equals("B") || option.equals("b")) 
			{
				// Calls the basic Calculator
				Calculator c = new Calculator();
				c.Calc(); 
			}

			else if (option.equals("S") || option.equals("s")) 
			{
				// Calls the scientific Calculator
				ScientificCalculator sc = new ScientificCalculator();
				sc.Calc(); 
			}
			else
				System.out.println("***Please enter option 'B' or 'S'.***");
		}
		else
			System.out.println("***Please enter option 'B' or 'S'.***");

	}
}