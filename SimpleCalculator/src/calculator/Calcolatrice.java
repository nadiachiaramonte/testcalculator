package calculator;

public class Calcolatrice {
	int add (int x, int y) {
		return x+y;
	}
	
	int addizione =0;
	int risultato = addizione ++ ;
	
	
	int sub (int x, int y) {
		return x-y;
	}
	

	
	
	int mul (int x, int y) {
		return x*y;
	}
	
	int div (int x, int y) {
		if (y==0) {
			return Integer.MAX_VALUE; 
		}
		else return x/y;
	}
	
	public int MCD(int x, int y) {
		if (y > x) 
			return MCD(y, x);
		if (y == 0)
			return x;
		return MCD(y, x%y);
	}
	
	public int mcm(int x, int y) {
		return (x*y)/MCD(x, y);
	}
	
}
