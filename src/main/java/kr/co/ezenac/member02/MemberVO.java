package kr.co.ezenac.member02;
/*
 * id	 varchar2(10) 		PRIMARY KEY 
    ,pwd varchar2(10)
    ,name varchar2(50)
    ,email varchar2(50)
    ,joinDate DATE DEFAULT sysdate 
 * */

import java.sql.Date;

public class MemberVO {
	/* t_member 테이블의 컬럼 이름과 동일한 자료형으로 속성들 선언함 */
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
	public MemberVO() {
		System.out.println("MemberVO 생성자 호출");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
}
