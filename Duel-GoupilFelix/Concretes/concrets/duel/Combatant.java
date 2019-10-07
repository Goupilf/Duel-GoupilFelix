package concrets.duel;



import java.util.ArrayList;
import java.util.List;

import abstracts.duel.ICapacite;
import abstracts.duel.ICombatant;
import exceptions.duel.StatsTooHighException;


public class Combatant implements ICombatant{
	public final int NOMBRE_DE_VIE_DE_BASE=200;
	public int Force;
	public int Dexterite;
	public int Intelligence;
	public int Concentration;
	public int Vie = NOMBRE_DE_VIE_DE_BASE - (Force+Dexterite+Intelligence+Concentration);
	public Statistiques stats;
	public CombatantEnum strategie;
	public List<ICapacite> list = new ArrayList<ICapacite>();
	
	
	
	public Combatant(Statistiques statistiques)
	{
		VerifyGeneral(statistiques);
		//setStrategie(strategie);
		Verify(statistiques);
		setStatistiques(statistiques);
		
	}
	
	public void setStrategie( CombatantEnum StrategieUtilise)
	{
		this.strategie = StrategieUtilise;
	}
	
	public CombatantEnum GetStrategie() 
	{
		return this.strategie;
	}
	
	public void setStatistiques(Statistiques statistiques) 
	{
		this.Force = statistiques.Force;
		this.Dexterite = statistiques.Dexterite;
		this.Intelligence = statistiques.Intelligence;
		this.Concentration = statistiques.Concentration;
	}
	private void VerifyGeneral(Statistiques statistiques) 
	{
		if(statistiques.Intelligence + statistiques.Force + statistiques.Dexterite + statistiques.Concentration <= 100) //à inverser pour ne pas avoir de if vide
		{
			
		}
		else throw new StatsTooHighException();
	}

	@Override
	public void Verify(Statistiques statistiques) {
		// TODO Auto-generated method stub
		
	}
	

	
	
}
