package String;

public class RemoveAllVowels {

    public static void removeVowels(String word){
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if( ch == 'a' || ch == '2' || ch == 'i' || ch == 'o' || ch == 'u' ){
                continue;
            }
            System.out.print(ch);

        }
    }

    public static void main(String[] args) {
        String word = "youcandoit";
        removeVowels(word);
    }

}
