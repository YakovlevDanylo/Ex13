import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for(int i = 0; i < jewels.length(); i++) {
            for(int j = 0; j < stones.length(); j++) {
                if(jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i ++) {
            for(int j = i + 1; j < nums.length; j ++) {
                if((nums[i] == nums[j]) && (i < j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> balloonCharFreq = new HashMap<>();
        balloonCharFreq.put('b', 1);
        balloonCharFreq.put('a', 1);
        balloonCharFreq.put('l', 2);
        balloonCharFreq.put('o', 2);
        balloonCharFreq.put('n', 1);

        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if (balloonCharFreq.containsKey(ch)) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }

        int maxInstances = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : balloonCharFreq.entrySet()) {
            char ch = entry.getKey();
            int requiredCount = entry.getValue();
            if (charCount.containsKey(ch)) {
                maxInstances = Math.min(maxInstances, charCount.get(ch) / requiredCount);
            } else {
                return 0;
            }
        }

        return maxInstances;

    }
}
