package abstracts.duel;


import concrets.duel.Statistiques;

public interface ICombatant {
public enum CombatantEnum
	{
		Guerrier,Athlète,Magicien;   
	}

	public void Verify(Statistiques statistiques);

	public CombatantEnum GetStrategie();

	
	
	
	
	
	
	static int Max(int force, int dexterite) {
		int plusGrand;
		if(force>dexterite) 
		{
			plusGrand =force;
		}
		else 
		{
			plusGrand = dexterite;
		}
		return plusGrand;
	}
	public void setStatistiques(Statistiques statistiques);
	
}
