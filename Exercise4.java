package day2;
import java.util.*;

public class Exercise4 {//输出一个数字字符，转成字符中的数字
	public static void main(String[] args) {
		char a;
		int b;
		Scanner input=new Scanner(System.in);
		a=input.next().charAt(0);
		b=a-'0';
		
		System.out.println(b);
	}

}
