package modsupport;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

import model.Tweet;

public class Tokenizer {
   
    public LinkedList<String> getTokens (Tweet tweet) throws IOException {
        String text = TextNormalizer.getTweetWithoutUrlsAnnotations(tweet.getText());
        //altre eventuali modifiche sul testo
        return getTokens(text);
    }

    
    public LinkedList<String> getTokens (String text) {
        LinkedList<String> tokens = new LinkedList<String>();
        String[] words = text.split(" ");
        tokens.addAll(Arrays.asList(words));
        return tokens;
    }
}