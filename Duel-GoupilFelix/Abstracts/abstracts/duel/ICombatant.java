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

	
	
	
	
	
	
	static int Max(int force, int dexterite) { //MS Il existe un package Math dans Java qui fournit une méthode Max(a,b)
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
	
	static void VerifyGeneral(Statistiques statistiques) //MS L'interface doit déclarer les méthodes qui seront implémentées dans les classes concrètes.
	{
		if(statistiques.Intelligence + statistiques.Force + statistiques.Dexterite + statistiques.Concentration <= 100) //à inverser pour ne pas avoir de if vide
		{
			
		}
		else throw new StatsTooHighException();
	}
	
}
