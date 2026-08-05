class Solution {
    public int maxRepeating(String sequence, String word) {
        
        String x = word;
        int count = 0;

        while(sequence.contains(x)){
            x+=word;
            count++;
        }

        return count;

    }
}