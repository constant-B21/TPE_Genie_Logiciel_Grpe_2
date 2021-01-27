package package_groupe_2;

import java.util.Arrays;

public class Fruit {

	// Attributs de la classe Fruit.
	private String nom;
	private String type;
	private String couleur;
	private int prix;
	private double poids;
	private static int dure;
	private String[] proprietes;

	// Définition du constructeur par defaut de la classe Fruit.
	public Fruit() {

	}

	// Définition du constructeur ayant tous les proprietés de la classe Fruit.
	public Fruit(String name, String types, int prise, double poid, String color, int tough, String... propriety) {
		nom = name;
		type = types;
		couleur = color;
		prix = prise;
		poids = poid;
		dure = tough;
		proprietes = propriety;
	}

	// Définition des Accésseurs (getters) et des Modificateurs (setters) des
	// attributs de la classe Fruit.
	public String getNom() {
		return nom;
	}

	public void setNom(String name) {
		nom = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String types) {
		type = types;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String color) {
		couleur = color;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prise) {
		prix = prise;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poid) {
		poids = poid;
	}

	public int getDure() {
		return dure;
	}

	public void setDure(int tough) {
		dure = tough;
	}

	public String[] getProprietes() {
		return proprietes;
	}

	public void setProprietes(String[] propriety) {
		this.proprietes = propriety;
	}

	// Définition de la méthode toString() de notre classe.
	@Override
	public String toString() {
		return "Fruit [nom=" + nom + ", type=" + type + ", couleur=" + couleur + ", prix=" + prix + ", poids=" + poids
				+ ", dure=" + dure + "]";
	}

	// Définition de la méthode equals() de la classe Fruit

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (Double.doubleToLongBits(poids) != Double.doubleToLongBits(other.poids))
			return false;
		if (prix != other.prix)
			return false;
		if (!Arrays.equals(proprietes, other.proprietes))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
