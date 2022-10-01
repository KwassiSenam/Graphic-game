/**
 * 
 */

/**
 * @author kwass
 *
 */
public class Colonie extends Planete {
		private int nbHabitant;
		private String nomVille;
		
		/***************************************/
		public int getNbHabitant() {
			return nbHabitant;
		}

		public String getNomVille() {
			return nomVille;
		}
		public void setNomVille(String nomVille) {
			this.nomVille = nomVille;
		}
		/***************************************/
		public Colonie(String nomPlanete, String nomVille) {
			super(nomPlanete); 
			this.nbHabitant = 10;
			this.nomVille = nomVille;
			}

			public void modifierHabitant(int nbHabitant_p)
			{
				//crer un thread ou une gestion de temps pour qu'à un certain temps il augmente le nb d'habitant
				/**
				 * while(true) 
				{ 
					Thread.sleep(200);
					this.nbHabitant +=nbHabitant_p;
				}
				 */

						this.nbHabitant +=nbHabitant_p;
		
			}
		
		public void afficheNbHabitant()
		{
			System.out.println(toString());
		}
			@Override
		public String toString() {
			return "Colonie [nbHabitant=" + nbHabitant + ", nomVille=" + nomVille + "]";
		}
		

}
