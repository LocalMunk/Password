import java.util.Scanner;

public class TUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		OperatorDTO loggedin = null;

		while (true) {
			System.out.println();
			System.out.println("Velkommen!");
			System.out.println("1. Opret ny bruger");
			System.out.println("2. Skift password");
			System.out.println("3. Afvejning");
			System.out.println("4. Afslut");
			if (loggedin == null) {
				System.out.println("5. log-in");
			} else if (loggedin != null) {
				System.out.println("5. log ud");
			}
			if (loggedin != null && loggedin.isSysAdmin()) {
				System.out.println("6. Admin controls");
			}
			System.out.println();
			switch (sc.nextInt()) {

			case 1:
				if (loggedin != null) {
					if (loggedin.isSysAdmin()) {
						controller.addUser();
					} else {
						System.out.println("Access denied");
					}
				} else {
					System.out.println("Log in først");
				}
				break;

			case 2:
				loggedin.setPassword();
				break;

			case 3:
				Afvejning vaegt = new Afvejning();
				vaegt.UdskrivVaegt();
				break;

			case 4:
				System.out.println("Systemet lukker");
				System.exit(0);
				break;

			case 5:
				if (loggedin != null) {
					loggedin = null;
				} else if (loggedin == null) {
					loggedin = null;
					System.out.println("Skriv dit user ID og dit password:");
					int id = sc.nextInt();
					String pass = sc.next();
					try {
						if (controller.getOperator(id).getPassword().equals(pass)) {
							System.out.println("Du er logget ind i systemet");
							loggedin = controller.getOperator(id);
						} else {
							System.out.println("Forkert password");
						}
					} catch (NullPointerException e) {
						System.out.println("User ID findes ikke");
					}
				}
				break;
			case 6:
				if (loggedin != null && loggedin.isSysAdmin()) {
					System.out.println("Skriv oprId på den person du vil ændre på:");
					int brugerId = sc.nextInt();
					if (controller.getOperator(brugerId) != null) {
						controller.updateUser(brugerId);
					} else {
						System.out.println("oprId findes ikke.");
					}
				}
				break;
			}

		}
	}
}
