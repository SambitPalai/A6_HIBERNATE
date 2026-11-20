package oneToOne.biDirectional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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

@Table(name = "aadhar_bidirectional")
@Entity
public class Aadhar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aadharId;
	private String name;
	private Integer age;
	private String parent;
	private String phoneNumber;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Pan pan;
	
}
