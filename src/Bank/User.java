package Bank;

public class User {
	private String name;
	private int Cardnum;
	private String PassWord;
	private int money;
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setCardnum(int cardnum) {
		Cardnum = cardnum;
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
