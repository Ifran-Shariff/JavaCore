package JAVA_Interview_programs;

public class count_vowels_consonants {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowelcount = 0;
        int consonantcout = 0;
        char[] ch = str.trim().replace(" ","").toLowerCase().toCharArray();
        for(char c: ch){
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
                vowelcount++;
            }
                else
                    consonantcout++;

            }
        System.out.println("vowel count is "+vowelcount);
        System.out.println("consontant count is "+consonantcout);
        }
}
