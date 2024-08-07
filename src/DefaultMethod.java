public interface DefaultMethod {

     default  void fromDefaultMethod(){
        System.out.println("from Default Method");}

    void fromImplementedMethod();
}
