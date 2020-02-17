package day6.Bank;

import java.util.Scanner;

//银行类
public class Bank {
    Scanner input = new Scanner(System.in);
    User[] users = new User[5];//保存已注册的用户信息 全局变量


    public Bank() {//第一行逻辑，构造方法初始化变量
        User user1 = new User();
        user1.setCardNo("6220220165583524693");
        user1.setIdentity("410422199501291019");
        user1.setPassword("123456");
        user1.setUsername("薛炜强");
        user1.setPhone("15993372915");
        user1.setBalance(20000);
        users[0] = user1;

        users[1] = new User();
        users[1].setCardNo("62200006666777");
        users[1].setIdentity("41042219930920000");
        users[1].setPassword("123456");
        users[1].setPhone("1334562654");
        users[1].setUsername("黄闪闪");
        users[1].setBalance(2000.0);

        users[2] = new User();
        users[2].setCardNo("62223214567890000");
        users[2].setIdentity("4100000000000000");
        users[2].setPassword("123456");
        users[2].setPhone("15093825313");
        users[2].setUsername("张三");
        users[2].setBalance(1000.0);

        users[3] = new User("65550002111136542222", "4104221567894566", "小明", "123456", "15690726678", 4000.0);


    }


    //登录验证
    public void login() {
        System.out.print("请输入卡号：");
        System.out.println();
        String no = input.next();
        System.out.print("请输入密码:");
        System.out.println();
        String pwd = input.next();
        //验证卡号密码是否正确
        User u = check(no, pwd);//验证卡号密码
        if (u!=null) {
            System.out.println("登录成功!");
            this.showMenu(u);
        } else {
            System.out.println("卡号或密码错误");
        }
    }

    //单一职能原则验证卡号密码
    public User check(String no, String pwd) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {//避免空指针异常
                if (no.equals(users[i].getCardNo()) && pwd.equals(users[i].getPassword())) {
                    return users[i];
                }
            }
        }
        return null;
    }


    //展示菜单
    public void showMenu(User u) {
        int choice;

        do {
            System.out.println("1.开户 2.存款 3.取款 4.转账 5.查询余额 6.修改密码  0.退出");
            System.out.println("------------------");
            System.out.print("请输入操作编码");
             choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("执行开户操作");
                    break;
                case 2:
                    System.out.println("执行存款操作");
                    this.deposit(u);//调用存款函数
                    break;
                case 3:
                    System.out.println("执行取款操作");
                    this.withdrawal(u);//调用取款函数
                    break;
                case 4:
                    System.out.println("执行转账操作");
                    break;
                case 5:
                    System.out.println("执行查询余额操作");
                    this.checkbalance(u);//调用查询余额
                    break;
                case 6:
                    System.out.println("修改密码");
                    this.revisePassword(u);
                    break;
                case 0:
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入有误,重新输入");
                    break;
            }

        } while (true);
    }
    public void withdrawal(User mine){//取款功能
        System.out.println("请输入取款金额：");
        double money=input.nextDouble();
        if (money<mine.getBalance()) {

            mine.setBalance(mine.getBalance()-money);
            System.out.println("请等待，正在出钞.......");
            System.out.println("您的余额为："+mine.getBalance());
        }else{
            System.out.println("对不起，您的余额不足");
        }
    }
    public void deposit(User mine){//存款功能
        System.out.print("请输入存款金额：");
        double money=input.nextDouble();
        mine.setBalance(mine.getBalance()+money);
        System.out.println("存款成功！您的余额为"+mine.getBalance());
    }
    public void checkbalance(User mine){//查询余额
        System.out.println("您的余额为"+mine.getBalance());
    }


    public void revisePassword(User mine){//修改密码
        for(int i=1;;i++){
            System.out.print("请输入新密码：");
            String p1=input.next();
            System.out.print("请再次输入新密码：");
            String p2=input.next();
            if(p1.equals(p2)){
                mine.setPassword(p1);
                System.out.println("密码修改成功！");
                break;
            }else{
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            }
        }
    }

}



