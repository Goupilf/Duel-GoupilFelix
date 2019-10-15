package concrets.duel;



import java.util.ArrayList;
import java.util.List;

import abstracts.duel.ICapacite;
import abstracts.duel.ICombatant;
import exceptions.duel.StatsTooHighException;


public class Combatant implements ICombatant{
	public final int NOMBRE_DE_VIE_DE_BASE=200;//MS Une constante doit être static final.
	public int Force;
	public int Dexterite;//MS Nomenclature java : propriétés en camelCase.
	public int Intelligence;
	public int Concentration;//MS POO1: On ne doit JAMAIS mettre une propriété public!
	public int Vie = NOMBRE_DE_VIE_DE_BASE - (Force+Dexterite+Intelligence+Concentration);
	public Statistiques stats;//MS Propriété stats jamais initialisée.
	public CombatantEnum strategie;
	public List<ICapacite> list = new ArrayList<ICapacite>();
	
	
	
	public Combatant(Statistiques statistiques)
	{
		VerifyGeneral(statistiques);
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
	
	public void setStatistiques(Statistiques statistiques) //MS Pourquoi on utilise un objet statistiques pour finalement tout remettre dans les propriétés du combattant?
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
