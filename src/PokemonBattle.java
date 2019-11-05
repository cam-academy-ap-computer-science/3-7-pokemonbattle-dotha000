import java.util.*;
public class PokemonBattle {
	public static void main(String[] args) {
		String yourPoke = battlestart();
		damage(yourPoke);


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
		System.out.print("Level: ");
		int lvl = input.nextInt();
		System.out.print("\nAttack: ");
		int atk = input.nextInt();
		System.out.print("\nDefense: ");
		int def = input.nextInt();
		System.out.print("\nBase: ");
		int base = input.nextInt();
		System.out.print("\nSTAB: ");
		int stab = input.nextInt();
		System.out.print("\nHP: ");
		int hp = input.nextInt();
		double mod = (0.85 + (Math.random() * 0.15)) * stab;
		int dmg = (int) ((((2 * lvl + 10) / 250) + ((atk/def) * base + 2)) * mod);
		hp = hp - dmg;
		System.out.println(dmgPoke + " sustained " + dmg + " points damage.");
		System.out.println("HP, after damage, are now " + hp);
		statsTable(dmgPoke, lvl, atk, def, base, stab, hp);
	}
	public static void statsTable(String statsPoke, int statsLvl, int statsAtk, int statsDef, int statsBase, int statsStab, int statsHp) {
		System.out.println("Name   " + statsPoke);
	}
}
