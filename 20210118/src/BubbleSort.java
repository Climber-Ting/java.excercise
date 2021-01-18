import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={1,2,7,5,3,6,8,4};
        boolean flag=true;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
                flag=false;
            }
            if(flag==true){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
