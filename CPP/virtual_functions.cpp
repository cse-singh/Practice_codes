#include<iostream>

using namespace std;

class A
{
	int a;
public:
	A()
	{
		a=1;
	}

	virtual void show()
	{
			cout<<"a = "<<a;
	}
	~A(){}
};

class B:public A
{
	int b;

public:
	B()
	{
		b=2;
	}

	void show()
	{
			cout<<"b="<<b;
	}
	~B(){}
	
};
int main()
{
	A a1;
	B b1;
	A *ap1=&b1;

	ap1->show();

	return 0;
}