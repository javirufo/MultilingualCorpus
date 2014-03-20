package apps;

import corpus.Corpus;
import timelineutils.timelineutils;
import xml.es.daedalus.tass.tweets.TweetLoader;
import xml.es.daedalus.tass.tweets.Tweets;

public class getTimelines {

	/**
	 * @param
	 * args[0] - Fichero usuarios
	 * args[1] - Fichero salida tweets corpus
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2)
		{
			System.out.println("Formato de invocación erróneo. El formato es:");
			System.out.println("java -jar getTimelines.jar Fichero_usuarios fichero_tweets");
			return;
		}		
		Corpus corpus = new Corpus();
		corpus.build(args[0], args[1]);
	
	}

}
