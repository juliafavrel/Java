package scores;

import java.io.*;
import java.net.*;

public class HighScore1 {
	
	public static String[] getScores(){
		int index=0;
		String[] tabScore = new String[100];
		BufferedReader br = null;
		try {
			URL url = new URL("https://api.thingspeak.com/channels/109390/feeds.csv");
			URLConnection connexion = url.openConnection();
			InputStreamReader is = new InputStreamReader(connexion.getInputStream());
			br = new BufferedReader(is);
			
			String nextLine = br.readLine();
			while (nextLine!=null){
				nextLine = br.readLine();
				tabScore[index]=nextLine;
				index++;
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("erreur fichier non trouvé");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("erreur IO");
			e.printStackTrace();
		}
		return tabScore;
	}
}
