/**
 * @author kwass
 *
 */
public class Argent {
	private int m_montant ;

	   /************************/
	   public int getM_montant() {
			return m_montant;
		}
		public void setM_montant(int montant) {
			this.m_montant=montant;
		}
	   
	   /************************/
	   public Argent()
	   {
		   m_montant = 10000;
	   }
	   
	   public void modifierArg(int prix)
	   {
		   this.m_montant += prix; //diminue argent
	   }


}
