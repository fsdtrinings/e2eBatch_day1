package p1;

import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class Certification {

	private int certificateNumber;
	private String stream;
	private String certificateName;
	private String issueDate;
	private String validUpto;
	private String remark;
	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certification(int certificateNumber, String stream, String certificateName, String issueDate,
			String validUpto, String remark) {
		super();
		this.certificateNumber = certificateNumber;
		this.stream = stream;
		this.certificateName = certificateName;
		this.issueDate = issueDate;
		this.validUpto = validUpto;
		this.remark = remark;
	}
	public int getCertificateNumber() {
		return certificateNumber;
	}
	public void setCertificateNumber(int certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getValidUpto() {
		return validUpto;
	}
	public void setValidUpto(String validUpto) {
		this.validUpto = validUpto;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
