package concrets.duel;

import java.util.ArrayList;
import java.util.List;

import abstracts.duel.ICapacite;
import abstracts.duel.ICombatant;
import abstracts.duel.IMagicien;
import exceptions.duel.ConcentrationTooLowException;
import exceptions.duel.IntelligenceTooLowException;

public class Magicien implements IMagicien{
	
	public final int NOMBRE_DE_VIE_DE_BASE=200;
	public int Force;
	public int Dexterite;
	public int Intelligence;
	public int Concentration;
	public int Vie = NOMBRE_DE_VIE_DE_BASE - (Force+Dexterite+Intelligence+Concentration);
	public Statistiques stats;
	public CombatantEnum strategie;
	public List<ICapacite> list = new ArrayList<ICapacite>();
	
	public Magicien (Statistiques statistiques) 
	{
		ICombatant.VerifyGeneral(statistiques);
		Verify(statistiques);
		setStatistiques(statistiques);
	}

	@Override
	public void Verify(Statistiques statistiques)
	{
		if(statistiques.Intelligence >= ICombatant.Max(statistiques.Force, statistiques.Dexterite)+15) 
		{
			
		}
		else throw new IntelligenceTooLowException();
		
		if(statistiques.Concentration >= ICombatant.Max(statistiques.Force, statistiques.Dexterite) + 15 ) 
		{
			
		}
		else throw new ConcentrationTooLowException();
		
		
		
	}

	

	@Override
	public CombatantEnum GetStrategie() {
		
		return CombatantEnum.Magicien;
	}
	public void setStatistiques(Statistiques statistiques) 
	{
		this.Force = statistiques.Force;
		this.Dexterite = statistiques.Dexterite;
		this.Intelligence = statistiques.Intelligence;
		this.Concentration = statistiques.Concentration;
	}
	

	

	

	

}
