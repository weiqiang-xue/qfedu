package day4;
import java.util.Scanner;
public class PalindromicNumber {//����һ�������ж��Ƿ�Ϊ������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1������
		System.out.print("������һ������:");
		Scanner input =new Scanner (System.in);
		int number=input.nextInt();
		//����һ��������������¼��ת�������
		int result=0;
		for(int n=number;n!=0;n/=10){
			result=result*10+n%10;
			}
			if(result==number){
				System.out.println(number+"��һ��������");
			}else{
				System.out.println(number+"����һ��������");
				
			}
		}
}
