package abstracts.duel;


import concrets.duel.Statistiques;
import exceptions.duel.StatsTooHighException;

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
	
	static void VerifyGeneral(Statistiques statistiques) 
	{
		if(statistiques.Intelligence + statistiques.Force + statistiques.Dexterite + statistiques.Concentration <= 100) //à inverser pour ne pas avoir de if vide
		{
			
		}
		else throw new StatsTooHighException();
	}
	
}
