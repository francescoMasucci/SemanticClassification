package persistence;

import java.io.IOException;

import model.Tweet;

public interface SentimentAnalyser {
	double sentiment(Tweet tweet) throws IOException;
}
