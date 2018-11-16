#include<stdio.h>

int pair_cal(int num)
{
	int a=1, res=0,b,i;
	int div=10000;
	int div2=1;

	for(i=0;i<5;i++)
	{
		a=num/div;
	printf("\ndiv=%d\n",div);
		if(i)
		{
			a%=10;
		}
		div/=10;	//div = div/10
	printf("\ndiv=%d\n",div);
	printf("\na=%d\n",a);
		b=9-a;
	printf("\nb=%d\n",b);
		res+=b;
	printf("\nres=%d\n",res);
	div2*=10;
	printf("\ndiv2=%d\n",div2);

	if(i==4)break;
	res*=10;
	printf("\nres=%d\n",res);

	}
	return(res);
}
		
int predict(int num)
{
	int key=2;
	int res=0;
	int div=10000;
	printf("\nnum=%d\n",num);
	num-=2;
	printf("\nnum=%d\n",num);
	
	for(int i=0;i<6;i++)
	{
		res+=key;
		if(i==5)break;

		printf("\nkey=%d\n",key);
		printf("\nnum=%d\n",num);
		printf("\nres=%d\n",res);
		res*=10;
		printf("\nres=%d\n",res);
	
		key=num/div;
		printf("\nkey=%d\n",key);
		num%=div;
		printf("\nnum=%d\n",num);
		div/=10;
		printf("\ndiv=%d\n",div);
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
		printf("Given number is not a 5 digit number!!!\n\n");
		return 0;
	}
		printf("Number is Five digit\n");
	return 1;	
}

int main()
{
	int num[3],data[3];

	for(int i=0;i<1;i++)
	{
		printf("Enter a 5 digit number:");
		scanf("%d",&num[i]);

		printf("checked flag=%d\n",fiveDigCheck(num[i]));
		if(fiveDigCheck(num[i]))
		{
			printf("\n\npair=%d\n\n",pair_cal(num[i]));
			printf("\n\npredict=%d\n\n",predict(num[i]));
		}	
	}
	return 0;
}
