import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    final int ObjectSize = 4;
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[ObjectSize];

        // game loop
        while (true) {
            for (int i = 0; i < ObjectSize; i++) {
                int mountainH = in.nextInt(); 

                
                arr[i] = mountainH;
            }


            System.out.println(Arrays.asList(arr).indexOf(Collections.max(Arrays.asList(arr))));

        }
    }
}