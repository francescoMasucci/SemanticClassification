package modsupport;

import java.io.IOException;
import java.util.LinkedList;

import model.Tweet;
import persistence.SentimentAnalyser;

public class Analysis implements SentimentAnalyser{

	@Override
	public double sentiment(Tweet tweet) throws IOException {
		Lexicon lexicon = new Lexicon();
		Tokenizer tokenizer = new Tokenizer();
		LinkedList<String> tokens = tokenizer.getTokens(tweet);
		String[] words = tokens.toArray(new String[0]);
		Double score = 0.0;
		words = tweet.getText().split("\\s+");
		for (String word : words) {
			word = word.replaceAll("([^a-zA-Z\\s])", "");
			if (lexicon.getSentiment(word) == null)
				continue;
			score += lexicon.getSentiment(word);
		}
		return score;
	}

}
