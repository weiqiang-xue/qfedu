package day4;
import java.util.*;
public class printEnglishNumber {//��ӡ������ĸ�����ĸ

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner =new Scanner (System.in);
			char c1=scanner.next().charAt(0);
			char c2=scanner.next().charAt(0);
			char max=c1>c2 ? c1:c2;
			char min=c1>c2 ? c2:c1;
			//���Ž�
			for(int  c=min+1;c<max;c++){
				if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
					System.out.print((char)c);
				}
			}
			System.out.println();
			
			//2�Լ����
			
			if(max<90){//ȫΪ��д
				for(int i=min+1;i<max;i++)
				System.out.print((char)i);
				
			}else if(min>=97){//ȫΪСд
				for(int j=min+1;j<max;j++){
					System.out.print((char)j);
					
				}
			}else{
				for(int k=min;k<90;k++){//minΪ��д��ĸ��ASCII��
					System.out.print((char)k);
				}
				for(int l=97;l<max;l++){//maxΪСд��ĸ��ASCII��
					System.out.print((char)l);
				}
				}
			
			}	
	}


