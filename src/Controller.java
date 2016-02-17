import java.util.Scanner;

public class Controller {

	OperatorDTO[] users;
	int currentID, lastAdded;
	Scanner keyboard;
	
	public Controller(){
		users = new OperatorDTO[88];
		lastAdded = 0;
		currentID = 11;
		keyboard = new Scanner(System.in);
		initSystemAdmin();
		
	}
	
	public void addUser(){
		System.out.println("Skriv brugerens navn:");
		String navn = keyboard.nextLine();
		System.out.println("Skriv brugerens CPR:");
		long cpr = keyboard.nextLong();
		users[lastAdded] = new OperatorDTO(navn, cpr, currentID);
		System.out.println("Dit userId er: " + currentID);
		currentID++; lastAdded++;
	}
	
	public void initSystemAdmin(){
		users[lastAdded] = new OperatorDTO("Martin Dalby", 0000000001, currentID);
		users[lastAdded].setPassword("aA1bB2=");
		users[lastAdded].setSysAdmin(true);
		currentID++; lastAdded++;
		
	}
	
	public OperatorDTO getOperator(int id){
		return users[id - 11];
		
	}
	
	
}
