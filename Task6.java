package Assignment1;

public class Task6 {

	public static void main(String[] args) {
		
		int value=0;
		
		for (int i=1;i<=1000;i++){
			
			for(int j=1;j<=i;j++){
				
				if(i%j==0){
					value++;
				}
				
			}
			if(value==2){
				System.out.println(i);
				
			}
			value=0;
		}
		
	}

}
