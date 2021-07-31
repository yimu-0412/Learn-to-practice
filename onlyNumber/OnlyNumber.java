package onlyNumber;


import java.util.HashSet;

/**
 * @author wangyimu
 * @create 2021-07-31-21:04
 *  只出现一次的数字
 *     给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
 *     找出那个只出现了一次的元素。
 */
public class OnlyNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length; i ++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        for(int i = 0;i < nums.length; i ++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1};
        OnlyNumber o =new OnlyNumber();
        int ret = o.singleNumber(arr);
        System.out.println(ret);
    }
}
