import java.util.*;
public class PokemonBattle {
	public static void main(String[] args) {
		String yourPoke = battlestart();
		damage(yourPoke);
		/* I did not put statsTable in main so that I could get all the date */
	}
	public static String battlestart() {
		Scanner input = new Scanner(System.in);
		System.out.println("Another tainer is issuing a chellenge!\n");
		System.out.println("Zebstrika appeared.\n");
		System.out.print("Which Pokemon do you choose? ");
		String youchoose = input.nextLine();
		System.out.println("\nYou chose " + youchoose + "!\n");
		System.out.println("It's a Pokemon battle between " + youchoose + " and Zebstrika!   Go!\n");
		return youchoose;
	}
	public static void damage(String dmgPoke) {
		Scanner input = new Scanner(System.in);
		System.out.println("Zebstrika used Thunderbolt!\n");
		System.out.println("Trainer, what are your " + dmgPoke + "'s stats?\n");
		int lvl = 40;
		System.out.println("Level: " + lvl);
		int atk = 52;
		System.out.println("\nAttack: " + atk);
		int def = 51;
		System.out.println("\nDefense: " + def);
		System.out.print("\nBase: ");
		int base = input.nextInt();
		int stab = 107;
		System.out.print("\nSTAB: ");
		int hp = 96;
		System.out.print("\nHP: " + hp);
		double mod = (0.85 + (Math.random() * 0.15)) * stab;
		int dmg = (int)Math.round(((2 * lvl + 10) / 250.0) + atk / def * base + 2)/** mod)*/;
		hp = hp - dmg;
		System.out.println("\n" + dmgPoke + " sustained " + dmg + " points damage.");
		System.out.println("\nHP, after damage, are now " + hp);
		statsTable(dmgPoke, lvl, atk, def, base, stab, hp);
	}
	public static void statsTable(String statsPoke, int statsLvl, int statsAtk, int statsDef, int statsBase, int statsStab, int statsHp) {
		System.out.println("\n\nName   " + statsPoke);
		System.out.println("\nLevel " + statsLvl);
		System.out.println("\n---------------------");
		System.out.println("HP     " + statsHp);
		System.out.println("\nATTACK " + statsAtk);
		System.out.println("\nDEFENSE   " + statsDef);
		System.out.println("\nBASE   " + statsBase);
		System.out.println("\nSTAB   " + statsStab);
	}
}
