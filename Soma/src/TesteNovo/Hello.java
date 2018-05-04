package TesteNovo;

public class Hello {
	public static void main(String[] args) {
		int a=30;
		int b=20;
		int r = somar(a, b);
		if(r==50)
		{
			System.out.println("Sucesso");
			//System.out.println(r);
		}
		else 
			System.out.println("FALHA!");
			//System.out.println(r);
		
		
	
	}

	public static int somar(int a, int b) {
		int r=a+b;
		return r;
	}
	}


