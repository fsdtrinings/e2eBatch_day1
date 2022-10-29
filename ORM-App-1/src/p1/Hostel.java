package p1;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hostel {

	@Id
	private int recordId;
	private String hostelName;
	private int roomNumber;
	private int totalFees;
	private int remainingBalance;
	private String remarks;
	
	
}
