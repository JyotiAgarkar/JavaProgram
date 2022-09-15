package JavaPracticeCode;

public class ForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]a= {{1,6},{3,9,4}};
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		for(int[] temp:a)
		{
			for(int tmp:temp)
			{
			System.out.print(tmp+",");
			}
		}
	}

}
