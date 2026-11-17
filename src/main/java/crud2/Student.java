package crud2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "learner")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length=30, nullable=false, unique=false)
	private String name;
	private Integer age;
	private Integer marks;
	@Transient
	private Boolean pass;
	
}
