import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class X_Y_sum_diff {

    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int sum=in.nextInt();
        int difference=in.nextInt();
        int y=(sum-difference)/2;
        int x=difference+y;
        System.out.println((x<y?x:y)+"\n"+(x>y?x:y));}}