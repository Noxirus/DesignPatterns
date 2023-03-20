package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCharacters {
    public char firstRepeated(String string){
        Set<Character> characterSet = new HashSet<>();

        for(char ch : string.toCharArray()){
            if(characterSet.contains(ch))
                return ch;

            characterSet.add(ch);
        }

        return Character.MIN_VALUE;
    }

    public char firstUnique(String string){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : string.toCharArray()){
            Integer value = 1;
            if(map.containsKey(ch)){
                value = map.get(ch);
                value++;

            }

            map.put(ch, value);
        }

        for(char ch : string.toCharArray()){
            if(map.get(ch) == 1 && ch != ' '){
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }
}
