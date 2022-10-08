package Assignment1;

public class Task10 {

	public static void main(String[] args) {
		
		String [] value = new String[5];
		
		value[0] = "Java";
		value[1] = "JavaScript";
		value[2] = "Selenium";
		value[3] = "Python";
		value[4] = "Mukesh";
		
		for (int i=0;i<=value.length;i++){
			
			System.out.println(value[i]);
			
			if (value[i].equals("Selenium")){
				
				break;
			}
		}
	}

}
