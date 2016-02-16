
public class GeneratorTest {

	
	public static void main(String[] args){
		long i = 1234567891;
		OperatorDTO operate = new OperatorDTO("Martin Dalby", i);
		System.out.println(operate.getPassword(11));
	}
}
