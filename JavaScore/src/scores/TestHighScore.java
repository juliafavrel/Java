package scores;
	

import java.util.*;
import java.io.*;

public class TestHighScore {
	

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

private static ArrayList<Integer> chooseScore(){
	ArrayList<Integer> tableauscore = new ArrayList<Integer>();
	int index = 0;
	String file = "scoreSamples.txt";
	BufferedReader br = null;
	try{
		br = new BufferedReader(new FileReader(file));
		while (br.readLine()!=null){
			int prochainentier = Integer.parseInt(br.readLine());
			tableauscore.add(index,prochainentier);
			index++;
		}
		br.close();
			
	} 
	catch (IOException e) {
		System.out.println("erreur io");
		e.printStackTrace();
	}
	catch (NumberFormatException e) {
		System.out.println("erreur number");
		e.printStackTrace();
	}
	return tableauscore;
}

	public static void main(String [] arg){
			TestHighScore test1 = new TestHighScore();
			String name = test1.askName();
			ArrayList<Integer> tableauScore = new ArrayList<Integer>();
			tableauScore = chooseScore();
			int taille = tableauScore.size();
			int index = (int)(Math.random() * taille);
			System.out.println("Nom Joueur "+ name + " score " +  tableauScore.get(index));
		}
}