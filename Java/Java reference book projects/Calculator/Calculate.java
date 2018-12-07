package Calculator;

// Defines the class
class Calculate implements iCalc
{
	private char Operator;
	private int iFNum, iSNum;
	private Double dblNumber = new Double(0);
	private Double dblResult = new Double(0);
	private int iResult = 0;
	private boolean typeDouble = false;
	private boolean typeInt = false;

	// Defines the constructor for scientific calculation
	public Calculate()
	{}
	public Calculate(Double dblNum, char cOperator)
	{
		dblNumber = dblNum;
		Operator = cOperator;
		typeDouble = true;
	}

	// Defines a constructor for basic calculations
	public Calculate(int iFirstNum, char cOperator, int iSecondNum)
	{
		iFNum = iFirstNum;
		iSNum = iSecondNum;
		Operator = cOperator;
		typeInt = true;
	}

	// Calculates the result based on the operator selected by the user
	public void doCalculation()
	{
		iResult = 0;
		dblResult = 0.0;

		switch(Operator)
		{
			case '+':
				checkInt();
				iResult = iFNum + iSNum;
				break;
			case '-':
				checkInt();
				iResult = iFNum - iSNum;
				break;
			case '*':
				checkInt();
				iResult = iFNum * iSNum;
				break;
			case '/':
				checkInt();
				if(!checkSecondNum())
				{
					iResult = iFNum / iSNum;
					break;
				}
				else
					throw new ArithmeticException("Divide by zero");
			case 'S':
			case 's':
				checkDouble();
				dblResult = Math.sin(dblNumber);
				break;
			case 'C':
			case 'c':
				checkDouble();
				dblResult = Math.cos(dblNumber);
				break;
			case 'T':
			case 't':
				checkDouble();
				dblResult = Math.tan(dblNumber);
				break;
			case 'L':
			case 'l':
				checkDouble();
				dblResult = Math.log(dblNumber);
				break;
			default:
				iResult = 0;
				dblResult = 0.0;
				System.out.println(
					"***Operation Not Available. \n"
					"Please Select any of available options.***"
					);
				break;
		}
	}

	// Displays the result of calculation to the user
	public void getResult()
	{
		if(typeInt)
		{
			System.out.println("The result is : " + iResult);
		}
		else if(typeInt)
		{
			System.out.println("The result is : " + dblResult);	
		}

	}


	// Checks for zero
	public boolean checkSecondNum()
	{
		if(iSNum)
		{
			System.out.println("Zero not allowed");
			System.exit(0);
			return true;
		}
		else
			return false;
	}

	public void checkInt()
	{
		if(!typeInt)
		{
			iResult = 0;
			System.out.println(
					"***Operation Not Available. \n"
					"Please Select any of available options.***"
					);
			System.exit(0);
		}
	}

	public void checkDouble()
	{
		if(!typeDouble)
		{
			dblResult = 0.0;
			System.out.println(
					"***Operation Not Available. \n"
					"Please Select any of available options.***"
					);
			System.exit(0);			
		}
	}
}
