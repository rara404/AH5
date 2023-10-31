import java.util.HashMap;
import java.util.Map;

class Solution {
    public static char mostFrequentChar(String s) {

        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> frequency = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(frequency.containsKey(s.charAt(i))){
                frequency.put(s.charAt(i), frequency.get(s.charAt(i))+1);
                if(frequency.get(s.charAt(i)) >= max){
                    max = frequency.get(s.charAt(i));
                }
            } else {
                frequency.put(s.charAt(i), 1);
            }

        }


        for (Map.Entry x : frequency.entrySet()) {
            if((int)x.getValue() == max)
                return (char)x.getKey();
        }
        return 0;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeepeoooor")); // -> 'e'
    }

  }
