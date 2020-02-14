package day5;


import java.util.Scanner;

    public class Exercise {
        public static void main(String[] args) {

             //one();
            // two();
            // three();
            four();
            //five();
            // six();
            // seven();
            // eight();
        }


        public static void one() {
            // 外层循环控制了打印多少行
            for (int line = 1; line <= 5; line++) {
                // 内存的循环控制每一行打印多少列
                for (int column = 1; column - line <= 4; column++) {
                    // 根据不同的条件，进行不同的结果输出
                    System.out.print(line > column ? " " : "*");
                }
                System.out.println();
            }
        }

        public static void two() {
            // 打印5行
            for (int line = 1; line <= 5; line++) {
                // 根据行跟列的规律，打印列
                for (int column = 1; column + line <= 10; column++) {
                    System.out.print(line > column ? " " : "*");
                }
                System.out.println();
            }
        }

        public static void three() {
            for (int line = 1; line <= 5; line++) {
                for (int column = 1; column - line <= 4; column++) {
                    System.out.print(line > column ? " " : (char)('A' + column - 1));
                }
                System.out.println();
            }
        }

        public static void four() {
            // 打印5行
            for (int line = 1; line <= 5; line++) {
                // 根据行跟列的规律，打印列
                for (int column = 1; column + line <= 10; column++) {
                    System.out.print(line + column <= 5 ? " " : (char)('A' + column - 1));
                }
                System.out.println();
            }
        }

        /**
         * 输出100以内所有的质数
         */
        public static void five() {

            for (int number = 2; number <= 100; number++) {
                // 1. 定义一个标志，假设所有的数字都是质数
                boolean flag = true;
                // 2. 从数字2开始，一直到number/2
                for (int i = 2; i <= number / 2; i++) {
                    // 3. 判断是否有一个i可以把number整除
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }
                // 4. 根据flag的值，输出最后的结果
                if (flag) {
                    System.out.println(number);
                }
            }
        }

        public static void six() {
            for (int i = 1000; i < 10000; i++) {
                // 求出这个四位数字的最后三位
                int last = i % 1000;

                if (i == last * 3) {
                    System.out.println(i);
                }
            }
        }

        public static void seven() {
            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();

            // sum: 用来记录每次累加的和
            // num: 用来记录每次累加的数字
            int sum = 0, num = 2;
            for (int i = 0; i < count; i++) {
                System.out.println(num);
                // 累加
                sum += num;
                // 计算下次需要累加的数字
                num = num * 10 + 2;
            }

            System.out.println(sum);
        }

        public static void eight() {

            double total = 0;       // 记录经过的总距离
            double height = 200;    // 记录单次起跳到落地共经过了多少米

            for (int i = 0; i < 10; i++, height /= 2) {
                total += height;
            }

            // 减最开始添加的上抛100米
            total -= 100;

            System.out.println(total);
        }


    }


