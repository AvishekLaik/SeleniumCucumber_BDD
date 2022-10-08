package Assignment1;

public class Task8 {

	public static void main(String[] args) {
		
		int [] marks = new int[5];
		
		marks[0] = 78;
		marks[1] = 12;
		marks[2] = 89;
		marks[3] = 55;
		marks[4] = 35;
		
		for (int i=0;i<marks.length;i++){
			
			if(marks[i]>80){
				
				System.out.println(marks[i]);
			}
		}
		
	}

}
