package combination;

public class Combination_lib {
	private int s,r;

	public Combination_lib(int s, int r) {
		this.s = s;
		this.r = r;
	}
	public int getFactorial(int f) {
		if(f <= 1) return 1;
		else return f*getFactorial(f-1);
	 }
}
