import java.util.Scanner;
public class Afvejning {

	public double UdskrivVaegt() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv tara vægt i kg og tryk enter:");
		double Tara = sc.nextDouble();
		
		System.out.println("Skriv brutto vægt i kg og tryk enter:");
		double Brutto = sc.nextDouble();
		
		double Netto = Brutto-Tara;
		
		System.out.println("Netto vægten er: " +Netto);
		return Netto;
	}

}
