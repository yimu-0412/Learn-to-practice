import java.util.Arrays;

public class SeqList {
     public int[] elem;//只定义了一个引用
     public int usedSize;//有效的数据个数

    public SeqList(){
        this.elem = new int[5];
    }
    // 打印顺序表
    public void display() {
        for (int i = 0;i < this.usedSize;i ++){
            System.out.print(this.elem[i] + " ");
        }
    }
    public boolean isFull() {
        if(this.elem.length == this.usedSize){
            return true;
        }
        return false;
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(this.isFull()){
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        if(pos < 0 || pos > this.usedSize){
            return ;
        }
        for(int i = this.usedSize - 1; i >= pos; i -- ){
            this.elem [i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize ++;
    }
    // 判定是否包含某个元素
     public boolean contains(int toFind) {
        boolean flg = true;
         for(int i = 0; i < this.usedSize-1; i ++){
             if(toFind == this.elem[i]){
                 return true;
             }
         }
        return false;
     }
    // 查找某个元素对应的位置
     public int search(int toFind) {
         for(int i = 0; i < this.usedSize-1; i ++){
             if(toFind == this.elem[i]){
                 return i;
             }
         }
        return -1;
     }
    // 获取 pos 位置的元素
     public int getPos(int pos) {
         if(pos < 0 || pos > this.usedSize){
             return -1;
         }
         return this.elem[pos];
     }
    // 给 pos 位置的元素设为 value
     public void setPos(int pos, int value) {
         if(pos < 0 || pos > this.usedSize){
             System.out.println("pos位置不合法 ");
             return ;
         }
         this.elem[pos] = value;
     }
    // 删除第一次出现的关键字key
     public void remove(int key) {
         int index = this.search(key);
         if(index == -1){
             System.out.println("没有key这个关键字");
         }
         for(int i = index;i < this.usedSize-1;i++){
             this.elem[i] = this.elem[i+1];
         }
         this.usedSize--;
     }
    // 获取顺序表长度
     public int size() {
         return this.elem.length;
     }
    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

}
