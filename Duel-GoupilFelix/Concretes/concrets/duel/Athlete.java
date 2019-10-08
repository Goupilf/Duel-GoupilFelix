package concrets.duel;

import java.util.ArrayList;
import java.util.List;

import abstracts.duel.IAthlete;
import abstracts.duel.ICapacite;

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
		setStatistiques(statistiques);
	}
	@Override
	public void Verify(Statistiques statistiques) {
		
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
