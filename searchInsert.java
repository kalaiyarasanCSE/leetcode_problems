class Solution {
    public int searchInsert(int[] nums, int target) {
int num=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            return i;
       
        }
        else{
            if(nums[i]>target){
                return i;
              
            }else{ 
                for(int k=0;k<nums.length;k++){
        if(nums[k]!=target){
            num=nums.length;
        }

            }
        }
       }
      
       
        
    } return num;
}}
