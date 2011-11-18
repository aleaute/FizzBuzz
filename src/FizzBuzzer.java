import java.util.ArrayList;
import java.util.List;


public class FizzBuzzer {

	List<String> resultats;
	
	public FizzBuzzer ()
	{
		resultats = new ArrayList<String>(100);
		genererFizzBuzz();
	}
	
	public void genererFizzBuzz()
	{
		for(int i = 1; i <= 100; i++){
			if ( estMultipleDe3(i) && estMultipleDe5(i))
				resultats.add("FizzBuzz");
			else if ( estMultipleDe3(i))
				resultats.add("Fizz");
			else if ( estMultipleDe5(i))
				resultats.add("Buzz");
			else 
				resultats.add(String.valueOf(i));
		}
	}
	
	public List<String> GetResultats()
	{
		return resultats;
	}
	
	public boolean estMultipleDe3(int value)
	{
		return (value % 3 == 0);
	}
	
	public boolean estMultipleDe5(int value)
	{
		return (value % 5 == 0);
	}
}
