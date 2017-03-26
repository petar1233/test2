package weiser;

public class NFac {

	public static int nFac(int n) {
		if (n == 0) {
			return 1;
		}
		return n*nFac(n-1);
	}
	
	public static void main(String[] args) {
		for (int i =0;i<20;i++) {
			System.out.println(i + "! = " +nFac(i));
		}
	}

}
