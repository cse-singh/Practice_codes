#include <bits/stdc++.h>
using namespace std;
int main() {
	int sum,dif;
	cin >> sum>>dif;
	int a=(sum+dif)/2,b=sum-a;
	cout<<min(a,b)<<"\n";
	cout<<max(a,b);
	return 0;
}