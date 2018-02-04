package Student;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method admin=new Method();
		System.out.println("欢迎来到用户管理系统");
		while(true) {
			Scanner in=new Scanner(System.in);
			System.out.println("1-添加"+"****"+"2-删除"+"****"+"3-修改"+"4-查询"+"****"+"5-查询所有");
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
				System.out.println("操作错误,请重新执行操作");
			}
		}
	}

}
