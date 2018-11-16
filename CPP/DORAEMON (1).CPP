#include<conio.h>
#include<stdio.h>
#include<graphics.h>
void main()
{
	int gm,gd;
	clrscr();
	detectgraph(&gm,&gd);
	initgraph(&gm,&gd,"c:/tc/bgi");
       //	setbkcolor(2);
	circle(300,120,90);    //outer head
	circle(300,230,10);    //inner head
	ellipse(300,160,180,360,40,34);  //mouth
	line(300,230,300,220);   //bell
	ellipse(300,160,140,40,70,60);  //head ka white circle
	ellipse(300,160,80,100,70,60);  //head ka white circle
	ellipse(265,100,0,360,20,40);   //L. eye
	ellipse(335,100,0,360,20,40);   //R. eye
	ellipse(345,315,305,60,40,160); //r.body
	ellipse(255,315,120,230,40,160); //l.body
       //	setcolor(2);
	//ellipse(245,300,100,250,40,115); //l.body
	ellipse(300,295,120,60,66,90);   //sphear pocket ka circle
	ellipse(300,315,180,360,40,34);     // pocket
	line(260,315,340,315);
	arc(190,315,0,45,204);
	getch();
	closegraph();


}