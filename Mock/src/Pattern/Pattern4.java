package Pattern;

public class Pattern4 {

	public static void main(String[] args) {
		
		int n=7;
		int space=n/2;
		int star=1;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 0; j < space; j++) {
				System.out.print("0 ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if (i<=n/2) {
				space=space-1;
				star=star+2;
			} else {
               space=space+1;
               star=star-2;
			}
		}
	}
}
