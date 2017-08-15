
public class ReelleZahl extends Zahl implements Comparable{
	
	private double value;
	
	public ReelleZahl(double v) {
		value = v;
	}

	@Override
	public ReelleZahl add(Zahl zahl) {
		// TODO Auto-generated method stub
		ReelleZahl temp = (ReelleZahl) zahl;
		return new ReelleZahl(value + temp.value);
	}
	
	public boolean equals(Object zahl) {
		ReelleZahl temp = (ReelleZahl) zahl;

		return temp.value == value;
	}

	@Override
	public int compareTo(Object o) {
		ReelleZahl temp = (ReelleZahl) o;
		if(temp.value == value) {
			return 0;
		} else if (temp.value < value) {
			return 1;
		} 
		return -1;
	}

}
