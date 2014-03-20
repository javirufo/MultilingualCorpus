package apps;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import xml.es.daedalus.tass.tweets.Tweet;
import xml.es.daedalus.tass.tweets.TweetLoader;
import xml.es.daedalus.tass.tweets.Tweets;

public class buildTrainAndSetCorpus {

	
	public static void generateTrainTest(String file, List<Tweet> train, List<Tweet> test, double trainPercent)
	{
		Tweets tweetsFile = TweetLoader.LoadFromXML(file);
		int trainTweets = (int) (trainPercent * tweetsFile.getTweet().size());
		System.out.println(trainTweets);
		Collections.shuffle(tweetsFile.getTweet());
		for(int i=0; i<trainTweets; i++)
			train.add(tweetsFile.getTweet().get(i));
		int tope = tweetsFile.getTweet().size();
		for(int i=trainTweets; i<tope; i++)
			test.add(tweetsFile.getTweet().get(i));
	}
	/**
	 * @param args
	 * args[0] - directorio ficheros tweets
	 * args[1] - numero idiomas
	 * args[2] - numero topics
	 * args[3] - % para train
	 * args[4] - fichero train
	 * args[5] - fichero test
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//corpus-LANG-X-TOPIC-Y
		if (args.length != 6)
		{
			System.out.println("Formato de invocación erróneo. El formato es:");
			System.out.println("java -jar buildTrainAndSetCorpus.jar Directorio_Ficheros_Tweets numero_idiomas numero_topics porcentaje_train fichero_train fichero_test");
			return;
		}
		Tweets CorpusTrain = new Tweets();
		Tweets CorpusTest = new Tweets();
		int topics = Integer.valueOf(args[2]);
		int idiomas = Integer.valueOf(args[1]);
		for(int indTopic=0; indTopic<topics;indTopic++)
		{
			for(int indIdioma=0; indIdioma<idiomas; indIdioma++)
			{
				System.out.println("corpus-LANG-"+indIdioma+"-TOPIC-"+indTopic);
				buildTrainAndSetCorpus.generateTrainTest(args[0]+"/"+"corpus-LANG-"+indIdioma+"-TOPIC-"+indTopic+".xml", CorpusTrain.getTweet(), CorpusTest.getTweet(), Double.valueOf(args[3]));				
			}
		}
		
		TweetLoader.SaveToXML(args[0]+"/"+args[4]+".xml", CorpusTrain);
		TweetLoader.SaveToXML(args[0]+"/"+args[5]+".xml", CorpusTest);
	}

}
