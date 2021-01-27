package package_groupe_2;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperMarcher {
	ArrayList<Rayon> rayons = new ArrayList<Rayon>();
	private Scanner key;
	private Scanner sc;
	private Scanner var;

	// La methode ajoutRayon() ajoute un Rayon au systeme( au ArrayList)
	public void ajoutRayon() {
		String etiquette;
		int number;
		sc = new Scanner(System.in);
		key = new Scanner(System.in);
		System.out.println("Entrez l\'etiquette :  <Exemple : Legume>");
		etiquette = sc.nextLine();
		System.out.println("Entrez le Numero");
		number = key.nextInt();
		Rayon newRayon = new Rayon(etiquette, number);
		rayons.add(newRayon);
		System.out.println("\nAjout Succès!\n");
		// Ecrire le nouveau rayon dans le fichier
	}

	// Methode demandRayon() est la methode qui demande l'etiquette du Rayon au quel
	// on va ajouter un Fruit
	public void ajoute() {
		sc = new Scanner(System.in);
		key = new Scanner(System.in);
		String etiquets;
		int number;
		System.out.println("Entrez l'etiquette du Rayon");
		etiquets = sc.nextLine();
		System.out.println("Entrez Le numero du Rayon");
		number = key.nextInt();
		Rayon r = new Rayon(etiquets, number);
		// Appel a la methode ajout()
		ajoutRayon(r);
	}

	// Méthode ajout()qui ajout un Fruit a un rayon spécifique!
	public void ajoutRayon(Rayon rayon) {
		for (Rayon r : rayons) {
			if (!r.getEtiquete().equals(rayon.getEtiquete())) {
				System.out.println("Le rayon saisie n\'existe pas !");
				
			} else if (r.getEtiquete().equals(rayon.getEtiquete())) {
				sc = new Scanner(System.in);
				key = new Scanner(System.in);
				var = new Scanner(System.in);
				String nom;
				String type;
				String couleur;
				int prix;
				double poids;
				int dure;
				String propriete;
				System.out.println("Entrez les Caracteristiques de votre Fruit");
				System.out.println("Nom :");
				nom = var.nextLine();
				System.out.println("type :");
				type = key.nextLine();
				if (!rayon.getEtiquete().equals(type)) {
					System.out.println(
							"Impossible d'ajouter ce Fruit a ce Rayon Entrez dans le Rayon Ayant l'etiquette de ce type <<"
									+ type + ">>!");
					break;
				} else {
					System.out.println("couleur :");
					couleur = key.nextLine();
					System.out.println("Prix :");
					prix = key.nextInt();
					System.out.println("Poids :");
					poids = sc.nextDouble();
					System.out.println("Proprietes :");
					propriete = var.nextLine();
					System.out.println("Dure : ");
					dure = sc.nextInt();
					Fruit frut = new Fruit(nom, type, prix, poids, couleur, dure, propriete);
					rayon.fruits.add(frut);
					System.out.println(rayon.fruits);
					System.out.println(" Ajout Succès !\n");
					int reponce;
					//
					do {
						// Sous Menu du systeme
						System.out.println("** Sous Menu du rayon **");
						System.out.println("\nTaper :");
						System.out.println("*  1. Modifier le prix de ce type de Fruit       *");
						System.out.println("*  2. Afficher les Fruit suivant une categorie   *");
						System.out.println("*  3. Afficher les Fruits devenu inconsommable   *");
						System.out.println("*  4. Modifier la dure de vie                    *");
						System.out.println("*  5. Quitter le Sous Menu                       *");
						reponce = key.nextInt();
						switch (reponce) {
						case 1:
							int var;
							System.out.println(
									"\nTaper\n*   1. S\'il s\'agit d\'un Rabait       *\n*   2. S\'il s\'agit d\'une augmentation*");
							var = sc.nextInt();
							switch (var) {
							case 1:
								System.out.println("Entrez le Pourcentatge d' Augmentation ");
								int pourcent1 = sc.nextInt();
								int resultat1;
								double a, b, c = 0;
								//
								a = (pourcent1 * 0.01);
								b = frut.getPrix() * a;
								c = frut.getPrix() - b;
								resultat1 = (int) c;
								//
								frut.setPrix(resultat1);
								System.out.println(rayon.fruits.toString());
								break;
							case 2:
								System.out.println("\nEntrez le Pourcentatge de Rabait");
								int pourcent2 = sc.nextInt();
								int resultat2;
								//
								a = (pourcent2 * 0.01);
								b = frut.getPrix() * a;
								c = frut.getPrix() + b;
								resultat2 = (int) c;
								//
								frut.setPrix(resultat2);
								System.out.println(rayon.fruits.toString());
								break;
							}
							break;
						case 2:
							for (Fruit f : rayon.fruits) {
								System.out.println(f);
							}

							break;
						case 3:
							if (frut.getDure() <= 5) {
								System.out.println("\nles Fruits devenu inconsommable !");
								System.out.println("\n" + frut.getNom() + "\n");
							} else {
								System.out.println("!\nAucun fruit trouver \n!");
							}
							break;
						case 4:
							System.out.println("Entrez la nouvelle Dure de Vie");
							int tough;
							tough = key.nextInt();
							frut.setDure(tough);
							System.out.println(rayon.fruits.toString());
							break;
						case 5:
							System.out.println("\nSous Menu quitter avec Succès !");
							break;

						default:
							System.out.println("Choix indisponible !");
							break;
						}
					} while (reponce < 5);
					break;
				}

			}

		}

	}

	public void afficherRayon() {
		if (rayons.isEmpty()) {
			System.out.println("Pour l'instant le Système n'a aucun Rayon ajouter avant l\'affichage !");
		} else {
			System.out.println("\nLes Rayons sont disposer Comme suit : ");
			System.out.println(rayons);
		}
	}

}
