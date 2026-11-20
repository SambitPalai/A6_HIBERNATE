package oneToMany.biDirectional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Branches {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer b_id;
	private String b_name;
	private String loc;
	private String b_code;
	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn
	@ToString.Exclude
	private Hospital hospital;

}
