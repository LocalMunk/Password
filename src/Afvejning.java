import java.util.Scanner;
public class Afvejning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv tara vægt i kg og tryk enter:");
		int Tara = sc.nextInt();
		
		System.out.println("Skriv brutto vægt i kg og tryk enter:");
		int Brutto = sc.nextInt();
		
		int Netto = Brutto-Tara;
		
		System.out.println("Netto vægten er: " +Netto);

	}

}
