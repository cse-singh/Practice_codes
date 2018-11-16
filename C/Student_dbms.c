// Student Database Management System
// Using C
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

#define Student struct Stud

void add(FILE *fp); 		//add to a list
FILE *del(FILE *fp);		//to delete from the list
void modify(FILE *fp);		//to modify a record
void displayList(FILE *fp); //display whole list
void searchRecord(FILE *fp);//find a particular record
void printChar(char ch, int n);//printing a character ch n times

struct Stud
{
	char name[100];
	char branch[50];
	int roll;
	float marks;
	float total;
};

int main(int argc, char const *argv[])
{
	FILE *fp;
	Student s;
	int option;
	char number;

	if((fp=fopen("studentinfo.txt", "rb+"))==NULL)
	{
		if((fp=fopen("studentinfo.txt", "wb+"))==NULL)
		{
			printf("Can't open file\n");
			return 0;
		}
	}

	printHead();
	printf("\n\n\t\tCREATED BY");
	printf("\n\n\t\tCO dept.");
	printf("\n\n\t\tAnmoldeep Singh");
	printf("Press any key to continue\n");

	while(1)
	{
		printHead();
		printf("\n\t");
		printChar('-', 64);

		printf("\n\n\t\t1. ADD Student");
		printf("\n\n\t\t2. DELETE Student");
		printf("\n\n\t\t3. MODIFY Student");
		printf("\n\n\t\t4. DISPLAY Student LIST");
		printf("\n\n\t\t5. SEARCH record");
		printf("\n\n\t\t0. EXIT");

		printf("Enter your option\n");
		scanf("%d", &option);

		switch(option)
		{
			case 0:
				return 1;
				break;
			case 1:
				add(fp);
				break;
			case 2:
				fp = del(fp);
				break;
			case 3:
				modify(fp);
				break;
			case 4:
				displayList(fp);
				break;
			case 5:
				searchRecord(fp);
				break;
			default:
				printf("\n\t\tYou Pressed wrong key");
				printf("\n\t\tProgram terminated");

				exit(0);

		}

	}
	return 1;
}




