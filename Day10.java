import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countOnes(n));
    }
    
    public static int countOnes(int n){
        List<Integer> binFormOrder = convertToBinary(n);
        int numOnes = 0;
        int maxSize = 0;
        for(int i = 0; i<binFormOrder.size(); i++){
            if(binFormOrder.get(i)==1){
                numOnes++;
                if(numOnes>maxSize)
                    maxSize = numOnes;
            }
            else
                numOnes = 0;
            
        }
        return maxSize;
    }
    
    public static List convertToBinary(int n){
        List<Integer> binaryForm = new LinkedList();
        while(n>0){
            int remainder = n%2;
            n = n/2;
            
            binaryForm.add(remainder);
        }
        
        List<Integer> binaryFormOrder = new LinkedList();
        for(int i = binaryForm.size() - 1; i>=0; i--){
            binaryFormOrder.add(binaryForm.get(i));
        }
        
        return binaryFormOrder;
    }
}