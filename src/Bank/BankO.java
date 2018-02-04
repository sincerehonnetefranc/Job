package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankO {
	List list=new ArrayList();
	List CardNum=new ArrayList();
	List bankU=new ArrayList();
	List monpack=new ArrayList();
	User u_=new User();
	public void Kaihu() {
//		System.out.println("hhh");
//		Scanner num=new Scanner(System.in);
//		int in=num.nextInt();
		int cardNum=(int)(Math.random()*900+100);
		u_.setCardnum(cardNum);
		System.out.println("已获得随机卡号,您的卡号是："+cardNum);
		bankU.add(cardNum);
		System.out.println("请输入你的名字");
		Scanner name=new Scanner(System.in);
		String name_=name.next();
		if(name_==null) {
			System.out.println("请输入你的名字");
		}else {
		System.out.println("请设置密码");
		Scanner sn=new Scanner(System.in);
		String passWord=sn.next();
		u_.setPassWord(passWord);
		System.out.println("开户成功");
		}
	}
	public void Cunqian() {
			System.out.println("请输入你的银行卡号");
			Scanner cardnum=new Scanner(System.in); 
			int cardnum_=cardnum.nextInt();
//			User u_=new User();
//			int v=u_.getCardnum();
//			System.out.println(cardnum_);
			if(bankU.contains(cardnum_)){
				System.out.println("登陆成功");
				for(int n=0;n<bankU.size();n++){
				System.out.println("请选择您的存款金额");
				Scanner putmon=new Scanner(System.in);
				int a=putmon.nextInt();
				monpack.add(a);
				int m=u_.getMoney();
				int money=(int)m+(int)a;
				System.out.println("您的余额为:"+money);	
			}
				System.out.println("账号或密码有误，登陆失败");
		}
	}
	public void Quqian(){
		for(int i=1;i<5;i++){
			System.out.println("请输入你的银行卡号");
			Scanner cardnum=new Scanner(System.in); 
			int cardnum_=cardnum.nextInt();
//			User u_=new User();
//			int v=u_.getCardnum();
			if(bankU.contains(cardnum_)){
				System.out.println("登陆成功");
				for(int n=0;n<bankU.size();n++) {
					System.out.println("请选择您的取款金额");
					Scanner takemon=new Scanner(System.in);
					int d=takemon.nextInt();
					int m=u_.getMoney();
					if(d>m){
						System.out.println("余额不足");
					}else {
						int c=(int)m-(int)d;
						System.out.println("您的余额为:"+c);
					}
			}
				
			}else{
				System.out.println("账号或密码有误，登陆失败");	
			}
		}
		
	}
	public void zhuanzhang() {
		for(int i=1;i<5;i++){
			System.out.println("请输入你的银行卡号");
			Scanner cardnum=new Scanner(System.in); 
			int cardnum_=cardnum.nextInt();
//			User u_=new User();
//			int v=u_.getCardnum();
			if(bankU.contains(cardnum_)){
				System.out.println("登陆成功");
				for(int n=0;n<bankU.size();n++) {
					System.out.println("请输入对方账号");
					Scanner id=new Scanner(System.in);
					int id_=id.nextInt();
					System.out.println("您输入的对方账号为："+id_+"是否确定 9----确定；0----错误");
					Scanner p=new Scanner(System.in);
					int p_=p.nextInt();
					if(p_==9) {
						System.out.println("请选择您的转账金额");
						Scanner takemon=new Scanner(System.in);
						int d=takemon.nextInt();
						int m=u_.getMoney();
						if(d>m){
							System.out.println("余额不足");
						}else {
							int c=(int)m-(int)d;
							System.out.println("您的余额为:"+c);
						}
							
						}else {
							continue;
					}
					
				}		
			}
		}
		
	}
	public void findAll() {
		System.out.println("你选择的业务是查询");
		System.out.println(list);
	}
}
