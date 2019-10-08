package concrets.duel;

import java.util.ArrayList;
import java.util.List;

import abstracts.duel.IAthlete;
import abstracts.duel.ICapacite;
import abstracts.duel.ICombatant;
import exceptions.duel.InvalidStatistiquesException;

public class Athlete implements IAthlete{

	public final int NOMBRE_DE_VIE_DE_BASE=200;
	public int Force;
	public int Dexterite;
	public int Intelligence;
	public int Concentration;
	public int Vie = NOMBRE_DE_VIE_DE_BASE - (Force+Dexterite+Intelligence+Concentration);
	public Statistiques stats;
	public CombatantEnum strategie;
	public List<ICapacite> list = new ArrayList<ICapacite>();
	
	public Athlete (Statistiques statistiques) 
	{
		ICombatant.VerifyGeneral(statistiques);
		Verify(statistiques);
		setStatistiques(statistiques);
	}
	@Override
	public void Verify(Statistiques statistiques) {
		if(statistiques.Force < 20 || statistiques.Dexterite <20 || statistiques.Intelligence <20 || statistiques.Concentration <20)throw new InvalidStatistiquesException();
		
	}

	@Override
	public CombatantEnum GetStrategie() {
		
		return CombatantEnum.Athlète;
	}
	public void setStatistiques(Statistiques statistiques) 
	{
		this.Force = statistiques.Force;
		this.Dexterite = statistiques.Dexterite;
		this.Intelligence = statistiques.Intelligence;
		this.Concentration = statistiques.Concentration;
	}

}
