package day4;
import java.util.Scanner;
public class Score {//����ѧ���ĳɼ��������Ӧ�ļ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ѧ���ĳɼ���");
		Scanner input =new Scanner (System.in);
		int s1=input.nextInt();
		if(s1<0||s1>100){
			System.out.println("�ɼ���������");
		}else if(s1>=0 && s1<60){
			System.out.println("C");
		}else if(s1<80){
			System.out.println("B");
		}else{
			System.out.println("A");
		}
	}

}
