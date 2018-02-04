package Bank;

public class User {
	private String name;
	private Integer Cardnum;
	private String PassWord;
	private Integer money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Integer getCardnum() {
		return Cardnum;
	}
	public void setCardnum(Integer cardnum) {
		Cardnum = cardnum;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
}
