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
			System.out.println("���з���");
			System.out.println("1------����");
			System.out.println("2------��Ǯ");
			System.out.println("3------ȡǮ");
			System.out.println("4------ת��");
			System.out.println("��ѡ������ҵ��");
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
				System.out.println("�����������������ѡ��");
			}
		}
		
	}
}
