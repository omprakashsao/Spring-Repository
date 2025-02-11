package in.pwskills.om.bean;

import java.io.Serializable;


public class Employee implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private Integer pid;
	private String pname;
	private Integer page;
	private String paddress;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	
	@Override
	public String toString() {
		return "Employee [pid=" + pid + ", pname=" + pname + ", page=" + page + ", paddress=" + paddress + "]";
	}

	
}
