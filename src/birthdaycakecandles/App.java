package birthdaycakecandles;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	static int birthdayCakeCandles(int n, int[] ar) {
        int max = ar[0];
        int freq = 1;
        for (int i=1; i<n; i++) {
        	if (ar[i]>max) {
        		max = ar[i];
        		freq=1;
        	}
        	else if(ar[i]==max)
        		freq++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
