package day4;
import java.util.*;

public class NarcissisticNumber {//�ж�һ�������Ƿ�Ϊˮ�ɻ���

	public static void main(String[] args) {//�ж�һ�������Ƿ�Ϊˮ�ɻ���
		// TODO Auto-generated method stub
		System.out.println("������һ�����֣�");
		Scanner input =new Scanner (System.in);
		int num=input.nextInt();
		if(num<100||num>999){
			System.out.print("��������������һ����λ��");
		}else {
			int a=num/100;//��λ
			int b=(num%100)/10;//ʮλ
			int c=num%10;//��λ
			if(a*a*a+b*b*b+c*c*c==num){
				System.out.print(num+"��һ��ˮ�ɻ���");
			}else{
				System.out.print(num+"����һ��ˮ�ɻ���");
			}			
		}	
	}
}
