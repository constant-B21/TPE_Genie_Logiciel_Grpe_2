package package_groupe_2;

import java.util.Scanner;

public class DriverSuperMarcher {

	public static void main(String[] args) {
		
		SuperMarcher superM = new SuperMarcher();
		menuSuperMarcher();
		int reponce;
		reponce = sectionOption();
		selectionSelectionMenus(reponce, superM);

	}

	private static Scanner sc;

	// Methode selectionSelectionMenus() nous permet de realiser les action choisi
	// au menus
	private static void selectionSelectionMenus(int reponce, SuperMarcher superM) {

		do {
			switch (reponce) {
			case 1:
				superM.ajoutRayon();
				reponce = sectionOption();
				break;
			case 2:
				superM.afficherRayon();
				reponce = sectionOption();
				break;
			case 3:
				superM.ajoute();
				reponce = sectionOption();
				break;
			case 4:
				finProg();
				break;
			default:
				choixIndiponible();
				reponce = sectionOption();
			}
		} while (reponce < 4);

	}
	// Banière du superMarcher
	private static void menuSuperMarcher() {
			System.out.println(
					"\n   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ \r\n"
					+" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ \r\n"
					+ "++++                                                            +++++\r\n"
					+ "++++          GESTION DES FRUITS DANS UN SUPERMARCHER           +++++\r\n"
					+ "++++                                                            +++++\r\n"
					+ "  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  \r\n"
					+ "     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    ");

		}
	
	
	// Menu du Systeme proposant different action a effectuer.
	private static int sectionOption() {
		int reponce = 0;
		System.out.println("\n 	     	    ** Menu Principale **\nTaper\n ");
		System.out.println("    *            1. Ajouter un Rayon au Systeme                *");
		System.out.println("    *            2. Afficher les Rayons du Systemes            *");
		System.out.println("    *            3. Ajouter un Fruit a un Rayon                *");
		System.out.println("    *            4. Quiter le Programme                        *");
		while ((reponce == 1) && (reponce == 2) && (reponce == 3) && (reponce == 4)) {
		}
		sc = new Scanner(System.in);
		reponce = sc.nextInt();
		return reponce;
	}

	private static void choixIndiponible() {
		System.out.println("Choix Indisponible !");
	}

	private static void finProg() {
		System.out.println("Fin du programme !");
	}

}
