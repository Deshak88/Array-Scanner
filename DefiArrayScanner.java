package Array;
/*	F4R3S5 S4D3K
	3 Mai
	Defi pour test array */

import java.util.Scanner;

public class DefiArrayScanner {
	public static void main (String args []) {
		
		//les compteurs
		int compteurPos = 0;
		int compteurNeg = 0;
		int compteurZero = 0;
		int compteurPair = 0;
		int compteurImpair = 0;
		
		//1.Créez un array de Integrer de 10 cases.
		int [] nombre = new int [10];
		
		//2.Utilisez un Scanner pour insérer les 10 valeurs dans l’array avec une boucle for
		Scanner xray = new Scanner(System.in);
		
		for(int i=0;i<nombre.length;i++) {
		System.out.print("Nombre " + (i+1) + " : ");
		nombre[i]=xray.nextInt();
		}
		
		//3. Avec une autre boucle for...
		for(int i=0;i<nombre.length;i++) {
			// a)nombres strictement positifs
			if(nombre[i]>0) {
				compteurPos++;
			// b)nombres strictement négatifs
			}else if(nombre[i]<0) {
				compteurNeg++;
			// c)zéros
			}else{ compteurZero++;}
			
			// d)nombres pair
			if(nombre[i]%2==0) {
				compteurPair++;
			// e)nombres impair
			}else {compteurImpair++;}
		}
		
		//3. Imprimer le montant de
		
		// a)nombres strictement positifs
		System.out.println("\nnombre positive : " +compteurPos);
		// b)nombres strictement négatifs
		System.out.println("\nnombre negatifs : " +compteurNeg);
		// c)zéros
		System.out.println("\nnombre Zero : " +compteurZero);
		// d)nombres pair
		System.out.println("\nnombre Pair : " +compteurPair);
		// e)nombres impair
		System.out.println("\nnombre Impair : " +compteurImpair);
	}
}
