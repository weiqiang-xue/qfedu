package day4;

import java.util.Scanner;

public class testEnglishNumber {

	public static void main(String[] args) {//转换大小写字母
		// TODO Auto-generated method stub
		System.out.println("请输入一个字符：");
		Scanner input =new Scanner (System.in);
		char c1=input.next().charAt(0);
		if(c1>='A'&&c1<='Z'){
			System.out.println((char)(c1+32));
		}else if(c1>='a'&&c1<='z'){
			System.out.println((char)(c1-32));
		}else{
			System.out.println(c1);
		}
	}

}
