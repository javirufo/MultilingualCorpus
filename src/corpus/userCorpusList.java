package corpus;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class userCorpusList {
	private List<userCorpus> users;
	
	public userCorpusList(){
		users = new ArrayList<userCorpus>();
	}
	
	public void loadUsers(String file){		
		BufferedReader br;
		String line=null;
		try {
			br = new BufferedReader(new FileReader(file));
			do{
				line = br.readLine();
				if (line!=null)
				{
					String[] campos = line.split("\t");
					if ((campos!=null)&&(campos.length==2))
					{
						userCorpus usuario = new userCorpus(campos[0], Integer.parseInt(campos[1]));
						users.add(usuario);
					}
				}			
			}while(line!=null);
			br.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}		
	}

	public List<userCorpus> getUsers() {
		return users;
	}

	public void setUsers(List<userCorpus> users) {
		this.users = users;
	}
	
	
}
