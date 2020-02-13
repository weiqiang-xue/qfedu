package day4;

public class Fibonacci {//输出前30位的斐波那契数列

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array=new int[30];
		array[0]=0;
		array[1]=1;
		array[2]=1;
		
		for(int i=3;i<array.length;i++){
			array[i]=array[i-1]+array[i-2];
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		

	}

}
