
import java.util.*;


public class PrintGraph {
    public static void main(String[] args) {
        //打印矩形
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        //打印直角三角形
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------");
        //九九乘法表
        for(int i=1;i<=9;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"x"+j+"="+i*j +"\t" );


            }
            System.out.println();
        }
        //直角梯形
        for (int i = 1; i <5 ; i++) {
            for(int j=1;j<i+4;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //等腰梯形
        for (int i = 1; i <=5 ; i++) {
            for(int j=1;j<=i+4;j++){
                if(i+j<=5){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        /*
        EFGHI
       DEFGH
      CDEFG
     BCDEF
    ABCDE
    */
         
        for (int i = 1; i <=5 ; i++) {
            for(int j=1;i+j<=10;j++){
                if(i+j<=5){
                    System.out.print(" ");
                }else{
                    System.out.print((char)('A'+j-1));
                }
            }
            System.out.println();
        }
    //百钱买百鸡
        for (int i = 0; i <100/5 ; i++) {//母鸡只数
            for (int j = 0; j <100/3 ; j++) {//公鸡只数
                for (int k = 0; k <100*3 ; k+=3) {//小鸡只数
                   if(i*5+j*3+k/3==100&& i+j+k==100){
                        System.out.println("母鸡: " + i + ", 公鸡: " + j + ", 小鸡: " + k);
                    }

                }

            }

        }

    }
}
