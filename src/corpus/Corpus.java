package corpus;
import java.util.List;

import timelineutils.timelineutils;
import xml.es.daedalus.tass.tweets.Tweet;
import xml.es.daedalus.tass.tweets.Topics;
import xml.es.daedalus.tass.tweets.TweetLoader;
import xml.es.daedalus.tass.tweets.Tweets;




public class Corpus {
	
	public Corpus(){
		
	}
	

	public void build(String usersfile, String outputFile){
		System.out.println("Creando corpus");
		userCorpusList usersList = new userCorpusList();
		usersList.loadUsers(usersfile);
		List<userCorpus> users = usersList.getUsers();
		Tweets corpus = new Tweets();
		for(int i=0; i<users.size(); i++)
		{
			String topic = Integer.toString(users.get(i).getTopic());			
			List<Tweet> userTweets = timelineutils.getUserTimeline(users.get(i).getUsername());
			for(int indTweetsUser=0; indTweetsUser<userTweets.size(); indTweetsUser++)
			{
				Tweet tweet = userTweets.get(indTweetsUser);
				tweet.getTopics().getTopic().add(topic);
			}
			corpus.getTweet().addAll(userTweets);
			
			Tweets corpusUser = new Tweets();			
			System.out.println(users.get(i).getUsername()+"\t"+userTweets.size());
			corpusUser.getTweet().addAll(userTweets);
			TweetLoader.SaveToXML(users.get(i).getUsername()+".xml", corpusUser);

		}
		TweetLoader.SaveToXML(outputFile, corpus);
		System.out.println("Corpus creado");
	}
}
