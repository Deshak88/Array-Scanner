package Array;
////////////////
//
//F4R3S5 S4D3K
//26 Avril
//Double array
//
////////////////
public class calendrierMai {
	public static void main(String args []) {
		
		int[][] day = new int [7][6];  //Determine la taille de l'array
		//Tous les jour des doubles array organiser par jour de la semaine
		day[0][0] = 0; /*lundi*/ 		day[3][0] = 0; /*jeudi*/		day[6][0] = 2; /*dimanche*/
		day[0][1] = 3;					day[3][1] = 6;					day[6][1] = 9;
		day[0][2] = 10;					day[3][2] = 13;					day[6][2] = 16;
		day[0][3] = 17;					day[3][3] = 20;					day[6][3] = 23;
		day[0][4] = 24;					day[3][4] = 27;					day[6][4] = 30;
		day[0][5] = 31; 				day[3][5] = 0;					day[6][5] = 0;
		
		day[1][0] = 0; /*mardi*/		day[4][0] = 0; /*vendredi*/
		day[1][1] = 4;					day[4][1] = 7;
		day[1][2] = 11;					day[4][2] = 14;
		day[1][3] = 18;					day[4][3] = 21;
		day[1][4] = 25;					day[4][4] = 28;
		day[1][5] = 0;					day[4][5] = 0;
		
		day[2][0] = 0; /*mercredi*/		day[5][0] = 1; /*samedi*/
		day[2][1] = 5;					day[5][1] = 8;
		day[2][2] = 12;					day[5][2] = 15;
		day[2][3] = 19;					day[5][3] = 22;
		day[2][4] = 26;					day[5][4] = 29;
		day[2][5] = 0;					day[5][5] = 0;
		
		
		//Tableau qui a les jours dessus comme un calendrier
		System.out.println("         MAI 2021           ");
		System.out.println("/ L | M |Mer| J| V | S | D\\");
		System.out.println("|   |   |   |  |   | " + day[5][0] + " |"+ day[6][0] + " |");
		System.out.println("|-------------------------|");
		System.out.println("| " + day[0][1] + " | " + day[1][1] + " | " + day[2][1] + " |" + day[3][1] + " | " + day[4][1] + " | " + day[5][1] + " |"+ day[6][1] + " |");
		System.out.println("|-------------------------|");
		System.out.println("| " + day[0][2] + "| " + day[1][2] + "| " + day[2][2] + "|" + day[3][2] + "| " + day[4][2] + "| " + day[5][2] + "|"+ day[6][2] + "|");
		System.out.println("|-------------------------|");
		System.out.println("| " + day[0][3] + "| " + day[1][3] + "| " + day[2][3] + "|" + day[3][3] + "| " + day[4][3] + "| " + day[5][3] + "|"+ day[6][3] + "|");
		System.out.println("|-------------------------|");
		System.out.println("| " + day[0][4] + "| " + day[1][4] + "| " + day[2][4] + "|" + day[3][4] + "| " + day[4][4] + "| " + day[5][4] + "|"+ day[6][4] + "|");
		System.out.println("|-------------------------|");
		System.out.println("| " + day[0][5] + "|   |   |  |   |   |  |");
		System.out.println("\\_________________________/");
		
		System.out.println();
		
		System.out.println("                     Mai 2021");
		System.out.println("Lun     Mar     Mer     Jeu     Ven     Sam     Dim");
		for(int i=0; i<6; i++) {
			for(int j=0; j<7; j++) {
				if(day[j][i]==0) {
					System.out.print("\t");
				}
				else System.out.print(day[j][i] +"\t");
			}
			System.out.println();
		}
	}
}
