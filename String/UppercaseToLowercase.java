package String;

public class UppercaseToLowercase {

    public static void uppercaseToLowercase(String word){
        char [] s = word.toCharArray();

        
        for(int i = 0; i < s.length; i++){
            char ch = s[i];
            if(ch >= 'A' && ch <= 'Z'){
                char ans = (char)(ch -'A'+'a');
                s[i] = ans;
            }
        }

        for (char c : s) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        String word = "weLcOmE";
        uppercaseToLowercase(word);
    }
}
