class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int p1 = 0;
        int p2 = numbers.length -1;

        int[] ans = new int[2];

        int n = numbers.length;

        for(int i =0 ; i<n ; i++ ){
            int val1 = numbers[p1];
            int val2 = numbers[p2];

            int sum = val1 + val2 ;

            if(sum>target){
                p2--;
            }else if(sum < target){
                p1++;
            }else if(sum == target){
                ans[0] = p1+1;
                ans[1] = p2+1;
                break;
            }
        }
        return ans;
    }
}