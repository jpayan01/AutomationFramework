package interview_questions;

import java.util.HashMap;
import java.util.Iterator;

public class FIndDuplicates {
    public static void main(String[] args) {
//        String str1 = "I am am learning java java";
        String str1 = "I am am am a a a coder learning java java";
        String str2 = "javaj2ee";

        findDuplicateWords(str1);
        findDuplicateCharacters(str2);
    }

    static void findDuplicateWords(String str){
        String[] s = str.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();

        for(String tempString : s){
            if(hm.get(tempString) != null) {
                hm.put(tempString, hm.get(tempString) + 1);
            } else {
                hm.put(tempString, 1);
            }
        }
        Iterator<String> tempString = hm.keySet().iterator();
        while (tempString.hasNext()){
            String temp = tempString.next();
            if(hm.get(temp) > 1){
                System.out.println("The word " + temp + " appeared " + hm.get(temp) + " no. of times");
            }
        }

    }

    static void findDuplicateCharacters(String str){
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(hm.get(c) != null){
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        System.out.println(hm);
    }
}
