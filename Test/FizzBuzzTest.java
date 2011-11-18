import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;


public class FizzBuzzTest
{
	public FizzBuzzer fizzBuzzer;
	
	@Before
	public void setUp()
	{
		fizzBuzzer = new FizzBuzzer();
	}
	
	@Test
	public void retourne100Resultat()
	{
		assertEquals(100, fizzBuzzer.GetResultats().size());
	}
	
	@Test 
	public void TroisEgaleFizz()
	{
		assertEquals("Fizz",fizzBuzzer.GetResultats().get(2));
	}
	
	@Test 
	public void CinqEgaleBuzz()
	{
		assertEquals("Buzz",fizzBuzzer.GetResultats().get(4));
	}
	
	@Test 
	public void SixEgaleFizz()
	{
		assertEquals("Fizz",fizzBuzzer.GetResultats().get(5));
	}
	
	@Test 
	public void DixEgaleBuzz()
	{
		assertEquals("Buzz",fizzBuzzer.GetResultats().get(9));
	}
	
	@Test 
	public void QuinzeTrenteEgaleFizzBuzz()
	{
		assertEquals("FizzBuzz",fizzBuzzer.GetResultats().get(14));
		assertEquals("FizzBuzz",fizzBuzzer.GetResultats().get(29));
	}
	
	@Test
	public void AfficherResultat()
	{
		for(int i = 0 ; i<fizzBuzzer.GetResultats().size(); i++)
			System.out.println(fizzBuzzer.GetResultats().get(i));
		
	}
}
