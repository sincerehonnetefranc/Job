package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		text line=new text();
		BankO way=new BankO();
		while(true) {
			System.out.println("银行服务");
			System.out.println("1------开户");
			System.out.println("2------存钱");
			System.out.println("3------取钱");
			System.out.println("4------转账");
			System.out.println("请选择您的业务");
			Scanner number=new Scanner(System.in);
			int number_=number.nextInt();
			
			if(number_==1) {
				
				way.Kaihu();
				
			}else if(number_==2) {
				way.Cunqian();
			}else if(number_==3) {
				way.Quqian();
			}else if(number_==4) {
				way.zhuanzhang();
			} else if(number_==6){
				way.findAll();
			}else{
				System.out.println("你的输入有误请重新选择");
			}
		}
		
	}
}
