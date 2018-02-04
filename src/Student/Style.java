package Student;

public class Style {
	private String stuId;
	private String name;
	private String sex;
	public Style() {
		
	}
	public Style(String name,String stuId,String sex) {
		super();
		this.name=name;
		this.stuId=stuId;
		this.sex=sex;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String toString() {
		return "Admin [name=" + name + ", id=" + stuId + ", sex=" + sex + "]";
	}
	
}
