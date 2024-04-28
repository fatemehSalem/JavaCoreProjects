public class MyArray implements Comparable<MyArray>{
     int number;
     int index;

    public MyArray(int number , int index){
        this.number = number;
        this.index = index;
    }
    @Override
    public int compareTo(MyArray o) {
        return Integer.compare(this.number, o.number);
    }
}
