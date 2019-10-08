package concrets.duel;

import java.util.ArrayList;
import java.util.List;

import abstracts.duel.ICapacite;
import abstracts.duel.ICombatant;
import abstracts.duel.IGuerrier;
import exceptions.duel.InvalidStatistiquesException;


public class Guerrier implements IGuerrier{

	public final int NOMBRE_DE_VIE_DE_BASE=200;
	public int Force;
	public int Dexterite;
	public int Intelligence;
	public int Concentration;
	public int Vie = NOMBRE_DE_VIE_DE_BASE - (Force+Dexterite+Intelligence+Concentration);
	public Statistiques stats;
	public CombatantEnum strategie;
	public List<ICapacite> list = new ArrayList<ICapacite>();
	
	public Guerrier (Statistiques statistiques) 
	{
		ICombatant.VerifyGeneral(statistiques);
		Verify(statistiques);
		setStatistiques(statistiques);
	}
	@Override
	public void Verify(Statistiques statistiques) {
		if(statistiques.Force < statistiques.Dexterite +10 || statistiques.Dexterite + 10 < statistiques.Intelligence + 10|| statistiques.Intelligence +10 < statistiques.Concentration) throw new InvalidStatistiquesException();
		
	}

	@Override
	public CombatantEnum GetStrategie() {
		
		return CombatantEnum.Guerrier;
	}
	public void setStatistiques(Statistiques statistiques) 
	{
		this.Force = statistiques.Force;
		this.Dexterite = statistiques.Dexterite;
		this.Intelligence = statistiques.Intelligence;
		this.Concentration = statistiques.Concentration;
	}

	

	

}
