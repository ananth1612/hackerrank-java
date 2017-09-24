package minimaxsum;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i < 5; i++){
            arr[i] = in.nextInt();
        }
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long sum = Arrays.stream(arr).sum();
        for (int j=0; j<5; j++) {
        	if (arr[j] < min)
        		min = arr[j];
        	else 
        		max = arr[j];
        }
        
        System.out.println((sum-max) + " " + (sum-min));
	}

}
