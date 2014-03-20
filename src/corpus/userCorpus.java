package corpus;

public class userCorpus {
	private int topic;
	private String username;
	public userCorpus(String _username, int _topic)
	{
		topic = _topic;
		username = _username;
	}
	public int getTopic() {
		return topic;
	}
	public void setTopic(int topic) {
		this.topic = topic;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
