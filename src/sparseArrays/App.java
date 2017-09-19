package sparseArrays;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int nStrings = sc.nextInt();
        sc.nextLine();
        String[] words = new String[nStrings];
        for (int i=0; i<nStrings; i++)
            words[i]=sc.nextLine();

        int nQueries = sc.nextInt();
        sc.nextLine();
        String[] lookupWords = new String[nQueries];
        for (int j=0; j<nQueries; j++){
            lookupWords[j]=sc.nextLine();
        }
        
        for(int i=0; i<nQueries; i++){
            int contagem = 0;
            for(int j=0; j<nStrings; j++)
                if (words[j].trim().equals(lookupWords[i]))
                    contagem++;
            System.out.println(contagem);
        }
    }

}
