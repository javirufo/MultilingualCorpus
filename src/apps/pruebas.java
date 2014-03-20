package apps;

import xml.es.daedalus.tass.tweets.TweetLoader;

public class pruebas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("train: "+TweetLoader.LoadFromXML(args[0]).getTweet().size());
		System.out.println("test: "+TweetLoader.LoadFromXML(args[1]).getTweet().size());
	}

}
