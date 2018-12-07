package Calculator;

import java.io.*;

class Calculator 
{
	public void Calc() throws java.io.IOException
	{
		boolean next;
		do
		{
			Integer iFirstNumber = new Integer(0);
			Integer iSecondNumber = new Integer(0);
			BufferedReader buffer = 
					new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Please Enter First Number");
			System.out.flush();
			try
			{
				iFirstNumber = Integer.parseInt(buffer.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("***Please provide Numeric Values.***");
				System.exit(0);
			}

			System.out.println
			(
				"Please Enter the operation:\n"
				+"(Add: +\nMinus: -\n"
				+"(Product: *\Divide: /\n):"
			);
			System.out.flush();
			String option = buffer.readLine();

			System.out.println("Please Enter First Number");
			System.out.flush();
			try
			{
				iSecondNumber = Integer.parseInt(buffer.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("***Please provide Numeric Values.***");
				System.exit(0);
			}

			if(option.lenght() == 1)
			{
				Calculate c = new Calculate(iFirstNumber, option.charAt(0), iSecondNumber);

				c.doCalculation();
				c.getResult();
			}
			else
			{
				System.out.println
				(
					"***Operation Not Available. \n"
					"Please Select any of available options.***"
				);
			}
			// Checks if the user wants to compute again
			System.out.println("Would you like to Calculate again?(y/n):");
			System.out.flush();
			char response = (char) buffer.read();
			if((response=='y')||(response == 'Y'))
				next = true;
			else
				next = false;
		}while(next);
	}
}