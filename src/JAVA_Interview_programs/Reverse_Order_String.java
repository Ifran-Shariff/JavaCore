package JAVA_Interview_programs;

public class Reverse_Order_String {
    public static  void main(String[] args){
        String str = "I am Ifran";
        String[] words = str.split(" ");
        String reverse = "";
        for(int i=words.length-1;i>=0;i--){
            reverse+=words[i]+" ";
        }
        System.out.println("String in reverse: "+reverse);
    }
}
