public class EmpUC2{

	public static final int EMP_WAGE_PER_HOUR = 20;
	public static final int EMP_PART_TIME_WORK = 4;
	public static final int EMP_DAY_WORK = 8;
	public static final int EMP_PRESENT = 2;
	public static final int EMP_ABSENT = 0;
	public static final int EMP_PART_TIME= 1;
	public static final int DAYS = 20;
	public static final int TOTAL_HOURS = 100;


	public static void main(String[] args){


		int  total=0;
		int  hours=0;
		for(int i=0 ; i <= DAYS ; i++){

			int empCheck=(int)Math.floor(Math.random()*10)%3;

			switch(empCheck){

				case EMP_PRESENT:
					total += EMP_WAGE_PER_HOUR*EMP_DAY_WORK;
					hours += EMP_DAY_WORK;
					break;
				case EMP_PART_TIME:
					total += EMP_WAGE_PER_HOUR*EMP_PART_TIME_WORK;
					hours += EMP_PART_TIME_WORK;
					break;
				default :

			}


		}
		System.out.println("The Total Wage earned by Employee : "+ total);
	}
}







