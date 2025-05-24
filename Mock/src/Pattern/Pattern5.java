package Pattern;

public class Pattern5 {

	public static void main(String[] args) {
		

		int n=7;
		int space=n;
		int star=1;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 0; j < space; j++) {
				System.out.print("0 ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if (i<=n) {
				space=space-1;
				star=star+2;
			} 
	}
}

}