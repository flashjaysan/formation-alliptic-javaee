package alliptic.flashjaysan.exercices.semaine1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenue.");
		while (true)
		{
			printMenu();
			int menuChoice = getInputInt();
			if (menuChoice == 0)
			{
				System.out.println("Fin du programme.");
				System.out.println("Au revoir.");
				break;
			}
			selectAction(menuChoice);
		}
	}
	
	private static void selectAction(int menuChoice) {
		switch (menuChoice)
		{
			case 1:
				exercise1();
				break;
			case 2:
				exercise2();
				break;
			case 3:
				exercise3();
				break;
			case 4:
				exercise4();
				break;
			case 5:
				exercise5();
				break;
			case 6:
				exercise6();
				break;
			case 7:
				exercise7();
				break;
			case 8:
				exercise8();
				break;
			default:
				System.out.println("Option inconnue.");
				break;
		}
	}

	private static void printMenu() {
		System.out.println("Options disponibles :");
		System.out.println("\t1 : Déterminer la catégorie d'age d'un enfant.");
		System.out.println("\t2 : Calculer un tarif.");
		System.out.println("\t3 : Comparer trois nombres.");
		System.out.println("\t4 : Analyser un tableau.");
		System.out.println("\t5 : Déterminer la validité d'une date.");
		System.out.println("\t6 : Deviner un nombre.");
		System.out.println("\t7 : Tracer des figures.");
		System.out.println("\t8 : Rendre la monnaie.");
		System.out.println("\t0 : Quitter le programme.");
		System.out.println("Veuillez faire votre choix :");
	}
	
	private static int getInputInt() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		while (true)
		{
			System.out.print("Veuillez saisir un nombre entier : ");
			if (scanner.hasNextInt())
			{
				return scanner.nextInt();
			}
			else 
			{
				System.out.println("Saisie invalide. Recommencez.");
				scanner.nextLine();
			}
		}
	}
	
	private static double getInputDouble() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		while (true)
		{
			System.out.print("Veuillez saisir un nombre à virgule : ");
			if (scanner.hasNextDouble())
			{
				return scanner.nextDouble();
			}
			else 
			{
				System.out.println("Saisie invalide. Recommencez.");
				scanner.nextLine();
			}
		}
	}
	
	private static void exercise1() {
		/*
		 * 1 : Déterminer une catégorie
		 * ----------------------------
		 * Ecrire un algorithme qui demande l’âge d’un enfant à l’utilisateur.
		 * Ensuite, il l’informe de sa catégorie :
		 * "Poussin" de 6 à 7 ans
		 * "Pupille" de 8 à 9 ans
		 * "Minime" de 10 à 11 ans
		 * "Cadet" après 12 ans
		 */
		System.out.println("Exercice 1 : Déterminer la catégorie d'age d'un enfant.");
		System.out.println("Veuillez saisir l'age de l'enfant.");
		int age = getInputInt();
		if (age <= 0)
		{
			System.out.println("Vous êtes sûr qu'il est humain ?");
		}
		else if (age < 6)
		{
			System.out.println("Cet enfant est trop jeune pour entrer dans une de nos catégories.");
		}
		else if (age < 8)
		{
			System.out.println("Cet enfant est un \"Poussin\".");
		}
		else if (age < 10)
		{
			System.out.println("Cet enfant est un \"Pupille\".");
		}
		else if (age < 12)
		{
			System.out.println("Cet enfant est un \"Minime\".");
		}
		else if (age < 18)
		{
			System.out.println("Cet enfant est un \"Cadet\".");
		}
		else
		{
			System.out.println("Cet enfant est un peu grand, vous ne trouvez pas ?");
		}
		System.out.println("Retour au menu principal.\n");
	}
	
	private static void exercise2() {
		System.out.println("Exercice 2 : Calculer un tarif.");
		/*
		 * 2 : Calcul d'un tarif
		 * ---------------------
		 * Un magasin de reprographie facture 0,10 euros les dix premières photocopies,
		 * 0,09 euros les vingt suivantes et 0,08 euros au-delà. Ecrivez un algorithme
		 * qui demande à l’utilisateur le nombre de photocopies effectuées et qui affiche
		 * la facture correspondante.
		 */
		System.out.println("Veuillez saisir le nombre de photocopies à faire.");
		int copies = getInputInt();
		double total;
		if (copies < 0)
		{
			System.out.println("Vous ne pouvez pas fournir un nombre négatif.");
			total = 0;
		}
		else if (copies <= 10)
		{
			total = copies * 0.10;
			
		}
		else if (copies <= 30)
		{
			total = 1 + 0.09 * (copies - 10);
		}
		else
		{
			total = 2.8 + 0.08 * (copies - 30);
		}
		System.out.println("Le montant total s'élève à " + total + " euros.");
		System.out.println("Retour au menu principal.\n");
	}
	
	private static void exercise3() {
		/*
		 * 3 : Comparaison de trois nombres
		 * --------------------------------
		 * Faire une fonction où l'on demande 3 nombres à l'utilisateur.
		 * On indique à l'utilisateur si les 3 nombres sont égaux, si deux sont 
		 * égaux parmi les trois ou si les trois sont différents.
		 */
		System.out.println("Exercice 3 : Comparer trois nombres.");
		System.out.println("Veuillez saisir un nombre entier.");
		int firstNumber = getInputInt();
		System.out.println("Veuillez saisir un deuxième nombre entier.");
		int secondNumber = getInputInt();
		System.out.println("Veuillez saisir un troisième nombre entier.");
		int thirdNumber = getInputInt();
		if (firstNumber == secondNumber && secondNumber == thirdNumber)
		{
			System.out.println("Les trois nombres sont égaux.");
		}
		else if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber)
		{
			System.out.println("Seuls deux nombres sont égaux.");
		}
		else
		{
			System.out.println("Chaque nombre est différent.");
		}
		System.out.println("Retour au menu principal.\n");		
	}
	
	private static void exercise4() {
		/*
		 * 4 - Analyse d'un tableau
		 * ------------------------
		 * Ecrire un programme qui analyse un nombre indéfini de valeurs numériques
		 * (par exemple une série de notes sur 20) stockées dans un tableau. Par exemple :
		 * int[] notes = {12, 18, 8, 15, 7, 11, 15, 16};
		
		 * Le programme doit afficher en sortie :
		 * la valeur minimale
		 * la valeur maximale
		 * la valeur moyenne
		 * le nombre de notes dont la valeur est supérieure à 10
		 * le nombre de notes dont la valeur est supérieure à la moyenne
		 */
		System.out.println("Exercice 4 : Analyser un tableau.");
		int[] notes = {12, 18, 8, 15, 7, 11, 15, 16};
		int sum = notes[0];
		int min = notes[0];
		int max = notes[0];
		for (int i = 1; i < notes.length; ++i)
		{
			min = Math.min(min, notes[i]);
			max = Math.max(max, notes[i]);
			sum += notes[i];
		}
		double mean = (double)sum / notes.length;
		int overTen = 0;
		int overMean = 0;
		for (int i = 0; i < notes.length; ++i)
		{
			if (notes[i] > 10)
			{
				++overTen;
			}
			if (notes[i] > mean)
			{
				++overMean;
			}
		}
		System.out.println("La note minimale est " + min + ".");
		System.out.println("La note maximale est " + max + ".");
		System.out.println("Il y a " + overTen + " notes au dessus de dix.");
		System.out.println("La moyenne est de " + mean + ".");
		System.out.println("Il y a " + overMean + " notes au dessus de la moyenne.");
		System.out.println("Retour au menu principal.\n");
	}
	
	private static void exercise5() {
		/*
		 * 5 : Déterminer la validité d'une date
		 * Ecrivez un algorithme qui après avoir demandé un numéro de jour, de mois et 
		 * d'année à l'utilisateur, indique s'il s'agit ou non d'une date valide.
		 * -------------------------------------
		 * 
		 * Pour rappel le mois de février compte 28 jours, sauf si l’année est bissextile,
		 * auquel cas il en compte 29.
		 * On prendra en considérations les règles suivantes qui permettent de déterminer
		 * si l'année est bissextile ou non :
		 * - l’année est bissextile si elle est divisible par quatre et non divisible par 100,
		 * - ou si elle est divisible par 400.
		
		 * (Pour savoir si un nombre est divisible par un autre, on utilise l'opérateur
		 * "modulo (%)" : le résultat (valeur du reste de la division) sera égal à zéro
		 * si le premier nombre est divisible par le second.
		 */
		System.out.println("Exercice 5 : Déterminer la validité d'une date.");
		System.out.println("Veuillez saisir le jour.");
		int day = getInputInt();
		System.out.println("Veuillez saisir le mois.");
		int month = getInputInt();
		System.out.println("Veuillez saisir l'année.");
		int year = getInputInt();
		boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		boolean isDateValid = false;
		if (day < 1 || day > 31 || month < 1 || month > 12)
		{
			isDateValid = false;
		}
		else
		{
			switch (month)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					isDateValid = true;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					isDateValid = day <= 30;
					break;
				case 2:
					isDateValid = day <= 28 || day <= 29 && isLeapYear;
					break;
			}
		}
		if (isDateValid)
		{
			System.out.println("La date est valide.");
		}
		else
		{
			System.out.println("La date est invalide.");
		}
		System.out.println("Retour au menu principal.\n");
	}
	
	private static void exercise6() {
		/*
		 * 6 - Jeux de devinette d'un nombre
		 * **********************************
		 * (avec la classe Scanner pour gérer la multiplicité des entrées de l'utilisateur)
		
		 * Le but du jeu est de deviner un nombre qui a été choisi au hasard (on va simuler
		 * un lancer de dé à 6 faces).
		
		 * Le joueur peut faire plusieurs propositions et à chaque fois l'ordinateur lui
		 * indique si le nombre proposé est plus grand ou plus petit que le nombre à deviner.
		
		 * Quand le joueur a trouvé le bon nombre, le programme indique combien de tentatives
		 * il y eu.
		
		 * Le jeu se déroule ainsi :
		
		 * 1/
		 * Choix d'un nombre aléatoire compris entre 1 et 6.
		 * On le génère en utilisant la fonction décrite plus bas.
		
		 * 2/
		 * On demande à l'utilisateur de saisir un nombre (fonction prompt).
		 * Après comparaison, on indique si le nombre saisi est trop grand ou trop petit.
		 * Et on renouvelle l'invitation à saisir un nouveau nombre tant qu'il n'est pas exact.
		
		 * 3/
		 * Quand l'utilisateur a gagné, on affiche le nombre de coups qu'il lui a fallu.
		
		 * 4/ (options)
		 * On peut varier la plage de nombre (par exemple de 1 à 12, de 1 à 24, ...).
		 * On peut donner un nombre limite de coups.
		
		 * ---------------------------------------------------------
		
		 * L'instruction (avec la fonction random de la classe Math) à utiliser pour
		 * générer un nombre aléatoire entier compris entre Min et Max :
		 * int nombreAleatoire = Min + (int)(Math.random() * ((Max - Min) + 1));
		 */
		System.out.println("Exercice 6 : Deviner un nombre compris entre 0 et 100.");
		System.out.println("Vous avez droit à 10 essais.");
		int numberToFind = (int)(Math.random() * 100);
		int numberOfTries = 0;
		boolean isNumberFound = false;
		while(!isNumberFound && numberOfTries < 10)
		{
			++numberOfTries;
			System.out.println("Veuillez saisir un nombre.");
			int inputNumber = getInputInt();
			if (inputNumber == numberToFind)
			{
				isNumberFound = true;
			}
			else if (inputNumber < numberToFind)
			{
				System.out.println("Le nombre à trouver est plus grand.");
			}
			else
			{
				System.out.println("Le nombre à trouver est plus petit.");
			}
			System.out.println("Nombre d'essais : " + numberOfTries);
		}
		if (isNumberFound)
		{
			System.out.println("Bravo ! Vous avez trouvé le nombre.");
		}
		else
		{
			System.out.println("Dommage ! Vous avez dépassé 10 essais.");
		}
		System.out.println("Retour au menu principal.\n");
	}
	
	private static void exercise7() {
		/*
		 * --------------------------------------
		 * 7 : Exercice bonus : figures
		 * --------------------------------------
		 * Dessiner en console les figures suivantes composées de caractères "*"
		 * - La pyramide inversée
		
		 * *******
		 *  *****
		 *   ***
		 *    *
		
		 * - et la pyramide
		 *    *
		 *   ***
		 *  *****
		 * *******
		
		 * Le nombre de lignes dépend d'un nombre renseigné par l'utilisateur.
		 */
		System.out.println("Exercice 7 : Tracer des figures.");
		System.out.println("Veuillez saisir un nombre de lignes.");
		int lines = getInputInt();
		
		for (int i = 0; i < lines; ++i)
		{
			for (int j = 0; j < i; ++j)
			{ 
				System.out.print(' ');
			}
			for (int j = 0; j < (lines - i) * 2 - 1; ++j)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();

		for (int i = 0; i < lines; ++i)
		{
			for (int j = 0; j < lines - i - 1; ++j)
			{ 
				System.out.print(' ');
			}
			for (int j = 0; j < i * 2 + 1; ++j)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("Retour au menu principal.\n");
	}
	
	private static void exercise8() {
		/*
		 * --------------------------------------
		 * 8 : Exercice bonus : Rendu de monnaie
		 * --------------------------------------
		 * Ecrire un programme qui simule un rendu de monnaie.
		 * Le programme accepte deux nombres en entrée :
		 * 1 : la valeur du produit
		 * 2 : la somme versée pour le paiement
		
		 * En sortie, le programme affiche le rendu de monnaie en détaillant le nombre
		 * de pièces pour chaque type de pièces.
		
		 * On peut se limiter à des valeurs de produits ne dépassant pas deux euros.
		 * Les pièces à décompter lors du rendu seront alors du type : 1 euros, 50 cents,
		 * 20 cent, 10 cents, 5 cents, 2 cents et 1 cent.
		
		 * Il faut construire le programme en raisonnant sur des valeurs exprimées en
		 * centimes et utiliser l'opérateur % (modulo) pour effectuer les calculs.
		 */
		System.out.println("Exercice 8 : Rendre la monnaie.");
		System.out.println("Veuillez saisir un prix de produit.");
		double price = getInputDouble();
		System.out.println("Veuillez saisir la somme versée.");
		double amount = getInputDouble();
		double remainingMoney = amount - price;
		if (remainingMoney < 0)
		{
			System.out.println("Vous n'avez pas assez pour acheter cet objet.");
		}
		else
		{
			int fiveHundredEuros = (int)(remainingMoney / 500);
			remainingMoney -= fiveHundredEuros * 500;
			int oneHundredEuros = (int)(remainingMoney / 100);
			remainingMoney -= oneHundredEuros * 100;
			int fiftyEuros = (int)(remainingMoney / 50);
			remainingMoney -= fiftyEuros * 50;
			int twentyEuros = (int)(remainingMoney / 20);
			remainingMoney -= twentyEuros * 20;
			int tenEuros = (int)(remainingMoney / 10);
			remainingMoney -= tenEuros * 10;
			int fiveEuros = (int)(remainingMoney / 5);
			remainingMoney -= fiveEuros * 5;
			int twoEuros = (int)(remainingMoney / 2);
			remainingMoney -= twoEuros * 2;
			int oneEuro = (int)remainingMoney;
			remainingMoney -= oneEuro;
			remainingMoney *= 100;
			int fiftyCents = (int)remainingMoney / 50;
			remainingMoney -= fiftyCents * 50;
			int twentyCents = (int)remainingMoney / 20;
			remainingMoney -= twentyCents * 20;
			int tenCents = (int)remainingMoney / 10;
			remainingMoney -= tenCents * 10;
			int fiveCents = (int)remainingMoney / 5;
			remainingMoney -= fiveCents * 5;
			int twoCents = (int)remainingMoney / 2;
			remainingMoney -= twoCents * 2;
			int oneCent = (int)remainingMoney;
			System.out.println("Voici votre monnaie :");
			System.out.println(fiveHundredEuros + " billet(s) de 500€.");
			System.out.println(oneHundredEuros + " billet(s) de 100€.");
			System.out.println(fiftyEuros + " billet(s) de 50€.");
			System.out.println(twentyEuros + " billet(s) de 20€.");
			System.out.println(tenEuros + " billet(s) de 10€.");
			System.out.println(fiveEuros + " billet(s) de 5€.");
			System.out.println(twoEuros + " pièce(s) de 2€.");
			System.out.println(oneEuro + " pièce(s) de 1€.");
			System.out.println(fiftyCents + " pièce(s) de 0.50€.");
			System.out.println(twentyCents + " pièce(s) de 0.20€.");
			System.out.println(tenCents + " pièce(s) de 0.10€.");
			System.out.println(fiveCents + " pièce(s) de 0.05€.");
			System.out.println(twoCents + " pièce(s) de 0.02€.");
			System.out.println(oneCent + " pièce(s) de 0.01€.");
		}
		System.out.println("Retour au menu principal.\n");
	}

}
