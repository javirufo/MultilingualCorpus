package apps;

import java.io.File;

import xml.es.daedalus.tass.tweets.Tweet;
import xml.es.daedalus.tass.tweets.TweetLoader;
import xml.es.daedalus.tass.tweets.Tweets;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class checkTimelines {

	/**
	 * @param args
	 * Repasa los ficheros de timeline de cada usuario para eliminar duplicados
	 * Lleva a cabo las estadísticas
	 * Crea un nuevo corpus
	 * args0 -> directorio con los timeline
	 * args1 -> fichero salida corpus
	 * args2 -> num_topics 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 3)
		{
			System.out.println("Formato de invocación erróneo. El formato es:");
			System.out.println("java -jar checkTimelines.jar Directorio_timelines fichero_corpus numero_topics");
			return;
		}		
		File dir = new File(args[0]);
		if (!dir.isDirectory())
			return;
		String[] ficheros = dir.list();
		int [][]estadisticas = new int[3][Integer.valueOf(args[2])];
		Tweets tweetsCorpus = new Tweets();
		Tweets tweetsCorpusES = new Tweets();
		Tweets tweetsCorpusEN = new Tweets();
		Tweets tweetsCorpusFR = new Tweets();
		Tweets [] tweetsTopics = new Tweets[Integer.valueOf(args[2])];
		Tweets [][] tweetsLangTopics = new Tweets[3][Integer.valueOf(args[2])];
		for (int i=0; i<tweetsTopics.length; i++)
			tweetsTopics[i] = new Tweets();
		for(int j=0;j<3;j++)
			for (int i=0; i<tweetsTopics.length; i++)
				tweetsLangTopics[j][i] = new Tweets();
		for(int indFile=0; indFile<ficheros.length; indFile++)
		{
			Tweets tweets = TweetLoader.LoadFromXML(args[0]+"/"+ficheros[indFile]);
//Remuevo los duplicados y hago estadísticas			
			List<BigInteger> listaIDs = new ArrayList<BigInteger>();
			Tweets tweetsLimpio = new Tweets();
			for(int indTweet=0; indTweet<tweets.getTweet().size(); indTweet++)
			{
				Tweet tweet = tweets.getTweet().get(indTweet);
				if (!listaIDs.contains(tweet.getTweetid()))
				{
					boolean valido = false;					
					if (tweet.getLang().compareTo("es")==0)
					{
						estadisticas[0][Integer.valueOf(tweet.getTopics().getTopic().get(0))]++;
						tweetsCorpusES.getTweet().add(tweet);
						tweetsLangTopics[0][Integer.valueOf(tweet.getTopics().getTopic().get(0))].getTweet().add(tweet);
						valido=true;
					}
					else
					{
						if (tweet.getLang().compareTo("en")==0)
						{
							estadisticas[1][Integer.valueOf(tweet.getTopics().getTopic().get(0))]++;
							tweetsCorpusEN.getTweet().add(tweet);
							tweetsLangTopics[1][Integer.valueOf(tweet.getTopics().getTopic().get(0))].getTweet().add(tweet);
							valido=true;
						}
						else
							if (tweet.getLang().compareTo("fr")==0)
							{
								estadisticas[2][Integer.valueOf(tweet.getTopics().getTopic().get(0))]++;
								tweetsCorpusFR.getTweet().add(tweet);
								tweetsLangTopics[2][Integer.valueOf(tweet.getTopics().getTopic().get(0))].getTweet().add(tweet);
								valido=true;
							}
					}
					if (valido)
					{
						listaIDs.add(tweet.getTweetid());
						tweetsLimpio.getTweet().add(tweet);
						tweetsTopics[Integer.valueOf(tweet.getTopics().getTopic().get(0))].getTweet().add(tweet);
					}
				}
			}
			TweetLoader.SaveToXML(args[0]+"/"+ficheros[indFile], tweetsLimpio);
			tweetsCorpus.getTweet().addAll(tweetsLimpio.getTweet());
			System.out.println(ficheros[indFile]+"\t"+tweetsLimpio.getTweet().size());
		}
		System.out.println("ESTADISTICAS");
		System.out.print("IDIOMA\t");
		for(int i=0; i<Integer.valueOf(args[2]); i++)
			System.out.print(i+"\t");
		System.out.println();
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<Integer.valueOf(args[2]); j++)
				System.out.print(estadisticas[i][j]+"\t");
			System.out.println();
		}
		TweetLoader.SaveToXML(args[0]+"/"+args[1]+".xml", tweetsCorpus);
		TweetLoader.SaveToXML(args[0]+"/"+args[1]+"-ES.xml", tweetsCorpusES);
		TweetLoader.SaveToXML(args[0]+"/"+args[1]+"-EN.xml", tweetsCorpusEN);
		TweetLoader.SaveToXML(args[0]+"/"+args[1]+"-FR.xml", tweetsCorpusFR);
		for (int i=0; i<tweetsTopics.length; i++)
			TweetLoader.SaveToXML(args[0]+"/"+args[1]+"-TOPIC-"+i+".xml", tweetsTopics[i]);		
		for(int j=0;j<3;j++)
		{
			for (int i=0; i<tweetsTopics.length; i++)
				TweetLoader.SaveToXML(args[0]+"/"+args[1]+"-LANG-"+j+"-TOPIC-"+i+".xml", tweetsLangTopics[j][i]);		
		}
		
	}

}
