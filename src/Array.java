public class Array {
    private int[] data;
    private int size;

    /**
     * 构造函数，传入数组的容量
     * @param capacity
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参构造，默认容量是10
     */
    public Array(){
        this(10);
    }

    /**
     * 获取数组的长度
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 判断数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size==0;
    }

    /**
     * 向数组尾添加元素
     * @param e
     */
    public void addLast(int e){
        add(size, e);
    }

    /**
     * 向数组头添加元素
     * @param e
     */
    public void addFirst(int e){
        add(0, e);
    }

    /**
     * 向指定位置插入元素
     * @param index
     * @param e
     */
    public void   add(int index, int e){
        if(size==this.data.length){
            throw new IllegalArgumentException("Add failed, Array is full");
        }
        if(index<0 || index>size){
            throw new IllegalArgumentException("Add failed, Require index>=0 and index<=size");
        }
        for(int i=size-1; i>=size; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 获取元素
     * @param index
     * @return
     */
    int get(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Get fail, Index id illegal");
        }
        return this.data[index];
    }

    /**
     * 添加元素
     * @param index
     * @param e
     */
    void set(int index, int e){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Set fail, Index id illegal");
        }
        data[index] = e;
    }

    /**
     * 查找是否含有元素e
     * @param e
     * @return
     */
    public boolean contains(int e){
        for(int i=0; i<size; i++){
            if(this.data[i] == e){
                return true;
            }
        }
        return false;
    }

    /**
     * 查找元素e的下标，没有返回-1
     * @param e
     * @return
     */
    public int find(int e){
        for(int i=0; i<size; i++){
            if(this.data[i] == e){
                return i;
            }
        }
        return -1;
    }

    /**
     * 数组中删除元素，返回被删除的元素
     * @param index
     * @return
     */
    public int remove(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Remove fail, Index id illegal");
        }
        int ref = data[index];
        for(int i=index+1; i<size; i++){
            data[i-1] = data[i];
        }
        size--;
        return ref;
    }

    /**
     * 删除第一个元素
     * @return
     */
    public int removeFirst(){
        return remove(0);
    }

    /**
     * 删除最后一个元素
     * @return
     */
    public int removeLast(){
        return remove(size-1);
    }

    /**
     * 删除第一个元素e
     * @param e
     */
    public void removeElement(int e){
        int index = find(e);
        if(index != -1){
            remove(index);
        }
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Array: size=%d, capacity=%d\n", this.size, this.data.length));
        stringBuilder.append("[");
        for(int i=0; i<size; i++){
            stringBuilder.append(this.data[i]);
            if(i != size-1) stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
