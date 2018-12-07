package Calculator;

import java.io.*;

class ScientificCalculator extends Calculate
{
	char Operator;
	Double dblNumber = new Double(0);

	ScientificCalculator(){}
	ScientificCalculator(double dblNumber, char Operator)
	{
		super(dblNumber, Operator);
		this.dblNumber = dblNumber;
		this.Operator = Operator;
	}

	public void Calc() throws java.io.IOException
	{
		boolean next;
		do
		{
			Double d = new Double(0);
			BufferedReader buffer = 
					new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Please Enter the Operation \n"
				+"(Sine-s,Cosine-c,Tangent-t,Log-l):");
			System.out.flush();
			String option = buffer.readLine();
			System.out.println("Please Enter a value:");
			System.out.flush();
			try
			{
				d = Double.valueOf(buffer.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("***Please provide Numeric Values.***");
				System.exit(0);
			}

			if(option.lenght() == 1)
			{
				ScientificCalculator sc = new ScientificCalculator
				(
					d, option.charAt(0)
				);

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
			char aa = (char) buffer.read();
			if((aa=='y')||(aa == 'Y'))
				next = true;
			else
				next = false;
		
		}while(next);
	}
}