package JAVA_Interview_programs;

public class first_nonrepeating_char {
    //finding first non repeating char from string
    public static void main(String[] args) {
        String str = "hello worldh";

        char firstnonrepeating='A';
        char[] ch = str.trim().replace(" ","").toLowerCase().toCharArray();
        for(int i=0;i<ch.length;i++){
            char unique = ch[i];
            boolean isunique = true;
            for(int j=0;j<ch.length;j++){
                if(i!=j && unique==ch[j]){
                    isunique= false;
                    break;
                }
            }
            if(isunique){
                firstnonrepeating = unique;
                break;

            }

        }
        System.out.println("First non repeating char is: "+firstnonrepeating);
    }
}
