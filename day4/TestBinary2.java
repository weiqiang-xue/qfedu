package day4;
import java.util.Scanner;
public class TestBinary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入要计算的数字：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		//用字符串记录辗转相除之后的结果
		String result="";
		//3
		for(int number=n;number!=0;number/=2){
			int last=number%2;
			result=last+result;
		}
		System.out.println(result);

	}

}
