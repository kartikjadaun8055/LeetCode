class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max =0;
       for(int i =0; i< s.length(); i++){
        char ch = s.charAt(i);
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    count++;
                }

            if(i>=k){
                char old = s.charAt(i-k);
                if (old == 'a' || old == 'e' || old == 'i' ||
                    old == 'o' || old == 'u') {
                    count--;
                }
            }
            if(i>=k-1){
                max = Math.max(count , max);
            }
       }
       return max;
        
    }
}