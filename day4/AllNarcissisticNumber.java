package day4;

public class AllNarcissisticNumber {//�������ˮ�ɻ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=999;i++){
			int a=i/100;//��λ
			int b=(i%100)/10;//ʮλ
			int c=i%10;//��λ
			if(a*a*a+b*b*b+c*c*c==i){
				System.out.print(i+"��һ��ˮ�ɻ���");
				System.out.println();
			}else{
				continue;
			}
		}

	}

}
