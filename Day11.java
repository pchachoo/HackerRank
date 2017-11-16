import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = maxhgSum(arr);
        System.out.println(max);
    }
    
    public static int maxhgSum(int[][] arr){
        int max = -9*7;
        for(int i = 0; i< 4; i++){
            for(int j =0; j< 4; j++){
                int hgSum = hgSum(i, j, arr);
                //System.out.println("sum of index "+i+" "+j+" is "+hgSum);
                if(hgSum>max)
                    max = hgSum;
            }
        }
        return max;
    }
    
    public static int hgSum(int i, int j, int[][] arr){
        int hgSum = 0;
        
        hgSum = arr[i][j]+ arr[i][j+1]+arr[i][j+2];
        hgSum += arr[i+1][j+1];
        hgSum += arr[i+2][j]+ arr[i+2][j+1]+arr[i+2][j+2];
        
        return hgSum;
    }
}
