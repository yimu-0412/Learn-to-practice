package heapsort;

import java.util.Arrays;

/**
 * @author wangyimu
 * @create 2021-07-26-19:21
 */

public class HeapSort {
    public int[] elem;
    public int usedSize ;

    public HeapSort() {
        this.elem = new int[10];
    }

    /*
     * 建大堆
     */
    public void createHeap(int[] arr){

        for(int i  = 0; i < arr.length; i++){
            this.elem[i] = arr[i];
            this.usedSize ++;
        }
        // 1.parent 代表每棵子树的根节点
        for(int parent = (arr.length -1 -1)/2; parent >= 0;parent -- ){
            // 2. 每次结束的位置应该是：this.usedsize
            adjustDown(parent,this.usedSize);
        }
    }

    public void adjustDown(int root,int len){
        int parent = root;
        int child = 2 * parent + 1;

        while(child < len){
            // 找到左右孩孩子的最大值
            // 1. 前提是有右孩子
            if(child + 1 < len && this.elem[child] < this.elem[child + 1]){
                child ++;
            }
            // 保证，child下标的数据，一定是左右孩子的最大值的下标
            if(this.elem[child] > this.elem[parent]){
                /*
                int tmp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = tmp;
                */
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;

                parent = child;
                child = 2 * parent + 1;
            }else{
                break;
            }
        }
    }
    /*
       1.先创建大堆，调整每棵树
       2.交换堆顶元素和队尾元素
       3.向下调整
       4.对堆元素下标减1，直到0为止
       注：2.3.4步在循环体中
    */
    public void heapSort(){
        int end =  this.usedSize - 1;
        while(end > 0){
            int temp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = temp;
            adjustDown(0,end);
            end --;
        }
    }
}
