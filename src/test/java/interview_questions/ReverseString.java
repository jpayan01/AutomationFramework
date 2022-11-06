package interview_questions;

import java.sql.Array;
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello World!";
        System.out.println(reverseWithStringBuilder(str));

        String[] namesOfGirls = {"ama", "ana", "bob"};
//        String[] namesInReverse = Arrays.asList(namesOfGirls); ***OPTIONAL***
        for(int i = Arrays.asList(namesOfGirls).size() -1; i >= 0; i--) {
            System.out.println("names listed in reverse are: " + namesOfGirls[i]);
        }

        String name = "marcela";
        System.out.println(reverseStringTraditionalWay(name));
    }

    private static String reverseWithStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();
    }

    private static String reverseManually(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = str.length()-1; i>0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    private static String reverseStringTraditionalWay(String words){
      String reversed = "";
      int len = words.length();

      for(int i = len -1; i >=0; i--){
        reversed = reversed + words.charAt(i);
      }
      return reversed;
    };
}
