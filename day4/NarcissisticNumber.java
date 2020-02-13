package day4;
import java.util.*;

public class NarcissisticNumber {//判断一个数字是否为水仙花数

	public static void main(String[] args) {//判断一个数字是否为水仙花数
		// TODO Auto-generated method stub
		System.out.println("请输入一个数字：");
		Scanner input =new Scanner (System.in);
		int num=input.nextInt();
		if(num<100||num>999){
			System.out.print("输入有误，请输入一个三位数");
		}else {
			int a=num/100;//百位
			int b=(num%100)/10;//十位
			int c=num%10;//个位
			if(a*a*a+b*b*b+c*c*c==num){
				System.out.print(num+"是一个水仙花数");
			}else{
				System.out.print(num+"不是一个水仙花数");
			}			
		}	
	}
}
