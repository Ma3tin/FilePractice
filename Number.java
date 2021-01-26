package filePractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Number {
    public static void main(String[] args) {
        boolean error = true;
        int total = 0;
        String replaced = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("in.txt"));
            String number = br.readLine();
            while (number != null) {
                if (number.contains("N")) {
                    replaced = number.replaceAll("N ", "-");
                }
                if (number.contains("P")) {
                    replaced = number.replaceAll("P ", "+");
                }
                total += Integer.parseInt(replaced);
                number = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(total);
    }
}

                /*while (!number.equals("")) {
                number = br.readLine();
                int replacedNumber = Integer.parseInt(number.replaceAll("N " ,"-"));
                replacedNumber = Integer.parseInt(number.replaceAll("P " ,"+"));
                total += replacedNumber;
                }*/