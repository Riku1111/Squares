package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x[] = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		double y[] = {0.0,1.5,2.9,3.6,5.0,6.6,8.3,9.9,12.0,14.0,16.3};
		double theta[] = new double[2];
		//���_�l��excel�ŋ��߂�����y=1.588182x
		Squares_lib slib = new Squares_lib(x,y);
		
		for(int i=0;i<100;i++){
			theta = slib.getDx();
			System.out.println(i+":theta[0] = "+theta[0]);
			System.out.println(i+":theta[1] = "+theta[1]);
			System.out.println(i+":Objective function ="+slib.getRx());
			
		}
	}

}
