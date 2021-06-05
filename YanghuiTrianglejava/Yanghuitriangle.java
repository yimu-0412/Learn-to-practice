import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows){
        if(numRows == 0){
            return null;
        }
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);//当前行第一个元素是1
        ret.add(list);//把第一行处理完

        //从第二行进行处理
        for(int i = 1; i < numRows; i ++){

            //获取上一行
            List<Integer> prevRow = ret.get(i - 1);
            //新建当前行
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);

            //当前行中间位置的值 = 上一行当前列 + 上一行前一列的值
            for(int j = 1; j < i; j ++){
                int val = prevRow.get(j) + prevRow.get(j - 1);
                curRow.add(val);
            }
            curRow.add(1);//当前行最后一个元素是1
            //放入当前行
            ret.add(curRow);
        }
        return ret;
    }
}

public class YangHuiTriangle {
    public static void main(String[] args) {
        Solution soul = new Solution();
        System.out.println(soul.generate(5));
    }

}