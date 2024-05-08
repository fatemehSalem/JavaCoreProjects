public class RunnableClass {

    public static StringBuilder reverseWords(String s) {
        String[] splitString = s.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = splitString.length - 1 ; i >= 0 ; i--){
            if(i == 0)
                stringBuilder.append(splitString[i]);
            else
                stringBuilder.append(splitString[i]).append(".");

        }
        return stringBuilder;
    }
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";

        StringBuilder result = reverseWords(s);
        System.out.println("missing number is: " + result);
    }
}

