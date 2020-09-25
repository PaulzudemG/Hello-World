
public class HelloWorld {

	static int counter = 1;
	
	/* das war ein Programm aus der Schule, es zählt und so */
	public static void main(String[] args)  {
	
		while(counter<=100) {
			if(counter%3==0 && counter%5==0) {
				System.out.println("Fissbuss");
			}
		   if(counter%3==0)  {System.out.println("Fiss");}
		      else 
		         if (counter%5==0) {System.out.println("Buss");}
		           else {System.out.println(counter);}
		
		
		counter++;   
	
		}
	}
}
