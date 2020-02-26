package kiemtra;

public class Account {

	String userName;
	String pass;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String userName) {
		this.userName = userName;
		this.pass = "admin123";
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", pass=" + pass + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean isCorrectPass(String pass) throws Exception {
		if (pass.length() < 8) {
			throw new Exception("Độ dài mật khẩu phải lớn hơn 7");
		}
		if (pass.matches("[^A-Z]+")) {
			throw new Exception("Phải có ít nhất 1 chữ in hoa");
		}
		if (pass.matches("[^0-9]+")) {
			throw new Exception("Phải có ít nhất 1 số ");
		}
		if (pass.matches("[^(~!@#$%^&*)]+")) {
			throw new Exception("Phải có ít nhất 1 trong các kí tự (~!@#$%^&*) ");
		}
		int count = 0;
		String user = this.getUserName();
		for (int i = 0; i < pass.length(); i++) {
			for (int j = 0; j < user.length(); j++) {
				String temp = user.charAt(j) + "";
				if (temp.equalsIgnoreCase(pass.charAt(i) + "")) {
					count++;
				}
			}

		}
		if (count >= 3) {
			throw new Exception("Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]");
		}
		return true;
	}

}
