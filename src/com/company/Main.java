package com.company;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

        public class Main {
            public static void main(String[] args)
            {

                // Get the regex to be checked
                String regex = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+";
                String regex1="91[0-9]+";
                List<String> emails = new ArrayList<String>();
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();


                Pattern pattern
                        = Pattern.compile(regex);
                Pattern pattern1
                        = Pattern.compile(regex1);






                Matcher matcher
                        = pattern
                        .matcher(s);
                Matcher matcher1
                        = pattern1
                        .matcher(s);

                MatchResult result
                        = matcher.toMatchResult();
                System.out.println("Current Matcher: "
                        + result);
                MatchResult result1
                        = matcher.toMatchResult();
                System.out.println("Current Matcher: "
                        + result1);

                while (matcher.find()) {

                    System.out.println(matcher.group());
                }
                while (matcher1.find()) {

                    System.out.println(matcher1.group());
                }
            }
        }


     