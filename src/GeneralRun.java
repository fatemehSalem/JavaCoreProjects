public class GeneralRun {
    public static void main(String[] args) {
        Parent p = new Child(); //UpCasting
       // p.showChild(); we dont access to Child's method
        p.showParent();
        p.show();
    }
}
