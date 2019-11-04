import java.util.*;
public class PokemonBattle {
	public static void main(String[] args) {
		String yourPoke = battlestart();
		damage(yourPoke);


	}
	public static String battlestart() {
		Scanner input = new Scanner(System.in);
		System.out.println("Another tainer is issuing a chellenge!");
		System.out.println("Zebstrika appeared.");
		System.out.print("Which Pokemon do you choose? ");
		String youchoose = input.nextLine();
		System.out.println("You chose " + youchoose + "!");
		System.out.println("It's a Pokemon battle between " + youchoose + " and Zebstrika!   Go!");
		return youchoose;
	}
	public static void damage(String dmgPoke) {
		Scanner input = new Scanner(System.in);
		System.out.println("Zebstrika used Thunderbolt!\n");
		System.out.println("Trainer, what are your " + dmgPoke + "'s stats?");
		System.out.print("Level: ");
		int lvl = input.nextInt();
		System.out.print("Attack: ");
		int atk = input.nextInt();
		System.out.print("Defense: ");
		int def = input.nextInt();
		System.out.print("Base: ");
		int base = input.nextInt();
		System.out.print("STAB: ");
		int stab = input.nextInt();
		System.out.print("HP: ");
		int hp = input.nextInt();
		double mod = (0.85 + (Math.random() * 0.15)) * stab;
		double dmg = (int) ((((2 * lvl + 10) / 250) + ((atk/def) * base + 2)) * mod);
		int finalHp = (int) (dmg - hp);
		System.out.println(dmgPoke + " sustained " + dmg + " points damage.");
		System.out.println("HP, after damage, are now " + finalHp);
		statsTable(dmgPoke);
	}
	public static void statsTable(String name) {
		System.out.println("Name   " + name);
	}
}
