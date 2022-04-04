package disburse.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "T_2013Q4_HOUSE_DISBURSE")
public class HouseDisburseDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable =  false, name = "RECORDID")
	private int recordID;
	@Column(nullable =  false, name = "BIOGUIDE_ID")
	private String bioGuideID;
	@Column(nullable =  false, name = "OFFICE")
	private String office;
	@Column(nullable =  false, name = "CATEGORY")
	private String category;
	@Column(nullable =  false, name = "PAYEE")
	private String payee;
	@Column(nullable =  false, name = "START_DATE")
	private String startDate;
	@Column(nullable =  false, name = "END_DATE")
	private String endDate;
	@Column(nullable =  false, name = "PURPOSE")
	private String purpose;
	@Column(nullable =  false, name = "AMOUNT")
	private double amount;
	@Column(nullable =  false, name = "YEAR")
	private String year;
	public int getRecordID() {
		return recordID;
	}
	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}
	public String getBioGuideID() {
		return bioGuideID;
	}
	public void setBioGuideID(String bioGuideID) {
		this.bioGuideID = bioGuideID;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "HouseDisburseDetail [recordID=" + recordID + ", bioGuideID=" + bioGuideID + ", office=" + office
				+ ", category=" + category + ", payee=" + payee + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", purpose=" + purpose + ", amount=" + amount + ", year=" + year + "]";
	}
	
}
