public class Main {
    public static void main(String[] args){
        Array array = new Array(20);
        for(int i=0; i<10; i++){
            array.addLast(i);
        }
        System.out.println(array);

        array.set(9,0);
        System.out.println(array);

        array.remove(3);
        System.out.println(array);

        array.removeLast();
        System.out.println(array);

        array.addFirst(100);
        System.out.println(array);
    }
}
