public class Ev05{
	public static void main(String[] args) {

		String ep[]={"Sis","Amb","Civil"};
		int ent[][] = {	{15,16,17,15},
						{11,17,20,16},
						{12,19,25,15},
						{12,19,25,65}
					  };
		int[] semi = calSueldo(ent);

		for (int i=0;i<semi.length ;i++ ) {
			System.out.println(""+ep[i]+"="+semi[i]);
		}
		
	}
	public static int[] calSueldo(int A[][]) {
		int[] semi = new int[A[0].length];
		for (int j=0; j< A[0].length ; j++ ) {
			semi[j]=0;
			for (int i=0;i<A.length ;i++ ) {
				semi[j] = semi[j]+A[i][j];
			}
		}
		return semi;
	}
}