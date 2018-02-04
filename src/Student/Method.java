package Student;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Method {
	public Map<String,Style> style;
	public Method(){
		this.style = new HashMap<String,Style>();
	}
	//���ѧ���û�
	public void stuPut() {
		System.out.println("������ѧ����Id");
		Scanner in=new Scanner(System.in);
		String id=in.next();
		Style stu=style.get(id);
		if(stu==null) {
			System.out.println("����������");
			String name=in.next();
			System.out.println("�������Ա�");
			String sex=in.next();
			//��������
			Style newstu=new Style(name,id,sex);
			style.put(id, newstu);
			System.out.println("�ɹ�����û�"+style.get(id).getName());
		}else {
			System.out.println("���û��Ѵ���");
		}
	}
	//ɾ���û�
	public void delStyle() {
		System.out.println("������Ҫɾ����ѧ��id");
		Scanner in=new Scanner(System.in);
		String id=in.next();
		Style stu=style.get(id);
		if(stu==null) {
			System.out.println("��ѧ��������");
		}else {
			style.remove(id);
			System.out.println("ѧ��IDΪ"+id+"���û��ѱ�ɾ��");
		}
	}
	//�޸��û�
	public void chastyle() {
		Scanner in=new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ��ID");
		String in_=in.next();
		Style stu=style.get(in_);
		if(stu==null) {
			System.out.println("��ѧ��������");
		}else {
			System.out.println("�������µ�����");
			String name=in.next();
			stu.setName(name);
			System.out.println("�������Ա�");
			String sex=in.next();
			stu.setSex(sex);
			System.out.println("�޸ĳɹ�");
		}
	}
	//��ѯ�û�
	public void findstu() {
		Scanner in=new Scanner(System.in);
		System.out.println("��������Ҫ���ѯ��id");
		String id=in.next();
		Style stu=style.get(id);
		if(stu==null) {
			System.out.println("��ѧ��������");
		}else {
			String name=stu.getName();
			String sex=stu.getSex();
			System.out.println("{ID:"+id+","+"name:"+name+","+"sex:"+sex+"}");
		}
	}
	//��ѯ�����û�
	public void findAll() {
		System.out.println(style.values());
	}
}
