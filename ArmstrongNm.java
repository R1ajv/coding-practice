public class ArmstrongNm{

public static void main(String[] args){
		//Armstrong number
		
		int num = 0 ;
		int rem;
		int c;
		int arm = 0 ;
		
		System.out.println("Enter any Number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		c = num ;
		while(num>0) {
			rem = num % 10; 
			arm = (rem*rem*rem) + arm ;
			num = num/10;
		}
		if(c==arm) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
	}
}