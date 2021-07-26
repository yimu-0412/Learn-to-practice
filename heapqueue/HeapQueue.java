package heapqueue;

import java.util.Arrays;

/**
 * @author wangyimu
 * @create 2021-07-23-21:27
 */
public class HeapQueue {
    public int[] elem;
    public int usedSize ;

    public HeapQueue() {
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
       过程（以大堆为例）：
        1. 首先按尾插方式放入数组
        2. 比较其和其双亲的值的大小，如果双亲的值大，则满足堆的性质，插入结束
        3. 否则，交换其和双亲位置的值，重新进行 2、3 步骤
        4. 直到根结点
    */
    public void push(int val){
        // 扩容
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2 * this.elem.length);
        }

        this.elem[usedSize ++] = val;
        shiftUp(this.usedSize - 1);// 最后一个子节点下标
    }


    public boolean isFull(){
        return this.usedSize == this.elem.length;
    }

    /*
        向下调整:让调整的结点与其孩子节点进行比较
        向上调整:让调整的结点与其父亲结点进行比较
    */
    public void shiftUp(int child){
        int parent = (child - 1)/2;
        while(child > 0){
            if(this.elem[child] > this.elem[parent]){
                int temp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = temp;
                child = parent;
                parent = (child - 1)/ 2;
            }else{
                break;
            }
        }
    }

    public boolean isEmpty(){
        return this.usedSize == 0;
    }

    public void pop(){
        if(isEmpty()){
            return;
        }
        int temp = this.elem[0];
        this.elem[0] = this.elem[usedSize - 1];
        this.elem[usedSize - 1] = temp;
        this.usedSize --; //  减完之后相当于删除
        adjustDown(0,this.usedSize);

    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("堆为空");
        }
        return this.elem[0];
    }



    public void heapSort(){
        int end =  this.usedSize - 1;
        while(end > 0){
            int temp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = temp;
            //adjustDown(0,end);
            end --;
        }
    }
}















































