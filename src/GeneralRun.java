public class GeneralRun {
    public static void main(String[] args) {
        Parent p = new Child(); //UpCasting
       if(p instanceof Child){
           Child c = (Child) p;
           c.showChild();
       } else{
           System.out.println("p is not instance of Child");
       }
    }
}
