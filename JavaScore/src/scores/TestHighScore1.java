package scores;
	

import java.util.*;
import java.io.*;
import java.lang.Math.*;

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
		return name;
	}

private static ArrayList<Integer> choosescore() throws FileNotFoundException, EOFException{
	boolean eof=false;
	ArrayList<Integer> tableauscore = new ArrayList<Integer>();
	int index = 0;
	do{
		Scanner file = new Scanner("./scoreSamples.txt");
		if (file.hasNextInt()){
			int prochainentier = file.nextInt();
			tableauscore.add(index,prochainentier);
		}
		file.close();
	} while(!eof);
	return tableauscore;
}

		public static void main(String [] arg){
			TestHighScore1 test1 = new TestHighScore1();
			String name = test1.askName();
			ArrayList<Integer> tableauscore = new ArrayList<Integer>();
			try {
				tableauscore = choosescore();
			} catch (FileNotFoundException | EOFException e) {
				System.out.println("erreur");
				e.printStackTrace();
			}
			int taille = tableauscore.size();
			int score = (int)(Math.random() * taille);
			System.out.println("Nom Joueur "+ name + "score " +  score);
		}
}