/*
*使用二维数组打印一个10行杨辉三角
*
* 【提示】
*   1.第一行由1个元素，第n行有n个元素
*   2.第一行第一个元素和最后一个元素都是1
*   3.从第三行开始对于非第一个和最后一个元素的元素。即：
*      yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]
*/

public class YanghuiTriangle {
    public static void main(String[] args) {
        //1.声明并初始化二维数组
        int[][] yanghui = new int[10][];
        //2.给数组元素赋值
        for(int i = 0; i < yanghui.length; i ++){
            yanghui[i] = new int[i + 1];
            //2.1 给首末元素赋值
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            //2.2 给每行的非首末元素赋值
            if(i > 1){
                for(int j = 1;j < yanghui[i].length-1;j ++){
                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                }
            }
        }
        //3.遍历二维数组
        for(int i = 0; i < yanghui.length; i++){
            for(int j = 0; j < yanghui[i].length; j++){
                System.out.print(yanghui[i][j] + "  ");
            }
            System.out.println();
        }
    }
}