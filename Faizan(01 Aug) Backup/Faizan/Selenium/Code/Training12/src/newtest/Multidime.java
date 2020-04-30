package newtest;

public class Multidime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]={{4,5,8},{8,9,6}};
		int b[][]={{7,8,9},{6,9,5}};
		
		int c[][]= new int [2][3];
		
		for(int i=0;i<2;i++){ 
			for (int j=0;j<3;j++){
				
				c[i][j]=a[i][j] + b [i][j];
				
				System.out.println(c[i][j]+ "");
			}
			System.out.println();
		}
				
		}

	

			
		

	}


