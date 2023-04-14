import java.util.Scanner;

public class Puissance4
{
	private static final int LIGNES = 6;
	private static final int COLONNES = 7;
	
	public static final char VIDE = ' ';
	public static final char JOUEUR1 = 'X';
	public static final char JOUEUR2 = 'O';

	private char[][] plateau;
	private char joueurActuel;
	
	private boolean jeuFini;
	
	private Controleur ctrl;

	public Puissance4(Controleur ctrl)
	{
		this.ctrl = ctrl;
		
		this.plateau = new char[LIGNES][COLONNES];
		for (int i = 0; i < LIGNES; i++)
		{
			for (int j = 0; j < COLONNES; j++)
			{
				this.plateau[i][j] = VIDE;
			}
		}
		this.joueurActuel = JOUEUR1;
		this.jeuFini = false;
	}

	public void placer( int col )
	{
		if( !this.jeuFini )
		{
			boolean coupValide = false;
			while (!coupValide)
			{
				System.out.print("Joueur " + joueurActuel );
				int colonne = col;
				if (colonne >= 0 && colonne < COLONNES && this.plateau[0][colonne] == VIDE)
				{
					for (int i = LIGNES - 1; i >= 0; i--)
					{
						if (this.plateau[i][colonne] == VIDE)
						{
							this.plateau[i][colonne] = this.joueurActuel;
							coupValide = true;
							break;
						}
					}
				} else
				{
					System.out.println("Coup invalide. Veuillez choisir une colonne valide.");
				}
			}
			if (verifierVictoire(this.joueurActuel))
			{
				afficherPlateau();
				System.out.println("Joueur " + this.joueurActuel + " remporte la partie !");
				this.jeuFini = true;
			} else if (verifierEgalite())
			{
				afficherPlateau();
				System.out.println("Egalité !");
				this.jeuFini = true;
			} else
			{
				this.joueurActuel = (this.joueurActuel == JOUEUR1) ? JOUEUR2 : JOUEUR1;
			}
			
			this.ctrl.setTexteJoueur( this.joueurActuel );
		}
		
		//a modifié
		if( this.jeuFini )
		{
			this.ctrl.setTexteErreur( "Le joueur " + joueurActuel+ " a gagné");
		}
	}

	/*public void jouer()
	{
		boolean jeuFini = false;
		boolean coupValide;
		int colonne;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bienvenue dans le jeu de Puissance 4 !");
		System.out.println("Les colonnes sont numérotées de 1 à " + COLONNES + ".");
		System.out.println("Pour jouer, entrez le numéro de la colonne où vous souhaitez placer votre pion.");
		System.out.println("Que le meilleur gagne !\n");

		while (!jeuFini)
		{
			afficherPlateau();
			coupValide = false;
			while (!coupValide)
			{
				System.out.print("Joueur " + joueurActuel + ", entrez le numéro de la colonne : ");
				colonne = scanner.nextInt() - 1;
				if (colonne >= 0 && colonne < COLONNES && plateau[0][colonne] == VIDE)
				{
					for (int i = LIGNES - 1; i >= 0; i--)
					{
						if (plateau[i][colonne] == VIDE)
						{
							plateau[i][colonne] = joueurActuel;
							coupValide = true;
							break;
						}
					}
				} else
				{
					System.out.println("Coup invalide. Veuillez choisir une colonne valide.");
				}
			}
			if (verifierVictoire(joueurActuel))
			{
				afficherPlateau();
				System.out.println("Joueur " + joueurActuel + " remporte la partie !");
				jeuFini = true;
			} else if (verifierEgalite())
			{
				afficherPlateau();
				System.out.println("Egalité !");
				jeuFini = true;
			} else
			{
				joueurActuel = (joueurActuel == JOUEUR1) ? JOUEUR2 : JOUEUR1;
			}
		}
		scanner.close();
	}*/

	public void afficherPlateau()
	{
		System.out.println(" 1 2 3 4 5 6 7 ");
		for (int i = 0; i < LIGNES; i++)
		{
			for (int j = 0; j < COLONNES; j++)
			{
				System.out.print("|" + plateau[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("---------------");
	}

public boolean verifierVictoire(char joueur)
{
		// Vérification des lignes
		for (int i = 0; i < LIGNES; i++)
		{
			for (int j = 0; j <= COLONNES - 4; j++)
			{
				if (this.plateau[i][j]     == joueur && this.plateau[i][j + 1] == joueur &&
				    this.plateau[i][j + 2] == joueur && this.plateau[i][j + 3] == joueur)
				{
					return true;
				}
			}
		}

		// Vérification des colonnes
		for (int i = 0; i <= LIGNES - 4; i++)
		{
			for (int j = 0; j < COLONNES; j++)
			{
				if (this.plateau[i][j]     == joueur && this.plateau[i + 1][j] == joueur &&
				    this.plateau[i + 2][j] == joueur && this.plateau[i + 3][j] == joueur)
				{
					return true;
				}
			}
		}

		// Vérification des diagonales ascendantes
		for (int i = 3; i < LIGNES; i++)
		{
			for (int j = 0; j <= COLONNES - 4; j++)
			{
				if (this.plateau[i][j]         == joueur && this.plateau[i - 1][j + 1] == joueur &&
				    this.plateau[i - 2][j + 2] == joueur && this.plateau[i - 3][j + 3] == joueur)
				{
					return true;
				}
			}
		}

		// Vérification des diagonales descendantes
		for (int i = 0; i <= LIGNES - 4; i++)
		{
			for (int j = 0; j <= COLONNES - 4; j++)
			{
				if (this.plateau[i][j]         == joueur && this.plateau[i + 1][j + 1] == joueur &&
				    this.plateau[i + 2][j + 2] == joueur && this.plateau[i + 3][j + 3] == joueur)
				{
					return true;
				}
			}
		}

		return false;
	}

	public boolean verifierEgalite()
	{
		for (int i = 0; i < LIGNES; i++)
		{
			for (int j = 0; j < COLONNES; j++)
			{
				if (this.plateau[i][j] == VIDE)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public char getCase( int lig, int col )
	{
		return this.plateau[lig][col];
	}

	/*public static void main(String[] args)
	{
		Puissance4 jeu = new Puissance4();
		jeu.jouer();
	}*/
}


