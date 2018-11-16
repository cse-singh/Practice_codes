#include<stdio.h>
//#include<conio.h>	//remove commenting from this line

//email id--2626thakur@gmail.com
int pair_cal(int num)
{
	int a=1, res=0,b,i;
	int div=10000;
	int div2=1;

	for(i=0;i<5;i++)
	{
		a=num/div;
		if(i)		//if(i!=0)
		{
			a%=10;
		}
		div/=10;	//div = div/10
		b=9-a;
		res+=b;
		div2*=10;
		if(i==4)break;
		res*=10;
	}

	return(res);
}

int predict(int num)
{
	int key=2;
	int res=0;
	int div=10000;

	num-=2;
	
	for(int i=0;i<6;i++)
	{
		res+=key;
		if(i==5)break;

		res*=10;	
		key=num/div;
		num%=div;
		div/=10;
	}
	return res;
}

int fiveDigCheck(int num)
{
	int count=0;

	while(num>0)
	{
		num/=10;
		count++;
	}
	if(count!=5)
	{
		printf("Given number is not a 5 digit number!!!");
		return 0;
	}
		printf("Number is Five digit\n");
	return 1;
	
}
		
int main()
{
	int num[3],data[2],guess_ans,result=0;

	// clrscr(); 	// remove commenting from here too
	for(int i=0;i<3;i++)
	{
		printf("Enter a 5 digit number:");
		scanf("%d",&num[i]);

		if(fiveDigCheck(num[i]))
		{
			switch(i)
			{
				case 0:
					guess_ans=predict(num[i]);
					printf("\n\n***Computer Predicted Result=%d***\n\n", guess_ans);
					break;
				case 1:
					data[i-1]=pair_cal(num[i]+num[i-1]);
					printf("Computer Input=%d\n\n",data[i-1]);
					break;
				case 2:
					data[i-1]=pair_cal(num[i]);
					printf("Computer Input=%d\n\n",data[i-1]);
					break;
			}
		}
		else
		{
			i--;
			printf("\nEnter number again!\n\n");
			continue;
		}	
	}

	// clrscr();		//remove commenting from here too
	printf("Final view:\n\n");
	printf("Entered num1:%d\n",num[0]);
	printf("Entered num2:%d\n",num[1]);
	printf("Computer's Entered num2:%d\n\n",data[0]);
	printf("Entered num3:%d\n",num[2]);
	printf("Computer's Entered num3:%d\n\n",data[1]);

	for(int i=0;i<3;i++)
	{
		result+=num[i]+data[i];

	}

	printf("\n***Computer Predicted Result=%d***\n", guess_ans);
	printf("\n***Actual  Calculated Result=%d***\n", result);
	// getch(); // remove commenting from here too
	return 0;
}
