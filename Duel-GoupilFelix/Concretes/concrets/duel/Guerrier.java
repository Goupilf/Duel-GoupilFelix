package concrets.duel;

import java.util.ArrayList;
import java.util.List;

import abstracts.duel.ICapacite;
import abstracts.duel.IGuerrier;


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
		
	}
	@Override
	public void Verify(Statistiques statistiques) {
		
	}

	@Override
	public CombatantEnum GetStrategie() {
		
		return CombatantEnum.Guerrier;
	}

	

	

}
