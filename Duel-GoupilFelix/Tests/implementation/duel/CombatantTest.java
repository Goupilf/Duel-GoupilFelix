package implementation.duel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import abstracts.duel.ICombatant;
import abstracts.duel.ICombatant.CombatantEnum;
import concrets.duel.Athlete;
import concrets.duel.Combatant;
import concrets.duel.Guerrier;
import concrets.duel.Magicien;
import concrets.duel.Statistiques;

public class CombatantTest {
	private final CombatantEnum GUERRIER_STRATEGIE = ICombatant.CombatantEnum.Guerrier;
	private final CombatantEnum ATHLETE_STRATEGIE = ICombatant.CombatantEnum.Athlète;
	private final CombatantEnum MAGICIEN_STRATEGIE = ICombatant.CombatantEnum.Magicien;
	private final int ANY_STAT_NUMBER = 10;
	
	@Test
	public void WHEN_ICombatantIsCreatedWithStrategieGuerrier_THEN_AGuerrierIsCreated() 
	{
		//Arrange
		Statistiques stats = new Statistiques(ANY_STAT_NUMBER, ANY_STAT_NUMBER, ANY_STAT_NUMBER, ANY_STAT_NUMBER);
		
		//Act
		ICombatant combatant = new Guerrier(stats);
		
		final CombatantEnum ACTUAL_COMBATANT_TYPE = combatant.GetStrategie();
				
		final CombatantEnum EXPECTED_COMBATANT_TYPE = GUERRIER_STRATEGIE;
		
		//Assert
		assertEquals(EXPECTED_COMBATANT_TYPE,ACTUAL_COMBATANT_TYPE);
	}
	
	@Test
	public void WHEN_ICombatantIsCreatedWithStrategieAthlete_THEN_AAthleteIsCreated() 
	{
		//Arrange
		Statistiques stats = new Statistiques(ANY_STAT_NUMBER, ANY_STAT_NUMBER, ANY_STAT_NUMBER, ANY_STAT_NUMBER);
		
		//Act
		ICombatant combatant = new Athlete(stats);
		
		final CombatantEnum ACTUAL_COMBATANT_TYPE = combatant.GetStrategie();
				
		final CombatantEnum EXPECTED_COMBATANT_TYPE = ATHLETE_STRATEGIE;
		
		//Assert
		assertEquals(EXPECTED_COMBATANT_TYPE,ACTUAL_COMBATANT_TYPE);
	}
	@Test
	public void WHEN_ICombatantIsCreatedWithStrategieMagicien_THEN_AMagicienIsCreated() 
	{
		//Arrange
		Statistiques stats = new Statistiques(ANY_STAT_NUMBER, ANY_STAT_NUMBER, ANY_STAT_NUMBER, ANY_STAT_NUMBER);
		
		//Act
		ICombatant combatant = new Magicien(stats);
		
		final CombatantEnum ACTUAL_COMBATANT_TYPE = combatant.GetStrategie();
				
		final CombatantEnum EXPECTED_COMBATANT_TYPE = MAGICIEN_STRATEGIE;
		
		//Assert
		assertEquals(EXPECTED_COMBATANT_TYPE,ACTUAL_COMBATANT_TYPE);
	}
}
