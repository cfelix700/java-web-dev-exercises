package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String prompt = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String userWord;
        Scanner inputLength = new Scanner(System.in);
        System.out.println("Enter a word to see if it's in the sentence: ");
        userWord = inputLength.next();
        if(prompt.toLowerCase().contains(userWord.toLowerCase())){
            System.out.println("This prompt contains the word " + userWord +"!");
        }else{
            System.out.println("This prompt does not contain the word " + userWord +"!");
        }

    }
}
