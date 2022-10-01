
public class Ressources {
	   private float m_eau;
	   private float m_temperature;
	   private float m_oxygene;

	   /***************************/
	   public Ressources(Planete p)
	   {
		   m_eau=10;
		   m_temperature= 0 ;
		   m_oxygene=15;
	   }
	   
	   public float getM_eau() {
			return m_eau;
		}
		public void setM_eau(float eau) {
			this.m_eau = eau;
		}
		public float getM_temperature() {
			return m_temperature;
		}
		public void setM_temperature(float temperature) {
			this.m_temperature = temperature;
		}
		public float getM_oxygene() {
			return m_oxygene;
		}
		public void setM_oxygene(float oxygene) {
			this.m_oxygene = oxygene;
		}   
		   
	   /***************************/
	   public void augmenterRess(float param1, float param2, float param3)
	   {
		   setM_eau(param1);
		   setM_temperature(param2);
		   setM_oxygene(param3);
	   }

	   public void diminuerRess(float param1, float param2, float param3)
	   {
		   this.m_eau-= param1;
		   this.m_temperature-= param2;
		   this.m_oxygene-= param3;
	   }
	   
	   public void affichageStatistique()
	   {
	       System.out.println(m_eau);
	       System.out.println(m_oxygene);
	       System.out.println(m_temperature);
	   }
	   /***************************/

}
