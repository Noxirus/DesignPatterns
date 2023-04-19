package StringManipulation;

import java.util.*;

public class StringManipulation {
    public static int countVowels(String string){
        if(string == null)
            return 0;

        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'o', 'u', 'i'));
        int numOfVowels = 0;
        for(var ch : string.toCharArray()){
            if(vowels.contains(Character.toLowerCase(ch)))
                numOfVowels++;
        }

        return numOfVowels;
    }

    public String reverseString(String string){
        StringBuilder builder = new StringBuilder();
        for(int i = string.length() - 1; i >=0; i--){
            builder.append(string.charAt(i));
        }

        return builder.toString();
    }

    public String reverseSentenceOrder(String string){
        String[] allStrings = string.split(" ");
        StringBuilder builder = new StringBuilder();

        for(int i = allStrings.length - 1; i >= 0; i--){
            builder.append(allStrings[i]);
            if(i != 0){
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    public String removeDuplicates(String string){
        if(string == null) return null;

        HashSet<Character> uniqueSet = new HashSet<Character>();
        StringBuilder builder = new StringBuilder();

        for(var ch : string.toCharArray()){
            if(!uniqueSet.contains(ch)){
                builder.append(ch);
                uniqueSet.add(ch);
            }
        }

        return builder.toString();
    }

    public Character findMostRepeatedCharacter(String string){
        HashMap<Character, Integer> map = new HashMap<>();
        for(var ch : string.toCharArray()){
            if(map.containsKey(ch)){
                int currentValue = map.get(ch);
                currentValue++;
                map.put(ch, currentValue);
            }
            else{
                map.put(ch, 0);
            }
        }

        Character highestChar = ' ';
        Integer highestAmount = 0;
        for(Map.Entry<Character, Integer> keyValue : map.entrySet()){
            if(keyValue.getValue() > highestAmount){
                highestChar = keyValue.getKey();
                highestAmount = keyValue.getValue();
            }
        }
        return highestChar;
    }

    public String upperCaseTrim(String string){
        String[] strings = string.split(" ");
        List<String> formattedStrings = new ArrayList<>();
        for(String str : strings){
            boolean firstChar = true;
            if(str != ""){
                StringBuilder builder = new StringBuilder();
                for(Character chr : str.toCharArray()){
                    if(firstChar){
                        builder.append(Character.toUpperCase(chr));
                        firstChar = false;
                    }
                    else{
                        builder.append(chr);
                    }
                }
                formattedStrings.add(builder.toString());
            }
        }
        StringBuilder builder = new StringBuilder();
        for(String str : formattedStrings){
            builder.append(str + " ");
        }

        return builder.toString().trim();
    }

    public static boolean isPalindrome(String word){
        int left = 0;
        int right = word.length() - 1;
        while(left < right)
            if(word.charAt(left++) != word.charAt(right--))
                return false;

        return true;
    }
}
