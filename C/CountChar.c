#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[])
{
	int Count=0;

	for (int i = 1; i < argc; ++i)
	{
		Count += strlen(argv[i]);
	}

	printf("Count = %i\n\n", Count);

	return 0;
}