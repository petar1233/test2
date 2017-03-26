package weiser;

public class NFac {

	public int nFac(int n) {
		if (n == 0) {
			return 1;
		}
		return n*nFac(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(new NFac().nFac(13));
	}

}
