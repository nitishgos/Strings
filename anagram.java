import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] str1Array=str1.toCharArray();
            char[] str2Array=str2.toCharArray();
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            boolean result=Arrays.equals(str1Array,str2Array);
            if(result){
                System.out.println("The string are anagrams");
            }else{
                System.out.println("The string are not anagrams");
            }
        }
    }
}
