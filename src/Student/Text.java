package Student;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method admin=new Method();
		System.out.println("��ӭ�����û�����ϵͳ");
		while(true) {
			Scanner in=new Scanner(System.in);
			System.out.println("1-���"+"****"+"2-ɾ��"+"****"+"3-�޸�"+"4-��ѯ"+"****"+"5-��ѯ����");
			int item=in.nextInt();
			if(item==1) {
				admin.stuPut();
			}else if(item==2) {
				admin.delStyle();
			}else if(item==3) {
				admin.chastyle();
			}else if(item==4) {
				admin.findstu();
			}else if(item==5) {
				admin.findAll();
			}else{
				System.out.println("��������,������ִ�в���");
			}
		}
	}

}
