package com.flag.app.Entity;

public class Welcome {

	/**
	 * 报名的个数
	 */
	public int study_course_count;

	/**
	 * 收到报名个数
	 */
	public int recieved_reg_form_count;

	/**
	 * push推送课程报名个数
	 */
	public int unread_count;

	/**
	 * 开设课程
	 */
	public int teach_course_count;

	/**
	 * 用户头像
	 */
	public String avatar;

	/**
	 * 用户ID
	 */
	public int user_id;

	/**
	 * 用户名
	 */
	public String nickname;

	
	
	
	public Welcome() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Welcome(int study_course_count, int recieved_reg_form_count,
			int unread_count, int teach_course_count, String avatar,
			int user_id, String nickname) {
		super();
		this.study_course_count = study_course_count;
		this.recieved_reg_form_count = recieved_reg_form_count;
		this.unread_count = unread_count;
		this.teach_course_count = teach_course_count;
		this.avatar = avatar;
		this.user_id = user_id;
		this.nickname = nickname;
	}




	public int getStudy_course_count() {
		return study_course_count;
	}

	public void setStudy_course_count(int study_course_count) {
		this.study_course_count = study_course_count;
	}

	public int getRecieved_reg_form_count() {
		return recieved_reg_form_count;
	}

	public void setRecieved_reg_form_count(int recieved_reg_form_count) {
		this.recieved_reg_form_count = recieved_reg_form_count;
	}

	public int getUnread_count() {
		return unread_count;
	}

	public void setUnread_count(int unread_count) {
		this.unread_count = unread_count;
	}

	public int getTeach_course_count() {
		return teach_course_count;
	}

	public void setTeach_course_count(int teach_course_count) {
		this.teach_course_count = teach_course_count;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "Welcome [study_course_count=" + study_course_count
				+ ", recieved_reg_form_count=" + recieved_reg_form_count
				+ ", unread_count=" + unread_count + ", teach_course_count="
				+ teach_course_count + ", avatar=" + avatar + ", user_id="
				+ user_id + ", nickname=" + nickname + "]";
	}
	
	
	

}
