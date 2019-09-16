package josd.login.entity;


public class Users {
	private String user_id;
	private String f_name;
	private String l_name;
	private String user_address;
	private String user_email;
	private String user_contNum;
	private String user_img;
	private String user_role;
	private String user_pw;
	
	
	
	public Users(String user_id, String f_name, String l_name, String user_address, String user_email,
			String user_contNum, String user_pw) {
		super();
		this.user_id = user_id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.user_address = user_address;
		this.user_email = user_email;
		this.user_contNum = user_contNum;
		this.user_pw = user_pw;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_contNum() {
		return user_contNum;
	}
	public void setUser_contNum(String user_contNum) {
		this.user_contNum = user_contNum;
	}
	public String getUser_img() {
		return user_img;
	}
	public void setUser_img(String user_img) {
		this.user_img = user_img;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
	public String toString() {
		return "User ["+"user_id = "+ user_id +", f_name=" + f_name + ", l_name=" + l_name + ", user_email=" + user_email
                + ", user_contNum=" + user_contNum + ", user_pw = "+ user_pw +" , user_contNum = "+ user_contNum + "]";
	}
	
	
}
