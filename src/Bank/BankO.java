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
		System.out.println("�ѻ���������,���Ŀ����ǣ�"+cardNum);
		bankU.add(cardNum);
		System.out.println("�������������");
		Scanner name=new Scanner(System.in);
		String name_=name.next();
		if(name_==null) {
			System.out.println("�������������");
		}else {
		System.out.println("����������");
		Scanner sn=new Scanner(System.in);
		String passWord=sn.next();
		u_.setPassWord(passWord);
		System.out.println("�����ɹ�");
		}
	}
	public void Cunqian() {
			System.out.println("������������п���");
			Scanner cardnum=new Scanner(System.in); 
			int cardnum_=cardnum.nextInt();
//			User u_=new User();
//			int v=u_.getCardnum();
//			System.out.println(cardnum_);
			if(bankU.contains(cardnum_)){
				System.out.println("��½�ɹ�");
				for(int n=0;n<bankU.size();n++){
				System.out.println("��ѡ�����Ĵ����");
				Scanner putmon=new Scanner(System.in);
				int a=putmon.nextInt();
				monpack.add(a);
				int m=u_.getMoney();
				int money=(int)m+(int)a;
				System.out.println("�������Ϊ:"+money);	
			}
				System.out.println("�˺Ż��������󣬵�½ʧ��");
		}
	}
	public void Quqian(){
		for(int i=1;i<5;i++){
			System.out.println("������������п���");
			Scanner cardnum=new Scanner(System.in); 
			int cardnum_=cardnum.nextInt();
//			User u_=new User();
//			int v=u_.getCardnum();
			if(bankU.contains(cardnum_)){
				System.out.println("��½�ɹ�");
				for(int n=0;n<bankU.size();n++) {
					System.out.println("��ѡ������ȡ����");
					Scanner takemon=new Scanner(System.in);
					int d=takemon.nextInt();
					int m=u_.getMoney();
					if(d>m){
						System.out.println("����");
					}else {
						int c=(int)m-(int)d;
						System.out.println("�������Ϊ:"+c);
					}
			}
				
			}else{
				System.out.println("�˺Ż��������󣬵�½ʧ��");	
			}
		}
		
	}
	public void zhuanzhang() {
		for(int i=1;i<5;i++){
			System.out.println("������������п���");
			Scanner cardnum=new Scanner(System.in); 
			int cardnum_=cardnum.nextInt();
//			User u_=new User();
//			int v=u_.getCardnum();
			if(bankU.contains(cardnum_)){
				System.out.println("��½�ɹ�");
				for(int n=0;n<bankU.size();n++) {
					System.out.println("������Է��˺�");
					Scanner id=new Scanner(System.in);
					int id_=id.nextInt();
					System.out.println("������ĶԷ��˺�Ϊ��"+id_+"�Ƿ�ȷ�� 9----ȷ����0----����");
					Scanner p=new Scanner(System.in);
					int p_=p.nextInt();
					if(p_==9) {
						System.out.println("��ѡ������ת�˽��");
						Scanner takemon=new Scanner(System.in);
						int d=takemon.nextInt();
						int m=u_.getMoney();
						if(d>m){
							System.out.println("����");
						}else {
							int c=(int)m-(int)d;
							System.out.println("�������Ϊ:"+c);
						}
							
						}else {
							continue;
					}
					
				}		
			}
		}
		
	}
	public void findAll() {
		System.out.println("��ѡ���ҵ���ǲ�ѯ");
		System.out.println(list);
	}
}
