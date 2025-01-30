package in.pwskills.om.bean;

public class CustomerBO {
	
	private String customerName;
	private String customerAddress;
	private Float pamt;
	private Float time;
	private Float rate;
	
	private Float si;
	
	
	
	
	
	public Float getSi() {
		return si;
	}



	public void setSi(Float si) {
		this.si = si;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}



	public Float getPamt() {
		return pamt;
	}



	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}



	public Float getTime() {
		return time;
	}



	public void setTime(Float time) {
		this.time = time;
	}



	public Float getRate() {
		return rate;
	}



	public void setRate(Float rate) {
		this.rate = rate;
	}



	@Override
	public String toString() {
		return "CustomerBO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", time=" + time + ", rate=" + rate + ", si=" + si + "]";
	}



	
}
