
        public class Box<T extends Number, V extends Number> {

            private T item;
            private V externalItem;

            public Box(T item, V externalItem){
                this.item = item;
                this.externalItem = externalItem;
            }
            public T getItem() {
                return item;
            }
            public T getExternalItem() {
                return item;
            }

            public double multiItems(){
                return  item.doubleValue() * externalItem.doubleValue();
            }

            public static <T> void printArray(T[] array) {
                for (T element : array) {
                    System.out.println(element);
                }
            }
        }
