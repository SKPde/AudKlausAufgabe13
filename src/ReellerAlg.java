
public class ReellerAlg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReelleZahl x = new ReelleZahl(0.1);
		ReelleZahl y = new ReelleZahl(0);
		
		while(y.compareTo(new ReelleZahl(10)) < 0) {
			y = y.add(x);
		}
		
		if(! y.equals(new ReelleZahl(10))) {
			System.out.println("Rundungsfehler");
		}

	}

}
