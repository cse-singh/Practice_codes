#include <stdio.h>
#include <string.h>
int my_strlen(char *string) //Function to calculate length of given string
{
    int i;
    for(i=0;string[i]!='\0';i++);
    return i;
}
int main(int argc, char *argv[])
{
  int length, CharCount = 0;
  printf("%s\n", argv[0]);
  if(argc == 1) //Check the number of command line arguments
  {
    printf("You must run this program with argument(s)\n");
    return 2;
  }
  else
  {
  	
    for (int i = 1; i < argc; ++i)
    {
    	length = my_strlen(argv[i]);
    	if (/* condition */)
    	{
    		/* code */
    	}
    }
    printf("Length of command line argument is: %d\n", CharCount);
    
  }
  return 0;
}