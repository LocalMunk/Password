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
			System.out.println("5. log-in");
			if (loggedin != null){
				System.out.println("6. log ud");
			}
			if (loggedin != null && loggedin.isSysAdmin()){
				System.out.println("7. Admin controls");
			}
			System.out.println();
			switch (sc.nextInt()) {

			case 1:
				if(loggedin != null){
					if(loggedin.isSysAdmin()){
						controller.addUser();
					}
					else{
						System.out.println("Access denied");
					}
				}else{
					System.out.println("log in først");
				}
				break;

			case 2:
				loggedin.setPassword(loggedin.getOprId());
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
				loggedin = null;
				System.out.println("Skriv dit user ID og dit password:");
				int id = sc.nextInt();
				String pass = sc.next();
				if(controller.getOperator(id).getPassword().equals(pass)){
					System.out.println("Du er logget ind i systemet");
					loggedin = controller.getOperator(id);
				}
				else{
					System.out.println("Forkert user id eller password");
				}
				break;
			case 6:
				loggedin = null;
				break;
			case 7: 
				if (loggedin.isSysAdmin()){
					System.out.println("Skriv oprId på den person du vil ændre på");
					controller.updateUser(sc.nextInt());
				}
				break;
			}

		}
	}
}
