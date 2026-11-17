package oneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Pan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer panId;
	private String occupation;
	private Integer yearly_income;
	// @OneToOne(cascade = CascadeType.ALL) // " It is by default EAGER " It fetches all the related data all at once "
	// @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER) // " EAGER | It fetches all the related data all at once "
	@OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY) // " LAZY | It only calls the required data | If any related data is needed later it goes back and fetches data when we exactly call the getter method"
	private Aadhar aadhar;	// Here it is to create "has a" relation with the aadhar_id in Aadhar class.

}	
