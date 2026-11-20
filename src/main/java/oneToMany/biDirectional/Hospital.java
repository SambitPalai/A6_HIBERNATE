package oneToMany.biDirectional;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hid;
	private String name;	
	private String head_office;
	private String head;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy= "hospital")
	@ToString.Exclude
	private List<Branches> branches;

}
