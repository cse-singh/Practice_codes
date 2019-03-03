import java.io.*;
class Student implements Serializable {
int roll_no;
String name;
double per;
public Student(int r,String n,double p) {
roll_no = r;
name = n;
per = p;
}
public String toString() {
return "Roll No="+roll_no+" Name="+name+" %ge="+per;
}
}