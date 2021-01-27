package package_groupe_2;

import java.util.ArrayList;

public class Rayon {

	// Attributs de la classe Rayon.
	private String etiquete;
	private int numero;

	// Définition d'un ArrayList constitué d'un ensemble de plusieur Fruit.
	ArrayList<Fruit> fruits = new ArrayList<>();

	// Constructeur de la Classe Rayon.
	public Rayon(String etiquets, int number) {
		etiquete = etiquets;
		numero = number;
	}

	// Constructeur par Défaut de la classe Rayon.
	public Rayon() {

	}

	// Définition des Accésseur (getters) et Manipulateur (setters) de la classe
	// Rayon.
	public String getEtiquete() {
		return etiquete;
	}

	public void setEtiquete(String etiquete) {
		this.etiquete = etiquete;
	}

	public int getNumero() {
		return numero;
	}

	public ArrayList<Fruit> getFruits() {
		return fruits;
	}

	// Définition de la méthode toString().
	@Override
	public String toString() {
		return "[Rayons etiquete=" + etiquete + ", numero=" + numero + "]";
	}

	// Définition de la méthode equals() de la classe Rayon.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rayon other = (Rayon) obj;
		if (etiquete == null) {
			if (other.etiquete != null)
				return false;
		} else if (!etiquete.equals(other.etiquete))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}
