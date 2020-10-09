public class Cycle {
	public static void main(String[] args) {
		
		int k = -6; 
		int g = 10; // int g = 9; в комментарии код проще
		for (int i = 0; i <= 6; i++) {
			System.out.println(i);
			}
		System.out.println();
		while(k <= 6) {
			System.out.println(k);
			k = k + 2;
		}
		System.out.println();
		 do {                           // do { 
        	if (g % 2 == 1) {            // 	g = g + 2;
        		System.out.println(g);  // 	System.out.println(g);
        		g = g + 1;              // } while (g <=17);
        	} else {
        		g = g + 1;
        	}
 		 } while (g <=20);					
	}
}
