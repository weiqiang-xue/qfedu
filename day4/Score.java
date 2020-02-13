package day4;
import java.util.Scanner;
public class Score {//输入学生的成绩，输出对应的级别

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入学生的成绩：");
		Scanner input =new Scanner (System.in);
		int s1=input.nextInt();
		if(s1<0||s1>100){
			System.out.println("成绩输入有误！");
		}else if(s1>=0 && s1<60){
			System.out.println("C");
		}else if(s1<80){
			System.out.println("B");
		}else{
			System.out.println("A");
		}
	}

}
