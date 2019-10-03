package josd.main.entity;

public class Chant {
	private String user_id;
	private String rec_dt;
	private int bf_8am;
	private int btw_8to6pm;
	private int af_6pm;
	private int chant_total;
	private int point_bf_8am;
	private int point_btw_8to6pm;
	private int point_af_6pm;
	private int point_total;
	private String up_dtime;
	private String up_id;
	private String user_id_1;
	
	public String getUser_id_1() {
		return user_id_1;
	}

	public void setUser_id_1(String user_id_1) {
		this.user_id_1 = user_id_1;
	}

	public Chant(String user_id, String rec_dt, int bf_8am, int btw_8to6pm, int af_6pm, int chant_total,
			int point_bf_8am, int point_btw_8to6pm, int point_at_6pm, int point_total, String up_dtime, String up_id) {
		super();
		this.user_id = user_id;
		this.rec_dt = rec_dt;
		this.bf_8am = bf_8am;
		this.btw_8to6pm = btw_8to6pm;
		this.af_6pm = af_6pm;
		this.chant_total = chant_total;
		this.point_bf_8am = point_bf_8am;
		this.point_btw_8to6pm = point_btw_8to6pm;
		this.point_total = point_total;
		this.up_dtime = up_dtime;
		this.up_id = up_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getRec_dt() {
		return rec_dt;
	}

	public void setRec_dt(String rec_dt) {
		this.rec_dt = rec_dt;
	}

	public int getBf_8am() {
		return bf_8am;
	}

	public void setBf_8am(int bf_8am) {
		this.bf_8am = bf_8am;
	}

	public int getBtw_8to6pm() {
		return btw_8to6pm;
	}

	public void setBtw_8to6pm(int btw_8to6pm) {
		this.btw_8to6pm = btw_8to6pm;
	}

	public int getAf_6pm() {
		return af_6pm;
	}

	public void setAf_6pm(int af_6pm) {
		this.af_6pm = af_6pm;
	}

	public int getChant_total() {
		return chant_total;
	}

	public void setChant_total(int chant_total) {
		this.chant_total = chant_total;
	}

	public int getPoint_bf_8am() {
		return point_bf_8am;
	}

	public void setPoint_bf_8am(int point_bf_8am) {
		this.point_bf_8am = point_bf_8am;
	}

	public int getPoint_btw_8to6pm() {
		return point_btw_8to6pm;
	}

	public void setPoint_btw_8to6pm(int point_btw_8to6pm) {
		this.point_btw_8to6pm = point_btw_8to6pm;
	}


	public int getPoint_af_6pm() {
		return point_af_6pm;
	}

	public void setPoint_af_6pm(int point_af_6pm) {
		this.point_af_6pm = point_af_6pm;
	}

	public int getPoint_total() {
		return point_total;
	}

	public void setPoint_total(int point_total) {
		this.point_total = point_total;
	}

	public String getUp_dtime() {
		return up_dtime;
	}

	public void setUp_dtime(String up_dtime) {
		this.up_dtime = up_dtime;
	}

	public String getUp_id() {
		return up_id;
	}

	public void setUp_id(String up_id) {
		this.up_id = up_id;
	}
	
	
}
