public class BubbleSort{

public static void main(String[] args){

int[] a = {12,34,55,67,4,8,9,9,9};
		int temp ;
		for(int i = 0 ; i< a.length ; i++) {
			int flag=0;
			for(int j = 0 ; j < a.length -1 - i ; j++)
			{
				
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] =  a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
			}else if(a[j] == a [j+1]) {
				 int index = j ; 
					for(int k = index ; k < a.length -1 ; k++) 
					  { 
						a[k] = a[k+1];
					  
					  }
				}
					 
			}
			if(flag==0)
				break;
		}
		
		for(int i=0 ; i < a.length ; i++) {
			System.out.println(a[i]+ " ");
		}
	}
}