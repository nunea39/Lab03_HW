package com.mycompany.lab03_hw;

/**
 * Homework
 *
 * @author Andry Nunez
 */
public class Homework {
    
    public static int getLargest(int arr[], int sz){
        
        int iterate1 = 0; // O(1)
        int iterate2 = 0; // O(1)
        int largest = 0;  // O(1)
    
        while(iterate1 < sz - 1) {  // O(n)
            iterate2++;             // O(1)
            
            if(iterate2 == sz) {        // O(n)
                iterate1++;             // O(1)
                iterate2 = iterate1;    // O(1)
                continue;               
            }

            int product = arr[iterate1] * arr[iterate2]; //O(1)
            
            if(product > largest)  // O(1)
                largest = product; // 0(1)
        }
        
        return largest; //O(1)
}
    /*
        dropping constants and using highest order this algorithm is O(n).
    */
}

