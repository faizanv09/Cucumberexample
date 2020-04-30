package Generalpractise.copy;

public class Smallestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x [][]= {{20,15,24},{69,68,98},{1000,11,45}};
		int min = x[0][0];
		
		for (int i =0;i<3;i++){
			for (int j=0;j<3;j++){
			
				if (x[i][j]>min){
					
					min= x[i][j];
				}
				
				
			}
			
		}
		
		System.out.println(min);
	}

}
