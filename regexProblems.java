package com.regex;
import java.util.regex.*;
import java.util.Scanner;

public class regexProblems {

    String firstName ;

    Scanner sc = new Scanner(System.in);

    public void validate_first_name(){
        System.out.println("\nEnter First Name (It should start with Capital Letter and have atleast 3 letters)");
        firstName = sc.nextLine();

        boolean validFirstName = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();

        if(validFirstName){
            System.out.println("\nFirst Name is valid");
        }
        else{
            System.out.println("\nFirst Name is not valid. \nEnter again");
            validate_first_name();
        }

    }

    public static void main(String[] args) {
        // write your code here

        regexProblems user = new regexProblems();

        user.validate_first_name();
    }
}
