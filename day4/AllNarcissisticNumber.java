package day4;

public class AllNarcissisticNumber {//输出所有水仙花数

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=999;i++){
			int a=i/100;//百位
			int b=(i%100)/10;//十位
			int c=i%10;//个位
			if(a*a*a+b*b*b+c*c*c==i){
				System.out.print(i+"是一个水仙花数");
				System.out.println();
			}else{
				continue;
			}
		}

	}

}
