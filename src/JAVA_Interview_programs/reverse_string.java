package JAVA_Interview_programs;

public class reverse_string {
    public static  void main(String[] args){
        String str = "hello world";
        char[] ch = str.toCharArray();
        String rev = "";
        for(int  i=ch.length-1;i>=0;i--){
            rev+= ch[i];
        }
        System.out.println(rev);
    }
}
