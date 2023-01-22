package SecondYearOOP;

class CalzadaRonald 
{
    void friend() {
        System.out.println("Jay");
    }
    void behavior() {
        System.out.println("Funny");
    }
}

class Friend1 extends CalzadaRonald {
    
    void friend() {
        System.out.println("Jose");
    }
    void behavior() {
        System.out.println("Shy");
    }
}

class Friend2 extends CalzadaRonald {
    
    void friend() {
        System.out.println("Jack");
    }
    void behavior() {
        System.out.println("Lover");
    }
}


public class main
{
	public static void main(String[] args)
	{
		CalzadaRonald A = new CalzadaRonald();
		CalzadaRonald B = new Friend1();
		CalzadaRonald C = new Friend2();
		
		
		
		A.friend();
		A.behavior();
		
		B.friend();
		B.behavior();
		
		C.friend();
		C.behavior();
		}
}