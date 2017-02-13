package kotitehtava1;

public class Noppa {
	public int silmaluku;
	
	public void heita() {
		silmaluku = (int)(Math.random()*6)+1;	
	}
	
	public int katsoSilmaluku() {
		return silmaluku;
	}

	public static void main(String[] args) {
		Noppa no1, no2;
		no1 = new Noppa();
		no2 = new Noppa();
		int i = 0;
		
	    do{
	        i++;
            no1.heita();
            no2.heita();
            System.out.println("Noppa 1: " + "[" + no1.silmaluku + "]" + " Noppa2: " + "[" + no2.silmaluku + "]");
     
	    }while(no1.silmaluku != no2.silmaluku);
	    System.out.println("Noppaa heitettiin " + i + " kertaa.");
	}

}
