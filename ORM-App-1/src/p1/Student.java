package p1;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//  POJO  : Plain old java object


@Entity
@Table(name = "CAPG_Student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	private int id;
	@Column(name="Participant_Name")
	private String studentName;
	private String batchName;
	private int raiting;
	private String remarks;
	private String projectTeam;
	
	@Embedded
	private Address address;
	
	@Embedded
	@AttributeOverrides({
	      @AttributeOverride(name = "houseNumber", column = @Column(name = "temp_houseNumber")),
	      @AttributeOverride(name = "city", column = @Column(name = "temp_city")),
	      @AttributeOverride(name = "state", column = @Column(name = "temp_state")),
	      @AttributeOverride(name = "country", column = @Column(name = "temp_country")),
	      @AttributeOverride(name = "pincode", column = @Column(name = "temp_pincode")),
	})
	private Address tempAddress;
	
	
	@ElementCollection
	@CollectionTable(name = "StudentCertificates")
	private List<Certification> allCertificates;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "HostelInfo")
	private Hostel hostelInfo;
	
	
	
	public Student(String studentName, String batchName, int raiting, String remarks, String projectTeam) {
		super();
		this.studentName = studentName;
		this.batchName = batchName;
		this.raiting = raiting;
		this.remarks = remarks;
		this.projectTeam = projectTeam;
	}
	
	
	
	
	
	
	
	
	
	
}
