import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemple1 {

	public static void main(String[] args) {
		FileReader ficAlire;
		BufferedReader entree;
		
		char c;
		int count = 0;
		try {
			ficAlire = new FileReader("/Users/wpho/desktop/monFichier.txt");
			entree = new BufferedReader(ficAlire);
			
			while (entree.ready())
			{
				c= (char) (entree.read());
				
				if (c=='a')
				{
					count++;
				}
			}
				
		System.out.println(" Il y a " + count + " caracteres 'a' dans le texte");
		entree.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("Le fichier ne peut pas etre lu ");
	
		} catch (IOException ioe)
		{
			System.out.println();
		}
	
			
					
		
	

	}

}
