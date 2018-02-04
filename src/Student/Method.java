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
	//添加学生用户
	public void stuPut() {
		System.out.println("请输入学生的Id");
		Scanner in=new Scanner(System.in);
		String id=in.next();
		Style stu=style.get(id);
		if(stu==null) {
			System.out.println("请输入姓名");
			String name=in.next();
			System.out.println("请输入性别");
			String sex=in.next();
			//创建对象
			Style newstu=new Style(name,id,sex);
			style.put(id, newstu);
			System.out.println("成功添加用户"+style.get(id).getName());
		}else {
			System.out.println("此用户已存在");
		}
	}
	//删除用户
	public void delStyle() {
		System.out.println("请输入要删除的学生id");
		Scanner in=new Scanner(System.in);
		String id=in.next();
		Style stu=style.get(id);
		if(stu==null) {
			System.out.println("此学生不存在");
		}else {
			style.remove(id);
			System.out.println("学生ID为"+id+"的用户已被删除");
		}
	}
	//修改用户
	public void chastyle() {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入您要修改的学生ID");
		String in_=in.next();
		Style stu=style.get(in_);
		if(stu==null) {
			System.out.println("此学生不存在");
		}else {
			System.out.println("请输入新的姓名");
			String name=in.next();
			stu.setName(name);
			System.out.println("请输入性别");
			String sex=in.next();
			stu.setSex(sex);
			System.out.println("修改成功");
		}
	}
	//查询用户
	public void findstu() {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你要想查询的id");
		String id=in.next();
		Style stu=style.get(id);
		if(stu==null) {
			System.out.println("此学生不存在");
		}else {
			String name=stu.getName();
			String sex=stu.getSex();
			System.out.println("{ID:"+id+","+"name:"+name+","+"sex:"+sex+"}");
		}
	}
	//查询所有用户
	public void findAll() {
		System.out.println(style.values());
	}
}
