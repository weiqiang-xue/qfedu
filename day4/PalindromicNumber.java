package day4;
import java.util.Scanner;
public class PalindromicNumber {//输入一个数字判断是否为回文数

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1回文数
		System.out.print("请输入一个数字:");
		Scanner input =new Scanner (System.in);
		int number=input.nextInt();
		//定义一个变量，用来记录翻转后的数字
		int result=0;
		for(int n=number;n!=0;n/=10){
			result=result*10+n%10;
			}
			if(result==number){
				System.out.println(number+"是一个回文数");
			}else{
				System.out.println(number+"不是一个回文数");
				
			}
		}
}
