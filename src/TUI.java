import java.util.Scanner;

public class TUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Velkommen!");
		System.out.println("1. Opret ny bruger");
		System.out.println("2. Skift password");
		System.out.println("3. Afvejning");
		System.out.println("4. Afslut");

		switch (sc.nextInt()) {

		case 1:
			System.out.println("Skriv dit navn og derefter cpr nr.");
			String navn = sc.nextLine();
			long cpr = sc.nextLong(1);
			OperatorDTO NewUser = new OperatorDTO(navn, cpr);
			break;

		case 2:
			System.out.println("Skriv dit oprId og derefter dit nye password");

			break;

		case 3:
			Afvejning vaegt = new Afvejning();
			vaegt.UdskrivVaegt();
			break;

		case 4:
			System.out.println("Systemet lukker");
			System.exit(0);
			break;
		}

	}

}
