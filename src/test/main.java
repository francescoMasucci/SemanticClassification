package test;

import java.io.IOException;

import model.Tweet;
import modsupport.Analysis;


public class main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Analysis a = new Analysis();
		Tweet tweet = new  Tweet();
		//esempio di tweet relativo al brand Barilla rilevato il 1 ottobre
		tweet.setText("I hate bigotry in my pasta - no Barilla for me @barillaUS @Barilla  #boicottabarilla #boycottbarilla");
		double score = a.sentiment(tweet);
		System.out.print(score);
	}

}
