import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numStrings = in.nextInt();
        //System.out.println(numStrings);
        for(int i = 0; i < numStrings; i++){
            String word = in.next();
            String evenString = "";
            String oddString = "";
            for(int j = 0; j<word.length(); j++){
                if(j%2==0){//even number
                    evenString = evenString+word.charAt(j);//concatenate to even
                }
                else
                    oddString= oddString+word.charAt(j);
            }
            System.out.print(evenString);
            System.out.print(" ");
            System.out.print(oddString);
            System.out.println();
        }
    }
}