class Solution {
    public static  int removeDuplicates(int[] nums) {
        int p = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[p+1]=nums[i];
                p++;
            }
        }
        return p + 1;
    }
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println(k);
        System.out.print("{");
        for(int i=0;i<k;i++) {
            System.out.print(nums[i]);
        }
        System.out.println("}");
    }
}