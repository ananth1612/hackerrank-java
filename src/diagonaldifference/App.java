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
        ArrayList<Integer>[] arr = new ArrayList[n];
        int diagonal1=0;
        int diagonal2=0;
        int count1=0;
        int count2=n-1;
        for (int i=0; i<n; i++){
            arr[i]=new ArrayList<Integer>();
            ArrayList<String> inputValues = new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));
            arr[i]= (ArrayList<Integer>) inputValues.stream().map(s-> Integer.parseInt(s)).collect(Collectors.toList());
            diagonal1=diagonal1+arr[i].get(count1);
            diagonal2=diagonal2+arr[i].get(count2);
            count1++;
            count2--;
        }
        int difference=diagonal1-diagonal2;
        System.out.println(Math.abs(difference));
	}

}
