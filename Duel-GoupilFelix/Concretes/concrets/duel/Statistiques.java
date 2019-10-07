package concrets.duel;

public class Statistiques {
	
	public final int NOMBRE_DE_VIE_DE_BASE=200;
	public int Force;
	public int Dexterite;
	public int Intelligence;
	public int Concentration;
	public int Vie = NOMBRE_DE_VIE_DE_BASE - (Force+Dexterite+Intelligence+Concentration);

	public Statistiques(int Force, int Dexterite, int Intelligence, int Concentration)
	{
		this.Force = Force;
		this.Dexterite = Dexterite;
		this.Intelligence = Intelligence;
		this.Concentration = Concentration;
	}
	public int getForce() 
	{
		return this.Force;		
	}
	public int getDexterite() 
	{
		return this.Dexterite;		
	}
	public int getIntelligence() 
	{
		return this.Intelligence;		
	}
	public int getConcentration() 
	{
		return this.Concentration;
	}
	
	
}
