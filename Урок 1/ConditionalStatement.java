public class ConditionalStatement {
	public static void main(String[] args){
		int year = 21;
		int male = 1;
		int height = 179;
		char firstLetterOfName = 'I';
		if(year>20){
			System.out.println("yes");	
		}
		if(male == 1){
			System.out.println("yes");
		}
		if(male != 1){
			System.out.println("no");
		}
		if(height<180){
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		if(firstLetterOfName == 'M') {
    System.out.println("yes");
} else if(firstLetterOfName == 'I') {
    System.out.println("no");
} else {
    System.out.println("UPS");}
}
}
