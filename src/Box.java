import java.util.List;

public class Box<T extends Number, V extends Number> {

            private T item;
            private V externalItem;
            private String boxName;

            public Box(T item, V externalItem , String boxName){
                this.item = item;
                this.externalItem = externalItem;
                this.boxName = boxName;
            }

        public double multiItems(){
                return  item.intValue() * externalItem.doubleValue();}



    public T getItem() {
        return item;
    }
    public T getExternalItem() {
        return item;
    }
            public static <T> void printArray(T[] array) {
                for (T element : array) {
                    System.out.println(element);
                }
            }

            public static <T extends Number> void processNumbers(T num) {
                System.out.println(num.doubleValue());
            }

            public static void addToList(List<? super Integer> list) {
                list.add(123);
                list.add(null);
            }


    public String getBoxName() {
        return boxName;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void setExternalItem(V externalItem) {
        this.externalItem = externalItem;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }
}
