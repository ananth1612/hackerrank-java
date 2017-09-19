package sparseArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String,Integer> inputMap = new HashMap<>(n);
        
        for (int i=0; i<n; i++){
            String stringInput = sc.next();
            
            Integer count = inputMap.get(stringInput);
            if(count == null){
                count = 0;
            }
            count++;
            inputMap.put(stringInput,count);
        }
        
        int nQuery = sc.nextInt();
        sc.nextLine();
        
        for (int j=0; j<nQuery; j++){
            String query = sc.next();
            
            Integer count = inputMap.get(query);
            
            if (count == null){
                count=0;
            }
            
            System.out.println(count);
        }
    }
}
