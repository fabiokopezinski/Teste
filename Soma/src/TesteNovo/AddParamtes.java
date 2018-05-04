package TesteNovo;


import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;



@RunWith(Parameterized.class)
public class AddParamtes {
	
	private int resultado;
	private int a;
	private int b;
	
	Hello hello;
	@Before
	public void setup() {
		hello=new Hello();
	}
	public AddParamtes(int resultado,int a,int b)
	{
		this.resultado=resultado;
		this.a=a;
		this.b=b;
		
	}
	@Parameters
	public static Collection<Object[]> testData(){
		
		Object[][] data= new Object[][]{ {50,20,30},{60,20,40} };
		 return Arrays.asList(data);
		
	
	}
	@Test
	public void testSomar()
	{
		Assert.assertEquals(resultado, hello.somar(a, b));
	}
	
	}
	

