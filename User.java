package day6.Bank;

import java.io.PushbackReader;

public class User {
    private String cardNo;//开号
    private  String identity;//身份证
    private String username;//用户名
    private  String password;//密码
    private String phone ;//手机号码
    private  double balance;//余额
    public User(){//无参构造
    }
    //有参构造
    public User(String cardNo,String identity,String username,String password,String phone,double blance){
        this.cardNo=cardNo;
        this.identity=identity;
        this.username= username;
        this.password=password;
        this.phone=phone;
        this.balance=balance;
    }
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



}
