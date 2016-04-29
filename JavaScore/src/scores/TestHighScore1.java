package scores;
	

import java.util.*;
import java.io.*;

public class TestHighScore1 {
	

/**
	Demande le nom du joueur et le retourne
	@return name Le nom du joueur
*/
	

private String askName(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer le nom du joueur : ");
		String name = sc.nextLine();
		System.out.println("Votre joueur s'appelle : " + name);
		sc.close();
		return name;
	}

private static ArrayList<Integer> choosescore() throws NumberFormatException, IOException{
	boolean eof=false;
	ArrayList<Integer> tableauscore = new ArrayList<Integer>();
	int index = 0;
	String file = "scoreSamples.txt";
	BufferedReader br = new BufferedReader(new FileReader(file));
	do{
			
			int prochainentier = Integer.parseInt(br.readLine());
			tableauscore.add(index,prochainentier);
			index++;
			
	} while(!eof);
	br.close();
	return tableauscore;
}

		public static void main(String [] arg){
			TestHighScore1 test1 = new TestHighScore1();
			String name = test1.askName();
			ArrayList<Integer> tableauscore = new ArrayList<Integer>();
			try {
				tableauscore = choosescore();
			} catch (NumberFormatException | IOException e) {
				System.out.println("erreur");
				e.printStackTrace();
			}
			int taille = tableauscore.size();
			int index = (int)(Math.random() * taille);
			System.out.println("Nom Joueur "+ name + " score " +  tableauscore.get(index));
		}
}