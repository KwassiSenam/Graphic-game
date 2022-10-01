import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Planete {
	/**
	 * @param args
	 */
	private String nom;
	private double niveauHabitabilite;
	private int nbHabitant;
	public int Count=0;
	List<Integer> liste = new ArrayList<Integer>();
	private Ressources ressource;
	private Argent monArgent;
	
	/***************************************/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getNiveauHabitabilite() {
		return niveauHabitabilite;
	}
	public void setNiveauHabitabilite() {
		this.niveauHabitabilite= ressource.getM_eau() + ressource.getM_oxygene() + ressource.getM_temperature();
		
	}
	/***************************************/
	public Planete(String nom) {
		this.nom = nom;
		this.nbHabitant=0;
		monArgent=new Argent();
		ressource = new Ressources(this);
	}
		
	/***************************************/
	
	public void creerColonie(Colonie nouveau)
	{
		monArgent.modifierArg(50);
		Count++;
		liste.add(nouveau.getNbHabitant());
	}
	
	public void ModArg(int arg)
	{
		monArgent.modifierArg(arg);
	}
	
	
	public String recuperationNom()
	{
		Scanner clavier = new Scanner(System.in);
		System.out.println("Nom ?");
		String nom = clavier.nextLine();
		clavier.close();
		return nom;
	}
	
	public long recuperationMoney()
	{
		return monArgent.getM_montant();
	}
	
	public int totalHabitant()
	{
		for(Integer nb : liste)
		{
			nbHabitant+=nb;
		
		}
		return nbHabitant;
	}
	
	/***************************************/
	public void creerMine()
	{
		Mines nouvelleMine = new Mines();
		monArgent.modifierArg(-100);
		/*on insert une gestion de temps
		for ()
		{
			monArgent.modifierArg(1000);
		}
		*/
	}
	public void creerForage()
	{
		PuitsDeForage forage = new PuitsDeForage();
		monArgent.modifierArg(50);
		//après une certaine durée il exécute ce bloc
		ressource.augmenterRess(5,0,0);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
