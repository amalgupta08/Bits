
public class TurningBitOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=16;
		int k=5;
		//System.out.println((~(1<<(k-1))));
		System.out.println(turnKthBitOff(x, k));
	}

	private static int turnKthBitOff(int x, int k) {
		// TODO Auto-generated method stub
		if(k<=0)
			return x;
		return (x&~(1<<(k-1)));
	}
}
