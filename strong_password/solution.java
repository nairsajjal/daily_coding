import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0;
       String numbers = "0123456789";
       String lower_case = "abcdefghijklmnopqrstuvwxyz";
       String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String special_characters = "!@#$%^&*()-+";

       boolean num = false,lowerCase= false, upperCase=false, specialChar=false;

       int min_length = 6;

       for(int i=0; i<password.length(); i++){
           if(numbers.indexOf(password.charAt(i))>=0){
               num = true;
           }

           if(lower_case.indexOf(password.charAt(i))>=0){
               lowerCase = true;
           } 

           if(upper_case.indexOf(password.charAt(i))>=0){
               upperCase = true;
           }

           if(special_characters.indexOf(password.charAt(i))>=0){
               specialChar = true;
           }

       }

       if(num != true) count++;
       if(lowerCase != true) count++;
       if(upperCase != true) count++;
       if(specialChar != true) count++;
        
       if((password.length()+count) < min_length){
           count = count + (min_length - (password.length()+count));
       }

       return count; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
