package sort;

import java.util.Arrays;

public class ReverseArray {
	
	
	//An array will be sorted in descending you need to change the code to sort it in ascending
	public static void main(String args[]){
		int[] input = {10, 9, 8, 7, 6, 5};

        Arrays.sort(input);
        //asscending
        for (int a : input)
        {
            System.out.println(a);
        }
        
            System.out.println("");
            
        int c=input.length-1;
        //descending
        for (int i = 0; i < input.length/2; i++)
        {
        	int tmp = input [i];
        	input[i] = input[c] ;
        	input[c] = tmp;
        	c--;
    
        }
        System.out.println("");
        for (int a : input)
        {
            System.out.println(a);
        }
	}

}
