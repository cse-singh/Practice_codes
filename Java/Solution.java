import java.util.*;
import java.io.*;
import java.math.*;
//reverse string from the given index


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        
        if(in.hasNextLine())
        
        {
            in.nextLine();
        }
        String word = in.nextLine();

        int indexOut=(N%word.length());
        
        char[] array = word.toCharArray();
        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
    for(int i=0;i<word.length();i++)
    {
        
        System.out.println(word.charAt(indexOut));
        indexOut = ++indexOut % word.length();
    }
    }
}