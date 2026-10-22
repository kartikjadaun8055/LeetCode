class Solution {
    public int longestOnes(int[] nums, int k) {
        // int max =0;

        // for( int i=0; i< nums.length; i++){
        //     int zero =0;

        //     for( int j=i; j<nums.length; j++){
        //         if(nums[j] == 0){
        //             zero++;
        //         }

        //         if(zero>k){
        //             break;
        //         }
        //         max = Math.max(max, j-i+1);
        //     }

            
        // }
        // return max;

        int left =0;
        int zero =0;
        int max =0;

        for( int right =0; right< nums.length; right++){
            if(nums[right] == 0){
                zero++;
            }

            while(zero>k){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }

            max = Math.max(max, right-left+1);

        }
        return max;
    }
}