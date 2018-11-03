package Number;

public class TaskThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = createRandom(5);
		System.out.println("aaa");
	}
	
	
	public static int[] createRandom (int n){
		
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=(int)Math.random()*99;
			if(array[i]<5) {
				i--;
			}
		}
		return array;
	}
	

}
