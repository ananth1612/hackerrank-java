package timeconversion;

import java.util.Scanner;

public class App {

	static String timeConversion(String s) {
		int n  = s.length();
		String[] parts = s.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[0]);
        int newHour = 0;
        char firstChar = parts[2].charAt(2);
        if (firstChar == 'P' && hour != 12)
            parts[0]=Integer.toString(hour+12);
        else if (firstChar == 'A' && hour == 12)
            parts[0] = "00";
        else
            parts[0]=hour<10 ? "0"+Integer.toString(hour) : parts[0];
        return parts[0]+s.substring(2,s.length()-2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
