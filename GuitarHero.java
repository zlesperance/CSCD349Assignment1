import java.util.Scanner;


public class GuitarHero {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Guitarist guitarist = changeCharacter(kb);
		
		int menuChoice;		
		do {
			menuChoice = menu(kb);
			switch (menuChoice) {
			case 1: guitarist = changeCharacter(kb); break;
			case 2: guitarist.setGuitar(changeGuitar(kb)); break;
			case 3: guitarist.setSoloAction(changeSolo(kb)); break;
			case 4: System.out.println("Ladies and Gentlement, " + guitarist.getName() + "!!!"); break;
			case 5: guitarist.playGuitar(); break;
			case 6: guitarist.playSolo(); break;
			}
		} while (menuChoice != 7);
		
		kb.close();
	}
	
	public static int menu(Scanner kb) {
		System.out.println();
		System.out.println("1) Change Character");
		System.out.println("2) Change Guitar");
		System.out.println("3) Change Solo");
		System.out.println("4) Introduce Character");
		System.out.println("5) Play Guitar");
		System.out.println("6) Play Solo");
		System.out.println("7) End Show");
		int choice;
		do {
			System.out.print(">> ");
			choice = kb.nextInt();
		} while(choice < 1 || choice > 7);
		kb.nextLine();
		System.out.println();
		
		return choice;
	}
	
	public static Guitarist changeCharacter(Scanner kb) {
		System.out.println("Select Character:");
		System.out.println("=================");
		System.out.println("1) Slash");
		System.out.println("2) Jimi Hendrix");
		System.out.println("3) Angus Young");
		int choice;
		
		do {
			System.out.print(">> ");
			choice = kb.nextInt();
		} while (choice < 1 || choice > 3);
		kb.nextLine();
		
		if (choice == 1)
			return new GuitaristSlash();
		if (choice == 2)
			return new GuitaristHendrix();
		return new GuitaristYoung();
	}
	
	public static Guitar changeGuitar(Scanner kb) {
		System.out.println("Select Guitar:");
		System.out.println("==============");
		System.out.println("1) Gibson SG");
		System.out.println("2) Fender Telecaster");
		System.out.println("3) Gibson Flying V");
		
		int choice;
		
		do {
			System.out.print(">> ");
			choice = kb.nextInt();
		} while (choice < 1 || choice > 3);
		kb.nextLine();
		
		if (choice == 1)
			return new GuitarGibsonSG();
		if (choice == 2)
			return new GuitarFenderTelecaster();
		return new GuitarGibsonFlyingV();
		
	}
	
	public static SoloAction changeSolo(Scanner kb) {
		System.out.println("Change Solo Action:");
		System.out.println("===================");
		System.out.println("1) Light Guitar on Fire");
		System.out.println("2) Jump off the Stage");
		System.out.println("3) Smash the Guitar");
		
		int choice;
		do {
			System.out.print(">> ");
			choice = kb.nextInt();
		} while (choice < 1 || choice > 3);
		
		if (choice == 1)
			return new SoloActionFire();
		if (choice == 2)
			return new SoloActionStageJump();
		return new SoloActionSmash();
	}

}
