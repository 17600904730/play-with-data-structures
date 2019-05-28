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
}
