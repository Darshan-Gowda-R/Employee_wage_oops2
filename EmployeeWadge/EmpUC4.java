public class EmpUC4{

	public static final int EMP_WAGE_PER_HOUR = 20;
	public static final int EMP_PART_TIME_WORK = 4;
	public static final int EMP_DAY_WORK = 8;
	public static final int EMP_PRESENT = 2;
	public static final int EMP_ABSENT = 0;
	public static final int EMP_PART_TIME= 1;

	public static void main(String[] args){

		int empCheck=(int)Math.floor(Math.random()*10)%3;

		switch(empCheck){

			case EMP_PRESENT:
				System.out.println("Employee wage : " + EMP_WAGE_PER_HOUR*EMP_DAY_WORK);
				break;
			case EMP_PART_TIME:
				System.out.println("Employee wage : " + EMP_WAGE_PER_HOUR*EMP_PART_TIME_WORK);
				break;
			default :
				System.out.println("Employee WAGE : 0" );
		}

	}
}







