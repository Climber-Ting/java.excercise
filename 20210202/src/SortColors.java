import java.util.*;
/*
    给定一个包含红色、白色和蓝色，一共n个元素的数组，原地对它们进行排序，
    使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
    此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
示例 1：
    输入：nums = [2,0,2,1,1,0]
    输出：[0,0,1,1,2,2]
示例 2：
    输入：nums = [2,0,1]
    输出：[0,1,2]
示例 3：
    输入：nums = [0]
    输出：[0]
示例 4：
    输入：nums = [1]
    输出：[1]
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int j=0,k=0,m=0;
        for(int i=0;i<nums.length;i++){
            switch (nums[i]){
                case 0:{
                    j++;
                    break;
                }
                case 1:{
                    k++;
                    break;
                }
                case 2:{
                    m++;
                    break;
                }
            }
        }
        for(int i=0;i<j;i++){
            nums[i]=0;
        }
        for(int i=j;i<j+k;i++){
            nums[i]=1;
        }
        for(int i=j+k;i<j+k+m;i++){
            nums[i]=2;
        }
    }
}
