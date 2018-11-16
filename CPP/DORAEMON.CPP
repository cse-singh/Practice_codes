#include<conio.h>
#include<stdio.h>
#include<graphics.h>
void main()
{
	int gm,gd;
	clrscr();
	detectgraph(&gm,&gd);
	initgraph(&gm,&gd,"c:/tc/bgi");
	circle(300,120,90);
	circle(300,230,10);
	ellipse(300,175,180,360,40,34);
	line(300,230,300,220);
	ellipse(300,160,0,360,70,60);
	ellipse(265,100,0,360,20,40);
	ellipse(335,100,0,360,20,40);
	ellipse(365,290,295,90,20,105);
	ellipse(300,175,180,360,40,34);     // pocket
	getch();
	closegraph();


}