package dynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dynamicArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstInput = sc.nextLine().split(" ");
        int lastAnswer = 0;
        int n = Integer.parseInt(firstInput[0]);
        int qtdQueries = Integer.parseInt(firstInput[1]);
        ArrayList<Integer>[] group = new ArrayList[n];
        
        for(int i=0; i<n; i++) {
        	group[i]=new ArrayList<Integer>();
        }
        
        for (int j=0; j<qtdQueries; j++) {
        	ArrayList<String> inputValues = new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));
        	int query = Integer.parseInt(inputValues.get(0));
        	int numberA = Integer.parseInt(inputValues.get(1));
        	int numberB = Integer.parseInt(inputValues.get(2));
        	int modulo = (numberA^lastAnswer)%n;
        	if (query == 2) {
        		lastAnswer= group[modulo].get((numberB % group[modulo].size()));
        		System.out.println(lastAnswer);
        	}
        	else {
            	group[modulo].add(numberB);
        	}
        } 
	}
}
