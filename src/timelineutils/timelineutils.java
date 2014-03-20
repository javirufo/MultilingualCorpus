package timelineutils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import json.TweetJson;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;



import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import oauth.signpost.OAuth;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.*;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import xml.es.daedalus.tass.tweets.Topics;
import xml.es.daedalus.tass.tweets.Tweet;
import xml.es.daedalus.tass.tweets.Tweets;


public class timelineutils {
	
		
	
	/*
	public static ConfigurationBuilder confbuilder  = new ConfigurationBuilder().setOAuthAccessToken("107456296-5IBwqhP2ZmnpJ27hXdUnYftkfrYve1S12ZrY3ke8") 
			.setOAuthAccessTokenSecret("jGcvj8Hu7BcuIDdkx5eKFz0K1Pk8OxkOlC6w3deLs") 
			.setOAuthConsumerKey("D7ZGwxpYFh9QLh24YfBzIw") 
			.setOAuthConsumerSecret("HdtS8osKwv1ARscd9AglMCv1DrmPB3Qo6Py0CKHzCOY"); 
	public static TwitterFactory tf = new TwitterFactory(confbuilder.build());
	public static Twitter twitter = tf.getInstance();	
	public static Map<java.lang.String,RateLimitStatus> rate=null; 
	public static RateLimitStatus limit=null;	
	*/
	public static int BLOQUE_TIMELINE=10;
	public static int EPOCH_GMT=7200;
	public static String OAuthAccessToken ="107456296-5IBwqhP2ZmnpJ27hXdUnYftkfrYve1S12ZrY3ke8"; 
	public static String OAuthAccessTokenSecret = "jGcvj8Hu7BcuIDdkx5eKFz0K1Pk8OxkOlC6w3deLs"; 
	public static String OAuthConsumerKey = "D7ZGwxpYFh9QLh24YfBzIw"; 
	public static String OAuthConsumerSecret = "HdtS8osKwv1ARscd9AglMCv1DrmPB3Qo6Py0CKHzCOY";
	public static OAuthConsumer consumer = new DefaultOAuthConsumer("D7ZGwxpYFh9QLh24YfBzIw", "HdtS8osKwv1ARscd9AglMCv1DrmPB3Qo6Py0CKHzCOY");
	public static Rates rate = null;
	
	
	
	public static List<Tweet> getUserTimeline(String user){
		try{
			//OAuthConsumer consumer = new DefaultOAuthConsumer("D7ZGwxpYFh9QLh24YfBzIw", "HdtS8osKwv1ARscd9AglMCv1DrmPB3Qo6Py0CKHzCOY");
/*
 * Este trozo de código es para conceder acceso a la aplicación a mi cuenta.
     OAuthProvider provider = new DefaultOAuthProvider(
             "https://twitter.com/oauth/request_token",
             "https://twitter.com/oauth/access_token",
             "https://twitter.com/oauth/authorize");

     
     // we do not support callbacks, thus pass OOB
     String authUrl = provider.retrieveRequestToken(consumer, OAuth.OUT_OF_BAND);
     System.out.println(authUrl);
     System.out.println("Enter the PIN code and hit ENTER when you're done:");

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String pin = br.readLine();

     System.out.println("Fetching access token from Twitter...");

     provider.retrieveAccessToken(consumer, pin);
     // bring the user to authUrl, e.g. open a web browser and note the PIN code
     // ...         

     
     // from the callback if you didn't do an out of band request

     // user must have granted authorization at this point
     //provider.retrieveAccessToken(consumer, pin);

     // store consumer.getToken() and consumer.getTokenSecret(),
     // for the current user, e.g. in a relational database
     // or a flat file
     // ...
*/
     /****************************************************
      * The following steps are performed everytime you
      * send a request accessing a resource on Twitter
      ***************************************************/
			consumer.setTokenWithSecret("107456296-lbHQDLYPbe1XbB9mUDBFZ8OrcK0tCO19jy7PMyeP", "6wQc7DJD5ditdzNkIqyGW15vPRHyW0EQb7tyLn2TA3U");
			if (rate==null)
				rate = getRate();

// create a request that requires authentication
			boolean procesado = false;
			while(!procesado)
			{
					List<Tweet> tweetsTimeLine = new ArrayList<Tweet>();
					for(int indTime=0; indTime<BLOQUE_TIMELINE; indTime++)
					{
						if (rate.getRemaining()<=0)
						{
							DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
							Date date = new Date();
							System.out.println(dateFormat.format(date) + "Se ha acabado ratio "+rate.getReset()+" ms");								
							//Thread.sleep(rate.getReset()+1);
							Thread.sleep((rate.getReset()));
							date = new Date();
							System.out.println(dateFormat.format(date) + "Continuo");
							do
							{
								rate = getRate();
								Thread.sleep(1000);
							}while((rate==null)||(rate.getRemaining()<=0));
						}
						URL url;						
						if (indTime==0)
							url=new URL("https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name="+user+"&count=200");
						else
							url=new URL("https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name="+user+"&count=200&max_id="+tweetsTimeLine.get(tweetsTimeLine.size()-1).getTweetid().toString());
						HttpURLConnection request = (HttpURLConnection) url.openConnection();
						consumer.sign(request);        			
						request.connect();          
						InputStreamReader in = new InputStreamReader((InputStream) request.getContent());
						BufferedReader br = new BufferedReader(in);
						int c;  
						StringBuffer buff = new StringBuffer();  
						while((c=br.read())!=-1)  
						{  
							buff.append((char)c);  
						}  
						br.close();
						String resultado = buff.toString();					
						tweetsTimeLine.addAll(timeLineFromString(resultado));
						rate.setRemaining(rate.getRemaining()-1);
					}
					procesado = true;
					return tweetsTimeLine;
			}
			}catch(Exception ex)
			{
				System.out.println("---> Error con "+user);
				return new ArrayList<Tweet>();
			}

		return null;
	}
     

	
	
	public static List<Tweet> timeLineFromString(String timeline){
		List<Tweet> tweets = new ArrayList<Tweet>();
		InputStream is = new ByteArrayInputStream(timeline.getBytes());			
		JsonReader reader = new JsonReader(new InputStreamReader(is));			
		JsonParser jsonParser = new JsonParser();
		JsonArray statusArray= jsonParser.parse(reader).getAsJsonArray();
		Gson gson = new Gson();			
		for ( JsonElement rawTweet : statusArray ) 
		{
			
			TweetJson status = gson.fromJson(rawTweet, TweetJson.class);
			Tweet tweet = new Tweet();
			tweet.setContent(status.getText());
			tweet.setDate(status.getCreated_at());
			tweet.setLang(status.getLang());				
			tweet.setTweetid( new BigInteger(status.getId_str()));
			tweet.setUser(status.getUser().getScreen_name());
			tweet.setTopics(new Topics());
			tweets.add(tweet);			
		}
		return tweets;
	}
	
	
	public static Rates getRate(){		
		try{
			consumer.setTokenWithSecret("107456296-lbHQDLYPbe1XbB9mUDBFZ8OrcK0tCO19jy7PMyeP", "6wQc7DJD5ditdzNkIqyGW15vPRHyW0EQb7tyLn2TA3U");// 
			URL url = new URL("https://api.twitter.com/1.1/application/rate_limit_status.json?resources=statuses");
			HttpURLConnection request = (HttpURLConnection) url.openConnection();
			consumer.sign(request);        			
			request.connect();          
			InputStreamReader in = new InputStreamReader((InputStream) request.getContent());
			BufferedReader br = new BufferedReader(in);
			int c;  
			StringBuffer buff = new StringBuffer();  
			while((c=br.read())!=-1)  
			{  
				buff.append((char)c);  
			}  
			br.close();
			String resultado = buff.toString();
//			/statuses/user_timeline":{"limit":180,"remaining":180,"reset":1375717919}" +
			int pos = resultado.indexOf("/statuses/user_timeline");
			int posCorchete = resultado.indexOf("{", pos+1);
			int posCorchete2 = resultado.indexOf("}", posCorchete+1);
			resultado = resultado.substring(posCorchete+1, posCorchete2);
			String[] campos = resultado.split(",");
			
			Rates rate = new Rates();
			rate.setRemaining(   Integer.parseInt(((String[])campos[1].split(":"))[1]));			
			long reset = Long.parseLong(((String[])campos[2].split(":"))[1]);
			long actual = System.currentTimeMillis()/1000L;
			rate.setReset((reset-actual)*1000L);
			System.out.print("****"+rate.getReset()+"****");
			return rate;
		}catch(Exception ex)
		{
			System.out.println("---> Error");
			return null;
			
		}			
	}
}
