
public class HelloWorld {

	static int counter = 0;
	
	/* das war ein Programm aus der Schule, es z�hlt und so */
	public static void main(String[] args)  {
	
		while(counter<100) {
		if(counter%5==0)
		{System.out.println("HA");}
		else { System.out.println("HelloWorld");}
		
		System.out.println(counter);
		
		counter++;   
	
		}
	}
}
