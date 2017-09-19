package diagonaldifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][];
        int diagonal1=0;
        int diagonal2=0;
        for (int i=0; i<n; i++){
            String[] inputValues = sc.nextLine().split(" ");
            arr[i]= Arrays.asList(inputValues).stream().mapToInt(Integer::parseInt).toArray();
            diagonal1=diagonal1+arr[i][i];
            diagonal2=diagonal2+arr[i][n-i-1];
        }
        int difference=diagonal1-diagonal2;
        System.out.println(Math.abs(difference));
	}

}
