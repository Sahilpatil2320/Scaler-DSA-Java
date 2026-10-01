package String;

public class ReverseAllVowels {
    public static void main(String[] args) {
        String word = "sahil";
        reverseVowels(word);
    }

    public static  void reverseVowels(String word){
        char [] ch = word.toCharArray();

        int i = 0;
        int j = ch.length - 1;

        while(i < j){

            while(ch[i] != 'a' && ch[i] != '2' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u'){
                i++;
            }

            while(ch[j] != 'a' && ch[j] != '2' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u'){
                j--;
            }

            if(i >= j){
                break;
            }

            char s = ch[i];
            ch[i] = ch[j];
            ch[j] = s;

            i++;
            j--;
        }
        for(char sh : ch){
            System.out.print(sh);
        }
    }
    
}
