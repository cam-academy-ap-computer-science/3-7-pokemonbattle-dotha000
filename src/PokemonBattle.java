/*
import util
create class
	create main method
		call battlestart set to a variable
		call damage
	create battlestart method
		call Scanner
		introduce challenge
		ask user for pokemon and set to variable
		return pokemon
	create damage method
		call scanner
		introduce battle
		print stats
		get user input on base stat
		calculate damage
		print damage and remaining HP
		create parameter statsTable with the name and stats inside
	create statsTable method
		print out stats as a table
 */
//IMPORT UTIL
import java.util.*;
//CREATE CLASS
public class PokemonBattle {
	//CREATE MAIN METHOD
	public static void main(String[] args) {
		String yourPoke = battlestart();
		damage(yourPoke);
		/* I did not put statsTable in main so that I could get all the date */
	}
	//BATTLE INTRO METHOD
	public static String battlestart() {
		//ISSUE CHALLENGE
		Scanner input = new Scanner(System.in);
		System.out.println("Another trainer is issuing a chellenge!\n");
		System.out.println("Zebstrika appeared.\n");
		System.out.print("Which Pokemon do you choose? ");
		//GET USER INPUT POKEMON AND SET TO VARIABLE
		String youchoose = input.nextLine();
		System.out.println("\nYou chose " + youchoose + "!\n");
		System.out.println("It's a Pokemon battle between " + youchoose + " and Zebstrika!   Go!\n");
		//RETURN POKEMON NAME
		return youchoose;
	}
	//CALCULATING DAMAGE METHOD
	public static void damage(String dmgPoke) {
		//INTRODUCE BATTLE
		Scanner input = new Scanner(System.in);
		System.out.println("Zebstrika used Thunderbolt!\n");
		System.out.println("Trainer, what are your " + dmgPoke + "'s stats?\n");
		//STATS
		int lvl = 40;
		System.out.println("Level: " + lvl);
		int atk = 52;
		System.out.println("\nAttack: " + atk);
		int def = 51;
		System.out.println("\nDefense: " + def);
		//GET USER INPUT FOR BASE STAT
		System.out.print("\nBase: ");
		int base = input.nextInt();
		int stab = 2;
		System.out.println("\nSTAB: " + stab);
		int hp = 96;
		System.out.println("\nHP: " + hp);
		//CALCULATE DAMAGE AND MODERATOR
		double mod = (0.85 + (Math.random() * 0.15)) * stab;
		int dmg = (int)Math.round((((2 * lvl + 10) / 250.0) + (double)atk / def * base + 2) * mod);
		int finalHp = hp - dmg;
		//SETS HP TO 0 WHEN HP IS NEGATIVE
		for(int i = 0; hp < 0; hp++);
		//PRINT DAMAGE AND HP
		System.out.println("\n\n" + dmgPoke + " sustained " + dmg + " points damage.");
		System.out.println("\nHP, after damage, are now " + finalHp);
		//TAKE STATS AS A PARAMETER
		statsTable(dmgPoke, lvl, atk, def, base, stab, hp, finalHp);
	}
	//STATS TABLE METHOD
	public static void statsTable(String statsPoke, int statsLvl, int statsAtk, int statsDef, int statsBase, int statsStab, int statsHp, int statsFinalHp) {
		//PRINT OUT STATS
		System.out.println("\n\nName   " + statsPoke);
		System.out.println("\nLevel " + statsLvl);
		System.out.println("\n---------------------");
		System.out.println("\nHP     " + statsFinalHp + "/" + statsHp);
		System.out.println("\nATTACK " + statsAtk);
		System.out.println("\nDEFENSE   " + statsDef);
		System.out.println("\nBASE   " + statsBase);
		System.out.println("\nSTAB   " + statsStab);
	}
}
