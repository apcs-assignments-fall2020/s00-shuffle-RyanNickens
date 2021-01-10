//import java.util.List;
//import java.util.ArrayList;
//import java.io.*; 
import java.util.*; 

public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        //return null;
        //separate into 2 halves to perfect shuffle, make new arrays
        int[] halfOne = new int[ arr.length / 2 ];
        int[] halfTwo = new int[ arr.length - arr.length / 2 ];
        //for loop half 1
        for( int i = 0; i < arr.length / 2; i++ ) {
            halfOne[i] = arr[i];
        }
        //for loop half 2      
        for( int i = 0; i < arr.length - arr.length / 2; i++ ) {
            halfTwo[i] = arr[ i + arr.length / 2 ];
        }
        //in same for loop so half 1 and 2 alternate/interweave
        for( int i = 0; i < arr.length / 2; i++ ) {
            //half 2 is 1 index above so they alternate
            arr[ 2 * i + 1] = halfTwo[i];
            arr[ 2 * i ] = halfOne[i];
        }
        //stops at zero
        if( arr.length % 2 != 0 ) {
            arr[ arr.length - 1 ] = halfTwo[ arr.length - arr.length / 2 ];
        }
        //returning altered array
        return arr;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        //return null;
        //i counts down so it runs through the array then stops
        for( int i = arr.length - 1; i >= 0; i-- ) {
            //math.random for random number to be used
            int x = (int)(Math.random() * i);
            int jonny = arr[x];
            arr[x] = arr[i];
            //making the new value the jonny
            arr[i] = jonny;
        }
        //returning altered array
        return arr;

        
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        //code to test perfect shuffle
        int[] cards = {1, 2, 3, 4, 5, 6, };
        cards = perfectShuffle(cards);
        System.out.println(Arrays.toString(cards));
        //code to test selection shuffle
        int[] cards2 = {1, 2, 3, 4, 5, 6, };
        cards2 = selectionShuffle(cards);
        System.out.println(Arrays.toString(cards2));

    }
}
