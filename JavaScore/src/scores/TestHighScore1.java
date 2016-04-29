package scores;
	

import java.util.*;
import java.io.FileReader;
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

private ArrayList choosescore(){
	boolean eof=false;
	do{
	try{
		Scanner scanner file = new Scanner(./scoreSamples.txt);
		int prochainentier = file.hasNextInt();
		int index = 0;
		ArrayList tableauscore = new ArrayList();
		tableau.add(index,prochainentier);
	}
	catch(FileNotFoundException exception)
	{
		System.out.println("fichier non trouvé");
	}
	catch(EOFException e)
	{
		eof=true;
	}
	} while(!eof);
	return tableauscore;
}

		public static void main(String [] arg){
			TestHighScore1 test1 = new TestHighScore1();
			String name = test1.askName();
			ArrayList tableauscore = new ArrayList();
			tableauscore = choosescore();
			int taille = tableauscore.size();
			int score = (int)(Math.random() * taille);
			System.out.println("Nom Joueur "+ name + "score " +  score);
		}
	}}